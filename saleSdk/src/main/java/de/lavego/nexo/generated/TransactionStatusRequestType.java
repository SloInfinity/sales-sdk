//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;
import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
/**
 * Definition: Content of the TransactionStatus Request message. --
 * 				Usage: It conveys Information requested for status of the last or current Payment,
 * 				Loyalty or Reversal transaction.
 *
 * <p>Java-Klasse für TransactionStatusRequestType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="TransactionStatusRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageReference" type="{}MessageReferenceType" minOccurs="0"/>
 *         &lt;element name="DocumentQualifier" type="{}DocumentQualifierTypeCode" maxOccurs="2" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ReceiptReprintFlag" type="{}ReceiptReprintFlagType" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class TransactionStatusRequestType {
    @Element(name = "MessageReference", required = false)
    protected MessageReferenceType messageReference;
    @Element(name = "DocumentQualifier", required = false)
    protected List<String> documentQualifier;
    @Attribute(name = "ReceiptReprintFlag", required = false)
    protected Boolean receiptReprintFlag;
    /**
     * Ruft den Wert der messageReference-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link MessageReferenceType }
     *
     */
    public MessageReferenceType getMessageReference() {
        return messageReference;
    }
    /**
     * Legt den Wert der messageReference-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link MessageReferenceType }
     *
     */
    public void setMessageReference(MessageReferenceType value) {
        this.messageReference = value;
    }
    /**
     * Gets the value of the documentQualifier property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentQualifier property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentQualifier().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getDocumentQualifier() {
        if (documentQualifier == null) {
            documentQualifier = new ArrayList<String>();
        }
        return this.documentQualifier;
    }
    /**
     * Ruft den Wert der receiptReprintFlag-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isReceiptReprintFlag() {
        if (receiptReprintFlag == null) {
            return false;
        } else {
            return receiptReprintFlag;
        }
    }
    /**
     * Legt den Wert der receiptReprintFlag-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setReceiptReprintFlag(Boolean value) {
        this.receiptReprintFlag = value;
    }
}
