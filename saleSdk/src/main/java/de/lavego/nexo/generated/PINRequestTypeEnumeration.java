//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

/**
 * <p>Java-Klasse für PINRequestTypeEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PINRequestTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PINVerify"/>
 *     &lt;enumeration value="PINVerifyOnly"/>
 *     &lt;enumeration value="PINEnter"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum PINRequestTypeEnumeration {
    /**
     * The PIN Entering and Verify.
     *
     */
    
    PIN_VERIFY("PINVerify"),
    /**
     * The PIN Verify only, the PIN is entered before and the PIN
     * 						Block (encrypted PIN) is provided.
     *
     */
    
    PIN_VERIFY_ONLY("PINVerifyOnly"),
    /**
     * The PIN is entered by the Cardholder, encrypted by the POI,
     * 						and provided as a result.
     *
     */
    
    PIN_ENTER("PINEnter");
    private final String value;
    PINRequestTypeEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static PINRequestTypeEnumeration fromValue(String v) {
        for (PINRequestTypeEnumeration c: PINRequestTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
