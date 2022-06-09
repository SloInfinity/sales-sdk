//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import org.simpleframework.xml.Attribute;
/**
 * Definition: Identification of a previous POI transaction. -- Usage: To
 * 				abort a transaction in progress or to request the status of a transaction from which
 * 				no response has been received. It identifies the message header of the message
 * 				request to abort or request the status. The Abort or
 * 				TransactionStatus
 *
 * <p>Java-Klasse für MessageReferenceType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="MessageReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="MessageCategory" type="{}MessageCategoryTypeCode" />
 *       &lt;attribute name="ServiceID" type="{}ServiceIDType" />
 *       &lt;attribute name="DeviceID" type="{}DeviceIDType" />
 *       &lt;attribute name="SaleID" type="{}SaleIDType" />
 *       &lt;attribute name="POIID" type="{}POIIDType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class MessageReferenceType {
    @Attribute(name = "MessageCategory", required = false)
    protected String messageCategory;
    @Attribute(name = "ServiceID", required = false)
    protected String serviceID;
    @Attribute(name = "DeviceID", required = false)
    protected String deviceID;
    @Attribute(name = "SaleID", required = false)
    protected String saleID;
    @Attribute(name = "POIID", required = false)
    protected String poiid;
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
