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
 * Definition: Content of the Stored Value Response message. -- Usage: It
 * 				conveys Information related to the Stored Value transaction processed by the POI
 * 				System.
 *
 * <p>Java-Klasse für StoredValueResponseType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="StoredValueResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Response" type="{}ResponseType"/>
 *         &lt;element name="SaleData" type="{}SaleDataType"/>
 *         &lt;element name="POIData" type="{}POIDataType"/>
 *         &lt;element name="StoredValueResult" type="{}StoredValueResultType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class StoredValueResponseType {
    @Element(name = "Response", required = true)
    protected ResponseType response;
    @Element(name = "SaleData", required = true)
    protected SaleDataType saleData;
    @Element(name = "POIData", required = true)
    protected POIDataType poiData;
    @Element(name = "StoredValueResult", required = false)
    protected List<StoredValueResultType> storedValueResult;
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
     * Gets the value of the storedValueResult property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the storedValueResult property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStoredValueResult().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StoredValueResultType }
     *
     *
     */
    public List<StoredValueResultType> getStoredValueResult() {
        if (storedValueResult == null) {
            storedValueResult = new ArrayList<StoredValueResultType>();
        }
        return this.storedValueResult;
    }
}
