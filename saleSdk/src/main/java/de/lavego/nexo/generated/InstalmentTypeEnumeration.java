//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

/**
 * <p>Java-Klasse für InstalmentTypeEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="InstalmentTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DeferredInstalments"/>
 *     &lt;enumeration value="EqualInstalments"/>
 *     &lt;enumeration value="InequalInstalments"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum InstalmentTypeEnumeration {
    /**
     * The payment of the service or goods is
     * 						deferred.
     *
     */
    
    DEFERRED_INSTALMENTS("DeferredInstalments"),
    /**
     * The payment is split in several instalments of equal
     * 						amounts.
     *
     */
    
    EQUAL_INSTALMENTS("EqualInstalments"),
    /**
     * The payment is split in several instalments of different
     * 						amounts.
     *
     */
    
    INEQUAL_INSTALMENTS("InequalInstalments");
    private final String value;
    InstalmentTypeEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static InstalmentTypeEnumeration fromValue(String v) {
        for (InstalmentTypeEnumeration c: InstalmentTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
