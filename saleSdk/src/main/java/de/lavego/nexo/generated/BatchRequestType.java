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
 * Definition: Content of the Batch Request message. -- Usage: Message to
 * 				send Payment, Loyalty and Reversal transactions to be performed without the Sale
 * 				System, or to request the Payment, Loyalty and Reversal transactions that has been
 * 				performed without the Sale System.
 *
 * <p>Java-Klasse für BatchRequestType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="BatchRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransactionToPerform" type="{}TransactionToPerformType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RemoveAllFlag" type="{}RemoveAllFlagType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class BatchRequestType {
    @Element(name = "TransactionToPerform", required = false)
    protected List<TransactionToPerformType> transactionToPerform;
    @Attribute(name = "RemoveAllFlag", required = false)
    protected Boolean removeAllFlag;
    /**
     * Gets the value of the transactionToPerform property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionToPerform property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionToPerform().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionToPerformType }
     *
     *
     */
    public List<TransactionToPerformType> getTransactionToPerform() {
        if (transactionToPerform == null) {
            transactionToPerform = new ArrayList<TransactionToPerformType>();
        }
        return this.transactionToPerform;
    }
    /**
     * Ruft den Wert der removeAllFlag-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isRemoveAllFlag() {
        return removeAllFlag;
    }
    /**
     * Legt den Wert der removeAllFlag-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setRemoveAllFlag(Boolean value) {
        this.removeAllFlag = value;
    }
}
