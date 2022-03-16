package org.fairgenomes.generator.datastructures;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class LookupList {

    public File srcFile;
    public String name;
    public String technicalName;
    public LinkedHashMap<String, Lookup> lookups; // LinkedHashMap preserves order so that global options are last
    private static final String TSV_HEADER = "value\tdescription\tcodesystem\tcode\tiri";
    private static final String CSV_HEADER = "value,description,codesystem,code,iri";

    /**
     * Checks:
     * - value_en is unique in file
     * @param lookupListFile
     */
    public LookupList(File lookupListFile) throws Exception {
        this.srcFile = lookupListFile;
        this.name = this.srcFile.getName().substring(0,this.srcFile.getName().indexOf("."));
        this.technicalName = YamlModel.toTechName(this.name);
        lookups = new LinkedHashMap<>();

        Scanner s = new Scanner(lookupListFile);
        boolean firstLine = true;
        while(s.hasNextLine())
        {
            if(firstLine)
            {
                String firstLineStr = s.nextLine();
                if(!(firstLineStr.equals(TSV_HEADER)))
                {
                    throw new Exception("At "+srcFile +", bad lookup file header: " + firstLineStr + "must be: " + TSV_HEADER + " or " + CSV_HEADER);
                }
                firstLine = false;
                continue;
            }
            String nextLine = s.nextLine();
            Lookup l = new Lookup(nextLine);

            if(lookups.containsKey(l.value))
            {
                throw new Exception("Lookups already contains value: " + l.value);
            }
            lookups.put(l.value, l);
        }

    }
}
