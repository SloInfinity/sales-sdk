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
 * Definition: Content of the Reversal Response message. -- Usage: It
 * 				conveys Information related to the reversal processed by the POI
 * 				System.
 *
 * <p>Java-Klasse für ReversalResponseType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="ReversalResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Response" type="{}ResponseType"/>
 *         &lt;element name="POIData" type="{}POIDataType" minOccurs="0"/>
 *         &lt;element name="OriginalPOITransaction" type="{}OriginalPOITransactionType" minOccurs="0"/>
 *         &lt;element name="PaymentReceipt" type="{}PaymentReceiptType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ReversedAmount" type="{}SimpleAmountType" />
 *       &lt;attribute name="CustomerOrderID" type="{}CustomerOrderIDType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class ReversalResponseType {
    @Element(name = "Response", required = true)
    protected ResponseType response;
    @Element(name = "POIData", required = false)
    protected POIDataType poiData;
    @Element(name = "OriginalPOITransaction", required = false)
    protected OriginalPOITransactionType originalPOITransaction;
    @Element(name = "PaymentReceipt", required = false)
    protected List<PaymentReceiptType> paymentReceipt;
    @Attribute(name = "ReversedAmount", required = false)
    protected BigDecimal reversedAmount;
    @Attribute(name = "CustomerOrderID", required = false)
    protected String customerOrderID;
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
     * Gets the value of the paymentReceipt property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentReceipt property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentReceipt().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentReceiptType }
     *
     *
     */
    public List<PaymentReceiptType> getPaymentReceipt() {
        if (paymentReceipt == null) {
            paymentReceipt = new ArrayList<PaymentReceiptType>();
        }
        return this.paymentReceipt;
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
    /**
     * Ruft den Wert der customerOrderID-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCustomerOrderID() {
        return customerOrderID;
    }
    /**
     * Legt den Wert der customerOrderID-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCustomerOrderID(String value) {
        this.customerOrderID = value;
    }
}
