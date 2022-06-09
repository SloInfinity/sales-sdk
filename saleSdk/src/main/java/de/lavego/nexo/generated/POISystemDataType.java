//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;

import de.lavego.nexo.types.DateTime;

/**
 * Definition: Information related to the POI System -- Usage: In the
 * Login message response, the data structure contains information related to the POI
 * System fixed for the session or defined as default value.
 *
 * <p>Java-Klasse für POISystemDataType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="POISystemDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DateTime" type="{}DateTimeType"/>
 *         &lt;element name="POISoftware" type="{}POISoftwareType"/>
 *         &lt;element name="POITerminalData" type="{}POITerminalDataType" minOccurs="0"/>
 *         &lt;element name="POIStatus" type="{}POIStatusType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TokenRequestStatus" type="{}TokenRequestStatusType" />
 *       &lt;attribute name="CustomerOrderStatus" type="{}CustomerOrderStatusType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@Order(elements = {
        "DateTime",
        "POISoftware",
        "POITerminalData",
        "POIStatus"
}, attributes = {"TokenRequestStatus"})
public class POISystemDataType
{
    @Element(name = "DateTime", required = true)
    protected DateTime            dateTime;
    @Element(name = "POISoftware", required = true)
    protected POISoftwareType     poiSoftware;
    @Element(name = "POITerminalData", required = false)
    protected POITerminalDataType poiTerminalData;
    @Element(name = "POIStatus", required = false)
    protected POIStatusType       poiStatus;
    @Attribute(name = "TokenRequestStatus", required = false)
    protected Boolean             tokenRequestStatus;
    @Attribute(name = "CustomerOrderStatus", required = false)
    protected Boolean             customerOrderStatus;
    
    public DateTime getDateTime()
    {
        return dateTime;
    }
    
    /**
     * Legt den Wert der dateTime-Eigenschaft fest.
     *
     * @param value allowed object is
     */
    public void setDateTime(DateTime value)
    {
        this.dateTime = value;
    }
    
    /**
     * Ruft den Wert der poiSoftware-Eigenschaft ab.
     *
     * @return possible object is
     * {@link POISoftwareType }
     */
    public POISoftwareType getPOISoftware()
    {
        return poiSoftware;
    }
    
    /**
     * Legt den Wert der poiSoftware-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link POISoftwareType }
     */
    public void setPOISoftware(POISoftwareType value)
    {
        this.poiSoftware = value;
    }
    
    /**
     * Ruft den Wert der poiStatus-Eigenschaft ab.
     *
     * @return possible object is
     * {@link POIStatusType }
     */
    public POIStatusType getPOIStatus()
    {
        return poiStatus;
    }
    
    /**
     * Legt den Wert der poiStatus-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link POIStatusType }
     */
    public void setPOIStatus(POIStatusType value)
    {
        this.poiStatus = value;
    }
    
    /**
     * Ruft den Wert der poiTerminalData-Eigenschaft ab.
     *
     * @return possible object is
     * {@link POITerminalDataType }
     */
    public POITerminalDataType getPOITerminalData()
    {
        return poiTerminalData;
    }
    
    /**
     * Legt den Wert der poiTerminalData-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link POITerminalDataType }
     */
    public void setPOITerminalData(POITerminalDataType value)
    {
        this.poiTerminalData = value;
    }
    
    /**
     * Ruft den Wert der customerOrderStatus-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isCustomerOrderStatus()
    {
        return customerOrderStatus;
    }
    
    /**
     * Ruft den Wert der tokenRequestStatus-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isTokenRequestStatus()
    {
        return tokenRequestStatus;
    }
    
    /**
     * Legt den Wert der customerOrderStatus-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setCustomerOrderStatus(Boolean value)
    {
        this.customerOrderStatus = value;
    }
    
    /**
     * Legt den Wert der tokenRequestStatus-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setTokenRequestStatus(Boolean value)
    {
        this.tokenRequestStatus = value;
    }
}
