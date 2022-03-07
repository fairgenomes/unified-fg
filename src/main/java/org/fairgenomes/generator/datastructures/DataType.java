package org.fairgenomes.generator.datastructures;

public enum DataType {
    /**
     * Previously:
     */
    //String, Text, UniqueID, LookupOne, LookupOne_NoGlobals, LookupMany, LookupMany_NoGlobals, Integer, ReferenceOne, ReferenceMany, Date, DateTime, Boolean, Decimal;

    /**
     * New:
     */
    string, text, identifier, xref, mref, xref_noglobals, mref_noglobals, integer, date, datetime, email, bool, decimal, hyperlink;
}
