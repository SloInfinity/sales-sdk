//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition: Content of the Payment Request message. -- Usage: It
 * conveys Information related to the Payment transaction to process
 *
 * <p>Java-Klasse für PaymentRequestType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="PaymentRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SaleData" type="{}SaleDataType"/>
 *         &lt;element name="PaymentTransaction" type="{}PaymentTransactionType"/>
 *         &lt;element name="PaymentData" type="{}PaymentDataType" minOccurs="0"/>
 *         &lt;element name="LoyaltyData" type="{}LoyaltyDataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@Order(elements = {
        "SaleData",
        "PaymentTransaction",
        "PaymentData",
        "LoyaltyData"
})
public class PaymentRequestType
{
    @Element(name = "SaleData", required = true)
    protected SaleDataType saleData;
    @Element(name = "PaymentTransaction", required = true)
    protected PaymentTransactionType paymentTransaction;
    @Element(name = "PaymentData", required = false)
    protected PaymentDataType paymentData;
    @Element(name = "LoyaltyData", required = false)
    protected List<LoyaltyDataType> loyaltyData;
    
    /**
     * Gets the value of the loyaltyData property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyData property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyData().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyDataType }
     */
    public List<LoyaltyDataType> getLoyaltyData()
    {
        if (loyaltyData == null)
        {
            loyaltyData = new ArrayList<LoyaltyDataType>();
        }
        return this.loyaltyData;
    }
    
    /**
     * Ruft den Wert der paymentData-Eigenschaft ab.
     *
     * @return possible object is
     * {@link PaymentDataType }
     */
    public PaymentDataType getPaymentData()
    {
        return paymentData;
    }
    
    /**
     * Legt den Wert der paymentData-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link PaymentDataType }
     */
    public void setPaymentData(PaymentDataType value)
    {
        this.paymentData = value;
    }
    
    /**
     * Ruft den Wert der paymentTransaction-Eigenschaft ab.
     *
     * @return possible object is
     * {@link PaymentTransactionType }
     */
    public PaymentTransactionType getPaymentTransaction()
    {
        return paymentTransaction;
    }
    
    /**
     * Legt den Wert der paymentTransaction-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link PaymentTransactionType }
     */
    public void setPaymentTransaction(PaymentTransactionType value)
    {
        this.paymentTransaction = value;
    }
    
    /**
     * Ruft den Wert der saleData-Eigenschaft ab.
     *
     * @return possible object is
     * {@link SaleDataType }
     */
    public SaleDataType getSaleData()
    {
        return saleData;
    }
    
    /**
     * Legt den Wert der saleData-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link SaleDataType }
     */
    public void setSaleData(SaleDataType value)
    {
        this.saleData = value;
    }
}
