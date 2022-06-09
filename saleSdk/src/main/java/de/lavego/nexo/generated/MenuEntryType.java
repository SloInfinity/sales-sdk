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
 * Definition: An entryof the menu to present to the Cashier -- Usage: It
 * 				conveys message text and parameters of the menu entry. This output data could be
 * 				only provided for an input command, in order to choose an entryof the
 * 				menu.
 *
 * <p>Java-Klasse für MenuEntryType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="MenuEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PredefinedContent" type="{}PredefinedContentType" minOccurs="0"/>
 *         &lt;element name="OutputText" type="{}OutputTextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OutputXHTML" type="{}OutputXHTMLType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="MenuEntryTag" type="{}MenuEntryTagTypeCode" default="Selectable" />
 *       &lt;attribute name="OutputFormat" use="required" type="{}OutputFormatTypeCode" />
 *       &lt;attribute name="DefaultSelectedFlag" type="{}DefaultSelectedFlagType" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class MenuEntryType {
    @Element(name = "PredefinedContent", required = false)
    protected PredefinedContentType predefinedContent;
    @Element(name = "OutputText", required = false)
    protected List<OutputTextType> outputText;
    @Element(name = "OutputXHTML", required = false)
    protected byte[] outputXHTML;
    @Attribute(name = "MenuEntryTag", required = false)
    protected String menuEntryTag;
    @Attribute(name = "OutputFormat", required = true)
    protected String outputFormat;
    @Attribute(name = "DefaultSelectedFlag", required = false)
    protected Boolean defaultSelectedFlag;
    /**
     * Ruft den Wert der predefinedContent-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link PredefinedContentType }
     *
     */
    public PredefinedContentType getPredefinedContent() {
        return predefinedContent;
    }
    /**
     * Legt den Wert der predefinedContent-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link PredefinedContentType }
     *
     */
    public void setPredefinedContent(PredefinedContentType value) {
        this.predefinedContent = value;
    }
    /**
     * Gets the value of the outputText property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputText property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputText().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutputTextType }
     *
     *
     */
    public List<OutputTextType> getOutputText() {
        if (outputText == null) {
            outputText = new ArrayList<OutputTextType>();
        }
        return this.outputText;
    }
    /**
     * Ruft den Wert der outputXHTML-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getOutputXHTML() {
        return outputXHTML;
    }
    /**
     * Legt den Wert der outputXHTML-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setOutputXHTML(byte[] value) {
        this.outputXHTML = value;
    }
    /**
     * Ruft den Wert der menuEntryTag-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMenuEntryTag() {
        if (menuEntryTag == null) {
            return "Selectable";
        } else {
            return menuEntryTag;
        }
    }
    /**
     * Legt den Wert der menuEntryTag-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMenuEntryTag(String value) {
        this.menuEntryTag = value;
    }
    /**
     * Ruft den Wert der outputFormat-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOutputFormat() {
        return outputFormat;
    }
    /**
     * Legt den Wert der outputFormat-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOutputFormat(String value) {
        this.outputFormat = value;
    }
    /**
     * Ruft den Wert der defaultSelectedFlag-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isDefaultSelectedFlag() {
        if (defaultSelectedFlag == null) {
            return false;
        } else {
            return defaultSelectedFlag;
        }
    }
    /**
     * Legt den Wert der defaultSelectedFlag-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setDefaultSelectedFlag(Boolean value) {
        this.defaultSelectedFlag = value;
    }
}
