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
 * Definition: Identification of a previous POI transaction. -- Usage: In
 * 				the Payment or the Loyalty Request message, it allows using the card of a previous
 * 				CardAcquisition or Payment/Loyalty request. To reverse a Payment or the Loyalty
 * 				transaction. By default, the reversal is requested from the same
 * 				Sale
 *
 * <p>Java-Klasse für OriginalPOITransactionType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="OriginalPOITransactionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="POITransactionID" type="{}TransactionIdentificationType" minOccurs="0"/>
 *         &lt;element name="ApprovalCode" type="{}ApprovalCodeType" minOccurs="0"/>
 *         &lt;element name="HostTransactionID" type="{}TransactionIdentificationType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SaleID" type="{}SaleIDType" />
 *       &lt;attribute name="POIID" type="{}POIIDType" />
 *       &lt;attribute name="ReuseCardDataFlag" type="{}ReuseCardDataFlagType" default="true" />
 *       &lt;attribute name="CustomerLanguage" type="{}ISOLanguage2A" />
 *       &lt;attribute name="AcquirerID" type="{}AcquirerIDType" />
 *       &lt;attribute name="LastTransactionFlag" type="{}LastTransactionFlagType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class OriginalPOITransactionType {
    @Element(name = "POITransactionID", required = false)
    protected TransactionIdentificationType poiTransactionID;
    @Element(name = "ApprovalCode", required = false)
    protected String approvalCode;
    @Element(name = "HostTransactionID", required = false)
    protected TransactionIdentificationType hostTransactionID;
    @Attribute(name = "SaleID", required = false)
    protected String saleID;
    @Attribute(name = "POIID", required = false)
    protected String poiid;
    @Attribute(name = "ReuseCardDataFlag", required = false)
    protected Boolean reuseCardDataFlag;
    @Attribute(name = "CustomerLanguage", required = false)
    protected String customerLanguage;
    @Attribute(name = "AcquirerID", required = false)
    protected String acquirerID;
    @Attribute(name = "LastTransactionFlag", required = false)
    protected Boolean lastTransactionFlag;
    /**
     * Ruft den Wert der poiTransactionID-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link TransactionIdentificationType }
     *
     */
    public TransactionIdentificationType getPOITransactionID() {
        return poiTransactionID;
    }
    /**
     * Legt den Wert der poiTransactionID-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link TransactionIdentificationType }
     *
     */
    public void setPOITransactionID(TransactionIdentificationType value) {
        this.poiTransactionID = value;
    }
    /**
     * Ruft den Wert der approvalCode-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getApprovalCode() {
        return approvalCode;
    }
    /**
     * Legt den Wert der approvalCode-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setApprovalCode(String value) {
        this.approvalCode = value;
    }
    /**
     * Ruft den Wert der hostTransactionID-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link TransactionIdentificationType }
     *
     */
    public TransactionIdentificationType getHostTransactionID() {
        return hostTransactionID;
    }
    /**
     * Legt den Wert der hostTransactionID-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link TransactionIdentificationType }
     *
     */
    public void setHostTransactionID(TransactionIdentificationType value) {
        this.hostTransactionID = value;
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
    /**
     * Ruft den Wert der reuseCardDataFlag-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isReuseCardDataFlag() {
        if (reuseCardDataFlag == null) {
            return true;
        } else {
            return reuseCardDataFlag;
        }
    }
    /**
     * Legt den Wert der reuseCardDataFlag-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setReuseCardDataFlag(Boolean value) {
        this.reuseCardDataFlag = value;
    }
    /**
     * Ruft den Wert der customerLanguage-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCustomerLanguage() {
        return customerLanguage;
    }
    /**
     * Legt den Wert der customerLanguage-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCustomerLanguage(String value) {
        this.customerLanguage = value;
    }
    /**
     * Ruft den Wert der acquirerID-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAcquirerID() {
        return acquirerID;
    }
    /**
     * Legt den Wert der acquirerID-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAcquirerID(String value) {
        this.acquirerID = value;
    }
    /**
     * Ruft den Wert der lastTransactionFlag-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isLastTransactionFlag() {
        return lastTransactionFlag;
    }
    /**
     * Legt den Wert der lastTransactionFlag-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setLastTransactionFlag(Boolean value) {
        this.lastTransactionFlag = value;
    }
}
