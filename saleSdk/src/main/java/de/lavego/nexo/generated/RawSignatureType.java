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
 * Definition: Numeric value of a handwritten signature. -- Usage:
 * 				Contain the value of a handwritten signature, e.g. the signature of a cardholder on
 * 				the merchant payment receipt. Only one format of the signature is allowed, it
 * 				contains: The size of the pad area where the signature is written,
 * 				given
 *
 * <p>Java-Klasse für RawSignatureType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="RawSignatureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AreaSize" type="{}AreaSizeType" minOccurs="0"/>
 *         &lt;element name="SignaturePoint" type="{}SignaturePointType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class RawSignatureType {
    @Element(name = "AreaSize", required = false)
    protected AreaSizeType areaSize;
    @Element(name = "SignaturePoint", required = true)
    protected List<SignaturePointType> signaturePoint;
    /**
     * Ruft den Wert der areaSize-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link AreaSizeType }
     *
     */
    public AreaSizeType getAreaSize() {
        return areaSize;
    }
    /**
     * Legt den Wert der areaSize-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link AreaSizeType }
     *
     */
    public void setAreaSize(AreaSizeType value) {
        this.areaSize = value;
    }
    /**
     * Gets the value of the signaturePoint property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signaturePoint property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignaturePoint().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SignaturePointType }
     *
     *
     */
    public List<SignaturePointType> getSignaturePoint() {
        if (signaturePoint == null) {
            signaturePoint = new ArrayList<SignaturePointType>();
        }
        return this.signaturePoint;
    }
}
