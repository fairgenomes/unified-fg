package org.fairgenomes.generator.implementations;

import org.fairgenomes.generator.AbstractGenerator;
import org.fairgenomes.generator.datastructures.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Generate Markdown documentation of the model
 */
public class ToMarkdown extends AbstractGenerator {

    static final int DESCRIPTION_LIMIT = 1000;

    public ToMarkdown(YamlModel fg, File outputFolder) throws Exception {
        super(fg, outputFolder);
    }

    @Override
    public void start() throws IOException {
        int totalNrOfElements = 0;
        for (Table m : fg.tables) {
            totalNrOfElements += m.columns.size();
        }


        String mdOutFile = fg.fileName.replace("-", "") + "-semantic-model.md";
        FileWriter fw = new FileWriter(new File(outputFolder, mdOutFile));
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("# " + fg.name + LE + LE);
        bw.write(fg.description + " Version "+fg.version + "-" + fg.releaseType + ", "+fg.date+". This model consists of __" + fg.tables.size() + " modules__ that contain __" + totalNrOfElements + " metadata elements__ and __" + fg.totalNrOfLookupsWithoutGlobals + " lookups__ in total (excluding null flavors)." + LE + LE);

        bw.write("## Module overview" + LE + LE);
        bw.write("| Name | Description | Ontology | Nr. of elements |" + LE);
        bw.write("|---|---|---|---|" + LE);
        for (Table m : fg.tables) {
            bw.write("| ["+m.name+"](" + m.toMarkdownAnchor() + ") | " + m.description + " | [" + m.parsedOntology.codeSystem + ":" + m.parsedOntology.code + "](" + m.parsedOntology.iri + ") | " + m.columns.size() + " |" + LE);
        }
        bw.write(LE);

        for (Table m : fg.tables) {
            bw.write("## Module: " + m.name + LE);
            bw.write(m.description + " Ontology: " + "[" + m.parsedOntology.codeSystem + ":" + m.parsedOntology.code + "](" + m.parsedOntology.iri + ")." + LE + LE);

            bw.write("| Element | Description | Ontology | Values |" + LE);
            bw.write("|---|---|---|---|" + LE);

            for (Column e : m.columns) {
                bw.write("| " + e.name + " | " + (e.description.length() < DESCRIPTION_LIMIT ? e.description : e.description.substring(0,DESCRIPTION_LIMIT) + "...") + " | " + printTags(e.parsedTags) + " | " + e.valueTypeToMarkDown() + " |" + LE);
            }
            bw.write(LE);
        }

        bw.write("## Null flavors" + LE);
        bw.write("Each lookup is supplemented with so-called 'null flavors' from HL7. These can be used to indicate precisely why a particular value could not be entered into the system, providing substantially more insight than simply leaving a field empty." + LE + LE);
        bw.write("| Value | Description | Ontology |" + LE);
        bw.write("|---|---|---|" + LE);
        for(String key: fg.lookupGlobalOptionsInstance.lookups.keySet())
        {
            Lookup nf = fg.lookupGlobalOptionsInstance.lookups.get(key);
            bw.write("| " + key.substring(0,key.indexOf("(")-1) + " | " + nf.description + " | " + "[" + nf.codesystem + ":" + nf.code + "](" + nf.iri + ") |" + LE);
        }
        bw.write(LE);

        bw.flush();
        bw.close();

    }

    public String printTags(List<Ontology> tags)
    {
        StringBuilder sb = new StringBuilder();
        for(Ontology o : tags)
        {
            sb.append("[" + o.codeSystem + ":" + o.code + "](" + o.iri + "), ");
        }
        sb.deleteCharAt(sb.length()-2);
        return sb.toString();
    }
}
