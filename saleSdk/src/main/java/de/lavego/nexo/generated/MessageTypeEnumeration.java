//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

/**
 * <p>Java-Klasse für MessageTypeEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Request"/>
 *     &lt;enumeration value="Response"/>
 *     &lt;enumeration value="Notification"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum MessageTypeEnumeration {
    /**
     * Request message that requires a response, except if the
     * 						request message mentions explicitely that a response message is not
     * 						expected.
     *
     */
    
    REQUEST("Request"),
    /**
     * Response message, sent to answer to a request
     * 						message.
     *
     */
    
    RESPONSE("Response"),
    /**
     * Unsollicited notification message that does not require an
     * 						answer.
     *
     */
    
    NOTIFICATION("Notification");
    private final String value;
    MessageTypeEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static MessageTypeEnumeration fromValue(String v) {
        for (MessageTypeEnumeration c: MessageTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
