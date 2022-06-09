//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

/**
 * <p>Java-Klasse für DeviceEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DeviceEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CashierDisplay"/>
 *     &lt;enumeration value="CustomerDisplay"/>
 *     &lt;enumeration value="CashierInput"/>
 *     &lt;enumeration value="CustomerInput"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum DeviceEnumeration {
    /**
     * Used by the POI System (or the Sale System when the device is
     * 						managed by the POI Terminal), to display some information to the
     * 						Cashier.
     *
     */
    
    CASHIER_DISPLAY("CashierDisplay"),
    /**
     * Used by the Sale System (or the POI System when the device is
     * 						managed by the Sale Terminal), to display some information to the
     * 						Customer.
     *
     */
    
    CUSTOMER_DISPLAY("CustomerDisplay"),
    /**
     * Any kind of keyboard allowing all or part of the commands of
     * 						the Input message request from the Sale System to the POI System
     * 						(InputCommand data element). The
     *
     */
    
    CASHIER_INPUT("CashierInput"),
    /**
     * Any kind of keyboard allowing all or part of the commands of
     * 						the Input message request from the POI System to the Sale System
     * 						(InputCommand data element). The
     *
     */
    
    CUSTOMER_INPUT("CustomerInput");
    private final String value;
    DeviceEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static DeviceEnumeration fromValue(String v) {
        for (DeviceEnumeration c: DeviceEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
