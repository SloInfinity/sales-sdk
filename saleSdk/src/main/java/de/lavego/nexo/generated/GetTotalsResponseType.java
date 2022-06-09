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
 * Definition: Content of the Reconciliation Response message. -- Usage:
 * 				It conveys Information related to the Reconciliation transaction processed by the
 * 				POI System
 *
 * <p>Java-Klasse für GetTotalsResponseType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="GetTotalsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Response" type="{}ResponseType"/>
 *         &lt;element name="TransactionTotals" type="{}TransactionTotalsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="POIReconciliationID" use="required" type="{}POIReconciliationIDType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class GetTotalsResponseType {
    @Element(name = "Response", required = true)
    protected ResponseType response;
    @Element(name = "TransactionTotals", required = false)
    protected List<TransactionTotalsType> transactionTotals;
    @Attribute(name = "POIReconciliationID", required = true)
    protected String poiReconciliationID;
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
     * Gets the value of the transactionTotals property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionTotals property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionTotals().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionTotalsType }
     *
     *
     */
    public List<TransactionTotalsType> getTransactionTotals() {
        if (transactionTotals == null) {
            transactionTotals = new ArrayList<TransactionTotalsType>();
        }
        return this.transactionTotals;
    }
    /**
     * Ruft den Wert der poiReconciliationID-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPOIReconciliationID() {
        return poiReconciliationID;
    }
    /**
     * Legt den Wert der poiReconciliationID-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPOIReconciliationID(String value) {
        this.poiReconciliationID = value;
    }
}
