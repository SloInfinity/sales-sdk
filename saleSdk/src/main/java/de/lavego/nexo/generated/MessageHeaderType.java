//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import org.simpleframework.xml.Attribute;
/**
 * Definition: Message header of the Sale to POI protocol message. --
 * 				Usage: It conveys Information related to the Sale to POI protocol
 * 				management
 *
 * <p>Java-Klasse für MessageHeaderType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="MessageHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ProtocolVersion" type="{}ProtocolVersionType" />
 *       &lt;attribute name="MessageClass" use="required" type="{}MessageClassTypeCode" />
 *       &lt;attribute name="MessageCategory" use="required" type="{}MessageCategoryTypeCode" />
 *       &lt;attribute name="MessageType" use="required" type="{}MessageTypeTypeCode" />
 *       &lt;attribute name="ServiceID" type="{}ServiceIDType" />
 *       &lt;attribute name="DeviceID" type="{}DeviceIDType" />
 *       &lt;attribute name="SaleID" use="required" type="{}SaleIDType" />
 *       &lt;attribute name="POIID" use="required" type="{}POIIDType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class MessageHeaderType {
    @Attribute(name = "ProtocolVersion", required = false)
    protected String protocolVersion;
    @Attribute(name = "MessageClass", required = true)
    protected String messageClass;
    @Attribute(name = "MessageCategory", required = true)
    protected String messageCategory;
    @Attribute(name = "MessageType", required = true)
    protected String messageType;
    @Attribute(name = "ServiceID", required = false)
    protected String serviceID;
    @Attribute(name = "DeviceID", required = false)
    protected String deviceID;
    @Attribute(name = "SaleID", required = true)
    protected String saleID;
    @Attribute(name = "POIID", required = true)
    protected String poiid;
    /**
     * Ruft den Wert der protocolVersion-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProtocolVersion() {
        return protocolVersion;
    }
    /**
     * Legt den Wert der protocolVersion-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProtocolVersion(String value) {
        this.protocolVersion = value;
    }
    /**
     * Ruft den Wert der messageClass-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMessageClass() {
        return messageClass;
    }
    /**
     * Legt den Wert der messageClass-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMessageClass(String value) {
        this.messageClass = value;
    }
    /**
     * Ruft den Wert der messageCategory-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMessageCategory() {
        return messageCategory;
    }
    /**
     * Legt den Wert der messageCategory-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMessageCategory(String value) {
        this.messageCategory = value;
    }
    /**
     * Ruft den Wert der messageType-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMessageType() {
        return messageType;
    }
    /**
     * Legt den Wert der messageType-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMessageType(String value) {
        this.messageType = value;
    }
    /**
     * Ruft den Wert der serviceID-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getServiceID() {
        return serviceID;
    }
    /**
     * Legt den Wert der serviceID-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setServiceID(String value) {
        this.serviceID = value;
    }
    /**
     * Ruft den Wert der deviceID-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDeviceID() {
        return deviceID;
    }
    /**
     * Legt den Wert der deviceID-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDeviceID(String value) {
        this.deviceID = value;
    }
    /**
     * Ruft den Wert der saleID-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSaleID() {
        return saleID;
    }
    /**
     * Legt den Wert der saleID-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSaleID(String value) {
        this.saleID = value;
    }
    /**
     * Ruft den Wert der poiid-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPOIID() {
        return poiid;
    }
    /**
     * Legt den Wert der poiid-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPOIID(String value) {
        this.poiid = value;
    }
}
