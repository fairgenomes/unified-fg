package org.fairgenomes.generator;

import org.apache.commons.io.FileUtils;
import org.fairgenomes.generator.datastructures.YamlModel;

import java.io.File;
import java.io.IOException;

/**
 * Attributes and constructor shared by all generator implementations
 */
public abstract class AbstractGenerator {

    public YamlModel fg;
    public File outputFolder;
    public static final String LE = "\n"; // using Unix line endings is the safer option

    public static final String baseIRI = "https://w3id.org/fair-genomes/";
    public static final String resourceURL = baseIRI + "resource/";
    public static final String ontologyURL = baseIRI + "ontology/";

    public AbstractGenerator(YamlModel fg, File outputFolder) throws IOException {
        this.fg = fg;
        if (!outputFolder.exists()) {
            outputFolder.mkdirs();
        }else{
            FileUtils.cleanDirectory(outputFolder);
        }
        this.outputFolder = outputFolder;
    }

    public abstract void start() throws Exception;
}
