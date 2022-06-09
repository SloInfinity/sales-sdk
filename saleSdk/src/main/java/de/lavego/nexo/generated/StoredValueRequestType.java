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
 * Definition: Content of the Stored Value Request message. -- Usage: It
 * 				conveys Information related to the Stored Value transaction to
 * 				process
 *
 * <p>Java-Klasse für StoredValueRequestType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="StoredValueRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SaleData" type="{}SaleDataType"/>
 *         &lt;element name="StoredValueData" type="{}StoredValueDataType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CustomerLanguage" type="{}ISOLanguage2A" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class StoredValueRequestType {
    @Element(name = "SaleData", required = true)
    protected SaleDataType saleData;
    @Element(name = "StoredValueData", required = true)
    protected List<StoredValueDataType> storedValueData;
    @Attribute(name = "CustomerLanguage", required = false)
    protected String customerLanguage;
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
     * Gets the value of the storedValueData property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the storedValueData property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStoredValueData().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StoredValueDataType }
     *
     *
     */
    public List<StoredValueDataType> getStoredValueData() {
        if (storedValueData == null) {
            storedValueData = new ArrayList<StoredValueDataType>();
        }
        return this.storedValueData;
    }
    /**
     * Ruft den Wert der customerLanguage-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCustomerLanguage() {
        return customerLanguage;
    }
    /**
     * Legt den Wert der customerLanguage-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCustomerLanguage(String value) {
        this.customerLanguage = value;
    }
}
