//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

/**
 * <p>Java-Klasse für ForceEntryModeEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ForceEntryModeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RFID"/>
 *     &lt;enumeration value="Keyed"/>
 *     &lt;enumeration value="Manual"/>
 *     &lt;enumeration value="File"/>
 *     &lt;enumeration value="Scanned"/>
 *     &lt;enumeration value="MagStripe"/>
 *     &lt;enumeration value="ICC"/>
 *     &lt;enumeration value="SynchronousICC"/>
 *     &lt;enumeration value="Tapped"/>
 *     &lt;enumeration value="Contactless"/>
 *     &lt;enumeration value="CheckReader"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum ForceEntryModeEnumeration {
    /**
     * Payment instrument information are taken from
     * 						RFID
     *
     */
    RFID("RFID"),
    /**
     * Manual key entry
     *
     */
    
    KEYED("Keyed"),
    /**
     * Reading of embossing or OCR of printed data either at time of
     * 						transaction or after the event.
     *
     */
    
    MANUAL("Manual"),
    /**
     * Account data on file
     *
     */
    
    FILE("File"),
    /**
     * Scanned by a bar code reader.
     *
     */
    
    SCANNED("Scanned"),
    /**
     * Magnetic stripe
     *
     */
    
    MAG_STRIPE("MagStripe"),
    /**
     * Contact ICC (asynchronous)
     *
     */
    ICC("ICC"),
    /**
     * Contact ICC (synchronous)
     *
     */
    
    SYNCHRONOUS_ICC("SynchronousICC"),
    /**
     * Contactless card reader Magnetic Stripe
     *
     */
    
    TAPPED("Tapped"),
    /**
     * Contactless card reader conform to ISO
     * 						14443
     *
     */
    
    CONTACTLESS("Contactless"),
    /**
     * Check Reader
     *
     */
    
    CHECK_READER("CheckReader");
    private final String value;
    ForceEntryModeEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static ForceEntryModeEnumeration fromValue(String v) {
        for (ForceEntryModeEnumeration c: ForceEntryModeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
