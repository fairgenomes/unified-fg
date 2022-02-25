package org.fairgenomes.generator.implementations;

import org.fairgenomes.generator.AbstractGenerator;
import org.fairgenomes.generator.datastructures.Table;
import org.fairgenomes.generator.datastructures.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Generate LaTeX tables
 */
public class ToLaTeXTables extends AbstractGenerator {

    static final int DESCRIPTION_LIMIT = 1000;

    public ToLaTeXTables(YamlModel fg, File outputFolder) throws Exception {
        super(fg, outputFolder);
    }

    @Override
    public void start() throws IOException {
        int totalNrOfElements = 0;
        for (Table m : fg.tables) {
            totalNrOfElements += m.columns.size();
        }
        int tableNr = 1;

        FileWriter fw = new FileWriter(new File(outputFolder, fg.fileName + ".tex"));
        BufferedWriter bw = new BufferedWriter(fw);

        /**
         * Header
         */
        bw.write("\\documentclass{article}" + LE);
        bw.write("\\usepackage[utf8]{inputenc}" + LE);
        bw.write("\\begin{document}" + LE);
        bw.write("\\setlength\\parindent{0pt}" + LE);
        bw.write(LE);
        bw.write("\\textbf{"+fg.name+"}" + LE);
        bw.write("\\newline" + LE);
        bw.write(LE);
        bw.write(fg.description + " Version "+fg.version + "-" + fg.releaseType + ", "+fg.date+". This model consists of " + fg.tables.size() + " modules that contain " + totalNrOfElements + " metadata elements and " + fg.totalNrOfLookupsWithoutGlobals + " lookups in total (excluding null flavors)." + LE);
        bw.write(LE);
        /**
         * Modules
         */
        bw.write("\\begin{table}[htb]"+ LE);
        bw.write("\\begin{tabular}{lll}"+ LE);
        bw.write("Name & Ontology & Nr. of elements \\\\"+ LE);
        bw.write("\\hline"+ LE);
        for (Table m : fg.tables) {
            bw.write(m.name + " & " + printTags(m.parsedTags) + " & " + m.columns.size() + " \\\\" + LE);
        }
        bw.write("\\hline" + LE);
        bw.write("\\end{tabular}" + LE);
        bw.write("\\caption[Module overview]{\\label{table:table" + (tableNr++) + "} "+fg.name+" v"+fg.version + "-" + fg.releaseType + " overview of all modules.}" + LE);
        bw.write("\\end{table}" + LE);
        bw.write(LE);

        /**
         * Elements
         */
        for (Table m : fg.tables) {
            bw.write("\\begin{table}[htb]"+ LE);
            bw.write("\\begin{tabular}{lll}"+ LE);
            bw.write("Name & Ontology & Values \\\\"+ LE);
            bw.write("\\hline"+ LE);
            for (Column e : m.columns) {
                bw.write(e.name + " & " + printTags(e.parsedTags) + " & " + e.valueTypeToLaTeX() + " \\\\" + LE);
            }
            bw.write("\\hline" + LE);
            bw.write("\\end{tabular}" + LE);
            bw.write("\\caption[Module: " + m.name + "]{\\label{table:table" + (tableNr++) + "} Module: " + m.name + ". " + m.description + " Ontology: " + printTags(m.parsedTags) + ". }" + LE);
            bw.write("\\end{table}" + LE);
            bw.write(LE);
        }

        /**
         * Null flavors
         */
        bw.write("\\begin{table}[htb]"+ LE);
        bw.write("\\begin{tabular}{ll}"+ LE);
        bw.write("Value & Ontology \\\\"+ LE);
        bw.write("\\hline"+ LE);
        for(String key: fg.lookupGlobalOptionsInstance.lookups.keySet())
        {
            Lookup nf = fg.lookupGlobalOptionsInstance.lookups.get(key);
            bw.write(key.substring(0,key.indexOf("(")-1) + " & " + nf.codesystem+":"+nf.code + " \\\\" + LE);
        }
        bw.write("\\hline" + LE);
        bw.write("\\end{tabular}" + LE);
        bw.write("\\caption[NullFlavors]{\\label{table:table" + (tableNr++) + "} Overview of null flavors. Each lookup is supplemented with so-called 'null flavors' from HL7. These can be used to indicate precisely why a particular value could not be entered into the system, providing substantially more insight than simply leaving a field empty. }" + LE);
        bw.write("\\end{table}" + LE);
        bw.write(LE);


        bw.write("\\end{document}" + LE);

        bw.flush();
        bw.close();


        /**
         * Printer helper Bash script to make PDF from LaTeX
         */
        FileWriter fw2 = new FileWriter(new File(outputFolder, "toPDF.sh"));
        BufferedWriter bw2 = new BufferedWriter(fw2);
        bw2.write("latex "+fg.fileName+".tex" + LE);
        bw2.write("dvips "+fg.fileName+".dvi" + LE);
        bw2.write("ps2pdf "+fg.fileName+".ps" + LE);
        bw2.write("mv "+fg.fileName+".pdf ../../derived/pdf/" + LE);
        bw2.flush();
        bw2.close();


    }


    public String printTags(List<Ontology> tags)
    {
        StringBuilder sb = new StringBuilder();
        for(Ontology o : tags)
        {
            sb.append(o.codeSystem + ":" + o.code.replace("_", "\\_") + ", ");
        }
        sb.deleteCharAt(sb.length()-2);
        return sb.toString();
    }


}
