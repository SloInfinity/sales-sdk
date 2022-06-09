//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

/**
 * <p>Java-Klasse für CustomerOrderReqEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerOrderReqEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Open"/>
 *     &lt;enumeration value="Closed"/>
 *     &lt;enumeration value="Both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum CustomerOrderReqEnumeration {
    /**
     * Customer order not completed.
     *
     */
    
    OPEN("Open"),
    /**
     * Completed customer orders.
     *
     */
    
    CLOSED("Closed"),
    /**
     * All type of CustomerOrder should be listed
     *
     */
    
    BOTH("Both");
    private final String value;
    CustomerOrderReqEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static CustomerOrderReqEnumeration fromValue(String v) {
        for (CustomerOrderReqEnumeration c: CustomerOrderReqEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
