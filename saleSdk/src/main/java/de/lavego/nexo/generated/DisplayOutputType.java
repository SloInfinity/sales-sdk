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
 * Definition: Information to display and the way to process the display.
 * 				-- Usage: It contains a complete display operation for a Display or an Input Device
 * 				type. For the Input Devices, Diagnosis and EnableService, ResponseRequiredFlag and
 * 				MinimumDisplayTime shall be absent.
 *
 * <p>Java-Klasse für DisplayOutputType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="DisplayOutputType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutputContent" type="{}OutputContentType"/>
 *         &lt;element name="MenuEntry" type="{}MenuEntryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OutputSignature" type="{}OutputSignatureType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ResponseRequiredFlag" type="{}ResponseRequiredFlagType" default="true" />
 *       &lt;attribute name="MinimumDisplayTime" type="{}MinimumDisplayTimeType" default="0" />
 *       &lt;attribute name="Device" use="required" type="{}DeviceTypeCode" />
 *       &lt;attribute name="InfoQualify" use="required" type="{}InfoQualifyTypeCode" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class DisplayOutputType {
    @Element(name = "OutputContent", required = true)
    protected OutputContentType outputContent;
    @Element(name = "MenuEntry", required = false)
    protected List<MenuEntryType> menuEntry;
    @Element(name = "OutputSignature", required = false)
    protected byte[] outputSignature;
    @Attribute(name = "ResponseRequiredFlag", required = false)
    protected Boolean responseRequiredFlag;
    @Attribute(name = "MinimumDisplayTime", required = false)
    protected Integer minimumDisplayTime;
    @Attribute(name = "Device", required = true)
    protected String device;
    @Attribute(name = "InfoQualify", required = true)
    protected String infoQualify;
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
     * Ruft den Wert der responseRequiredFlag-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isResponseRequiredFlag() {
        if (responseRequiredFlag == null) {
            return true;
        } else {
            return responseRequiredFlag;
        }
    }
    /**
     * Legt den Wert der responseRequiredFlag-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setResponseRequiredFlag(Boolean value) {
        this.responseRequiredFlag = value;
    }
    /**
     * Ruft den Wert der minimumDisplayTime-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public int getMinimumDisplayTime() {
        if (minimumDisplayTime == null) {
            return  0;
        } else {
            return minimumDisplayTime;
        }
    }
    /**
     * Legt den Wert der minimumDisplayTime-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setMinimumDisplayTime(Integer value) {
        this.minimumDisplayTime = value;
    }
    /**
     * Ruft den Wert der device-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDevice() {
        return device;
    }
    /**
     * Legt den Wert der device-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDevice(String value) {
        this.device = value;
    }
    /**
     * Ruft den Wert der infoQualify-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInfoQualify() {
        return infoQualify;
    }
    /**
     * Legt den Wert der infoQualify-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInfoQualify(String value) {
        this.infoQualify = value;
    }
}
