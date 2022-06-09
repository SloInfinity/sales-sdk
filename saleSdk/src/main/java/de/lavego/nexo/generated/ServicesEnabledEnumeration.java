//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

/**
 * <p>Java-Klasse für ServicesEnabledEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ServicesEnabledEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CardAcquisition"/>
 *     &lt;enumeration value="Payment"/>
 *     &lt;enumeration value="Loyalty"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum ServicesEnabledEnumeration {
    /**
     * Enable the POI to process a card acquisition before the
     * 						request of the Sale System (e.g. the same processing than the
     * 						CardAcquisition command, but no more)
     *
     */
    
    CARD_ACQUISITION("CardAcquisition"),
    /**
     * Enable the POI to start a payment transaction before the
     * 						request of the Sale System (e.g. the same processing than the Payment
     * 						command)
     *
     */
    
    PAYMENT("Payment"),
    /**
     * Enable the POI to start a loyalty transaction before the
     * 						request of the Sale System (e.g. the same processing than the Loyalty
     * 						command)
     *
     */
    
    LOYALTY("Loyalty");
    private final String value;
    ServicesEnabledEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static ServicesEnabledEnumeration fromValue(String v) {
        for (ServicesEnabledEnumeration c: ServicesEnabledEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
