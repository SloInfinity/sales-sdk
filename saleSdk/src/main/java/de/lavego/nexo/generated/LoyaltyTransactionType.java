//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
/**
 * Definition: Data related to the loyalty
 * 				transaction.
 *
 * <p>Java-Klasse für LoyaltyTransactionType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="LoyaltyTransactionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OriginalPOITransaction" type="{}OriginalPOITransactionType" minOccurs="0"/>
 *         &lt;element name="TransactionConditions" type="{}TransactionConditionsType" minOccurs="0"/>
 *         &lt;element name="SaleItem" type="{}SaleItemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="LoyaltyTransactionType" use="required" type="{}LoyaltyTransactionTypeTypeCode" />
 *       &lt;attribute name="Currency" type="{}ISOCurrency3A" />
 *       &lt;attribute name="TotalAmount" type="{}SimpleAmountType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class LoyaltyTransactionType {
    @Element(name = "OriginalPOITransaction", required = false)
    protected OriginalPOITransactionType originalPOITransaction;
    @Element(name = "TransactionConditions", required = false)
    protected TransactionConditionsType transactionConditions;
    @Element(name = "SaleItem", required = false)
    protected List<SaleItemType> saleItem;
    @Attribute(name = "LoyaltyTransactionType", required = true)
    protected String loyaltyTransactionType;
    @Attribute(name = "Currency", required = false)
    protected String currency;
    @Attribute(name = "TotalAmount", required = false)
    protected BigDecimal totalAmount;
    /**
     * Ruft den Wert der originalPOITransaction-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link OriginalPOITransactionType }
     *
     */
    public OriginalPOITransactionType getOriginalPOITransaction() {
        return originalPOITransaction;
    }
    /**
     * Legt den Wert der originalPOITransaction-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link OriginalPOITransactionType }
     *
     */
    public void setOriginalPOITransaction(OriginalPOITransactionType value) {
        this.originalPOITransaction = value;
    }
    /**
     * Ruft den Wert der transactionConditions-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link TransactionConditionsType }
     *
     */
    public TransactionConditionsType getTransactionConditions() {
        return transactionConditions;
    }
    /**
     * Legt den Wert der transactionConditions-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link TransactionConditionsType }
     *
     */
    public void setTransactionConditions(TransactionConditionsType value) {
        this.transactionConditions = value;
    }
    /**
     * Gets the value of the saleItem property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saleItem property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaleItem().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SaleItemType }
     *
     *
     */
    public List<SaleItemType> getSaleItem() {
        if (saleItem == null) {
            saleItem = new ArrayList<SaleItemType>();
        }
        return this.saleItem;
    }
    /**
     * Ruft den Wert der loyaltyTransactionType-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLoyaltyTransactionType() {
        return loyaltyTransactionType;
    }
    /**
     * Legt den Wert der loyaltyTransactionType-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLoyaltyTransactionType(String value) {
        this.loyaltyTransactionType = value;
    }
    /**
     * Ruft den Wert der currency-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCurrency() {
        return currency;
    }
    /**
     * Legt den Wert der currency-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCurrency(String value) {
        this.currency = value;
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
}
