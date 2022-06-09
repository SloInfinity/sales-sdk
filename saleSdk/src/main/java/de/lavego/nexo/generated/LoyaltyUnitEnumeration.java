//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

/**
 * <p>Java-Klasse für LoyaltyUnitEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="LoyaltyUnitEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Point"/>
 *     &lt;enumeration value="Monetary"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum LoyaltyUnitEnumeration {
    /**
     * The amount is expressed in point.
     *
     */
    
    POINT("Point"),
    /**
     * The amount is expressed in a monetary value in a
     * 						currency.
     *
     */
    
    MONETARY("Monetary");
    private final String value;
    LoyaltyUnitEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static LoyaltyUnitEnumeration fromValue(String v) {
        for (LoyaltyUnitEnumeration c: LoyaltyUnitEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
