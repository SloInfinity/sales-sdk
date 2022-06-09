//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

/**
 * <p>Java-Klasse für StoredValueAccountTypeEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="StoredValueAccountTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GiftCard"/>
 *     &lt;enumeration value="PhoneCard"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum StoredValueAccountTypeEnumeration {
    /**
     * Payment mean issued by retailers or banks as a substitute to a
     * 						non-monetary gift.
     *
     */
    
    GIFT_CARD("GiftCard"),
    /**
     * Stored value instrument used to pay telephone services (e.g.
     * 						card or identifier).
     *
     */
    
    PHONE_CARD("PhoneCard"),
    /**
     * Other stored value instrument.
     *
     */
    
    OTHER("Other");
    private final String value;
    StoredValueAccountTypeEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static StoredValueAccountTypeEnumeration fromValue(String v) {
        for (StoredValueAccountTypeEnumeration c: StoredValueAccountTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
