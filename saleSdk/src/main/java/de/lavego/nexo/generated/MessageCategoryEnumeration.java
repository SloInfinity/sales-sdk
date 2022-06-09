//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

/**
 * <p>Java-Klasse für MessageCategoryEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageCategoryEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Abort"/>
 *     &lt;enumeration value="Admin"/>
 *     &lt;enumeration value="BalanceInquiry"/>
 *     &lt;enumeration value="Batch"/>
 *     &lt;enumeration value="CardAcquisition"/>
 *     &lt;enumeration value="CardReaderAPDU"/>
 *     &lt;enumeration value="CardReaderInit"/>
 *     &lt;enumeration value="CardReaderPowerOff"/>
 *     &lt;enumeration value="Diagnosis"/>
 *     &lt;enumeration value="Display"/>
 *     &lt;enumeration value="EnableService"/>
 *     &lt;enumeration value="Event"/>
 *     &lt;enumeration value="GetTotals"/>
 *     &lt;enumeration value="Input"/>
 *     &lt;enumeration value="InputUpdate"/>
 *     &lt;enumeration value="Login"/>
 *     &lt;enumeration value="Logout"/>
 *     &lt;enumeration value="Loyalty"/>
 *     &lt;enumeration value="Payment"/>
 *     &lt;enumeration value="PIN"/>
 *     &lt;enumeration value="Print"/>
 *     &lt;enumeration value="Reconciliation"/>
 *     &lt;enumeration value="Reversal"/>
 *     &lt;enumeration value="Sound"/>
 *     &lt;enumeration value="StoredValue"/>
 *     &lt;enumeration value="TransactionStatus"/>
 *     &lt;enumeration value="Transmit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum MessageCategoryEnumeration {
    /**
     * Abort message request
     *
     */
    
    ABORT("Abort"),
    /**
     * Admin request or response
     *
     */
    
    ADMIN("Admin"),
    /**
     * Balance Inquiry request or response
     *
     */
    
    BALANCE_INQUIRY("BalanceInquiry"),
    /**
     * Batch request or response
     *
     */
    
    BATCH("Batch"),
    /**
     * Card Acquisition request or response
     *
     */
    
    CARD_ACQUISITION("CardAcquisition"),
    /**
     * Card Reader APDU request or response
     *
     */
    
    CARD_READER_APDU("CardReaderAPDU"),
    /**
     * Card Reader Init request or response
     *
     */
    
    CARD_READER_INIT("CardReaderInit"),
    /**
     * Card Reader Power-Off request or response
     *
     */
    
    CARD_READER_POWER_OFF("CardReaderPowerOff"),
    /**
     * Diagnosis request or response
     *
     */
    
    DIAGNOSIS("Diagnosis"),
    /**
     * Display message request or response
     *
     */
    
    DISPLAY("Display"),
    /**
     * Enable Service message request or response
     *
     */
    
    ENABLE_SERVICE("EnableService"),
    /**
     * Event Notification message
     *
     */
    
    EVENT("Event"),
    /**
     * GetTotals message request or response
     *
     */
    
    GET_TOTALS("GetTotals"),
    /**
     * Input message request or response
     *
     */
    
    INPUT("Input"),
    /**
     * Input Update message
     *
     */
    
    INPUT_UPDATE("InputUpdate"),
    /**
     * Login message request or response
     *
     */
    
    LOGIN("Login"),
    /**
     * Logout message request or response
     *
     */
    
    LOGOUT("Logout"),
    /**
     * Loyalty message request or response
     *
     */
    
    LOYALTY("Loyalty"),
    /**
     * Payment message request or response
     *
     */
    
    PAYMENT("Payment"),
    /**
     * PIN message request or response
     *
     */
    PIN("PIN"),
    /**
     * Print message request or response
     *
     */
    
    PRINT("Print"),
    /**
     * Reconciliation message request or response
     *
     */
    
    RECONCILIATION("Reconciliation"),
    /**
     * Reversal message request or response
     *
     */
    
    REVERSAL("Reversal"),
    /**
     * Sound message request or response
     *
     */
    
    SOUND("Sound"),
    /**
     * Stored Value message request or response
     *
     */
    
    STORED_VALUE("StoredValue"),
    /**
     * TransactionStatus message request or
     * 						response
     *
     */
    
    TRANSACTION_STATUS("TransactionStatus"),
    /**
     * Transmit message request or response
     *
     */
    
    TRANSMIT("Transmit");
    private final String value;
    MessageCategoryEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static MessageCategoryEnumeration fromValue(String v) {
        for (MessageCategoryEnumeration c: MessageCategoryEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
