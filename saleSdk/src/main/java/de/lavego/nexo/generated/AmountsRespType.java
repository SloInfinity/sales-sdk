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
 * Definition: Various amounts related to the payment response from the
 * 				POI System. -- Usage: Amounts approved by the POI and the Acquirer for the payment
 * 				and loyalty transaction, containing: The authorised amount to be paid The amount of
 * 				the rebates The amount of financial fees The cash back part of the requested amount
 * 				for a
 *
 * <p>Java-Klasse für AmountsRespType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="AmountsRespType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Currency" type="{}ISOCurrency3A" />
 *       &lt;attribute name="AuthorizedAmount" use="required" type="{}SimpleAmountType" />
 *       &lt;attribute name="TotalRebatesAmount" type="{}SimpleAmountType" />
 *       &lt;attribute name="TotalFeesAmount" type="{}SimpleAmountType" />
 *       &lt;attribute name="CashBackAmount" type="{}SimpleAmountType" />
 *       &lt;attribute name="TipAmount" type="{}SimpleAmountType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class AmountsRespType {
    @Attribute(name = "Currency", required = false)
    protected String currency;
    @Attribute(name = "AuthorizedAmount", required = true)
    protected BigDecimal authorizedAmount;
    @Attribute(name = "TotalRebatesAmount", required = false)
    protected BigDecimal totalRebatesAmount;
    @Attribute(name = "TotalFeesAmount", required = false)
    protected BigDecimal totalFeesAmount;
    @Attribute(name = "CashBackAmount", required = false)
    protected BigDecimal cashBackAmount;
    @Attribute(name = "TipAmount", required = false)
    protected BigDecimal tipAmount;
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
     * Ruft den Wert der authorizedAmount-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getAuthorizedAmount() {
        return authorizedAmount;
    }
    /**
     * Legt den Wert der authorizedAmount-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setAuthorizedAmount(BigDecimal value) {
        this.authorizedAmount = value;
    }
    /**
     * Ruft den Wert der totalRebatesAmount-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getTotalRebatesAmount() {
        return totalRebatesAmount;
    }
    /**
     * Legt den Wert der totalRebatesAmount-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setTotalRebatesAmount(BigDecimal value) {
        this.totalRebatesAmount = value;
    }
    /**
     * Ruft den Wert der totalFeesAmount-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getTotalFeesAmount() {
        return totalFeesAmount;
    }
    /**
     * Legt den Wert der totalFeesAmount-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setTotalFeesAmount(BigDecimal value) {
        this.totalFeesAmount = value;
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
}
