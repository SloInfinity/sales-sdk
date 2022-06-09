//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

/**
 * <p>Java-Klasse für TransactionActionEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionActionEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="StartTransaction"/>
 *     &lt;enumeration value="AbortTransaction"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum TransactionActionEnumeration {
    /**
     * Start a transaction by a swipe ahead mechanism, with the
     * 						services which are enabled.
     *
     */
    
    START_TRANSACTION("StartTransaction"),
    /**
     * Abort a transaction started either by a CardAcquisition or
     * 						EnableService with TransactionAction to "StartTransaction", not followed by
     * 						a service request from
     *
     */
    
    ABORT_TRANSACTION("AbortTransaction");
    private final String value;
    TransactionActionEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static TransactionActionEnumeration fromValue(String v) {
        for (TransactionActionEnumeration c: TransactionActionEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
