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
 * Definition: Content of the Sound Request message. -- Usage: It conveys
 * 				the data to start a sound, stop a sound, or modify the default sound volume. The
 * 				sound to play may be a preloaded sound or a text to play.
 *
 * <p>Java-Klasse für SoundRequestType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="SoundRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SoundContent" type="{}SoundContentType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ResponseMode" type="{}ResponseModeTypeCode" default="NotRequired" />
 *       &lt;attribute name="SoundAction" use="required" type="{}SoundActionTypeCode" />
 *       &lt;attribute name="SoundVolume" type="{}SoundVolumeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class SoundRequestType {
    @Element(name = "SoundContent", required = true)
    protected SoundContentType soundContent;
    @Attribute(name = "ResponseMode", required = false)
    protected String responseMode;
    @Attribute(name = "SoundAction", required = true)
    protected String soundAction;
    @Attribute(name = "SoundVolume", required = false)
    protected BigInteger soundVolume;
    /**
     * Ruft den Wert der soundContent-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link SoundContentType }
     *
     */
    public SoundContentType getSoundContent() {
        return soundContent;
    }
    /**
     * Legt den Wert der soundContent-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link SoundContentType }
     *
     */
    public void setSoundContent(SoundContentType value) {
        this.soundContent = value;
    }
    /**
     * Ruft den Wert der responseMode-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResponseMode() {
        if (responseMode == null) {
            return "NotRequired";
        } else {
            return responseMode;
        }
    }
    /**
     * Legt den Wert der responseMode-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResponseMode(String value) {
        this.responseMode = value;
    }
    /**
     * Ruft den Wert der soundAction-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSoundAction() {
        return soundAction;
    }
    /**
     * Legt den Wert der soundAction-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSoundAction(String value) {
        this.soundAction = value;
    }
    /**
     * Ruft den Wert der soundVolume-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getSoundVolume() {
        return soundVolume;
    }
    /**
     * Legt den Wert der soundVolume-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setSoundVolume(BigInteger value) {
        this.soundVolume = value;
    }
}
