//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

/**
 * <p>Java-Klasse für SoundActionEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SoundActionEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="StartSound"/>
 *     &lt;enumeration value="StopSound"/>
 *     &lt;enumeration value="SetDefaultVolume"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum SoundActionEnumeration {
    /**
     * Start the sound as specified in the
     * 						message.
     *
     */
    
    START_SOUND("StartSound"),
    /**
     * Stop the sound in progress.
     *
     */
    
    STOP_SOUND("StopSound"),
    /**
     * Set the default volume of sounds.
     *
     */
    
    SET_DEFAULT_VOLUME("SetDefaultVolume");
    private final String value;
    SoundActionEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static SoundActionEnumeration fromValue(String v) {
        for (SoundActionEnumeration c: SoundActionEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
