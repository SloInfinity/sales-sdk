//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

/**
 * <p>Java-Klasse für StoredValueTransactionTypeEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="StoredValueTransactionTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Reserve"/>
 *     &lt;enumeration value="Activate"/>
 *     &lt;enumeration value="Load"/>
 *     &lt;enumeration value="Unload"/>
 *     &lt;enumeration value="Reverse"/>
 *     &lt;enumeration value="Duplicate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum StoredValueTransactionTypeEnumeration {
    /**
     * Reserve the account (e.g. get an activation
     * 						code)
     *
     */
    
    RESERVE("Reserve"),
    /**
     * Activate the account or the card
     *
     */
    
    ACTIVATE("Activate"),
    /**
     * Load the account or the card with money
     *
     */
    
    LOAD("Load"),
    /**
     * Unload the account
     *
     */
    
    UNLOAD("Unload"),
    /**
     * Reverse an activation or loading.
     *
     */
    
    REVERSE("Reverse"),
    /**
     * Duplicate the code or number provided by the loading or
     * 						activation
     *
     */
    
    DUPLICATE("Duplicate");
    private final String value;
    StoredValueTransactionTypeEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static StoredValueTransactionTypeEnumeration fromValue(String v) {
        for (StoredValueTransactionTypeEnumeration c: StoredValueTransactionTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
