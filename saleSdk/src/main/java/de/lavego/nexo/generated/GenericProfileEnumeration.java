//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;
/**
 * <p>Java-Klasse für GenericProfileEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="GenericProfileEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Basic"/>
 *     &lt;enumeration value="Standard"/>
 *     &lt;enumeration value="Extended"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum GenericProfileEnumeration {
    /**
     * Protocol services that needs to be implemented by all the Sale
     * 						and POI
     *
     */
    BASIC("Basic"),
    /**
     * Protocol services involving interaction between Sale System
     * 						and POI System as devices shared between the two Systems.
     *
     */
    STANDARD("Standard"),
    /**
     * Complete Protocol services
     *
     */
    
    EXTENDED("Extended");
    private final String value;
    GenericProfileEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static GenericProfileEnumeration fromValue(String v) {
        for (GenericProfileEnumeration c: GenericProfileEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
