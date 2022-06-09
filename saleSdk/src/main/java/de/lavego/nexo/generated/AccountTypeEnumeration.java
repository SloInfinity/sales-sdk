//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;
/**
 * <p>Java-Klasse für AccountTypeEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="Savings"/>
 *     &lt;enumeration value="Checking"/>
 *     &lt;enumeration value="CreditCard"/>
 *     &lt;enumeration value="Universal"/>
 *     &lt;enumeration value="Investment"/>
 *     &lt;enumeration value="CardTotals"/>
 *     &lt;enumeration value="EpurseCard"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum AccountTypeEnumeration {
    /**
     * Default account
     *
     */
    
    DEFAULT("Default"),
    /**
     * Savings account
     *
     */
    
    SAVINGS("Savings"),
    /**
     * Checking account
     *
     */
    
    CHECKING("Checking"),
    /**
     * Credit card account
     *
     */
    
    CREDIT_CARD("CreditCard"),
    /**
     * Universal account
     *
     */
    
    UNIVERSAL("Universal"),
    /**
     * Investment account
     *
     */
    
    INVESTMENT("Investment"),
    /**
     * Card totals
     *
     */
    
    CARD_TOTALS("CardTotals"),
    /**
     * e-Purse card account
     *
     */
    
    EPURSE_CARD("EpurseCard");
    private final String value;
    AccountTypeEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static AccountTypeEnumeration fromValue(String v) {
        for (AccountTypeEnumeration c: AccountTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
