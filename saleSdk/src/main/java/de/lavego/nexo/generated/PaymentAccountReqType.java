//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
/**
 * Definition: Data related to the account pointed by the payment card --
 * 				Usage: Information provided by the Sale System related to the payment account
 * 				requesting a balance.
 *
 * <p>Java-Klasse für PaymentAccountReqType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="PaymentAccountReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CardAcquisitionReference" type="{}TransactionIdentificationType" minOccurs="0"/>
 *         &lt;element name="PaymentInstrumentData" type="{}PaymentInstrumentDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AccountType" type="{}AccountTypeTypeCode" default="Default" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class PaymentAccountReqType {
    @Element(name = "CardAcquisitionReference", required = false)
    protected TransactionIdentificationType cardAcquisitionReference;
    @Element(name = "PaymentInstrumentData", required = false)
    protected PaymentInstrumentDataType paymentInstrumentData;
    @Attribute(name = "AccountType", required = false)
    protected String accountType;
    /**
     * Ruft den Wert der cardAcquisitionReference-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link TransactionIdentificationType }
     *
     */
    public TransactionIdentificationType getCardAcquisitionReference() {
        return cardAcquisitionReference;
    }
    /**
     * Legt den Wert der cardAcquisitionReference-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link TransactionIdentificationType }
     *
     */
    public void setCardAcquisitionReference(TransactionIdentificationType value) {
        this.cardAcquisitionReference = value;
    }
    /**
     * Ruft den Wert der paymentInstrumentData-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link PaymentInstrumentDataType }
     *
     */
    public PaymentInstrumentDataType getPaymentInstrumentData() {
        return paymentInstrumentData;
    }
    /**
     * Legt den Wert der paymentInstrumentData-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link PaymentInstrumentDataType }
     *
     */
    public void setPaymentInstrumentData(PaymentInstrumentDataType value) {
        this.paymentInstrumentData = value;
    }
    /**
     * Ruft den Wert der accountType-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAccountType() {
        if (accountType == null) {
            return "Default";
        } else {
            return accountType;
        }
    }
    /**
     * Legt den Wert der accountType-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }
}
