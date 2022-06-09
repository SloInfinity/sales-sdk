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
 * Definition: Data related to the Sale System. -- Usage: Data associated
 * 				to the Sale System, with a particular value during the processing of the payment by
 * 				the POI, including the cards acquisition.
 *
 * <p>Java-Klasse für SaleDataType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="SaleDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SaleTransactionID" type="{}TransactionIdentificationType"/>
 *         &lt;element name="SaleTerminalData" type="{}SaleTerminalDataType" minOccurs="0"/>
 *         &lt;element name="SponsoredMerchant" type="{}SponsoredMerchantType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SaleToPOIData" type="{}SaleToPOIDataType" minOccurs="0"/>
 *         &lt;element name="SaleToAcquirerData" type="{}SaleToAcquirerDataType" minOccurs="0"/>
 *         &lt;element name="SaleToIssuerData" type="{}SaleToIssuerDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="OperatorID" type="{}OperatorIDType" />
 *       &lt;attribute name="OperatorLanguage" type="{}ISOLanguage2A" />
 *       &lt;attribute name="ShiftNumber" type="{}ShiftNumberType" />
 *       &lt;attribute name="SaleReferenceID" type="{}SaleReferenceIDType" />
 *       &lt;attribute name="TokenRequestedType" type="{}TokenRequestedTypeTypeCode" />
 *       &lt;attribute name="CustomerOrderID" type="{}CustomerOrderIDType" />
 *       &lt;attribute name="CustomerOrderReq" type="{}CustomerOrderReqType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class SaleDataType {
    @Element(name = "SaleTransactionID", required = true)
    protected TransactionIdentificationType saleTransactionID;
    @Element(name = "SaleTerminalData", required = false)
    protected SaleTerminalDataType saleTerminalData;
    @Element(name = "SponsoredMerchant", required = false)
    protected List<SponsoredMerchantType> sponsoredMerchant;
    @Element(name = "SaleToPOIData", required = false)
    protected String saleToPOIData;
    @Element(name = "SaleToAcquirerData", required = false)
    protected String saleToAcquirerData;
    @Element(name = "SaleToIssuerData", required = false)
    protected SaleToIssuerDataType saleToIssuerData;
    @Attribute(name = "OperatorID", required = false)
    protected String operatorID;
    @Attribute(name = "OperatorLanguage", required = false)
    protected String operatorLanguage;
    @Attribute(name = "ShiftNumber", required = false)
    protected String shiftNumber;
    @Attribute(name = "SaleReferenceID", required = false)
    protected String saleReferenceID;
    @Attribute(name = "TokenRequestedType", required = false)
    protected String tokenRequestedType;
    @Attribute(name = "CustomerOrderID", required = false)
    protected String customerOrderID;
    @Attribute(name = "CustomerOrderReq", required = false)
    protected List<String> customerOrderReq;
    /**
     * Ruft den Wert der saleTransactionID-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link TransactionIdentificationType }
     *
     */
    public TransactionIdentificationType getSaleTransactionID() {
        return saleTransactionID;
    }
    /**
     * Legt den Wert der saleTransactionID-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link TransactionIdentificationType }
     *
     */
    public void setSaleTransactionID(TransactionIdentificationType value) {
        this.saleTransactionID = value;
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
     * Gets the value of the sponsoredMerchant property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sponsoredMerchant property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSponsoredMerchant().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SponsoredMerchantType }
     *
     *
     */
    public List<SponsoredMerchantType> getSponsoredMerchant() {
        if (sponsoredMerchant == null) {
            sponsoredMerchant = new ArrayList<SponsoredMerchantType>();
        }
        return this.sponsoredMerchant;
    }
    /**
     * Ruft den Wert der saleToPOIData-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSaleToPOIData() {
        return saleToPOIData;
    }
    /**
     * Legt den Wert der saleToPOIData-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSaleToPOIData(String value) {
        this.saleToPOIData = value;
    }
    /**
     * Ruft den Wert der saleToAcquirerData-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSaleToAcquirerData() {
        return saleToAcquirerData;
    }
    /**
     * Legt den Wert der saleToAcquirerData-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSaleToAcquirerData(String value) {
        this.saleToAcquirerData = value;
    }
    /**
     * Ruft den Wert der saleToIssuerData-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link SaleToIssuerDataType }
     *
     */
    public SaleToIssuerDataType getSaleToIssuerData() {
        return saleToIssuerData;
    }
    /**
     * Legt den Wert der saleToIssuerData-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link SaleToIssuerDataType }
     *
     */
    public void setSaleToIssuerData(SaleToIssuerDataType value) {
        this.saleToIssuerData = value;
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
     * Ruft den Wert der saleReferenceID-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSaleReferenceID() {
        return saleReferenceID;
    }
    /**
     * Legt den Wert der saleReferenceID-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSaleReferenceID(String value) {
        this.saleReferenceID = value;
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
     * Ruft den Wert der customerOrderID-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCustomerOrderID() {
        return customerOrderID;
    }
    /**
     * Legt den Wert der customerOrderID-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCustomerOrderID(String value) {
        this.customerOrderID = value;
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
}
