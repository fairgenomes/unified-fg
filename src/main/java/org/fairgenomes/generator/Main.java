package org.fairgenomes.generator;

public class Main {

    public static void main(String args[]) throws Exception {
        System.out.println("Starting...");
        long start = System.nanoTime();
        new GenerateOutputs("unified-schema.yml").generateResources();
        //new GenerateOutputs("extensions/palga-protocol-molecular-testing.yml").generateResources();
        System.out.println("Done! Completed in " + ((System.nanoTime()-start)/1000000)+"ms.");
    }
}