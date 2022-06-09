//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

/**
 * <p>Java-Klasse für ResponseModeEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ResponseModeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotRequired"/>
 *     &lt;enumeration value="Immediate"/>
 *     &lt;enumeration value="PrintEnd"/>
 *     &lt;enumeration value="SoundEnd"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum ResponseModeEnumeration {
    /**
     * The Message Response is not required, except in case of
     * 						error.
     *
     */
    
    NOT_REQUIRED("NotRequired"),
    /**
     * The Message Response is immediate, after taking into account
     * 						the request.
     *
     */
    
    IMMEDIATE("Immediate"),
    /**
     * The Print Response is required at the end of
     * 						print.
     *
     */
    
    PRINT_END("PrintEnd"),
    /**
     * The Sound Response is required at the end of
     * 						play.
     *
     */
    
    SOUND_END("SoundEnd");
    private final String value;
    ResponseModeEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static ResponseModeEnumeration fromValue(String v) {
        for (ResponseModeEnumeration c: ResponseModeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
