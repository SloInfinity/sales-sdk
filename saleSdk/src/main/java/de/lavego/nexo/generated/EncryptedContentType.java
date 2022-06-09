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
 * Definition: Cryptographic Message Syntax (CMS) data structure containing encrypted data with encryption key -- Reference: RFC 3852: Cryptographic Message Syntax (CMS) -- Usage: This data structure contains: the type of the encrypted content, which is id-data for an application data or another CMS data structure the protected encryption key for every recipient the encrypted data
 *
 * <p>Java-Klasse für EncryptedContentType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="EncryptedContentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContentEncryptionAlgorithm" type="{}AlgorithmIdentifier"/>
 *         &lt;element name="EncryptedData" type="{}EncryptedDataType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ContentType" use="required" type="{}ContentTypeTypeCode" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class EncryptedContentType {
    @Element(name = "ContentEncryptionAlgorithm", required = true)
    protected AlgorithmIdentifier contentEncryptionAlgorithm;
    @Element(name = "EncryptedData", required = true)
    protected byte[] encryptedData;
    @Attribute(name = "ContentType", required = true)
    protected String contentType;
    /**
     * Ruft den Wert der contentEncryptionAlgorithm-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link AlgorithmIdentifier }
     *
     */
    public AlgorithmIdentifier getContentEncryptionAlgorithm() {
        return contentEncryptionAlgorithm;
    }
    /**
     * Legt den Wert der contentEncryptionAlgorithm-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link AlgorithmIdentifier }
     *
     */
    public void setContentEncryptionAlgorithm(AlgorithmIdentifier value) {
        this.contentEncryptionAlgorithm = value;
    }
    /**
     * Ruft den Wert der encryptedData-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getEncryptedData() {
        return encryptedData;
    }
    /**
     * Legt den Wert der encryptedData-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setEncryptedData(byte[] value) {
        this.encryptedData = value;
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
