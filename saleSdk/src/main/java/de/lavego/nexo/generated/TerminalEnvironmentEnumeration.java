//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

/**
 * <p>Java-Klasse für TerminalEnvironmentEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TerminalEnvironmentEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Attended"/>
 *     &lt;enumeration value="SemiAttended"/>
 *     &lt;enumeration value="Unattended"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum TerminalEnvironmentEnumeration {
    /**
     * The Sale Terminal is managed by a Cashier through the Sale
     * 						System. A Cashier Interface is provided by the POI System during the process
     * 						of a request from the
     *
     */
    
    ATTENDED("Attended"),
    /**
     * Without a Cashier Interface. The POI Terminal is managed by
     * 						the Customer through the Customer Interface. A Cashier could help the
     * 						Cardholder during the
     *
     */
    
    SEMI_ATTENDED("SemiAttended"),
    /**
     * The Sale Terminal is managed as a logical terminal without any
     * 						Cashier Interface (typically a background process). The POI Terminal is
     * 						managed by the Customer
     *
     */
    
    UNATTENDED("Unattended");
    private final String value;
    TerminalEnvironmentEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static TerminalEnvironmentEnumeration fromValue(String v) {
        for (TerminalEnvironmentEnumeration c: TerminalEnvironmentEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
