//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

/**
 * <p>Java-Klasse für ContentTypeEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ContentTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="id-data"/>
 *     &lt;enumeration value="id-signedData"/>
 *     &lt;enumeration value="id-envelopedData"/>
 *     &lt;enumeration value="id-digestedData"/>
 *     &lt;enumeration value="id-encryptedData"/>
 *     &lt;enumeration value="id-ct-authData"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum ContentTypeEnumeration {
    /**
     * Generic, non cryptographic, or unqualified data content - (OID: iso(1) member-body(2) us(840) rsadsi(113549) pkcs(1) pkcs7(7) 1)
     *
     */
    
    ID_DATA("id-data"),
    /**
     * Signature CMS data content  - (OID: iso(1) member-body(2) us(840) rsadsi(113549) pkcs(1) pkcs7(7) 2)
     *
     */
    
    ID_SIGNED_DATA("id-signedData"),
    /**
     * Encrypted CMS data content, with encryption key - (OID: iso(1) member-body(2) us(840) rsadsi(113549) pkcs(1) pkcs7(7) 3)
     *
     */
    
    ID_ENVELOPED_DATA("id-envelopedData"),
    /**
     * Message digest CMS data content - (OID: iso(1) member-body(2) us(840) rsadsi(113549) pkcs(1) pkcs7(7) 5)
     *
     */
    
    ID_DIGESTED_DATA("id-digestedData"),
    /**
     * Encrypted CMS data content - (OID: iso(1) member-body(2) us(840) rsadsi(113549) pkcs(1) pkcs7(7) 6)
     *
     */
    
    ID_ENCRYPTED_DATA("id-encryptedData"),
    /**
     * MAC CMS data content, with encryption key - (OID: iso(1) member- body(2) us(840) rsadsi(113549) pkcs(1) pkcs9(9) smime(16) ct(1) 2)
     *
     */
    
    ID_CT_AUTH_DATA("id-ct-authData");
    private final String value;
    ContentTypeEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static ContentTypeEnumeration fromValue(String v) {
        for (ContentTypeEnumeration c: ContentTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
