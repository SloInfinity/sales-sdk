//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;
/**
 * <p>Java-Klasse für AttributeTypeEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AttributeTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="id-at-commonName"/>
 *     &lt;enumeration value="id-at-localityName"/>
 *     &lt;enumeration value="id-at-organizationName"/>
 *     &lt;enumeration value="id-at-organizationalUnitName"/>
 *     &lt;enumeration value="id-at-countryName"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum AttributeTypeEnumeration {
    /**
     * Common Name - (OID: joint-iso-ccitt(2) ds(5) 4 3)
     *
     */
    
    ID_AT_COMMON_NAME("id-at-commonName"),
    /**
     * Locality - (OID: joint-iso-ccitt(2) ds(5) 4 7)
     *
     */
    
    ID_AT_LOCALITY_NAME("id-at-localityName"),
    /**
     * Organization Name - (OID: joint-iso-ccitt(2) ds(5) 4 10)
     *
     */
    
    ID_AT_ORGANIZATION_NAME("id-at-organizationName"),
    /**
     * Organization Unit Name - (OID: joint-iso-ccitt(2) ds(5) 4 11)
     *
     */
    
    ID_AT_ORGANIZATIONAL_UNIT_NAME("id-at-organizationalUnitName"),
    /**
     * Country Name - (OID: joint-iso-ccitt(2) ds(5) 4 6)
     *
     */
    
    ID_AT_COUNTRY_NAME("id-at-countryName");
    private final String value;
    AttributeTypeEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static AttributeTypeEnumeration fromValue(String v) {
        for (AttributeTypeEnumeration c: AttributeTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
