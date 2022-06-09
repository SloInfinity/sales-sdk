//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
/**
 * Definition: Data related to the POI System. -- Usage: In the Message
 * 				Response, identification of the POI transaction.
 *
 * <p>Java-Klasse für POIDataType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="POIDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="POITransactionID" type="{}TransactionIdentificationType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="POIReconciliationID" type="{}POIReconciliationIDType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class POIDataType {
    @Element(name = "POITransactionID", required = true)
    protected TransactionIdentificationType poiTransactionID;
    @Attribute(name = "POIReconciliationID", required = false)
    protected String poiReconciliationID;
    /**
     * Ruft den Wert der poiTransactionID-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link TransactionIdentificationType }
     *
     */
    public TransactionIdentificationType getPOITransactionID() {
        return poiTransactionID;
    }
    /**
     * Legt den Wert der poiTransactionID-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link TransactionIdentificationType }
     *
     */
    public void setPOITransactionID(TransactionIdentificationType value) {
        this.poiTransactionID = value;
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
