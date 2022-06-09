//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

/**
 * <p>Java-Klasse für IdentificationSupportEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="IdentificationSupportEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NoCard"/>
 *     &lt;enumeration value="LoyaltyCard"/>
 *     &lt;enumeration value="HybridCard"/>
 *     &lt;enumeration value="LinkedCard"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum IdentificationSupportEnumeration {
    /**
     * The identification is not found on a card
     *
     */
    
    NO_CARD("NoCard"),
    /**
     * The identification is on a card dedicated to this loyalty
     * 						brand.
     *
     */
    
    LOYALTY_CARD("LoyaltyCard"),
    /**
     * The identification is on a card which might be used both for
     * 						the loyalty and the payment.
     *
     */
    
    HYBRID_CARD("HybridCard"),
    /**
     * The loyalty account is implicitly attached to the payment
     * 						card. This is usually detected by the loyalty Acquirer.
     *
     */
    
    LINKED_CARD("LinkedCard");
    private final String value;
    IdentificationSupportEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static IdentificationSupportEnumeration fromValue(String v) {
        for (IdentificationSupportEnumeration c: IdentificationSupportEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
