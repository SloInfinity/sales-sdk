//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition: Cryptographic Message Syntax (CMS) data structure containing encrypted data with encryption key -- Reference: RFC 3852: Cryptographic Message Syntax (CMS) -- Usage: This data structure contains:  the version of the data structure (which is v0 in nexo protocol context)  the protected encrytion key for every adressee (recipient)  the encrypted data
 *
 * <p>Java-Klasse für EnvelopedDataType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="EnvelopedDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element name="KeyTransport" type="{}KeyTransportType"/>
 *           &lt;element name="KEK" type="{}KEKType"/>
 *         &lt;/choice>
 *         &lt;element name="EncryptedContent" type="{}EncryptedContentType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Version" type="{}VersionTypeCode" default="v0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class EnvelopedDataType {
    //@Elements({
    //    @Element(name = "KeyTransport", type = KeyTransportType.class),
    //    @Element(name = "KEK", type = KEKType.class)
    //})
    protected List<Object> keyTransportOrKEK;
    @Element(name = "EncryptedContent", required = true)
    protected EncryptedContentType encryptedContent;
    @Attribute(name = "Version", required = false)
    protected String version;
    /**
     * Gets the value of the keyTransportOrKEK property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyTransportOrKEK property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyTransportOrKEK().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyTransportType }
     * {@link KEKType }
     *
     *
     */
    public List<Object> getKeyTransportOrKEK() {
        if (keyTransportOrKEK == null) {
            keyTransportOrKEK = new ArrayList<Object>();
        }
        return this.keyTransportOrKEK;
    }
    /**
     * Ruft den Wert der encryptedContent-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link EncryptedContentType }
     *
     */
    public EncryptedContentType getEncryptedContent() {
        return encryptedContent;
    }
    /**
     * Legt den Wert der encryptedContent-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link EncryptedContentType }
     *
     */
    public void setEncryptedContent(EncryptedContentType value) {
        this.encryptedContent = value;
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
            return "v0";
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
