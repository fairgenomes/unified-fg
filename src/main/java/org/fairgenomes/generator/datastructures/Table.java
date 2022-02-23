package org.fairgenomes.generator.datastructures;

import java.util.List;
import java.util.Map;

public class Table {

    /*
    Variables mapped to the YAML file
    */
    public String name;
    public String description;
    public String tags;
    public List<RelationWith> relationWith;
    public List<Column> columns;

    /*
    Variables that may be loaded afterwards
    */
    public String technicalName;
    public Ontology parsedOntology;
    public Map<String, Column> elementMap;

    @Override
    public String toString() {
        return "Module{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", elements=" + columns +
                '}';
    }

    /**
     * Helper function to convert name into a Markdown anchor
     * @return
     */
    public String toMarkdownAnchor()
    {
        return "#module-" + name.replace(" ", "-").toLowerCase();
    }
}