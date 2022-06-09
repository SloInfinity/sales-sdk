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
 * Definition: Content of the Login Request message. -- Usage: It conveys
 * 				Information related to the session (period between a Login and the following Logout)
 * 				to process
 *
 * <p>Java-Klasse für LoginRequestType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="LoginRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DateTime" type="{}DateTimeType"/>
 *         &lt;element name="SaleSoftware" type="{}SaleSoftwareType"/>
 *         &lt;element name="SaleTerminalData" type="{}SaleTerminalDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TrainingModeFlag" type="{}TrainingModeFlagType" default="false" />
 *       &lt;attribute name="OperatorLanguage" use="required" type="{}ISOLanguage2A" />
 *       &lt;attribute name="OperatorID" type="{}OperatorIDType" />
 *       &lt;attribute name="ShiftNumber" type="{}ShiftNumberType" />
 *       &lt;attribute name="TokenRequestedType" type="{}TokenRequestedTypeTypeCode" />
 *       &lt;attribute name="CustomerOrderReq" type="{}CustomerOrderReqType" />
 *       &lt;attribute name="POISerialNumber" type="{}POISerialNumberType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class LoginRequestType {
    @Element(name = "DateTime", required = true)
    protected String dateTime;
    @Element(name = "SaleSoftware", required = true)
    protected SaleSoftwareType saleSoftware;
    @Element(name = "SaleTerminalData", required = false)
    protected SaleTerminalDataType saleTerminalData;
    @Attribute(name = "TrainingModeFlag", required = false)
    protected Boolean trainingModeFlag;
    @Attribute(name = "OperatorLanguage", required = true)
    protected String operatorLanguage;
    @Attribute(name = "OperatorID", required = false)
    protected String operatorID;
    @Attribute(name = "ShiftNumber", required = false)
    protected String shiftNumber;
    @Attribute(name = "TokenRequestedType", required = false)
    protected String tokenRequestedType;
    @Attribute(name = "CustomerOrderReq", required = false)
    protected List<String> customerOrderReq;
    @Attribute(name = "POISerialNumber", required = false)
    protected String poiSerialNumber;
    /**
     * Ruft den Wert der dateTime-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *
     */
    public String getDateTime() {
        return dateTime;
    }
    /**
     * Legt den Wert der dateTime-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *
     */
    public void setDateTime(String value) {
        this.dateTime = value;
    }
    /**
     * Ruft den Wert der saleSoftware-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link SaleSoftwareType }
     *
     */
    public SaleSoftwareType getSaleSoftware() {
        return saleSoftware;
    }
    /**
     * Legt den Wert der saleSoftware-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link SaleSoftwareType }
     *
     */
    public void setSaleSoftware(SaleSoftwareType value) {
        this.saleSoftware = value;
    }
    /**
     * Ruft den Wert der saleTerminalData-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link SaleTerminalDataType }
     *
     */
    public SaleTerminalDataType getSaleTerminalData() {
        return saleTerminalData;
    }
    /**
     * Legt den Wert der saleTerminalData-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link SaleTerminalDataType }
     *
     */
    public void setSaleTerminalData(SaleTerminalDataType value) {
        this.saleTerminalData = value;
    }
    /**
     * Ruft den Wert der trainingModeFlag-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isTrainingModeFlag() {
        if (trainingModeFlag == null) {
            return false;
        } else {
            return trainingModeFlag;
        }
    }
    /**
     * Legt den Wert der trainingModeFlag-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setTrainingModeFlag(Boolean value) {
        this.trainingModeFlag = value;
    }
    /**
     * Ruft den Wert der operatorLanguage-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOperatorLanguage() {
        return operatorLanguage;
    }
    /**
     * Legt den Wert der operatorLanguage-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOperatorLanguage(String value) {
        this.operatorLanguage = value;
    }
    /**
     * Ruft den Wert der operatorID-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOperatorID() {
        return operatorID;
    }
    /**
     * Legt den Wert der operatorID-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOperatorID(String value) {
        this.operatorID = value;
    }
    /**
     * Ruft den Wert der shiftNumber-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getShiftNumber() {
        return shiftNumber;
    }
    /**
     * Legt den Wert der shiftNumber-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setShiftNumber(String value) {
        this.shiftNumber = value;
    }
    /**
     * Ruft den Wert der tokenRequestedType-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTokenRequestedType() {
        return tokenRequestedType;
    }
    /**
     * Legt den Wert der tokenRequestedType-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTokenRequestedType(String value) {
        this.tokenRequestedType = value;
    }
    /**
     * Gets the value of the customerOrderReq property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerOrderReq property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerOrderReq().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getCustomerOrderReq() {
        if (customerOrderReq == null) {
            customerOrderReq = new ArrayList<String>();
        }
        return this.customerOrderReq;
    }
    /**
     * Ruft den Wert der poiSerialNumber-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPOISerialNumber() {
        return poiSerialNumber;
    }
    /**
     * Legt den Wert der poiSerialNumber-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPOISerialNumber(String value) {
        this.poiSerialNumber = value;
    }
}
