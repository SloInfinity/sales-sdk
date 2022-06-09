//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * Definition: Data related to the payment and loyalty card acquisition.
 * 				-- Usage: Elements requested by the Sale System that are global to the payment or
 * 				loyalty transaction.
 *
 * <p>Java-Klasse für CardAcquisitionTransactionType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="CardAcquisitionTransactionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AllowedPaymentBrand" type="{}AllowedPaymentBrandType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AllowedLoyaltyBrand" type="{}AllowedLoyaltyBrandType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ForceEntryMode" type="{}ForceEntryModeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="LoyaltyHandling" type="{}LoyaltyHandlingTypeCode" default="Allowed" />
 *       &lt;attribute name="CustomerLanguage" type="{}ISOLanguage2A" />
 *       &lt;attribute name="ForceCustomerSelectionFlag" type="{}ForceCustomerSelectionFlagType" default="false" />
 *       &lt;attribute name="TotalAmount" type="{}SimpleAmountType" />
 *       &lt;attribute name="PaymentType" type="{}PaymentTypeTypeCode" />
 *       &lt;attribute name="CashBackFlag" type="{}CashBackFlagType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class CardAcquisitionTransactionType {
    @Element(name = "AllowedPaymentBrand", required = false)
    protected List<String> allowedPaymentBrand;
    @Element(name = "AllowedLoyaltyBrand", required = false)
    protected List<String> allowedLoyaltyBrand;
    @Element(name = "ForceEntryMode",required = false)
    protected List<String> forceEntryMode;
    @Attribute(name = "LoyaltyHandling", required = false)
    protected String loyaltyHandling;
    @Attribute(name = "CustomerLanguage", required = false)
    protected String customerLanguage;
    @Attribute(name = "ForceCustomerSelectionFlag", required = false)
    protected Boolean forceCustomerSelectionFlag;
    @Attribute(name = "TotalAmount", required = false)
    protected BigDecimal totalAmount;
    @Attribute(name = "PaymentType", required = false)
    protected String paymentType;
    @Attribute(name = "CashBackFlag", required = false)
    protected Boolean cashBackFlag;
    /**
     * Gets the value of the allowedPaymentBrand property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowedPaymentBrand property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedPaymentBrand().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getAllowedPaymentBrand() {
        if (allowedPaymentBrand == null) {
            allowedPaymentBrand = new ArrayList<String>();
        }
        return this.allowedPaymentBrand;
    }
    /**
     * Gets the value of the allowedLoyaltyBrand property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowedLoyaltyBrand property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedLoyaltyBrand().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getAllowedLoyaltyBrand() {
        if (allowedLoyaltyBrand == null) {
            allowedLoyaltyBrand = new ArrayList<String>();
        }
        return this.allowedLoyaltyBrand;
    }
    /**
     * Gets the value of the forceEntryMode property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forceEntryMode property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForceEntryMode().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     *
     *
     */
    public List<String> getForceEntryMode() {
        if (forceEntryMode == null) {
            forceEntryMode = new ArrayList<String>();
        }
        return this.forceEntryMode;
    }
    /**
     * Ruft den Wert der loyaltyHandling-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLoyaltyHandling() {
        if (loyaltyHandling == null) {
            return "Allowed";
        } else {
            return loyaltyHandling;
        }
    }
    /**
     * Legt den Wert der loyaltyHandling-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLoyaltyHandling(String value) {
        this.loyaltyHandling = value;
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
     * Ruft den Wert der forceCustomerSelectionFlag-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isForceCustomerSelectionFlag() {
        if (forceCustomerSelectionFlag == null) {
            return false;
        } else {
            return forceCustomerSelectionFlag;
        }
    }
    /**
     * Legt den Wert der forceCustomerSelectionFlag-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setForceCustomerSelectionFlag(Boolean value) {
        this.forceCustomerSelectionFlag = value;
    }
    /**
     * Ruft den Wert der totalAmount-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }
    /**
     * Legt den Wert der totalAmount-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setTotalAmount(BigDecimal value) {
        this.totalAmount = value;
    }
    /**
     * Ruft den Wert der paymentType-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPaymentType() {
        return paymentType;
    }
    /**
     * Legt den Wert der paymentType-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
    }
    /**
     * Ruft den Wert der cashBackFlag-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isCashBackFlag() {
        return cashBackFlag;
    }
    /**
     * Legt den Wert der cashBackFlag-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setCashBackFlag(Boolean value) {
        this.cashBackFlag = value;
    }
}
