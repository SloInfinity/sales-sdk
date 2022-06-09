//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

/**
 * <p>Java-Klasse für IdentificationTypeEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="IdentificationTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PAN"/>
 *     &lt;enumeration value="ISOTrack2"/>
 *     &lt;enumeration value="BarCode"/>
 *     &lt;enumeration value="AccountNumber"/>
 *     &lt;enumeration value="PhoneNumber"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum IdentificationTypeEnumeration {
    /**
     * Standard card identification (card number)
     *
     */
    PAN("PAN"),
    /**
     * ISO Track 2 including identification.
     *
     */
    
    ISO_TRACK_2("ISOTrack2"),
    /**
     * Bar-code with a specific form of
     * 						identification
     *
     */
    
    BAR_CODE("BarCode"),
    /**
     * Account number
     *
     */
    
    ACCOUNT_NUMBER("AccountNumber"),
    /**
     * A phone number identifies the account on which the phone card
     * 						is assigned.
     *
     */
    
    PHONE_NUMBER("PhoneNumber");
    private final String value;
    IdentificationTypeEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static IdentificationTypeEnumeration fromValue(String v) {
        for (IdentificationTypeEnumeration c: IdentificationTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
