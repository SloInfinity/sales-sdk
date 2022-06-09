//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

import java.util.ArrayList;
import java.util.List;
/**
 * Definition: Information related to the payment card used for the
 * 				transaction. -- Usage: Allows acquisition of the card data by the Sale System before
 * 				the Payment, CardAcquisition or BalanceInquiry request to the POI. It could also be
 * 				sent in the CardAcquisition response, to be processed by the Sale System. In this
 * 				case, the
 *
 * <p>Java-Klasse für CardDataType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="CardDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProtectedCardData" type="{}ContentInformationType" minOccurs="0"/>
 *         &lt;element name="SensitiveCardData" type="{}SensitiveCardDataType" minOccurs="0"/>
 *         &lt;element name="AllowedProductCode" type="{}AllowedProductCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AllowedProduct" type="{}AllowedProductType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaymentToken" type="{}PaymentTokenType" minOccurs="0"/>
 *         &lt;element name="CustomerOrder" type="{}CustomerOrderType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PaymentBrand" type="{}PaymentBrandType" />
 *       &lt;attribute name="MaskedPAN" type="{}MaskedPANType" />
 *       &lt;attribute name="PaymentAccountRef" type="{}PaymentAccountRefType" />
 *       &lt;attribute name="EntryMode" type="{}EntryModeType" />
 *       &lt;attribute name="CardCountryCode" type="{}CardCountryCodeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class CardDataType {
    @Element(name = "ProtectedCardData", required = false)
    protected ContentInformationType protectedCardData;
    @Element(name = "SensitiveCardData", required = false)
    protected SensitiveCardDataType sensitiveCardData;
    @Element(name = "AllowedProductCode", required = false)
    protected List<String> allowedProductCode;
    @Element(name = "AllowedProduct", required = false)
    protected List<AllowedProductType> allowedProduct;
    @Element(name = "PaymentToken", required = false)
    protected PaymentTokenType paymentToken;
    @Element(name = "CustomerOrder", required = false)
    protected List<CustomerOrderType> customerOrder;
    @Attribute(name = "PaymentBrand", required = false)
    protected String paymentBrand;
    @Attribute(name = "MaskedPAN", required = false)
    protected String maskedPAN;
    @Attribute(name = "PaymentAccountRef", required = false)
    protected String paymentAccountRef;
    @Attribute(name = "EntryMode", required = false)
    protected List<String> entryMode;
    @Attribute(name = "CardCountryCode", required = false)
    protected String cardCountryCode;
    /**
     * Ruft den Wert der protectedCardData-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link ContentInformationType }
     *
     */
    public ContentInformationType getProtectedCardData() {
        return protectedCardData;
    }
    /**
     * Legt den Wert der protectedCardData-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link ContentInformationType }
     *
     */
    public void setProtectedCardData(ContentInformationType value) {
        this.protectedCardData = value;
    }
    /**
     * Ruft den Wert der sensitiveCardData-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link SensitiveCardDataType }
     *
     */
    public SensitiveCardDataType getSensitiveCardData() {
        return sensitiveCardData;
    }
    /**
     * Legt den Wert der sensitiveCardData-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link SensitiveCardDataType }
     *
     */
    public void setSensitiveCardData(SensitiveCardDataType value) {
        this.sensitiveCardData = value;
    }
    /**
     * Gets the value of the allowedProductCode property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowedProductCode property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedProductCode().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getAllowedProductCode() {
        if (allowedProductCode == null) {
            allowedProductCode = new ArrayList<String>();
        }
        return this.allowedProductCode;
    }
    /**
     * Gets the value of the allowedProduct property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowedProduct property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedProduct().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllowedProductType }
     *
     *
     */
    public List<AllowedProductType> getAllowedProduct() {
        if (allowedProduct == null) {
            allowedProduct = new ArrayList<AllowedProductType>();
        }
        return this.allowedProduct;
    }
    /**
     * Ruft den Wert der paymentToken-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link PaymentTokenType }
     *
     */
    public PaymentTokenType getPaymentToken() {
        return paymentToken;
    }
    /**
     * Legt den Wert der paymentToken-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link PaymentTokenType }
     *
     */
    public void setPaymentToken(PaymentTokenType value) {
        this.paymentToken = value;
    }
    /**
     * Gets the value of the customerOrder property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerOrder property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerOrder().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerOrderType }
     *
     *
     */
    public List<CustomerOrderType> getCustomerOrder() {
        if (customerOrder == null) {
            customerOrder = new ArrayList<CustomerOrderType>();
        }
        return this.customerOrder;
    }
    /**
     * Ruft den Wert der paymentBrand-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPaymentBrand() {
        return paymentBrand;
    }
    /**
     * Legt den Wert der paymentBrand-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPaymentBrand(String value) {
        this.paymentBrand = value;
    }
    /**
     * Ruft den Wert der maskedPAN-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMaskedPAN() {
        return maskedPAN;
    }
    /**
     * Legt den Wert der maskedPAN-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMaskedPAN(String value) {
        this.maskedPAN = value;
    }
    /**
     * Ruft den Wert der paymentAccountRef-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPaymentAccountRef() {
        return paymentAccountRef;
    }
    /**
     * Legt den Wert der paymentAccountRef-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPaymentAccountRef(String value) {
        this.paymentAccountRef = value;
    }
    /**
     * Gets the value of the entryMode property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entryMode property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntryMode().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getEntryMode() {
        if (entryMode == null) {
            entryMode = new ArrayList<String>();
        }
        return this.entryMode;
    }
    /**
     * Ruft den Wert der cardCountryCode-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCardCountryCode() {
        return cardCountryCode;
    }
    /**
     * Legt den Wert der cardCountryCode-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCardCountryCode(String value) {
        this.cardCountryCode = value;
    }
}
