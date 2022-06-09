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
 * Definition: Content of text message to display or print. -- Usage: It
 * 				conveys Information related to the content of the text message and its format. All
 * 				the data elements related to the format of the text to display or print are
 * 				parameters valid for the whole Text content.
 *
 * <p>Java-Klasse für OutputTextType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="OutputTextType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;>TextString">
 *       &lt;attribute name="CharacterSet" type="{}CharacterSetType" />
 *       &lt;attribute name="Font" type="{}FontType" />
 *       &lt;attribute name="StartRow" type="{}StartRowType" />
 *       &lt;attribute name="StartColumn" type="{}StartColumnType" />
 *       &lt;attribute name="Color" type="{}ColorTypeCode" />
 *       &lt;attribute name="CharacterWidth" type="{}CharacterWidthTypeCode" />
 *       &lt;attribute name="CharacterHeight" type="{}CharacterHeightTypeCode" />
 *       &lt;attribute name="CharacterStyle" type="{}CharacterStyleTypeCode" />
 *       &lt;attribute name="Alignment" type="{}AlignmentTypeCode" />
 *       &lt;attribute name="EndOfLineFlag" type="{}EndOfLineFlagType" default="true" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class OutputTextType {
    @Element
    protected String value;
    @Attribute(name = "CharacterSet", required = false)
    protected Integer characterSet;
    @Attribute(name = "Font", required = false)
    protected String font;
    @Attribute(name = "StartRow", required = false)
    protected Integer startRow;
    @Attribute(name = "StartColumn", required = false)
    protected Integer startColumn;
    @Attribute(name = "Color", required = false)
    protected String color;
    @Attribute(name = "CharacterWidth", required = false)
    protected String characterWidth;
    @Attribute(name = "CharacterHeight", required = false)
    protected String characterHeight;
    @Attribute(name = "CharacterStyle", required = false)
    protected String characterStyle;
    @Attribute(name = "Alignment", required = false)
    protected String alignment;
    @Attribute(name = "EndOfLineFlag", required = false)
    protected Boolean endOfLineFlag;
    /**
     * Ruft den Wert der value-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getValue() {
        return value;
    }
    /**
     * Legt den Wert der value-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setValue(String value) {
        this.value = value;
    }
    /**
     * Ruft den Wert der characterSet-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getCharacterSet() {
        return characterSet;
    }
    /**
     * Legt den Wert der characterSet-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setCharacterSet(Integer value) {
        this.characterSet = value;
    }
    /**
     * Ruft den Wert der font-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFont() {
        return font;
    }
    /**
     * Legt den Wert der font-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFont(String value) {
        this.font = value;
    }
    /**
     * Ruft den Wert der startRow-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getStartRow() {
        return startRow;
    }
    /**
     * Legt den Wert der startRow-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setStartRow(Integer value) {
        this.startRow = value;
    }
    /**
     * Ruft den Wert der startColumn-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getStartColumn() {
        return startColumn;
    }
    /**
     * Legt den Wert der startColumn-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setStartColumn(Integer value) {
        this.startColumn = value;
    }
    /**
     * Ruft den Wert der color-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getColor() {
        return color;
    }
    /**
     * Legt den Wert der color-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setColor(String value) {
        this.color = value;
    }
    /**
     * Ruft den Wert der characterWidth-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCharacterWidth() {
        return characterWidth;
    }
    /**
     * Legt den Wert der characterWidth-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCharacterWidth(String value) {
        this.characterWidth = value;
    }
    /**
     * Ruft den Wert der characterHeight-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCharacterHeight() {
        return characterHeight;
    }
    /**
     * Legt den Wert der characterHeight-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCharacterHeight(String value) {
        this.characterHeight = value;
    }
    /**
     * Ruft den Wert der characterStyle-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCharacterStyle() {
        return characterStyle;
    }
    /**
     * Legt den Wert der characterStyle-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCharacterStyle(String value) {
        this.characterStyle = value;
    }
    /**
     * Ruft den Wert der alignment-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAlignment() {
        return alignment;
    }
    /**
     * Legt den Wert der alignment-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAlignment(String value) {
        this.alignment = value;
    }
    /**
     * Ruft den Wert der endOfLineFlag-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isEndOfLineFlag() {
        if (endOfLineFlag == null) {
            return true;
        } else {
            return endOfLineFlag;
        }
    }
    /**
     * Legt den Wert der endOfLineFlag-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setEndOfLineFlag(Boolean value) {
        this.endOfLineFlag = value;
    }
}
