//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

/**
 * <p>Java-Klasse für TotalDetailsEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TotalDetailsEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="POIID"/>
 *     &lt;enumeration value="SaleID"/>
 *     &lt;enumeration value="OperatorID"/>
 *     &lt;enumeration value="ShiftNumber"/>
 *     &lt;enumeration value="TotalsGroupID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum TotalDetailsEnumeration {
    /**
     * Give the totals result per POIID value.
     *
     */
    POIID("POIID"),
    /**
     * Give the totals result per SaleID value.
     *
     */
    
    SALE_ID("SaleID"),
    /**
     * Give the totals result per OperatorID
     * 						value.
     *
     */
    
    OPERATOR_ID("OperatorID"),
    /**
     * Give the totals result per ShiftNumber
     * 						value.
     *
     */
    
    SHIFT_NUMBER("ShiftNumber"),
    /**
     * Give the totals result per TotalsGroupID
     * 						value.
     *
     */
    
    TOTALS_GROUP_ID("TotalsGroupID");
    private final String value;
    TotalDetailsEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static TotalDetailsEnumeration fromValue(String v) {
        for (TotalDetailsEnumeration c: TotalDetailsEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
