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
 * Definition: Data entered by the user, related to the input command. --
 * 				Usage: Choice of a data which contains data entered by the user on the requested
 * 				device, depending on the requested InputCommand:GetConfirmation: the input is in
 * 				ConfirmedFlag.GetAnyKey: there is no input.GetFunctionKey: the input is
 * 				in
 *
 * <p>Java-Klasse für InputType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="InputType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConfirmedFlag" type="{}ConfirmedFlagType" minOccurs="0"/>
 *         &lt;element name="FunctionKey" type="{}FunctionKeyType" minOccurs="0"/>
 *         &lt;element name="TextInput" type="{}TextInputType" minOccurs="0"/>
 *         &lt;element name="DigitInput" type="{}DigitInputType" minOccurs="0"/>
 *         &lt;element name="Password" type="{}ContentInformationType" minOccurs="0"/>
 *         &lt;element name="MenuEntryNumber" type="{}MenuEntryNumberType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="InputCommand" use="required" type="{}InputCommandTypeCode" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class InputType {
    @Element(name = "ConfirmedFlag", required = false)
    protected Boolean confirmedFlag;
    @Element(name = "FunctionKey", required = false)
    protected String functionKey;
    @Element(name = "TextInput", required = false)
    protected String textInput;
    @Element(name = "DigitInput", required = false)
    protected String digitInput;
    @Element(name = "Password", required = false)
    protected ContentInformationType password;
    @Element(name = "MenuEntryNumber", required = false)
    protected BigInteger menuEntryNumber;
    @Attribute(name = "InputCommand", required = true)
    protected String inputCommand;
    /**
     * Ruft den Wert der confirmedFlag-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isConfirmedFlag() {
        return confirmedFlag;
    }
    /**
     * Legt den Wert der confirmedFlag-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setConfirmedFlag(Boolean value) {
        this.confirmedFlag = value;
    }
    /**
     * Ruft den Wert der functionKey-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFunctionKey() {
        return functionKey;
    }
    /**
     * Legt den Wert der functionKey-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFunctionKey(String value) {
        this.functionKey = value;
    }
    /**
     * Ruft den Wert der textInput-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTextInput() {
        return textInput;
    }
    /**
     * Legt den Wert der textInput-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTextInput(String value) {
        this.textInput = value;
    }
    /**
     * Ruft den Wert der digitInput-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDigitInput() {
        return digitInput;
    }
    /**
     * Legt den Wert der digitInput-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDigitInput(String value) {
        this.digitInput = value;
    }
    /**
     * Ruft den Wert der password-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link ContentInformationType }
     *
     */
    public ContentInformationType getPassword() {
        return password;
    }
    /**
     * Legt den Wert der password-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link ContentInformationType }
     *
     */
    public void setPassword(ContentInformationType value) {
        this.password = value;
    }
    /**
     * Ruft den Wert der menuEntryNumber-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getMenuEntryNumber() {
        return menuEntryNumber;
    }
    /**
     * Legt den Wert der menuEntryNumber-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setMenuEntryNumber(BigInteger value) {
        this.menuEntryNumber = value;
    }
    /**
     * Ruft den Wert der inputCommand-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInputCommand() {
        return inputCommand;
    }
    /**
     * Legt den Wert der inputCommand-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInputCommand(String value) {
        this.inputCommand = value;
    }
}
