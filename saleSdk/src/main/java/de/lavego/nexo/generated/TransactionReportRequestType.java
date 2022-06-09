//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;
import java.math.BigInteger;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
/**
 * Definition: Content of the TransactionReport Request message. --
 * 				Usage: It conveys Information to request a report of transactioons according to some criteria.
 *
 *
 * <p>Java-Klasse für TransactionReportRequestType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="TransactionReportRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchCriterias" type="{}SearchCriteriasType"/>
 *         &lt;element name="SearchOutputOrder" type="{}SearchOutputOrderType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DescendingOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="BlockStart" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
 *       &lt;attribute name="BlockStop" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class TransactionReportRequestType {
    @Element(name = "SearchCriterias", required = true)
    protected SearchCriteriasType searchCriterias;
    @Element(name = "SearchOutputOrder", required = false)
    protected SearchOutputOrderType searchOutputOrder;
    @Attribute(name = "DescendingOrder", required = false)
    protected Boolean descendingOrder;
    @Attribute(name = "BlockStart", required = false)
    protected BigInteger blockStart;
    @Attribute(name = "BlockStop", required = false)
    protected BigInteger blockStop;
    /**
     * Ruft den Wert der searchCriterias-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link SearchCriteriasType }
     *
     */
    public SearchCriteriasType getSearchCriterias() {
        return searchCriterias;
    }
    /**
     * Legt den Wert der searchCriterias-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link SearchCriteriasType }
     *
     */
    public void setSearchCriterias(SearchCriteriasType value) {
        this.searchCriterias = value;
    }
    /**
     * Ruft den Wert der searchOutputOrder-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link SearchOutputOrderType }
     *
     */
    public SearchOutputOrderType getSearchOutputOrder() {
        return searchOutputOrder;
    }
    /**
     * Legt den Wert der searchOutputOrder-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link SearchOutputOrderType }
     *
     */
    public void setSearchOutputOrder(SearchOutputOrderType value) {
        this.searchOutputOrder = value;
    }
    /**
     * Ruft den Wert der descendingOrder-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isDescendingOrder() {
        if (descendingOrder == null) {
            return false;
        } else {
            return descendingOrder;
        }
    }
    /**
     * Legt den Wert der descendingOrder-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setDescendingOrder(Boolean value) {
        this.descendingOrder = value;
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
        if (blockStart == null) {
            return new BigInteger("0");
        } else {
            return blockStart;
        }
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
