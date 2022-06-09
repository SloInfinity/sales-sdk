//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

/**
 * <p>Java-Klasse für CharacterStyleEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CharacterStyleEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Normal"/>
 *     &lt;enumeration value="Bold"/>
 *     &lt;enumeration value="Italic"/>
 *     &lt;enumeration value="Underlined"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum CharacterStyleEnumeration {
    
    NORMAL("Normal"),
    
    BOLD("Bold"),
    
    ITALIC("Italic"),
    
    UNDERLINED("Underlined");
    private final String value;
    CharacterStyleEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static CharacterStyleEnumeration fromValue(String v) {
        for (CharacterStyleEnumeration c: CharacterStyleEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
