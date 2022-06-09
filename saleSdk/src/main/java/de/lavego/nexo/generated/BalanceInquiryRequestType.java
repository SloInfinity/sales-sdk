//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;
import org.simpleframework.xml.Element;
/**
 * Definition: Content of the Balance Inquiry Request message. -- Usage:
 * 				It conveys Information related to the account for which a Balance Inquiry is
 * 				requested
 *
 * <p>Java-Klasse für BalanceInquiryRequestType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="BalanceInquiryRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentAccountReq" type="{}PaymentAccountReqType" minOccurs="0"/>
 *         &lt;element name="LoyaltyAccountReq" type="{}LoyaltyAccountReqType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class BalanceInquiryRequestType {
    @Element(name = "PaymentAccountReq", required = false)
    protected PaymentAccountReqType paymentAccountReq;
    @Element(name = "LoyaltyAccountReq", required = false)
    protected LoyaltyAccountReqType loyaltyAccountReq;
    /**
     * Ruft den Wert der paymentAccountReq-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link PaymentAccountReqType }
     *
     */
    public PaymentAccountReqType getPaymentAccountReq() {
        return paymentAccountReq;
    }
    /**
     * Legt den Wert der paymentAccountReq-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link PaymentAccountReqType }
     *
     */
    public void setPaymentAccountReq(PaymentAccountReqType value) {
        this.paymentAccountReq = value;
    }
    /**
     * Ruft den Wert der loyaltyAccountReq-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link LoyaltyAccountReqType }
     *
     */
    public LoyaltyAccountReqType getLoyaltyAccountReq() {
        return loyaltyAccountReq;
    }
    /**
     * Legt den Wert der loyaltyAccountReq-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link LoyaltyAccountReqType }
     *
     */
    public void setLoyaltyAccountReq(LoyaltyAccountReqType value) {
        this.loyaltyAccountReq = value;
    }
}
