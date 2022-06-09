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
 * Definition: Content of the Card Reader Init Response message. --
 * 				Usage: It contains the result of the Card Reader by the POI Card Reader (magnetic
 * 				stripe content, or chip initialisation data).
 *
 * <p>Java-Klasse für CardReaderInitResponseType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="CardReaderInitResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Response" type="{}ResponseType"/>
 *         &lt;element name="TrackData" type="{}TrackDataType" maxOccurs="4" minOccurs="0"/>
 *         &lt;element name="ICCResetData" type="{}ICCResetDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="EntryMode" type="{}EntryModeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class CardReaderInitResponseType {
    @Element(name = "Response", required = true)
    protected ResponseType response;
    @Element(name = "TrackData", required = false)
    protected List<TrackDataType> trackData;
    @Element(name = "ICCResetData", required = false)
    protected ICCResetDataType iccResetData;
    @Attribute(name = "EntryMode", required = false)
    protected List<String> entryMode;
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
     * Ruft den Wert der iccResetData-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link ICCResetDataType }
     *
     */
    public ICCResetDataType getICCResetData() {
        return iccResetData;
    }
    /**
     * Legt den Wert der iccResetData-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link ICCResetDataType }
     *
     */
    public void setICCResetData(ICCResetDataType value) {
        this.iccResetData = value;
    }
    /**
     * Gets the value of the entryMode property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entryMode property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntryMode().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getEntryMode() {
        if (entryMode == null) {
            entryMode = new ArrayList<String>();
        }
        return this.entryMode;
    }
}
