//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

/**
 * <p>Java-Klasse für LoyaltyTransactionTypeEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="LoyaltyTransactionTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Award"/>
 *     &lt;enumeration value="Rebate"/>
 *     &lt;enumeration value="Redemption"/>
 *     &lt;enumeration value="AwardRefund"/>
 *     &lt;enumeration value="RebateRefund"/>
 *     &lt;enumeration value="RedemptionRefund"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum LoyaltyTransactionTypeEnumeration {
    /**
     * Direct or payment related award on a loyalty account. Award
     * 						alone, award associated to a payment (may be with an additional award
     * 						alone), award because of a
     *
     */
    
    AWARD("Award"),
    /**
     * Rebate on a total amount, sale item amount, or sale
     * 						items
     *
     */
    
    REBATE("Rebate"),
    /**
     * Redemption on a loyalty account.
     *
     */
    
    REDEMPTION("Redemption"),
    /**
     * Refund of a loyalty award transaction.
     *
     */
    
    AWARD_REFUND("AwardRefund"),
    /**
     * Refund of a loyalty rebate transaction.
     *
     */
    
    REBATE_REFUND("RebateRefund"),
    /**
     * Refund of a loyalty redemption transaction.
     *
     */
    
    REDEMPTION_REFUND("RedemptionRefund");
    private final String value;
    LoyaltyTransactionTypeEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static LoyaltyTransactionTypeEnumeration fromValue(String v) {
        for (LoyaltyTransactionTypeEnumeration c: LoyaltyTransactionTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
