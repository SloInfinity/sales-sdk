//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;
import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
/**
 * Definition: Cryptographic Message Syntax (CMS) data structure containing signed data  -- Reference: RFC 3852: Cryptographic Message Syntax (CMS) -- Usage: This data structure contains:  the version of the data structure (which is v1 in nexo protocol context)  the identifiers of the message digest algorithms  the encapsulated content  the certificates for the verification of the signature
 *
 * <p>Java-Klasse für SignedDataType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="SignedDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DigestAlgorithm" type="{}AlgorithmIdentifier" maxOccurs="unbounded"/>
 *         &lt;element name="EncapsulatedContent" type="{}EncapsulatedContentType"/>
 *         &lt;element name="Certificate" type="{}CertificateType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Signer" type="{}SignerType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Version" type="{}VersionTypeCode" default="v1" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class SignedDataType {
    @Element(name = "DigestAlgorithm", required = true)
    protected List<AlgorithmIdentifier> digestAlgorithm;
    @Element(name = "EncapsulatedContent", required = true)
    protected EncapsulatedContentType encapsulatedContent;
    @Element(name = "Certificate", required = false)
    protected List<byte[]> certificate;
    @Element(name = "Signer", required = true)
    protected List<SignerType> signer;
    @Attribute(name = "Version", required = false)
    protected String version;
    /**
     * Gets the value of the digestAlgorithm property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the digestAlgorithm property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDigestAlgorithm().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlgorithmIdentifier }
     *
     *
     */
    public List<AlgorithmIdentifier> getDigestAlgorithm() {
        if (digestAlgorithm == null) {
            digestAlgorithm = new ArrayList<AlgorithmIdentifier>();
        }
        return this.digestAlgorithm;
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
     * Gets the value of the certificate property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certificate property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertificate().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * byte[]
     *
     */
    public List<byte[]> getCertificate() {
        if (certificate == null) {
            certificate = new ArrayList<byte[]>();
        }
        return this.certificate;
    }
    /**
     * Gets the value of the signer property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signer property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSigner().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SignerType }
     *
     *
     */
    public List<SignerType> getSigner() {
        if (signer == null) {
            signer = new ArrayList<SignerType>();
        }
        return this.signer;
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
        if (version == null) {
            return "v1";
        } else {
            return version;
        }
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
