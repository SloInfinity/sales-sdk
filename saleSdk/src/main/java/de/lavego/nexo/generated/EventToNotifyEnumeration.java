//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

/**
 * <p>Java-Klasse für EventToNotifyEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="EventToNotifyEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BeginMaintenance"/>
 *     &lt;enumeration value="EndMaintenance"/>
 *     &lt;enumeration value="Shutdown"/>
 *     &lt;enumeration value="Initialised"/>
 *     &lt;enumeration value="OutOfOrder"/>
 *     &lt;enumeration value="Completed"/>
 *     &lt;enumeration value="Abort"/>
 *     &lt;enumeration value="SaleWakeUp"/>
 *     &lt;enumeration value="SaleAdmin"/>
 *     &lt;enumeration value="CustomerLanguage"/>
 *     &lt;enumeration value="KeyPressed"/>
 *     &lt;enumeration value="SecurityAlarm"/>
 *     &lt;enumeration value="StopAssistance"/>
 *     &lt;enumeration value="CardInserted"/>
 *     &lt;enumeration value="CardRemoved"/>
 *     &lt;enumeration value="Reject"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum EventToNotifyEnumeration {
    /**
     * Begin of POI Maintenance
     *
     */
    
    BEGIN_MAINTENANCE("BeginMaintenance"),
    /**
     * End of POI Maintenance
     *
     */
    
    END_MAINTENANCE("EndMaintenance"),
    /**
     * The POI Terminal or the POI System is shutting
     * 						down
     *
     */
    
    SHUTDOWN("Shutdown"),
    /**
     * The POI Terminal or the POI System is now ready to
     * 						work
     *
     */
    
    INITIALISED("Initialised"),
    /**
     * The POI Terminal or the POI System cannot
     * 						work
     *
     */
    
    OUT_OF_ORDER("OutOfOrder"),
    /**
     * An Abort request has been sent to abort a message which is
     * 						already completed.
     *
     */
    
    COMPLETED("Completed"),
    /**
     * One or several device request has been sent by the POI during
     * 						the processing of a service requested by the Sale System. The processing is
     * 						cancelled by the
     *
     */
    
    ABORT("Abort"),
    /**
     * A POI terminal requests the payment of the transaction
     * 						identified by the content of EventDetails in the Event
     * 						notification.
     *
     */
    
    SALE_WAKE_UP("SaleWakeUp"),
    /**
     * The POI has performed, or want to perform an automatic
     * 						administrative process, e.g. the reports at the end of
     * 						day.
     *
     */
    
    SALE_ADMIN("SaleAdmin"),
    /**
     * The customer has selected a different language on the
     * 						POI.
     *
     */
    
    CUSTOMER_LANGUAGE("CustomerLanguage"),
    /**
     * The customer has pressed a specific key on the
     * 						POI.
     *
     */
    
    KEY_PRESSED("KeyPressed"),
    /**
     * Problem of security
     *
     */
    
    SECURITY_ALARM("SecurityAlarm"),
    /**
     * When the Customer assistance is stopped, because the Customer
     * 						has completed its input.
     *
     */
    
    STOP_ASSISTANCE("StopAssistance"),
    /**
     * A card is inserted in the card reader (see Input request and
     * 						NotifyCardInputFlag)
     *
     */
    
    CARD_INSERTED("CardInserted"),
    /**
     * A card is removed from the card reader.
     *
     */
    
    CARD_REMOVED("CardRemoved"),
    /**
     * A message request is rejected. An error explanation and the
     * 						message in error have to be put in the EventDetails data
     * 						element.
     *
     */
    
    REJECT("Reject");
    private final String value;
    EventToNotifyEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static EventToNotifyEnumeration fromValue(String v) {
        for (EventToNotifyEnumeration c: EventToNotifyEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
