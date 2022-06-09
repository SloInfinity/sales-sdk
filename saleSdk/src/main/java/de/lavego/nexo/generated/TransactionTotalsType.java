//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition: Result of the Sale to POI Reconciliation processing. --
 * Usage: If Result is Success, contains all the totals, classified as required by the
 * Sale in the message request. At least, transaction totals are provided per Acquirer,
 * Acquirer Settlement, and Card Brand.
 *
 * <p>Java-Klasse für TransactionTotalsType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="TransactionTotalsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentTotals" type="{}PaymentTotalsType" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="LoyaltyTotals" type="{}LoyaltyTotalsType" maxOccurs="6" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PaymentInstrumentType" use="required" type="{}PaymentInstrumentTypeTypeCode" />
 *       &lt;attribute name="AcquirerID" type="{}AcquirerIDType" />
 *       &lt;attribute name="ErrorCondition" type="{}ErrorConditionTypeCode" />
 *       &lt;attribute name="HostReconciliationID" type="{}HostReconciliationIDType" />
 *       &lt;attribute name="CardBrand" type="{}CardBrandType" />
 *       &lt;attribute name="POIID" type="{}POIIDType" />
 *       &lt;attribute name="SaleID" type="{}SaleIDType" />
 *       &lt;attribute name="OperatorID" type="{}OperatorIDType" />
 *       &lt;attribute name="ShiftNumber" type="{}ShiftNumberType" />
 *       &lt;attribute name="TotalsGroupID" type="{}TotalsGroupIDType" />
 *       &lt;attribute name="PaymentCurrency" type="{}ISOCurrency3A" />
 *       &lt;attribute name="LoyaltyUnit" type="{}LoyaltyUnitTypeCode" default="Point" />
 *       &lt;attribute name="LoyaltyCurrency" type="{}ISOCurrency3A" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
public class TransactionTotalsType
{
    @ElementList(inline = true, required = false, entry = "PaymentTotals")
    protected List<PaymentTotalsType> paymentTotals;
    
    @ElementList(inline = true, required = false, entry = "LoyaltyTotals")
    protected List<LoyaltyTotalsType> loyaltyTotals;
    
    @Attribute(name = "PaymentInstrumentType", required = true)
    protected String paymentInstrumentType;
    @Attribute(name = "AcquirerID", required = false)
    protected String acquirerID;
    @Attribute(name = "ErrorCondition", required = false)
    protected String errorCondition;
    @Attribute(name = "HostReconciliationID", required = false)
    protected String hostReconciliationID;
    @Attribute(name = "CardBrand", required = false)
    protected String cardBrand;
    @Attribute(name = "POIID", required = false)
    protected String poiid;
    @Attribute(name = "SaleID", required = false)
    protected String saleID;
    @Attribute(name = "OperatorID", required = false)
    protected String operatorID;
    @Attribute(name = "ShiftNumber", required = false)
    protected String shiftNumber;
    @Attribute(name = "TotalsGroupID", required = false)
    protected String totalsGroupID;
    @Attribute(name = "PaymentCurrency", required = false)
    protected String paymentCurrency;
    @Attribute(name = "LoyaltyUnit", required = false)
    protected String loyaltyUnit;
    @Attribute(name = "LoyaltyCurrency", required = false)
    protected String loyaltyCurrency;
    
    /**
     * Ruft den Wert der acquirerID-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAcquirerID()
    {
        return acquirerID;
    }
    
    /**
     * Legt den Wert der acquirerID-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAcquirerID(String value)
    {
        this.acquirerID = value;
    }
    
    /**
     * Ruft den Wert der cardBrand-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCardBrand()
    {
        return cardBrand;
    }
    
    /**
     * Legt den Wert der cardBrand-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCardBrand(String value)
    {
        this.cardBrand = value;
    }
    
    /**
     * Ruft den Wert der errorCondition-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getErrorCondition()
    {
        return errorCondition;
    }
    
    /**
     * Legt den Wert der errorCondition-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setErrorCondition(String value)
    {
        this.errorCondition = value;
    }
    
    /**
     * Ruft den Wert der hostReconciliationID-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getHostReconciliationID()
    {
        return hostReconciliationID;
    }
    
    /**
     * Legt den Wert der hostReconciliationID-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHostReconciliationID(String value)
    {
        this.hostReconciliationID = value;
    }
    
    /**
     * Ruft den Wert der loyaltyCurrency-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLoyaltyCurrency()
    {
        return loyaltyCurrency;
    }
    
    /**
     * Legt den Wert der loyaltyCurrency-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLoyaltyCurrency(String value)
    {
        this.loyaltyCurrency = value;
    }
    
    /**
     * Gets the value of the loyaltyTotals property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyTotals property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyTotals().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyTotalsType }
     */
    public List<LoyaltyTotalsType> getLoyaltyTotals()
    {
        if (loyaltyTotals == null)
        {
            loyaltyTotals = new ArrayList<LoyaltyTotalsType>();
        }
        return this.loyaltyTotals;
    }
    
    /**
     * Ruft den Wert der loyaltyUnit-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLoyaltyUnit()
    {
        if (loyaltyUnit == null)
        {
            return "Point";
        }
        else
        {
            return loyaltyUnit;
        }
    }
    
    /**
     * Legt den Wert der loyaltyUnit-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLoyaltyUnit(String value)
    {
        this.loyaltyUnit = value;
    }
    
    /**
     * Ruft den Wert der operatorID-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOperatorID()
    {
        return operatorID;
    }
    
    /**
     * Legt den Wert der operatorID-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOperatorID(String value)
    {
        this.operatorID = value;
    }
    
    /**
     * Ruft den Wert der poiid-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPOIID()
    {
        return poiid;
    }
    
    /**
     * Legt den Wert der poiid-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPOIID(String value)
    {
        this.poiid = value;
    }
    
    /**
     * Ruft den Wert der paymentCurrency-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPaymentCurrency()
    {
        return paymentCurrency;
    }
    
    /**
     * Legt den Wert der paymentCurrency-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPaymentCurrency(String value)
    {
        this.paymentCurrency = value;
    }
    
    /**
     * Ruft den Wert der paymentInstrumentType-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPaymentInstrumentType()
    {
        return paymentInstrumentType;
    }
    
    /**
     * Legt den Wert der paymentInstrumentType-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPaymentInstrumentType(String value)
    {
        this.paymentInstrumentType = value;
    }
    
    /**
     * Gets the value of the paymentTotals property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentTotals property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentTotals().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentTotalsType }
     */
    public List<PaymentTotalsType> getPaymentTotals()
    {
        if (paymentTotals == null)
        {
            paymentTotals = new ArrayList<PaymentTotalsType>();
        }
        return this.paymentTotals;
    }
    
    /**
     * Ruft den Wert der saleID-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSaleID()
    {
        return saleID;
    }
    
    /**
     * Legt den Wert der saleID-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSaleID(String value)
    {
        this.saleID = value;
    }
    
    /**
     * Ruft den Wert der shiftNumber-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getShiftNumber()
    {
        return shiftNumber;
    }
    
    /**
     * Legt den Wert der shiftNumber-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setShiftNumber(String value)
    {
        this.shiftNumber = value;
    }
    
    /**
     * Ruft den Wert der totalsGroupID-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTotalsGroupID()
    {
        return totalsGroupID;
    }
    
    /**
     * Legt den Wert der totalsGroupID-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTotalsGroupID(String value)
    {
        this.totalsGroupID = value;
    }
}
