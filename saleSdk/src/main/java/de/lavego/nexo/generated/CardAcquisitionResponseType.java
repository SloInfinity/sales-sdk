//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;
import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.Element;
/**
 * Definition: Content of the Card Acquisition Response message. --
 * 				Usage: It conveys Information related to the payment and loyalty cards read and
 * 				processed by the POI System and entered by the Customer:As for the Payment request,
 * 				the result of the CardAcquisition and the identification of the
 * 				transaction.One
 *
 * <p>Java-Klasse für CardAcquisitionResponseType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="CardAcquisitionResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Response" type="{}ResponseType"/>
 *         &lt;element name="SaleData" type="{}SaleDataType"/>
 *         &lt;element name="POIData" type="{}POIDataType"/>
 *         &lt;element name="PaymentBrand" type="{}PaymentBrandType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaymentInstrumentData" type="{}PaymentInstrumentDataType" minOccurs="0"/>
 *         &lt;element name="LoyaltyAccount" type="{}LoyaltyAccountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CustomerOrder" type="{}CustomerOrderType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class CardAcquisitionResponseType {
    @Element(name = "Response", required = true)
    protected ResponseType response;
    @Element(name = "SaleData", required = true)
    protected SaleDataType saleData;
    @Element(name = "POIData", required = true)
    protected POIDataType poiData;
    @Element(name = "PaymentBrand", required = false)
    protected List<String> paymentBrand;
    @Element(name = "PaymentInstrumentData", required = false)
    protected PaymentInstrumentDataType paymentInstrumentData;
    @Element(name = "LoyaltyAccount", required = false)
    protected List<LoyaltyAccountType> loyaltyAccount;
    @Element(name = "CustomerOrder", required = false)
    protected List<CustomerOrderType> customerOrder;
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
     * Gets the value of the paymentBrand property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentBrand property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentBrand().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getPaymentBrand() {
        if (paymentBrand == null) {
            paymentBrand = new ArrayList<String>();
        }
        return this.paymentBrand;
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
     * Gets the value of the loyaltyAccount property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyAccount property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyAccount().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyAccountType }
     *
     *
     */
    public List<LoyaltyAccountType> getLoyaltyAccount() {
        if (loyaltyAccount == null) {
            loyaltyAccount = new ArrayList<LoyaltyAccountType>();
        }
        return this.loyaltyAccount;
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
}
