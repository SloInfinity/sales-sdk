//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

/**
 * <p>Java-Klasse für PINFormatEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PINFormatEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ISO0"/>
 *     &lt;enumeration value="ISO1"/>
 *     &lt;enumeration value="ISO2"/>
 *     &lt;enumeration value="ISO3"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum PINFormatEnumeration {
    /**
     * ISO 0
     *
     */
    
    ISO_0("ISO0"),
    /**
     * ISO 1
     *
     */
    
    ISO_1("ISO1"),
    /**
     * ISO 2
     *
     */
    
    ISO_2("ISO2"),
    /**
     * ISO 3
     *
     */
    
    ISO_3("ISO3");
    private final String value;
    PINFormatEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static PINFormatEnumeration fromValue(String v) {
        for (PINFormatEnumeration c: PINFormatEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
