//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

/**
 * <p>Java-Klasse für PaymentInstrumentTypeEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentInstrumentTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Card"/>
 *     &lt;enumeration value="Check"/>
 *     &lt;enumeration value="Mobile"/>
 *     &lt;enumeration value="StoredValue"/>
 *     &lt;enumeration value="Cash"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum PaymentInstrumentTypeEnumeration {
    /**
     * Payment card (credit or debit).
     *
     */
    
    CARD("Card"),
    /**
     * Paper check.
     *
     */
    
    CHECK("Check"),
    /**
     * Operator account accessed by a mobile
     * 						phone.
     *
     */
    
    MOBILE("Mobile"),
    /**
     * Account accesed by a stored value instrument such as a card or
     * 						a certificate.
     *
     */
    
    STORED_VALUE("StoredValue"),
    /**
     * Cash managed by a cash handling system.
     *
     */
    
    CASH("Cash");
    private final String value;
    PaymentInstrumentTypeEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static PaymentInstrumentTypeEnumeration fromValue(String v) {
        for (PaymentInstrumentTypeEnumeration c: PaymentInstrumentTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
