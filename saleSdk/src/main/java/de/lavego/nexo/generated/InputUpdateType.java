//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
/**
 * Definition: Content of the Input Update message. -- Usage: It conveys
 * 				update of the display of an Input request in progress.
 *
 * <p>Java-Klasse für InputUpdateType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="InputUpdateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageReference" type="{}MessageReferenceType"/>
 *         &lt;element name="OutputContent" type="{}OutputContentType"/>
 *         &lt;element name="MenuEntry" type="{}MenuEntryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OutputSignature" type="{}OutputSignatureType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="MinLength" type="{}MinLengthType" />
 *       &lt;attribute name="MaxLength" type="{}MaxLengthType" />
 *       &lt;attribute name="MaxDecimalLength" type="{}MaxDecimalLengthType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class InputUpdateType {
    @Element(name = "MessageReference", required = true)
    protected MessageReferenceType messageReference;
    @Element(name = "OutputContent", required = true)
    protected OutputContentType outputContent;
    @Element(name = "MenuEntry", required = false)
    protected List<MenuEntryType> menuEntry;
    @Element(name = "OutputSignature", required = false)
    protected byte[] outputSignature;
    @Attribute(name = "MinLength", required = false)
    protected BigInteger minLength;
    @Attribute(name = "MaxLength", required = false)
    protected BigInteger maxLength;
    @Attribute(name = "MaxDecimalLength", required = false)
    protected BigInteger maxDecimalLength;
    /**
     * Ruft den Wert der messageReference-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link MessageReferenceType }
     *
     */
    public MessageReferenceType getMessageReference() {
        return messageReference;
    }
    /**
     * Legt den Wert der messageReference-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link MessageReferenceType }
     *
     */
    public void setMessageReference(MessageReferenceType value) {
        this.messageReference = value;
    }
    /**
     * Ruft den Wert der outputContent-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link OutputContentType }
     *
     */
    public OutputContentType getOutputContent() {
        return outputContent;
    }
    /**
     * Legt den Wert der outputContent-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link OutputContentType }
     *
     */
    public void setOutputContent(OutputContentType value) {
        this.outputContent = value;
    }
    /**
     * Gets the value of the menuEntry property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the menuEntry property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMenuEntry().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MenuEntryType }
     *
     *
     */
    public List<MenuEntryType> getMenuEntry() {
        if (menuEntry == null) {
            menuEntry = new ArrayList<MenuEntryType>();
        }
        return this.menuEntry;
    }
    /**
     * Ruft den Wert der outputSignature-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getOutputSignature() {
        return outputSignature;
    }
    /**
     * Legt den Wert der outputSignature-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setOutputSignature(byte[] value) {
        this.outputSignature = value;
    }
    /**
     * Ruft den Wert der minLength-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getMinLength() {
        return minLength;
    }
    /**
     * Legt den Wert der minLength-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setMinLength(BigInteger value) {
        this.minLength = value;
    }
    /**
     * Ruft den Wert der maxLength-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getMaxLength() {
        return maxLength;
    }
    /**
     * Legt den Wert der maxLength-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setMaxLength(BigInteger value) {
        this.maxLength = value;
    }
    /**
     * Ruft den Wert der maxDecimalLength-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getMaxDecimalLength() {
        return maxDecimalLength;
    }
    /**
     * Legt den Wert der maxDecimalLength-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setMaxDecimalLength(BigInteger value) {
        this.maxDecimalLength = value;
    }
}
