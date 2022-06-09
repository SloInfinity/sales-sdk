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
 * Definition: Data related to the payment and loyalty transaction. --
 * 				Usage: Elements requested by the Sale System that are global to the payment or
 * 				loyalty transaction.
 *
 * <p>Java-Klasse für PaymentTransactionType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="PaymentTransactionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AmountsReq" type="{}AmountsReqType"/>
 *         &lt;element name="OriginalPOITransaction" type="{}OriginalPOITransactionType" minOccurs="0"/>
 *         &lt;element name="TransactionConditions" type="{}TransactionConditionsType" minOccurs="0"/>
 *         &lt;element name="SaleItem" type="{}SaleItemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class PaymentTransactionType {
    @Element(name = "AmountsReq", required = true)
    protected AmountsReqType amountsReq;
    @Element(name = "OriginalPOITransaction", required = false)
    protected OriginalPOITransactionType originalPOITransaction;
    @Element(name = "TransactionConditions", required = false)
    protected TransactionConditionsType transactionConditions;
    @Element(name = "SaleItem", required = false)
    protected List<SaleItemType> saleItem;
    /**
     * Ruft den Wert der amountsReq-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link AmountsReqType }
     *
     */
    public AmountsReqType getAmountsReq() {
        return amountsReq;
    }
    /**
     * Legt den Wert der amountsReq-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link AmountsReqType }
     *
     */
    public void setAmountsReq(AmountsReqType value) {
        this.amountsReq = value;
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
     * Ruft den Wert der transactionConditions-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link TransactionConditionsType }
     *
     */
    public TransactionConditionsType getTransactionConditions() {
        return transactionConditions;
    }
    /**
     * Legt den Wert der transactionConditions-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link TransactionConditionsType }
     *
     */
    public void setTransactionConditions(TransactionConditionsType value) {
        this.transactionConditions = value;
    }
    /**
     * Gets the value of the saleItem property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saleItem property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaleItem().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SaleItemType }
     *
     *
     */
    public List<SaleItemType> getSaleItem() {
        if (saleItem == null) {
            saleItem = new ArrayList<SaleItemType>();
        }
        return this.saleItem;
    }
}
