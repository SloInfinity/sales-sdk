//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

/**
 * <p>Java-Klasse für LoyaltyHandlingEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="LoyaltyHandlingEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Forbidden"/>
 *     &lt;enumeration value="Processed"/>
 *     &lt;enumeration value="Allowed"/>
 *     &lt;enumeration value="Proposed"/>
 *     &lt;enumeration value="Required"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum LoyaltyHandlingEnumeration {
    /**
     * No loyalty card to read and loyalty transaction to process.
     * 						Any attempt to enter a pure loyalty card is rejected.
     *
     */
    
    FORBIDDEN("Forbidden"),
    /**
     * The loyalty transaction is already processed, no loyalty card
     * 						or loyalty transaction to process.
     *
     */
    
    PROCESSED("Processed"),
    /**
     * The loyalty is accepted, but the POI has not to require or ask
     * 						a loyalty card. The loyalty is involved by the payment card (e.g. an hybrid
     * 						or linked card).
     *
     */
    
    ALLOWED("Allowed"),
    /**
     * The loyalty is accepted, and the POI has to ask a loyalty
     * 						card. If the Customer does not enter a loyalty card, no loyalty transaction
     * 						is realised.
     *
     */
    
    PROPOSED("Proposed"),
    /**
     * The loyalty is required, and the POI refuses the processing of
     * 						the message request if the cardholder does not entre a loyalty
     * 						card
     *
     */
    
    REQUIRED("Required");
    private final String value;
    LoyaltyHandlingEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static LoyaltyHandlingEnumeration fromValue(String v) {
        for (LoyaltyHandlingEnumeration c: LoyaltyHandlingEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
