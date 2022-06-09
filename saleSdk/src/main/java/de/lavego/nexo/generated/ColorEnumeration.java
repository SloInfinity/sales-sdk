//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

/**
 * <p>Java-Klasse für ColorEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ColorEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="White"/>
 *     &lt;enumeration value="Black"/>
 *     &lt;enumeration value="Red"/>
 *     &lt;enumeration value="Green"/>
 *     &lt;enumeration value="Blue"/>
 *     &lt;enumeration value="Yellow"/>
 *     &lt;enumeration value="Magenta"/>
 *     &lt;enumeration value="Cyan"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum ColorEnumeration {
    
    WHITE("White"),
    
    BLACK("Black"),
    
    RED("Red"),
    
    GREEN("Green"),
    
    BLUE("Blue"),
    
    YELLOW("Yellow"),
    
    MAGENTA("Magenta"),
    
    CYAN("Cyan");
    private final String value;
    ColorEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static ColorEnumeration fromValue(String v) {
        for (ColorEnumeration c: ColorEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
