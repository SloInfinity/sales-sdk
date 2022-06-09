//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

/**
 * <p>Java-Klasse für ReversalReasonEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ReversalReasonEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CustCancel"/>
 *     &lt;enumeration value="MerchantCancel"/>
 *     &lt;enumeration value="Malfunction"/>
 *     &lt;enumeration value="Unable2Compl"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum ReversalReasonEnumeration {
    /**
     * Customer cancellation
     *
     */
    
    CUST_CANCEL("CustCancel"),
    /**
     * Cashier cancellation
     *
     */
    
    MERCHANT_CANCEL("MerchantCancel"),
    /**
     * Suspected malfunction
     *
     */
    
    MALFUNCTION("Malfunction"),
    /**
     * Card acceptor device unable to complete
     * 						transaction
     *
     */
    
    UNABLE_2_COMPL("Unable2Compl");
    private final String value;
    ReversalReasonEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static ReversalReasonEnumeration fromValue(String v) {
        for (ReversalReasonEnumeration c: ReversalReasonEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
