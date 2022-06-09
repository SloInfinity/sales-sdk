//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

/**
 * <p>Java-Klasse für BarcodeTypeEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="BarcodeTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EAN8"/>
 *     &lt;enumeration value="EAN13"/>
 *     &lt;enumeration value="UPCA"/>
 *     &lt;enumeration value="Code25"/>
 *     &lt;enumeration value="Code128"/>
 *     &lt;enumeration value="PDF417"/>
 *     &lt;enumeration value="QRCODE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum BarcodeTypeEnumeration {
    
    EAN_8("EAN8"),
    
    EAN_13("EAN13"),
    UPCA("UPCA"),
    
    CODE_25("Code25"),
    
    CODE_128("Code128"),
    
    PDF_417("PDF417"),
    QRCODE("QRCODE");
    private final String value;
    BarcodeTypeEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static BarcodeTypeEnumeration fromValue(String v) {
        for (BarcodeTypeEnumeration c: BarcodeTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
