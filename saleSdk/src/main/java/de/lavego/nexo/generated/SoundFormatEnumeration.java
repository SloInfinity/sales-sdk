//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

/**
 * <p>Java-Klasse für SoundFormatEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SoundFormatEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SoundRef"/>
 *     &lt;enumeration value="MessageRef"/>
 *     &lt;enumeration value="Text"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum SoundFormatEnumeration {
    /**
     * Preloaded sound File.
     *
     */
    
    SOUND_REF("SoundRef"),
    /**
     * Reference of a preloaded text to play.
     *
     */
    
    MESSAGE_REF("MessageRef"),
    /**
     * Text to play.
     *
     */
    
    TEXT("Text");
    private final String value;
    SoundFormatEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static SoundFormatEnumeration fromValue(String v) {
        for (SoundFormatEnumeration c: SoundFormatEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
