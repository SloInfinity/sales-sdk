//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

/**
 * <p>Java-Klasse für PeriodUnitEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PeriodUnitEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Daily"/>
 *     &lt;enumeration value="Weekly"/>
 *     &lt;enumeration value="Monthly"/>
 *     &lt;enumeration value="Annual"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum PeriodUnitEnumeration {
    /**
     * The day is the unit of the period.
     *
     */
    
    DAILY("Daily"),
    /**
     * The week is the unit of the period.
     *
     */
    
    WEEKLY("Weekly"),
    /**
     * The month is the unit of the period.
     *
     */
    
    MONTHLY("Monthly"),
    /**
     * The year is the unit of the period.
     *
     */
    
    ANNUAL("Annual");
    private final String value;
    PeriodUnitEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static PeriodUnitEnumeration fromValue(String v) {
        for (PeriodUnitEnumeration c: PeriodUnitEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
