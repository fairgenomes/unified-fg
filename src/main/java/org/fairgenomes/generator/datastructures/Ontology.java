package org.fairgenomes.generator.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * e.g. parse
 *
 * OMIABIS:0000037 [http://purl.obolibrary.org/obo/OMIABIS_0000037]
 *
 * into
 *
 * codeSystem -> OMIABIS
 * code -> 0000037
 * iri -> http://purl.obolibrary.org/obo/OMIABIS_0000037
 */
public class Ontology {
    public String codeSystem;
    public String code;
    public String iri;

    public static List<Ontology> toOntoList(String raw) throws Exception {
        ArrayList<Ontology> res = new ArrayList<>();
        String[] split = raw.split(",", -1);
        for(String s : split)
        {
            Ontology o = new Ontology(s);
            res.add(o);
        }
        return res;
    }

    public Ontology(String raw) throws Exception {
        raw = raw.trim();
        int whiteSpaceIndex = raw.indexOf(" ");
        if(whiteSpaceIndex == -1)
        {
            throw new Exception("bad ontology tag: " + raw + ", format = CODESYSTEM:CODE [IRI]");
        }
        String codeAndCodeSystem = raw.substring(0, whiteSpaceIndex);
        if(!codeAndCodeSystem.contains(":")){
            throw new Exception("bad ontology tag: " + raw + ", format = CODESYSTEM:CODE [IRI]");
        }
        String[] split = codeAndCodeSystem.split(":", -1);
        this.codeSystem = split[0];
        this.code = split[1];
        this.iri = raw.substring(whiteSpaceIndex).replace("[", "").replace("]", "").trim();
    }

    @Override
    public String toString() {
        return "Ontology{" +
                "codeSystem='" + codeSystem + '\'' +
                ", code='" + code + '\'' +
                ", iri='" + iri + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ontology ontology = (Ontology) o;
        return Objects.equals(codeSystem, ontology.codeSystem) &&
                Objects.equals(code, ontology.code) &&
                Objects.equals(iri, ontology.iri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeSystem, code, iri);
    }
}
