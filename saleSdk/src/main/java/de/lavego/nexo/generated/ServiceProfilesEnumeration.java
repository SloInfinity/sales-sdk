//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;
/**
 * <p>Java-Klasse für ServiceProfilesEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceProfilesEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Synchro"/>
 *     &lt;enumeration value="Batch"/>
 *     &lt;enumeration value="OneTimeRes"/>
 *     &lt;enumeration value="Reservation"/>
 *     &lt;enumeration value="Loyalty"/>
 *     &lt;enumeration value="StoredValue"/>
 *     &lt;enumeration value="PIN"/>
 *     &lt;enumeration value="CardReader"/>
 *     &lt;enumeration value="Sound"/>
 *     &lt;enumeration value="Communication"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum ServiceProfilesEnumeration {
    /**
     * CardAcquisition and EnableService could be requested by the
     * 						Sale System to the POI System.
     *
     */

    Synchro("Synchro"),
    /**
     * When the POI is unable to perform transactions without the
     * 						Sale system, e.g. payment at delivery, the POI provides in a Batch the
     * 						performed transactions, and
     *
     */
    
    Batch("Batch"),
    /**
     * One Time Reservation service could be requested by the Sale
     * 						System (as petrol distribution)
     *
     */

    OneTimeRes("OneTimeRes"),
    /**
     * The Reservation services could be requested by the Sale
     * 						System
     *
     */

    Reservation("Reservation"),
    /**
     * Loyalty services could be requested by the Sale
     * 						System
     *
     */

    Loyalty("Loyalty"),
    /**
     * Stored Value service could be requested by the Sale
     * 						System
     *
     */

    StoredValue("StoredValue"),
    /**
     * The Sale System could request the PIN validation
     * 						services.
     *
     */
    PIN("PIN"),
    /**
     * The Sale System could request Card Reader
     * 						services.
     *
     */

    CardReader("CardReader"),
    /**
     * To produce various forms of sounds to a customer or an
     * 						operator interface.
     *
     */
    
    Sound("Sound"),
    /**
     * The POI or Sale System could request communication through the
     * 						Transmit device messages exchange.
     *
     */

    Communication("Communication");

    private final String value;
    ServiceProfilesEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static ServiceProfilesEnumeration fromValue(String v) {
        for (ServiceProfilesEnumeration c: ServiceProfilesEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
