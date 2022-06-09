//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

/**
 * <p>Java-Klasse für AlgorithmEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AlgorithmEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="id-retail-cbc-mac"/>
 *     &lt;enumeration value="id-retail-cbc-mac-sha-256"/>
 *     &lt;enumeration value="id-ukpt-wrap "/>
 *     &lt;enumeration value="id-dukpt-wrap"/>
 *     &lt;enumeration value="des-ede3-ecb"/>
 *     &lt;enumeration value="des-ede3-cbc"/>
 *     &lt;enumeration value="id-sha256"/>
 *     &lt;enumeration value="sha256WithRSAEncryption"/>
 *     &lt;enumeration value="rsaEncryption"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum AlgorithmEnumeration {
    /**
     * Retail CBC-MAC (cf. ISO 9807, ANSI X9.19) - (OID: iso(1) member-body(2) fr(250) type-org (1) gie-cb(79) algorithm(10) nexo(1) 2)
     *
     */
    
    ID_RETAIL_CBC_MAC("id-retail-cbc-mac"),
    /**
     * Retail-CBC-MAC with SHA-256  - (OID: iso(1) member-body(2) fr(250) type-org (1) gie-cb(79) algorithm(10) nexo(1) 3)
     *
     */
    
    ID_RETAIL_CBC_MAC_SHA_256("id-retail-cbc-mac-sha-256"),
    /**
     * The UKPT or Master Session Key key encryption - (OID: iso(1) member-body(2) fr(250) type-org (1) gie-cb(79) algorithm(10) nexo(1) 4)
     *
     */
    
    ID_UKPT_WRAP("id-ukpt-wrap "),
    /**
     * DUKPT is specified in ANS X9.24-2004, Annex A, and ISO/DIS 13492-2006.  - (OID: iso(1) member-body(2) fr(250) type-org (1) gie-cb(79) algorithm(10) nexo(1) 1)
     *
     */
    
    ID_DUKPT_WRAP("id-dukpt-wrap"),
    /**
     * Triple DES ECB encryption with double length key (112 Bit) as defined in FIPS PUB 46-3 - (OID: iso(1) member-body(2) fr(250) type-org (1) gie-cb(79)
     *
     */
    
    DES_EDE_3_ECB("des-ede3-ecb"),
    /**
     * Triple DES CBC encryption with double length key (112 Bit) as defined in FIPS PUB 46-3 - (OID: iso(1) member-body(2) us(840) rsadsi(113549)
     *
     */
    
    DES_EDE_3_CBC("des-ede3-cbc"),
    /**
     * Message Digest Algorithm SHA-256 as defined in FIPS 180-1 and 2 - (ISO20022 Label: SHA256)
     *
     */
    
    ID_SHA_256("id-sha256"),
    /**
     * Signature Algorithms SHA-256 with RSA - (OID: iso(1) member-body(2) us(840) rsadsi(113549) pkcs(1) pkcs-1(1) 11)
     *
     */
    
    SHA_256_WITH_RSA_ENCRYPTION("sha256WithRSAEncryption"),
    /**
     * Key Transport Algorithm RSA - (OID: iso(1) member-body(2) us(840) rsadsi(113549) pkcs(1) pkcs-1(1) 1)
     *
     */
    
    RSA_ENCRYPTION("rsaEncryption");
    private final String value;
    AlgorithmEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static AlgorithmEnumeration fromValue(String v) {
        for (AlgorithmEnumeration c: AlgorithmEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
