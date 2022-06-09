//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.simpleframework.xml.Attribute;
/**
 * Definition: Totals of the loyalty transaction during the
 * 				reconciliation period.
 *
 * <p>Java-Klasse für LoyaltyTotalsType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="LoyaltyTotalsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="TransactionType" use="required" type="{}TransactionTypeTypeCode" />
 *       &lt;attribute name="TransactionCount" use="required" type="{}TransactionCountType" />
 *       &lt;attribute name="TransactionAmount" use="required" type="{}SimpleAmountType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class LoyaltyTotalsType {
    @Attribute(name = "TransactionType", required = true)
    protected String transactionType;
    @Attribute(name = "TransactionCount", required = true)
    protected BigInteger transactionCount;
    @Attribute(name = "TransactionAmount", required = true)
    protected BigDecimal transactionAmount;
    /**
     * Ruft den Wert der transactionType-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTransactionType() {
        return transactionType;
    }
    /**
     * Legt den Wert der transactionType-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }
    /**
     * Ruft den Wert der transactionCount-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getTransactionCount() {
        return transactionCount;
    }
    /**
     * Legt den Wert der transactionCount-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setTransactionCount(BigInteger value) {
        this.transactionCount = value;
    }
    /**
     * Ruft den Wert der transactionAmount-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getTransactionAmount() {
        return transactionAmount;
    }
    /**
     * Legt den Wert der transactionAmount-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setTransactionAmount(BigDecimal value) {
        this.transactionAmount = value;
    }
}
