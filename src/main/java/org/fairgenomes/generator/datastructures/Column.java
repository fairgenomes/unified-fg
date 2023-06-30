package org.fairgenomes.generator.datastructures;

import java.util.List;
import java.util.Map;

public class Column {

    /*
    Variables mapped to the YAML file
    */
    public String name;
    public String description;
    public String tags;
    public String reference;
    public String referenceTypeTag;
    public String dataType;
    public String unit;
    public String exactMatch;
    public String closeMatch;
    public String relatedMatch;
    public String broadMatch;
    public String narrowMatch;
    public String example;
    public String profile;

    /*
    Variables that may be loaded afterwards
     */
    public Table m;
    public String technicalName;
    public DataType dataTypeEnum;
    public LookupList lookup;
    public List<Ontology> parsedTags;
    public Ontology unitOntology;
    public String type;
    public int nrOfLookupsWithoutGlobals;
    public Map<Match, List<Ontology>> matches;

    @Override
    public String toString() {
        return "Attribute{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", tags='" + tags + '\'' +
                ", dataType='" + dataType + '\'' +
                '}';
    }

    /**
     * Helper function to determine whether this element has a lookup value type
     * meaning it refers to a pre-loaded table, like a categorical value
     * in contrast to a 'regular xref/mref' between tables as defined in the model
     *
     * @return
     */
    public boolean isLookup() {
        switch (dataTypeEnum) {
            case xref:
            case mref:
            case xref_noglobals:
            case mref_noglobals:
                return !YamlModel.isTableReference(reference);
            default:
                return false;
        }
    }

    /**
     * Helper function to determine whether this element has a reference value type
     *
     * @return
     */
    public boolean isTableReference() {
        switch (dataTypeEnum) {
            case xref:
            case mref:
                return YamlModel.isTableReference(reference);
            default:
                return false;
        }
    }

    /**
     * Helper function to convert the value type to Markdown
     *
     * @return
     */
    public String valueTypeToMarkDown() {
        if (isLookup()) {
            return "[" + lookup.srcFile.getName().replace(".txt", "") + "](../../lookups/" + lookup.srcFile.getName() + ") lookup (" + nrOfLookupsWithoutGlobals + " choices" + (type == null ? "" : " [of type](" + type + ")") + ")";
        } else if (isTableReference()) {
            return "Reference to instances of " + reference;
        } else {
            return dataTypeEnum.toString();
        }
    }

    /**
     * Helper function to convert the value type to LaTeX
     *
     * @return
     */
    public String valueTypeToLaTeX() {
        if (isLookup()) {
            return lookup.srcFile.getName().replace(".txt", "") + " lookup (" + nrOfLookupsWithoutGlobals + " choices)";
        } else if (isTableReference()) {
            return "Reference to " + reference;
        } else {
            return dataTypeEnum.toString();
        }
    }

    /**
     * Helper function to convert the value type to ART-DECOR
     *
     * @return
     */
    public String valueTypeToArtDecor() {
        switch (dataTypeEnum) {
            case string:
                return "ST";
            case text:
                return "ST";
            case identifier:
                return "ST";
            case xref:
                return "ST";
            case mref:
                return "ST";
            case xref_noglobals:
                return "ST";
            case mref_noglobals:
                return "ST";
            case integer:
                return "INT";
            case date:
                return "DATE";
            case datetime:
                return "DATE";
            case bool:
                return "BOOLEAN";
            case decimal:
                return "DECIMAL";
            default:
                return "ST";
        }
    }

    /**
     * Helper function to convert the value type to EMX
     *
     * @return
     */
    public String valueTypeToEMX() {
        switch (dataTypeEnum) {
            case string:
                return "string";
            case text:
                return "text";
            case identifier:
                return "string";
            case xref:
                return "xref";
            case mref:
                return "mref";
            case xref_noglobals:
                return "xref";
            case mref_noglobals:
                return "mref";
            case integer:
                return "int";
            case date:
                return "date";
            case datetime:
                return "datetime";
            case bool:
                return "bool";
            case decimal:
                return "decimal";
            default:
                return "string";
        }
    }

    /**
     * Helper function to convert the value type to EMX2
     *
     * @return
     */
    public String valueTypeToEMX2() {
        switch (dataTypeEnum) {
            case string:
                return "string";
            case text:
                return "text";
            case identifier:
                return "string";
            case xref:
                return "ref";
            case mref:
                return "ref_array";
            case xref_noglobals:
                return "ref";
            case mref_noglobals:
                return "ref_array";
            case integer:
                return "int";
            case date:
                return "date";
            case datetime:
                return "datetime";
            case bool:
                return "bool";
            case decimal:
                return "decimal";
            default:
                return "string";
        }
    }

    /**
     * Helper function to convert a lookup or reference to EMX
     *
     * @return
     */
    public String lookupOrReferencetoEMX(String pkgName) {
        if (isTableReference()) {
            return pkgName + "_" + YamlModel.toTechName(reference);
        } else if (isLookup()) {
            return pkgName + "_" + m.technicalName + "_" + technicalName;
        } else {
            return "";
        }
    }

    public String lookupOrReferencetoEMX2() {
        if (isTableReference()) {
            return YamlModel.toTechName(reference);
        } else if (isLookup()) {
            return technicalName;
        } else {
            return "";
        }
    }

    public String getArtDecorInputType() {
        switch (dataTypeEnum) {
            case xref:
                return "single-select";
            case mref:
                return "multi-select";
            case xref_noglobals:
                return "single-select";
            case mref_noglobals:
                return "multi-select";
            default:
                return "text";
        }
    }

    /**
     * Helper function to convert the value type to RDF
     *
     * @return
     */
    public String valueTypeToRDF() {
        switch (dataTypeEnum) {
            case string:
                return "string";
            case text:
                return "string";
            case identifier:
                return "string";
            case xref:
                return "string";
            case mref:
                return "list";
            case xref_noglobals:
                return "string";
            case mref_noglobals:
                return "list";
            case integer:
                return "integer";
            case date:
                return "date";
            case datetime:
                return "datetime";
            case bool:
                return "boolean";
            case decimal:
                return "decimal";
            default:
                return "string";
        }
    }

    /**
     * Helper function to convert the value type to Java
     * @return
     */
    public String valueTypeToJava(String obj)
    {
        switch(dataTypeEnum) {
            case string: return "String";
            case text: return "String";
            case identifier: return "String";
            case xref: return "String";
            case mref: return "List<String>";
            case xref_noglobals: return "String";
            case mref_noglobals: return "List<String>";
            case integer: return "int";
            //case ReferenceOne: return obj;
            //case ReferenceMany: return "List<"+obj+">";
            case date: return "String";
            case datetime: return "String";
            case bool: return "boolean";
            case decimal: return "double";
            default: return "String";
        }
    }

}