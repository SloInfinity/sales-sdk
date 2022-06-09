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
 * Definition: Sensitive information related to the payment card, entered
 * 				or read by the Sale System. -- Usage: This data structure could be CMS protected
 * 				(EnvelopedData). In this case the data structure SensitiveCardData is replaced by
 * 				the data structure ProtectedCardData of type ContentInformationType. When this data
 * 				is protected, the exact
 *
 * <p>Java-Klasse für SensitiveCardDataType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="SensitiveCardDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TrackData" type="{}TrackDataType" maxOccurs="4" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PAN" type="{}PANType" />
 *       &lt;attribute name="CardSeqNumb" type="{}CardSeqNumbType" />
 *       &lt;attribute name="ExpiryDate" type="{}ExpiryDateType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class SensitiveCardDataType {
    @Element(name = "TrackData", required = false)
    protected List<TrackDataType> trackData;
    @Attribute(name = "PAN", required = false)
    protected String pan;
    @Attribute(name = "CardSeqNumb", required = false)
    protected String cardSeqNumb;
    @Attribute(name = "ExpiryDate", required = false)
    protected String expiryDate;
    /**
     * Gets the value of the trackData property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trackData property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrackData().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackDataType }
     *
     *
     */
    public List<TrackDataType> getTrackData() {
        if (trackData == null) {
            trackData = new ArrayList<TrackDataType>();
        }
        return this.trackData;
    }
    /**
     * Ruft den Wert der pan-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPAN() {
        return pan;
    }
    /**
     * Legt den Wert der pan-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPAN(String value) {
        this.pan = value;
    }
    /**
     * Ruft den Wert der cardSeqNumb-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCardSeqNumb() {
        return cardSeqNumb;
    }
    /**
     * Legt den Wert der cardSeqNumb-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCardSeqNumb(String value) {
        this.cardSeqNumb = value;
    }
    /**
     * Ruft den Wert der expiryDate-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getExpiryDate() {
        return expiryDate;
    }
    /**
     * Legt den Wert der expiryDate-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setExpiryDate(String value) {
        this.expiryDate = value;
    }
}
