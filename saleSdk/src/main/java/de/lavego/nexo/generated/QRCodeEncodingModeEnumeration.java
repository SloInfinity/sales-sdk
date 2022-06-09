//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

/**
 * <p>Java-Klasse für QRCodeEncodingModeEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="QRCodeEncodingModeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Numeric"/>
 *     &lt;enumeration value="Alphanumeric"/>
 *     &lt;enumeration value="Binary"/>
 *     &lt;enumeration value="Kanji"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum QRCodeEncodingModeEnumeration {
    
    NUMERIC("Numeric"),
    
    ALPHANUMERIC("Alphanumeric"),
    
    BINARY("Binary"),
    
    KANJI("Kanji");
    private final String value;
    QRCodeEncodingModeEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static QRCodeEncodingModeEnumeration fromValue(String v) {
        for (QRCodeEncodingModeEnumeration c: QRCodeEncodingModeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
