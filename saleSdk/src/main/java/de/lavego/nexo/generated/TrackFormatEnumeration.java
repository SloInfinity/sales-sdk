//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

/**
 * <p>Java-Klasse für TrackFormatEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TrackFormatEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ISO"/>
 *     &lt;enumeration value="JIS-I"/>
 *     &lt;enumeration value="JIS-II"/>
 *     &lt;enumeration value="AAMVA"/>
 *     &lt;enumeration value="CMC-7"/>
 *     &lt;enumeration value="E-13B"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum TrackFormatEnumeration {
    /**
     * ISO card track format - ISO 7813 - ISO 4909
     *
     */
    ISO("ISO"),
    /**
     * Japenese track format I
     *
     */
    
    JIS_I("JIS-I"),
    /**
     * Japenese track format II
     *
     */
    
    JIS_II("JIS-II"),
    /**
     * American driver license
     *
     */
    AAMVA("AAMVA"),
    /**
     * ((Magnetic Ink Character Recognition, using the CMC-7 font -
     * 						ISO 1004) Line at the bottom of a check containing the bank account and the
     * 						check number.
     *
     */
    
    CMC_7("CMC-7"),
    /**
     * (Magnetic Ink Character Recognition, using the E-13B font)
     * 						Line at the bottom of a check containing the bank account and the check
     * 						number.
     *
     */
    
    E_13_B("E-13B");
    private final String value;
    TrackFormatEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static TrackFormatEnumeration fromValue(String v) {
        for (TrackFormatEnumeration c: TrackFormatEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
