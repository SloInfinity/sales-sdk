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
 * Definition: Cryptographic Message Syntax (CMS) data structure containing content to authenticate -- Reference: RFC 3852: Cryptographic Message Syntax (CMS) -- Usage: This data structure contains: the type of the encapsulated content, which is id-data for an application data or another CMS data structure the data to authenticate
 *
 * <p>Java-Klasse für EncapsulatedContentType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="EncapsulatedContentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Content" type="{}ContentType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ContentType" use="required" type="{}ContentTypeTypeCode" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class EncapsulatedContentType {
    @Element(name = "Content", required = false)
    protected byte[] content;
    @Attribute(name = "ContentType", required = true)
    protected String contentType;
    /**
     * Ruft den Wert der content-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getContent() {
        return content;
    }
    /**
     * Legt den Wert der content-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setContent(byte[] value) {
        this.content = value;
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
