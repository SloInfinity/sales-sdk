//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

/**
 * <p>Java-Klasse für MessageClassEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageClassEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Service"/>
 *     &lt;enumeration value="Device"/>
 *     &lt;enumeration value="Event"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum MessageClassEnumeration {
    /**
     * A transaction message pair initiated by the Sale System, and
     * 						requested to the POI System.
     *
     */
    
    SERVICE("Service"),
    /**
     * A device message pair either: Inside a Service request and
     * 						response. This device message pair is initiated by the POI System, and sent
     * 						to Sale System,
     *
     */
    
    DEVICE("Device"),
    /**
     * An unsolicited event notification by the POI System to the
     * 						Sale System.
     *
     */
    
    EVENT("Event");
    private final String value;
    MessageClassEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static MessageClassEnumeration fromValue(String v) {
        for (MessageClassEnumeration c: MessageClassEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
