//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;
import java.math.BigDecimal;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
/**
 * Definition: Content of the Reversal Request message. -- Usage: It
 * 				conveys Information related to the reversal of a previous payment or a loyalty
 * 				transaction.
 *
 * <p>Java-Klasse für ReversalRequestType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="ReversalRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SaleData" type="{}SaleDataType" minOccurs="0"/>
 *         &lt;element name="OriginalPOITransaction" type="{}OriginalPOITransactionType"/>
 *         &lt;element name="CustomerOrder" type="{}CustomerOrderType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ReversalReason" use="required" type="{}ReversalReasonTypeCode" />
 *       &lt;attribute name="ReversedAmount" type="{}SimpleAmountType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class ReversalRequestType {
    @Element(name = "SaleData", required = false)
    protected SaleDataType saleData;
    @Element(name = "OriginalPOITransaction", required = true)
    protected OriginalPOITransactionType originalPOITransaction;
    @Element(name = "CustomerOrder", required = false)
    protected CustomerOrderType customerOrder;
    @Attribute(name = "ReversalReason", required = true)
    protected String reversalReason;
    @Attribute(name = "ReversedAmount", required = false)
    protected BigDecimal reversedAmount;
    /**
     * Ruft den Wert der saleData-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link SaleDataType }
     *
     */
    public SaleDataType getSaleData() {
        return saleData;
    }
    /**
     * Legt den Wert der saleData-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link SaleDataType }
     *
     */
    public void setSaleData(SaleDataType value) {
        this.saleData = value;
    }
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
     * Ruft den Wert der customerOrder-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link CustomerOrderType }
     *
     */
    public CustomerOrderType getCustomerOrder() {
        return customerOrder;
    }
    /**
     * Legt den Wert der customerOrder-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link CustomerOrderType }
     *
     */
    public void setCustomerOrder(CustomerOrderType value) {
        this.customerOrder = value;
    }
    /**
     * Ruft den Wert der reversalReason-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReversalReason() {
        return reversalReason;
    }
    /**
     * Legt den Wert der reversalReason-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReversalReason(String value) {
        this.reversalReason = value;
    }
    /**
     * Ruft den Wert der reversedAmount-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getReversedAmount() {
        return reversedAmount;
    }
    /**
     * Legt den Wert der reversedAmount-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setReversedAmount(BigDecimal value) {
        this.reversedAmount = value;
    }
}
