//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

/**
 * <p>Java-Klasse für VersionEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="VersionEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="v0"/>
 *     &lt;enumeration value="v1"/>
 *     &lt;enumeration value="v2"/>
 *     &lt;enumeration value="v3"/>
 *     &lt;enumeration value="v4"/>
 *     &lt;enumeration value="v5"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum VersionEnumeration {
    /**
     * Version 0
     *
     */
    
    V_0("v0"),
    /**
     * Version 1
     *
     */
    
    V_1("v1"),
    /**
     * Version 2
     *
     */
    
    V_2("v2"),
    /**
     * Version 3
     *
     */
    
    V_3("v3"),
    /**
     * Version 4
     *
     */
    
    V_4("v4"),
    /**
     * Version 5
     *
     */
    
    V_5("v5");
    private final String value;
    VersionEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static VersionEnumeration fromValue(String v) {
        for (VersionEnumeration c: VersionEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
