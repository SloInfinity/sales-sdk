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
 * Definition: Information related to a currency conversion -- Usage: A
 * 				currency conversion occurred in the payment, and the merchant needs to know
 * 				information related to this conversion (e.g. to print on the sale
 * 				receipt)
 *
 * <p>Java-Klasse für CurrencyConversionType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="CurrencyConversionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConvertedAmount" type="{}AmountType"/>
 *         &lt;element name="Commission" type="{}SimpleAmountType" minOccurs="0"/>
 *         &lt;element name="Declaration" type="{}DeclarationType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CustomerApprovedFlag" type="{}CustomerApprovedFlagType" default="true" />
 *       &lt;attribute name="Rate" type="{}RateType" />
 *       &lt;attribute name="Markup" type="{}MarkupType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class CurrencyConversionType {
    @Element(name = "ConvertedAmount", required = true)
    protected AmountType convertedAmount;
    @Element(name = "Commission", required = false)
    protected BigDecimal commission;
    @Element(name = "Declaration", required = false)
    protected String declaration;
    @Attribute(name = "CustomerApprovedFlag", required = false)
    protected Boolean customerApprovedFlag;
    @Attribute(name = "Rate", required = false)
    protected BigDecimal rate;
    @Attribute(name = "Markup", required = false)
    protected BigDecimal markup;
    /**
     * Ruft den Wert der convertedAmount-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link AmountType }
     *
     */
    public AmountType getConvertedAmount() {
        return convertedAmount;
    }
    /**
     * Legt den Wert der convertedAmount-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *
     */
    public void setConvertedAmount(AmountType value) {
        this.convertedAmount = value;
    }
    /**
     * Ruft den Wert der commission-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCommission() {
        return commission;
    }
    /**
     * Legt den Wert der commission-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCommission(BigDecimal value) {
        this.commission = value;
    }
    /**
     * Ruft den Wert der declaration-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDeclaration() {
        return declaration;
    }
    /**
     * Legt den Wert der declaration-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDeclaration(String value) {
        this.declaration = value;
    }
    /**
     * Ruft den Wert der customerApprovedFlag-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isCustomerApprovedFlag() {
        if (customerApprovedFlag == null) {
            return true;
        } else {
            return customerApprovedFlag;
        }
    }
    /**
     * Legt den Wert der customerApprovedFlag-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setCustomerApprovedFlag(Boolean value) {
        this.customerApprovedFlag = value;
    }
    /**
     * Ruft den Wert der rate-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getRate() {
        return rate;
    }
    /**
     * Legt den Wert der rate-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }
    /**
     * Ruft den Wert der markup-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getMarkup() {
        return markup;
    }
    /**
     * Legt den Wert der markup-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setMarkup(BigDecimal value) {
        this.markup = value;
    }
}
