//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

/**
 * <p>Java-Klasse für OutputFormatEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="OutputFormatEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MessageRef"/>
 *     &lt;enumeration value="Text"/>
 *     &lt;enumeration value="XHTML"/>
 *     &lt;enumeration value="BarCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum OutputFormatEnumeration {
    /**
     * Predefined message (of any format) on the POI or the Sale. The
     * 						output is then a PredefinedContent data structure.
     *
     */
    
    MESSAGE_REF("MessageRef"),
    /**
     * Text message including control characters prefixed by an
     * 						escape character. The DisplayOutput is then an OutputText data
     * 						structure.
     *
     */
    
    TEXT("Text"),
    /**
     * DisplayOutput uses the eXtensible HyperText Markup
     * 						Language.
     *
     */
    XHTML("XHTML"),
    /**
     * Barcode type to print The output is then a OutputBarCode data
     * 						structure.
     *
     */
    
    BAR_CODE("BarCode");
    private final String value;
    OutputFormatEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static OutputFormatEnumeration fromValue(String v) {
        for (OutputFormatEnumeration c: OutputFormatEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
