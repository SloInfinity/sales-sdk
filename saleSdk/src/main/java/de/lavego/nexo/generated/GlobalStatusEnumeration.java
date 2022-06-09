//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

/**
 * <p>Java-Klasse für GlobalStatusEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="GlobalStatusEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="Busy"/>
 *     &lt;enumeration value="Maintenance"/>
 *     &lt;enumeration value="Unreachable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum GlobalStatusEnumeration {
    /**
     * The POI is ready to receive and process a
     * 						request
     *
     */
    OK("OK"),
    /**
     * The POI Terminal cannot process a request because another
     * 						processing is in progress.
     *
     */
    
    BUSY("Busy"),
    /**
     * The POI is in maintenance processing
     *
     */
    
    MAINTENANCE("Maintenance"),
    /**
     * The POI is unreachable or not responding
     *
     */
    
    UNREACHABLE("Unreachable");
    private final String value;
    GlobalStatusEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static GlobalStatusEnumeration fromValue(String v) {
        for (GlobalStatusEnumeration c: GlobalStatusEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
