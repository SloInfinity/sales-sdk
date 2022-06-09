//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
/**
 * Definition: Cryptographic Message Syntax (CMS) data structure containing digested data -- Reference: RFC 3852: Cryptographic Message Syntax (CMS) -- Usage: This data structure contains:  the version of the data structure  the identifiers of the message digest algorithms  the encapsulated content  the digested data
 *
 * <p>Java-Klasse für DigestedDataType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="DigestedDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DigestAlgorithm" type="{}AlgorithmIdentifier"/>
 *         &lt;element name="EncapsulatedContent" type="{}EncapsulatedContentType"/>
 *         &lt;element name="Digest" type="{}DigestType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Version" type="{}VersionTypeCode" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class DigestedDataType {
    @Element(name = "DigestAlgorithm", required = true)
    protected AlgorithmIdentifier digestAlgorithm;
    @Element(name = "EncapsulatedContent", required = true)
    protected EncapsulatedContentType encapsulatedContent;
    @Element(name = "Digest", required = true)
    protected byte[] digest;
    @Attribute(name = "Version", required = false)
    protected String version;
    /**
     * Ruft den Wert der digestAlgorithm-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link AlgorithmIdentifier }
     *
     */
    public AlgorithmIdentifier getDigestAlgorithm() {
        return digestAlgorithm;
    }
    /**
     * Legt den Wert der digestAlgorithm-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link AlgorithmIdentifier }
     *
     */
    public void setDigestAlgorithm(AlgorithmIdentifier value) {
        this.digestAlgorithm = value;
    }
    /**
     * Ruft den Wert der encapsulatedContent-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link EncapsulatedContentType }
     *
     */
    public EncapsulatedContentType getEncapsulatedContent() {
        return encapsulatedContent;
    }
    /**
     * Legt den Wert der encapsulatedContent-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link EncapsulatedContentType }
     *
     */
    public void setEncapsulatedContent(EncapsulatedContentType value) {
        this.encapsulatedContent = value;
    }
    /**
     * Ruft den Wert der digest-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDigest() {
        return digest;
    }
    /**
     * Legt den Wert der digest-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDigest(byte[] value) {
        this.digest = value;
    }
    /**
     * Ruft den Wert der version-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVersion() {
        return version;
    }
    /**
     * Legt den Wert der version-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVersion(String value) {
        this.version = value;
    }
}
