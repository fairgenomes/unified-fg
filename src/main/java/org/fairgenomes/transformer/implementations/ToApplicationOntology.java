package org.fairgenomes.transformer.implementations;

import org.eclipse.rdf4j.model.vocabulary.OWL;
import org.eclipse.rdf4j.model.vocabulary.RDFS;
import org.fairgenomes.transformer.datastructures.*;

import java.io.*;
import java.util.HashMap;

import org.eclipse.rdf4j.model.Model;
import org.eclipse.rdf4j.model.IRI;
import static org.eclipse.rdf4j.model.util.Values.iri;
import org.eclipse.rdf4j.model.vocabulary.RDF;
import org.eclipse.rdf4j.model.vocabulary.DC;
import static org.eclipse.rdf4j.model.util.Values.literal;
import org.eclipse.rdf4j.rio.RDFFormat;
import org.eclipse.rdf4j.rio.Rio;
import org.eclipse.rdf4j.model.util.ModelBuilder;
import org.fairgenomes.transformer.datastructures.Module;

public class ToApplicationOntology extends GenericTransformer {

    public ToApplicationOntology(FAIRGenomes fg, File outputFolder) {
        super(fg, outputFolder);
    }

    @Override
    public void start() throws Exception, IOException {
        // Replace this later with w3id or purl
        String baseUrl = "https://github.com/fairgenomes/fairgenomes-semantic-model/";
        ModelBuilder builder = new ModelBuilder();
        FileWriter fw = new FileWriter(new File(outputFolder, "fair-genomes.ttl"));
        BufferedWriter bw = new BufferedWriter(fw);
        RDFFormat applicationOntologyFormat = RDFFormat.TURTLE;

        builder.setNamespace("fg", "https://fair-genomes.org/");
        builder.setNamespace("rdfs", "http://www.w3.org/2000/01/rdf-schema#");
        builder.setNamespace("dc", "http://purl.org/dc/elements/1.1/");
        builder.setNamespace("rdf", "http://www.w3.org/1999/02/22-rdf-syntax-ns#");
        builder.setNamespace("owl", "http://www.w3.org/2002/07/owl#");
        builder.setNamespace("xsd", "http://www.w3.org/2001/XMLSchema#");
        builder.setNamespace("obo", "http://purl.obolibrary.org/obo/");
        builder.setNamespace("sio", "https://semanticscience.org/resource/");
        builder.setNamespace("ordo", "http://www.orpha.net/ORDO/");

        for (Module m : fg.modules) {
            String moduleName = cleanLabel(m.name);
            IRI moduleClass = iri(baseUrl, cleanLabel(moduleName));
            builder.add(moduleClass, RDF.TYPE, OWL.CLASS);
            builder.add(moduleClass, RDFS.ISDEFINEDBY, iri(m.iri));
            builder.add(moduleClass, RDFS.LABEL, literal(m.name));
            builder.add(moduleClass, DC.DESCRIPTION, literal(m.description));

            for(Element e : m.elements) {
                String elementName = moduleName + "_" + cleanLabel(e.name);
                IRI moduleProperty = iri(baseUrl, cleanLabel(elementName));
                builder.add(moduleProperty, RDF.TYPE, e.isLookup() || e.isReference() ? OWL.OBJECTPROPERTY : OWL.DATATYPEPROPERTY);
                builder.add(moduleProperty, RDFS.LABEL, literal(e.name));
                builder.add(moduleProperty, RDFS.DOMAIN, moduleClass);
                builder.add(moduleProperty, RDFS.ISDEFINEDBY, iri(e.iri));
                builder.add(moduleProperty, DC.DESCRIPTION, literal(e.description));
                // We need to check this annotation
                //bw.write("\t\trdfs:Datatype xsd:" + e.valueTypeToRDF() + " ;" + LE);

                if(e.isLookup()){
                    for (String lookup : e.lookup.lookups.keySet()) {
                        Lookup l = e.lookup.lookups.get(lookup);
                        String lookupName = elementName + "_" + cleanLabel(l.value);
                        IRI lookupInstance = iri(baseUrl, cleanLabel(lookupName));
                        builder.add(lookupInstance, RDF.TYPE, (e.type != null ? e.type : moduleProperty));
                        builder.add(lookupInstance, RDFS.LABEL, literal(l.value));
                        builder.add(lookupInstance, RDFS.DOMAIN, moduleProperty);
                        builder.add(lookupInstance, DC.DESCRIPTION, literal(l.description));
                        builder.add(lookupInstance, RDFS.ISDEFINEDBY, iri(l.iri));
                        // We need to check this annotation
                        //bw.write("\t\t\trdf:type " + elementName + LE);

                    }
                }
            }
        }
        Model model = builder.build();
        Rio.write(model, bw, applicationOntologyFormat);
        bw.flush();
        bw.close();
    }

    private String cleanLabel(String label) {
        label = label.trim();
        label = label.replace(" ", "_");
        label = label.replace("[","");
        label = label.replace("]","");
        label = label.replace("|","_");
        label = label.replace("<","lt");
        label = label.replace(">","gt");
        label = label.replace("%","pc");
        return label;
    }
}
