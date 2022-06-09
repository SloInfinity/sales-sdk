//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import org.simpleframework.xml.Element;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition: Content of the Batch Response message. -- Usage: It
 * conveys either the response of transactions to perform sent in the batch request, or
 * a collection of results of performed Payment, Loyalty and Reversal transactions in a
 * batch message or file.
 *
 * <p>Java-Klasse für BatchResponseType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="BatchResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Response" type="{}ResponseType"/>
 *         &lt;element name="PerformedTransaction" type="{}PerformedTransactionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
public class BatchResponseType
{
    @Element(name = "Response", required = true)
    protected ResponseType                   response;
    @Element(name = "PerformedTransaction", required = false)
    protected List<PerformedTransactionType> performedTransaction;

    /**
     * Ruft den Wert der response-Eigenschaft ab.
     *
     * @return possible object is
     * {@link ResponseType }
     */
    public ResponseType getResponse()
    {
        return response;
    }

    /**
     * Legt den Wert der response-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link ResponseType }
     */
    public void setResponse(ResponseType value)
    {
        this.response = value;
    }

    /**
     * Gets the value of the performedTransaction property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the performedTransaction property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerformedTransaction().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PerformedTransactionType }
     */
    public List<PerformedTransactionType> getPerformedTransaction()
    {
        if (performedTransaction == null)
        {
            performedTransaction = new ArrayList<PerformedTransactionType>();
        }
        return this.performedTransaction;
    }
}
