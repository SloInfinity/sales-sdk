//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import org.simpleframework.xml.Element;
/**
 * Definition: Content of the Card Acquisition Request message. -- Usage:
 * 				It conveys Information related to the payment and loyalty cards to read and analyse.
 * 				This message pair is usually followed by a message pair (e.g. payment or loyalty)
 * 				which refers to this Card Acquisition message pair. The Card
 * 				Acquisition
 *
 * <p>Java-Klasse für CardAcquisitionRequestType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="CardAcquisitionRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SaleData" type="{}SaleDataType"/>
 *         &lt;element name="CardAcquisitionTransaction" type="{}CardAcquisitionTransactionType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class CardAcquisitionRequestType {
    @Element(name = "SaleData", required = true)
    protected SaleDataType saleData;
    @Element(name = "CardAcquisitionTransaction", required = true)
    protected CardAcquisitionTransactionType cardAcquisitionTransaction;
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
     * Ruft den Wert der cardAcquisitionTransaction-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link CardAcquisitionTransactionType }
     *
     */
    public CardAcquisitionTransactionType getCardAcquisitionTransaction() {
        return cardAcquisitionTransaction;
    }
    /**
     * Legt den Wert der cardAcquisitionTransaction-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link CardAcquisitionTransactionType }
     *
     */
    public void setCardAcquisitionTransaction(CardAcquisitionTransactionType value) {
        this.cardAcquisitionTransaction = value;
    }
}
