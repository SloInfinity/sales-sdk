//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;
/**
 * <p>Java-Klasse für OperatorEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="OperatorEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EQ"/>
 *     &lt;enumeration value="LE"/>
 *     &lt;enumeration value="LT"/>
 *     &lt;enumeration value="GE"/>
 *     &lt;enumeration value="GT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum OperatorEnumeration {
    /**
     * Criteria is met if target element value is equal to
     * 						Value
     *
     */
    EQ,
    /**
     * Criteria is met if target element value is lower or equal to
     * 						Value
     *
     */
    LE,
    /**
     * Criteria is met if target element is strictly lower than
     * 						Value
     *
     */
    LT,
    /**
     * Criteria is met if target element value is greater or equal to
     * 						Value.
     *
     */
    GE,
    /**
     * Criteria is met if target element value is strictly greater
     * 						than Value.
     *
     */
    GT;
    public String value() {
        return name();
    }
    public static OperatorEnumeration fromValue(String v) {
        return valueOf(v);
    }
}
