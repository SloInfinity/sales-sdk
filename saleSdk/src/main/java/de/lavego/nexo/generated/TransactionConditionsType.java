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
 * Definition: Conditions on which the transaction must be
 * 				processed.
 *
 * <p>Java-Klasse für TransactionConditionsType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="TransactionConditionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AllowedPaymentBrand" type="{}AllowedPaymentBrandType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AcquirerID" type="{}AcquirerIDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AllowedLoyaltyBrand" type="{}AllowedLoyaltyBrandType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ForceEntryMode" type="{}ForceEntryModeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DebitPreferredFlag" type="{}DebitPreferredFlagType" default="false" />
 *       &lt;attribute name="LoyaltyHandling" type="{}LoyaltyHandlingTypeCode" default="Forbidden" />
 *       &lt;attribute name="CustomerLanguage" type="{}ISOLanguage2A" />
 *       &lt;attribute name="ForceOnlineFlag" type="{}ForceOnlineFlagType" default="false" />
 *       &lt;attribute name="MerchantCategoryCode" type="{}MerchantCategoryCodeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class TransactionConditionsType {
    @Element(name = "AllowedPaymentBrand", required = false)
    protected List<String> allowedPaymentBrand;
    @Element(name = "AcquirerID", required = false)
    protected List<String> acquirerID;
    @Element(name = "AllowedLoyaltyBrand", required = false)
    protected List<String> allowedLoyaltyBrand;
    @Element(name = "ForceEntryMode", required = false)
    protected List<String> forceEntryMode;
    @Attribute(name = "DebitPreferredFlag", required = false)
    protected Boolean debitPreferredFlag;
    @Attribute(name = "LoyaltyHandling", required = false)
    protected String loyaltyHandling;
    @Attribute(name = "CustomerLanguage", required = false)
    protected String customerLanguage;
    @Attribute(name = "ForceOnlineFlag", required = false)
    protected Boolean forceOnlineFlag;
    @Attribute(name = "MerchantCategoryCode", required = false)
    protected String merchantCategoryCode;
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
     * Gets the value of the acquirerID property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acquirerID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcquirerID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getAcquirerID() {
        if (acquirerID == null) {
            acquirerID = new ArrayList<String>();
        }
        return this.acquirerID;
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
     * Ruft den Wert der debitPreferredFlag-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isDebitPreferredFlag() {
        if (debitPreferredFlag == null) {
            return false;
        } else {
            return debitPreferredFlag;
        }
    }
    /**
     * Legt den Wert der debitPreferredFlag-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setDebitPreferredFlag(Boolean value) {
        this.debitPreferredFlag = value;
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
            return "Forbidden";
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
     * Ruft den Wert der forceOnlineFlag-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isForceOnlineFlag() {
        if (forceOnlineFlag == null) {
            return false;
        } else {
            return forceOnlineFlag;
        }
    }
    /**
     * Legt den Wert der forceOnlineFlag-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setForceOnlineFlag(Boolean value) {
        this.forceOnlineFlag = value;
    }
    /**
     * Ruft den Wert der merchantCategoryCode-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMerchantCategoryCode() {
        return merchantCategoryCode;
    }
    /**
     * Legt den Wert der merchantCategoryCode-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMerchantCategoryCode(String value) {
        this.merchantCategoryCode = value;
    }
}
