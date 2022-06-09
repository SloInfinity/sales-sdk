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
 * Definition: Result of performed transactions. -- Usage: Contains
 * 				result of transaction performed without the Sale system.
 *
 * <p>Java-Klasse für PerformedTransactionType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="PerformedTransactionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Response" type="{}ResponseType"/>
 *         &lt;element name="SaleData" type="{}SaleDataType" minOccurs="0"/>
 *         &lt;element name="POIData" type="{}POIDataType"/>
 *         &lt;element name="PaymentResult" type="{}PaymentResultType" minOccurs="0"/>
 *         &lt;element name="LoyaltyResult" type="{}LoyaltyResultType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ReversedAmount" type="{}SimpleAmountType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class PerformedTransactionType {
    @Element(name = "Response", required = true)
    protected ResponseType response;
    @Element(name = "SaleData", required = false)
    protected SaleDataType saleData;
    @Element(name = "POIData", required = true)
    protected POIDataType poiData;
    @Element(name = "PaymentResult", required = false)
    protected PaymentResultType paymentResult;
    @Element(name = "LoyaltyResult", required = false)
    protected List<LoyaltyResultType> loyaltyResult;
    @Attribute(name = "ReversedAmount", required = false)
    protected BigDecimal reversedAmount;
    /**
     * Ruft den Wert der response-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link ResponseType }
     *
     */
    public ResponseType getResponse() {
        return response;
    }
    /**
     * Legt den Wert der response-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link ResponseType }
     *
     */
    public void setResponse(ResponseType value) {
        this.response = value;
    }
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
     * Ruft den Wert der poiData-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link POIDataType }
     *
     */
    public POIDataType getPOIData() {
        return poiData;
    }
    /**
     * Legt den Wert der poiData-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link POIDataType }
     *
     */
    public void setPOIData(POIDataType value) {
        this.poiData = value;
    }
    /**
     * Ruft den Wert der paymentResult-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link PaymentResultType }
     *
     */
    public PaymentResultType getPaymentResult() {
        return paymentResult;
    }
    /**
     * Legt den Wert der paymentResult-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link PaymentResultType }
     *
     */
    public void setPaymentResult(PaymentResultType value) {
        this.paymentResult = value;
    }
    /**
     * Gets the value of the loyaltyResult property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyResult property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyResult().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyResultType }
     *
     *
     */
    public List<LoyaltyResultType> getLoyaltyResult() {
        if (loyaltyResult == null) {
            loyaltyResult = new ArrayList<LoyaltyResultType>();
        }
        return this.loyaltyResult;
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
