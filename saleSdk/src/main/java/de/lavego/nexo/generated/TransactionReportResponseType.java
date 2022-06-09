//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
/**
 * Definition: Content of the TransactionReport Response message. --
 * 				Usage: It conveys Information related to the report of transactions.
 *
 *
 * <p>Java-Klasse für TransactionReportResponseType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="TransactionReportResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Response" type="{}ResponseType"/>
 *         &lt;element name="TransactionReport" type="{}TransactionReportType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ReportFullSize" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="BlockStart" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="BlockStop" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class TransactionReportResponseType {
    @Element(name = "Response", required = true)
    protected ResponseType response;
    @Element(name = "TransactionReport", required = false)
    protected List<TransactionReportType> transactionReport;
    @Attribute(name = "ReportFullSize", required = true)
    protected BigInteger reportFullSize;
    @Attribute(name = "BlockStart", required = true)
    protected BigInteger blockStart;
    @Attribute(name = "BlockStop", required = true)
    protected BigInteger blockStop;
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
     * Gets the value of the transactionReport property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionReport property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionReport().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionReportType }
     *
     *
     */
    public List<TransactionReportType> getTransactionReport() {
        if (transactionReport == null) {
            transactionReport = new ArrayList<TransactionReportType>();
        }
        return this.transactionReport;
    }
    /**
     * Ruft den Wert der reportFullSize-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getReportFullSize() {
        return reportFullSize;
    }
    /**
     * Legt den Wert der reportFullSize-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setReportFullSize(BigInteger value) {
        this.reportFullSize = value;
    }
    /**
     * Ruft den Wert der blockStart-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getBlockStart() {
        return blockStart;
    }
    /**
     * Legt den Wert der blockStart-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setBlockStart(BigInteger value) {
        this.blockStart = value;
    }
    /**
     * Ruft den Wert der blockStop-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getBlockStop() {
        return blockStop;
    }
    /**
     * Legt den Wert der blockStop-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setBlockStop(BigInteger value) {
        this.blockStop = value;
    }
}
