//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;
import org.simpleframework.xml.Element;
/**
 * Definition: Content of the Balance Inquiry Response message. -- Usage:
 * 				It conveys the balance and the identification of the associated payment, loyalty or
 * 				stored value account.
 *
 * <p>Java-Klasse für BalanceInquiryResponseType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="BalanceInquiryResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Response" type="{}ResponseType"/>
 *         &lt;element name="PaymentAccountStatus" type="{}PaymentAccountStatusType" minOccurs="0"/>
 *         &lt;element name="LoyaltyAccountStatus" type="{}LoyaltyAccountStatusType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class BalanceInquiryResponseType {
    @Element(name = "Response", required = true)
    protected ResponseType response;
    @Element(name = "PaymentAccountStatus", required = false)
    protected PaymentAccountStatusType paymentAccountStatus;
    @Element(name = "LoyaltyAccountStatus", required = false)
    protected LoyaltyAccountStatusType loyaltyAccountStatus;
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
     * Ruft den Wert der paymentAccountStatus-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link PaymentAccountStatusType }
     *
     */
    public PaymentAccountStatusType getPaymentAccountStatus() {
        return paymentAccountStatus;
    }
    /**
     * Legt den Wert der paymentAccountStatus-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link PaymentAccountStatusType }
     *
     */
    public void setPaymentAccountStatus(PaymentAccountStatusType value) {
        this.paymentAccountStatus = value;
    }
    /**
     * Ruft den Wert der loyaltyAccountStatus-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link LoyaltyAccountStatusType }
     *
     */
    public LoyaltyAccountStatusType getLoyaltyAccountStatus() {
        return loyaltyAccountStatus;
    }
    /**
     * Legt den Wert der loyaltyAccountStatus-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link LoyaltyAccountStatusType }
     *
     */
    public void setLoyaltyAccountStatus(LoyaltyAccountStatusType value) {
        this.loyaltyAccountStatus = value;
    }
}
