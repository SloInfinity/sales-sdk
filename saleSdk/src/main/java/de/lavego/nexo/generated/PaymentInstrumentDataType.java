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
 * Definition: Data related to the instrument of payment for the
 * 				transaction. -- Usage: Sent in the result of the payment transaction. For a card, it
 * 				could also be sent in the CardAcquisition response, to be processed by the Sale
 * 				System. In this case, the card or type of card has to be configured to have this
 * 				behaviour. It is
 *
 * <p>Java-Klasse für PaymentInstrumentDataType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="PaymentInstrumentDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CardData" type="{}CardDataType" minOccurs="0"/>
 *         &lt;element name="CheckData" type="{}CheckDataType" minOccurs="0"/>
 *         &lt;element name="MobileData" type="{}MobileDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PaymentInstrumentType" use="required" type="{}PaymentInstrumentTypeTypeCode" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class PaymentInstrumentDataType {
    @Element(name = "CardData", required = false)
    protected CardDataType cardData;
    @Element(name = "CheckData", required = false)
    protected CheckDataType checkData;
    @Element(name = "MobileData", required = false)
    protected MobileDataType mobileData;
    @Attribute(name = "PaymentInstrumentType", required = true)
    protected String paymentInstrumentType;
    /**
     * Ruft den Wert der cardData-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link CardDataType }
     *
     */
    public CardDataType getCardData() {
        return cardData;
    }
    /**
     * Legt den Wert der cardData-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link CardDataType }
     *
     */
    public void setCardData(CardDataType value) {
        this.cardData = value;
    }
    /**
     * Ruft den Wert der checkData-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link CheckDataType }
     *
     */
    public CheckDataType getCheckData() {
        return checkData;
    }
    /**
     * Legt den Wert der checkData-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link CheckDataType }
     *
     */
    public void setCheckData(CheckDataType value) {
        this.checkData = value;
    }
    /**
     * Ruft den Wert der mobileData-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link MobileDataType }
     *
     */
    public MobileDataType getMobileData() {
        return mobileData;
    }
    /**
     * Legt den Wert der mobileData-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link MobileDataType }
     *
     */
    public void setMobileData(MobileDataType value) {
        this.mobileData = value;
    }
    /**
     * Ruft den Wert der paymentInstrumentType-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPaymentInstrumentType() {
        return paymentInstrumentType;
    }
    /**
     * Legt den Wert der paymentInstrumentType-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPaymentInstrumentType(String value) {
        this.paymentInstrumentType = value;
    }
}
