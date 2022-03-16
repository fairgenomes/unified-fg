package org.fairgenomes.generator.datastructures;

import java.io.File;
import java.time.LocalDate;
import java.util.*;

public class YamlModel {

    /*
    Variables mapped to the YAML file
     */
    public String name;
    public String description;
    public String tags;
    public Double version;
    public ReleaseType releaseType;
    public LocalDate date;
    public File lookupGlobalOptions;
    public List<Author> authors;
    public List<Implementers> implementers;
    public Copyright copyright;
    public License license;
    public Technical technical;
    public List<Table> tables;

    /*
    Variables loaded afterwards
     */
    public String fileName;
    public LookupList lookupGlobalOptionsInstance;
    public int totalNrOfLookupsWithoutGlobals;
    public Map<String, Table> moduleMap;
    public Set<Ontology> allElementOntologies;
    public Set<Ontology> allModuleOntologies;


    /**
     * Load the lookupGlobalOptions
     * @throws Exception
     */
    public void loadLookupGlobalOptions() throws Exception {
        LookupList ll = new LookupList(lookupGlobalOptions);
        lookupGlobalOptionsInstance = ll;
    }


    /**
     * Parse the 'values' information to ValueType enum values
     * @throws Exception
     */
    public void parseElementValueTypes() throws Exception {
        for(Table m: tables)
        {
            for(Column e : m.columns)
            {
                if(e.dataType == null)
                {
                    throw new Exception("No datatype for " + e.toString());
                }
                int whiteSpaceIndex = e.dataType.indexOf(" ");
                String vt = whiteSpaceIndex > 0 ? e.dataType.substring(0, whiteSpaceIndex) : e.dataType;
                DataType dataType = DataType.valueOf(vt);
                e.dataTypeEnum = dataType;
            }
        }
    }

    /**
     * Parse element 'unit' information
     * @throws Exception
     */
    public void parseElementUnits() throws Exception {
        for(Table m: tables)
        {
            for(Column e : m.columns)
            {
                if(e.unit != null)
                {
                    e.unitOntology = new Ontology(e.unit);
                }
            }
        }
    }

    /**
     * Parse module relations with other modules
     * @throws Exception
     */
    public void parseModuleRelations() throws Exception {
        for(Table m: tables)
        {
           if(m.relationWith != null)
           {
               for(RelationWith rw : m.relationWith)
               {
                   rw.relationOnto = new Ontology(rw.relation);
               }
           }
        }
    }

    /**
     * Load the lookups for each element
     * @throws Exception
     */
    public void loadElementLookups() throws Exception {
        totalNrOfLookupsWithoutGlobals = 0;
        moduleMap = new HashMap<String, Table>();
        for(Table m: tables)
        {
            moduleMap.put(m.technicalName, m);
            m.elementMap = new HashMap<String, Column>();
            for(Column e : m.columns)
            {
                m.elementMap.put(e.technicalName, e);
                if(e.isLookup())
                {
                    LookupList ll = new LookupList(new File(e.reference));
                    e.lookup = ll;
                    e.nrOfLookupsWithoutGlobals = ll.lookups.size();
                    totalNrOfLookupsWithoutGlobals += ll.lookups.size();

                    // type the lookup
                    if(e.referenceTypeTag == null)
                    {
                        throw new Exception("No reference type tag specified for " + e.toString());
                    }
                    e.type = new Ontology(e.referenceTypeTag).iri;

                    /*
                    Add the global lookups unless NoGlobals is specified
                    */
                    if(!(e.dataTypeEnum.equals(DataType.xref_noglobals) || e.dataTypeEnum.equals(DataType.mref_noglobals))) {
                        e.lookup.lookups.putAll(lookupGlobalOptionsInstance.lookups);
                    }
                }
                else if(e.isTableReference())
                {
                    boolean found = false;
                    for(Table mm : tables)
                    {
                        if(mm.name.equals(e.reference))
                        {
                            // instances of reference fields (i.e. foreign keys) are typed as the module IRI they refer to
                            // this is not part of any output formats, since these references do not exist yet!
                            // this instance type is different from the field type, i.e.
                            // 'Belongs to sequencing' has type NCIT_C25683 (Source), while instances refer to the
                            // Sequencing module, and are therefore types as EDAM:topic_3168 (Sequencing)
                            // FIXME: limit to first tag because referenceTypeTag has 1 value
                            e.type = m.parsedTags.get(0).iri;
                            found = true;
                            break;
                        }
                    }
                    if(!found)
                    {
                        throw new Exception("Unable to find module reference '"+e.reference+"' for setting value type");
                    }
                }
            }
        }
    }

    /**
     * Parse and split ontology info to code, codesystem and iri
     * @throws Exception
     */
    public void parseOntologies() throws Exception {
        allModuleOntologies = new HashSet<Ontology>();
        allElementOntologies = new HashSet<Ontology>();
        for (Table m : tables) {
            m.parsedTags = Ontology.toOntoList(m.tags);
            allModuleOntologies.addAll(m.parsedTags);
            for (Column e : m.columns) {
                if(e.tags == null){
                    throw new Exception("empty tags for " + e.name + " in " + m.name);
                }
                e.parsedTags = Ontology.toOntoList(e.tags);
                allElementOntologies.addAll(e.parsedTags);
            }
        }
    }

    /**
     * Parse and split SKOS matches for mapping
     * @throws Exception
     */
    public void parseMatches() throws Exception {
        for(Table m: tables) {
            for (Column e : m.columns) {
                if(e.exactMatch != null) { addMatches(Match.exactMatch, e, e.exactMatch); }
                if(e.closeMatch != null) { addMatches(Match.closeMatch, e, e.closeMatch); }
                if(e.relatedMatch != null) { addMatches(Match.relatedMatch, e, e.relatedMatch); }
                if(e.broadMatch != null) { addMatches(Match.broadMatch, e, e.broadMatch); }
                if(e.narrowMatch != null) { addMatches(Match.narrowMatch, e, e.narrowMatch); }

                /**
                 * for debug
                 */
//                if(e.exactMatch != null || e.closeMatch != null || e.relatedMatch != null || e.broadMatch != null || e.narrowMatch != null)
//                {
//                    for(Match key : e.matches.keySet())
//                    {
//                        for(Ontology o : e.matches.get(key))
//                        {
//                            System.out.println(key + " -> " + o);
//                        }
//                    }
//                }

            }
        }
    }

    private void addMatches(Match m, Column e, String value) throws Exception {
        if(e.matches == null)
        {
            e.matches = new HashMap<Match, List<Ontology>>();
        }
        if(!e.matches.containsKey(m))
        {
            e.matches.put(m, new ArrayList<Ontology>());
        }
        String[] matchSplit = value.split(",", -1);
        for(String match : matchSplit)
        {
            Ontology o = new Ontology(match);
            e.matches.get(m).add(o);
        }
    }



    /**
     * Wrapper to create technical names
     * @return
     */
    public void createElementTechnicalNames() throws Exception {
        for (Table m : tables) {
            m.technicalName = toTechName(m.name);
            for (Column e : m.columns) {
                e.technicalName = toTechName(e.name);
            }
        }
    }

    /**
     * check if reference is to a table, otherwise its a file
     * @param ref
     * @return
     */
    public static boolean isTableReference(String ref)
    {
        if(ref.endsWith(".tsv") || ref.endsWith(".csv"))
        {
           return false;
        }
        else
        {
            return true;
        }
    }

    /**
     * Parse any references to other modules or lookups
     * @throws Exception
     */
    public void parseReferences() throws Exception {
        for (Table m : tables) {
            for (Column e : m.columns) {
                if(e.isTableReference())
                {
                    // validate Module or file existence?
                }
            }
        }
    }

    /**
     * Add module pointers to the elements
     * @throws Exception
     */
    public void setElementModules() throws Exception {
        for (Table m : tables) {
            for (Column e : m.columns) {
                e.m = m;
            }
        }
    }

    /**
     * Helper to simplify names for technical use
     * @param in
     * @return
     */
    public static String toTechName(String in)
    {
        return in.replace(" ", "").toLowerCase();
    }

    @Override
    public String toString() {
        return "YamlModel{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", version=" + version +
                ", date=" + date +
                ", lookupGlobalOptions=" + lookupGlobalOptions +
                ", modules=" + tables +
                ", lookupGlobalOptionsInstance=" + lookupGlobalOptionsInstance +
                '}';
    }

    /**
     * helper to find overlap in models
     * @param y
     * @return
     */
    public YamlModel intersectWith(YamlModel y)
    {
        YamlModel intersect = new YamlModel();
        intersect.name = this.name + " intersected with " + y.name;

        for(Table m : y.tables)
        {
            if(this.allModuleOntologies.contains(m.parsedTags))
            {
                System.out.println("MODULE ONTOLOGY OVERLAP: " + m.parsedTags);
            }

            for(Column e : m.columns)
            {
                if(this.allElementOntologies.contains(e.parsedTags))
                {
                    System.out.println("ELEMENT ONTOLOGY OVERLAP: " + e.parsedTags);
                    //List elementInOriginal = findElement(e.parsedTags);
                }
            }
        }

        return intersect;
    }

    public List<Column> findElement(Ontology o)
    {
        List<Column> e = new ArrayList<>();
        // todo ...
        return e;
    }
}