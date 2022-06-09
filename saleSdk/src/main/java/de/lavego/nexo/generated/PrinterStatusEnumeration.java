//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

/**
 * <p>Java-Klasse für PrinterStatusEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PrinterStatusEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="PaperLow"/>
 *     &lt;enumeration value="NoPaper"/>
 *     &lt;enumeration value="PaperJam"/>
 *     &lt;enumeration value="OutOfOrder"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum PrinterStatusEnumeration {
    /**
     * The printer is operational.
     *
     */
    OK("OK"),
    /**
     * The printer is operational but paper roll is almost
     * 						empty.
     *
     */
    
    PAPER_LOW("PaperLow"),
    /**
     * Paper roll is empty, an operator must insert a new paper
     * 						roll.
     *
     */
    
    NO_PAPER("NoPaper"),
    /**
     * An operator must remove the paper jam
     * 						manually.
     *
     */
    
    PAPER_JAM("PaperJam"),
    /**
     * The printer is out of order.
     *
     */
    
    OUT_OF_ORDER("OutOfOrder");
    private final String value;
    PrinterStatusEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static PrinterStatusEnumeration fromValue(String v) {
        for (PrinterStatusEnumeration c: PrinterStatusEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
