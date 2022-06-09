//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;
import org.simpleframework.xml.Attribute;

import java.math.BigDecimal;
/**
 * Definition: Various amounts related to the payment and loyalty request
 * 				from the Sale System. -- Usage: Amounts requested by the Sale System for the payment
 * 				and loyalty transaction, containing: The currency which is the same for all these
 * 				amounts The requested amount to pay The cash back part of the requested amount for a
 * 				payment with cash
 *
 * <p>Java-Klasse für AmountsReqType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="AmountsReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Currency" use="required" type="{}ISOCurrency3A" />
 *       &lt;attribute name="RequestedAmount" type="{}SimpleAmountType" />
 *       &lt;attribute name="CashBackAmount" type="{}SimpleAmountType" />
 *       &lt;attribute name="TipAmount" type="{}SimpleAmountType" />
 *       &lt;attribute name="PaidAmount" type="{}SimpleAmountType" />
 *       &lt;attribute name="MinimumAmountToDeliver" type="{}SimpleAmountType" />
 *       &lt;attribute name="MaximumCashBackAmount" type="{}SimpleAmountType" />
 *       &lt;attribute name="MinimumSplitAmount" type="{}SimpleAmountType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class AmountsReqType {
    @Attribute(name = "Currency", required = true)
    protected String currency;
    @Attribute(name = "RequestedAmount", required = false)
    protected BigDecimal requestedAmount;
    @Attribute(name = "CashBackAmount", required = false)
    protected BigDecimal cashBackAmount;
    @Attribute(name = "TipAmount", required = false)
    protected BigDecimal tipAmount;
    @Attribute(name = "PaidAmount", required = false)
    protected BigDecimal paidAmount;
    @Attribute(name = "MinimumAmountToDeliver", required = false)
    protected BigDecimal minimumAmountToDeliver;
    @Attribute(name = "MaximumCashBackAmount", required = false)
    protected BigDecimal maximumCashBackAmount;
    @Attribute(name = "MinimumSplitAmount", required = false)
    protected BigDecimal minimumSplitAmount;
    @Attribute(name="RcncltnId", required = false)
    protected String rcncltnId;
    
    public String getRcncltnId() { return rcncltnId; }
    public void setRcncltnId(String rcncltnId) { this.rcncltnId = rcncltnId; }
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
     * Ruft den Wert der requestedAmount-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getRequestedAmount() {
        return requestedAmount;
    }
    /**
     * Legt den Wert der requestedAmount-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setRequestedAmount(BigDecimal value) {
        this.requestedAmount = value;
    }
    /**
     * Ruft den Wert der cashBackAmount-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCashBackAmount() {
        return cashBackAmount;
    }
    /**
     * Legt den Wert der cashBackAmount-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCashBackAmount(BigDecimal value) {
        this.cashBackAmount = value;
    }
    /**
     * Ruft den Wert der tipAmount-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getTipAmount() {
        return tipAmount;
    }
    /**
     * Legt den Wert der tipAmount-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setTipAmount(BigDecimal value) {
        this.tipAmount = value;
    }
    /**
     * Ruft den Wert der paidAmount-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getPaidAmount() {
        return paidAmount;
    }
    /**
     * Legt den Wert der paidAmount-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setPaidAmount(BigDecimal value) {
        this.paidAmount = value;
    }
    /**
     * Ruft den Wert der minimumAmountToDeliver-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getMinimumAmountToDeliver() {
        return minimumAmountToDeliver;
    }
    /**
     * Legt den Wert der minimumAmountToDeliver-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setMinimumAmountToDeliver(BigDecimal value) {
        this.minimumAmountToDeliver = value;
    }
    /**
     * Ruft den Wert der maximumCashBackAmount-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getMaximumCashBackAmount() {
        return maximumCashBackAmount;
    }
    /**
     * Legt den Wert der maximumCashBackAmount-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setMaximumCashBackAmount(BigDecimal value) {
        this.maximumCashBackAmount = value;
    }
    /**
     * Ruft den Wert der minimumSplitAmount-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getMinimumSplitAmount() {
        return minimumSplitAmount;
    }
    /**
     * Legt den Wert der minimumSplitAmount-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setMinimumSplitAmount(BigDecimal value) {
        this.minimumSplitAmount = value;
    }
}
