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
 * Definition: General Cryptographic Message Syntax (CMS) data structure -- Reference: RFC 3852: Cryptographic Message Syntax (CMS) -- Usage: This data structure contains two data elements:  The type of content of the CMS data structure   The content itself These CMS data structures could be nested to allow a sequence of cryptographic processings on a part of a message (e.g.
 *
 * <p>Java-Klasse für ContentInformationType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="ContentInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="EnvelopedData" type="{}EnvelopedDataType"/>
 *           &lt;element name="AuthenticatedData" type="{}AuthenticatedDataType"/>
 *           &lt;element name="SignedData" type="{}SignedDataType"/>
 *           &lt;element name="DigestedData" type="{}DigestedDataType"/>
 *           &lt;element name="NamedKeyEncryptedData" type="{}NamedKeyEncryptedDataType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="ContentType" use="required" type="{}ContentTypeTypeCode" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class ContentInformationType {
    @Element(name = "EnvelopedData", required = false)
    protected EnvelopedDataType envelopedData;
    @Element(name = "AuthenticatedData", required = false)
    protected AuthenticatedDataType authenticatedData;
    @Element(name = "SignedData", required = false)
    protected SignedDataType signedData;
    @Element(name = "DigestedData", required = false)
    protected DigestedDataType digestedData;
    @Element(name = "NamedKeyEncryptedData", required = false)
    protected NamedKeyEncryptedDataType namedKeyEncryptedData;
    @Attribute(name = "ContentType", required = true)
    protected String contentType;
    /**
     * Ruft den Wert der envelopedData-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link EnvelopedDataType }
     *
     */
    public EnvelopedDataType getEnvelopedData() {
        return envelopedData;
    }
    /**
     * Legt den Wert der envelopedData-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link EnvelopedDataType }
     *
     */
    public void setEnvelopedData(EnvelopedDataType value) {
        this.envelopedData = value;
    }
    /**
     * Ruft den Wert der authenticatedData-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link AuthenticatedDataType }
     *
     */
    public AuthenticatedDataType getAuthenticatedData() {
        return authenticatedData;
    }
    /**
     * Legt den Wert der authenticatedData-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link AuthenticatedDataType }
     *
     */
    public void setAuthenticatedData(AuthenticatedDataType value) {
        this.authenticatedData = value;
    }
    /**
     * Ruft den Wert der signedData-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link SignedDataType }
     *
     */
    public SignedDataType getSignedData() {
        return signedData;
    }
    /**
     * Legt den Wert der signedData-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link SignedDataType }
     *
     */
    public void setSignedData(SignedDataType value) {
        this.signedData = value;
    }
    /**
     * Ruft den Wert der digestedData-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link DigestedDataType }
     *
     */
    public DigestedDataType getDigestedData() {
        return digestedData;
    }
    /**
     * Legt den Wert der digestedData-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link DigestedDataType }
     *
     */
    public void setDigestedData(DigestedDataType value) {
        this.digestedData = value;
    }
    /**
     * Ruft den Wert der namedKeyEncryptedData-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link NamedKeyEncryptedDataType }
     *
     */
    public NamedKeyEncryptedDataType getNamedKeyEncryptedData() {
        return namedKeyEncryptedData;
    }
    /**
     * Legt den Wert der namedKeyEncryptedData-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link NamedKeyEncryptedDataType }
     *
     */
    public void setNamedKeyEncryptedData(NamedKeyEncryptedDataType value) {
        this.namedKeyEncryptedData = value;
    }
    /**
     * Ruft den Wert der contentType-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getContentType() {
        return contentType;
    }
    /**
     * Legt den Wert der contentType-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setContentType(String value) {
        this.contentType = value;
    }
}
