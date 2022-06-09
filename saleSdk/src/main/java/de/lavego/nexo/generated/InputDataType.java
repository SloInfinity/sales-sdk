//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

import java.math.BigInteger;
/**
 * Definition: Information related to an Input request. -- Usage: It
 * 				conveys the target input logical device, the type of input command, and possible
 * 				minimum and maximum length of the input. In addition, if the requestor might require
 * 				to receive an Event Notification if a card is inserted in a card
 *
 * <p>Java-Klasse für InputDataType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="InputDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DefaultInputString" type="{}DefaultInputStringType" minOccurs="0"/>
 *         &lt;element name="StringMask" type="{}StringMaskType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Device" use="required" type="{}DeviceTypeCode" />
 *       &lt;attribute name="InfoQualify" use="required" type="{}InfoQualifyTypeCode" />
 *       &lt;attribute name="InputCommand" use="required" type="{}InputCommandTypeCode" />
 *       &lt;attribute name="NotifyCardInputFlag" type="{}NotifyCardInputFlagType" default="false" />
 *       &lt;attribute name="MaxInputTime" type="{}MaxInputTimeType" />
 *       &lt;attribute name="ImmediateResponseFlag" type="{}ImmediateResponseFlagType" default="false" />
 *       &lt;attribute name="MinLength" type="{}MinLengthType" />
 *       &lt;attribute name="MaxLength" type="{}MaxLengthType" />
 *       &lt;attribute name="MaxDecimalLength" type="{}MaxDecimalLengthType" />
 *       &lt;attribute name="WaitUserValidationFlag" type="{}WaitUserValidationFlagType" default="true" />
 *       &lt;attribute name="FromRightToLeftFlag" type="{}FromRightToLeftFlagType" default="false" />
 *       &lt;attribute name="MaskCharactersFlag" type="{}MaskCharactersFlagType" default="false" />
 *       &lt;attribute name="BeepKeyFlag" type="{}BeepKeyFlagType" default="false" />
 *       &lt;attribute name="GlobalCorrectionFlag" type="{}GlobalCorrectionFlagType" default="false" />
 *       &lt;attribute name="DisableCancelFlag" type="{}DisableCancelFlagType" default="false" />
 *       &lt;attribute name="DisableCorrectFlag" type="{}DisableCorrectFlagType" default="false" />
 *       &lt;attribute name="DisableValidFlag" type="{}DisableValidFlagType" default="false" />
 *       &lt;attribute name="MenuBackFlag" type="{}MenuBackFlagType" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class InputDataType {
    @Element(name = "DefaultInputString", required = false)
    protected String defaultInputString;
    @Element(name = "StringMask", required = false)
    protected String stringMask;
    @Attribute(name = "Device", required = true)
    protected String device;
    @Attribute(name = "InfoQualify", required = true)
    protected String infoQualify;
    @Attribute(name = "InputCommand", required = true)
    protected String inputCommand;
    @Attribute(name = "NotifyCardInputFlag", required = false)
    protected Boolean notifyCardInputFlag;
    @Attribute(name = "MaxInputTime", required = false)
    protected BigInteger maxInputTime;
    @Attribute(name = "ImmediateResponseFlag", required = false)
    protected Boolean immediateResponseFlag;
    @Attribute(name = "MinLength", required = false)
    protected BigInteger minLength;
    @Attribute(name = "MaxLength", required = false)
    protected BigInteger maxLength;
    @Attribute(name = "MaxDecimalLength", required = false)
    protected BigInteger maxDecimalLength;
    @Attribute(name = "WaitUserValidationFlag", required = false)
    protected Boolean waitUserValidationFlag;
    @Attribute(name = "FromRightToLeftFlag", required = false)
    protected Boolean fromRightToLeftFlag;
    @Attribute(name = "MaskCharactersFlag", required = false)
    protected Boolean maskCharactersFlag;
    @Attribute(name = "BeepKeyFlag", required = false)
    protected Boolean beepKeyFlag;
    @Attribute(name = "GlobalCorrectionFlag", required = false)
    protected Boolean globalCorrectionFlag;
    @Attribute(name = "DisableCancelFlag", required = false)
    protected Boolean disableCancelFlag;
    @Attribute(name = "DisableCorrectFlag", required = false)
    protected Boolean disableCorrectFlag;
    @Attribute(name = "DisableValidFlag", required = false)
    protected Boolean disableValidFlag;
    @Attribute(name = "MenuBackFlag", required = false)
    protected Boolean menuBackFlag;
    /**
     * Ruft den Wert der defaultInputString-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDefaultInputString() {
        return defaultInputString;
    }
    /**
     * Legt den Wert der defaultInputString-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDefaultInputString(String value) {
        this.defaultInputString = value;
    }
    /**
     * Ruft den Wert der stringMask-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStringMask() {
        return stringMask;
    }
    /**
     * Legt den Wert der stringMask-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStringMask(String value) {
        this.stringMask = value;
    }
    /**
     * Ruft den Wert der device-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDevice() {
        return device;
    }
    /**
     * Legt den Wert der device-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDevice(String value) {
        this.device = value;
    }
    /**
     * Ruft den Wert der infoQualify-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInfoQualify() {
        return infoQualify;
    }
    /**
     * Legt den Wert der infoQualify-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInfoQualify(String value) {
        this.infoQualify = value;
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
    /**
     * Ruft den Wert der notifyCardInputFlag-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isNotifyCardInputFlag() {
        if (notifyCardInputFlag == null) {
            return false;
        } else {
            return notifyCardInputFlag;
        }
    }
    /**
     * Legt den Wert der notifyCardInputFlag-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setNotifyCardInputFlag(Boolean value) {
        this.notifyCardInputFlag = value;
    }
    /**
     * Ruft den Wert der maxInputTime-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getMaxInputTime() {
        return maxInputTime;
    }
    /**
     * Legt den Wert der maxInputTime-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setMaxInputTime(BigInteger value) {
        this.maxInputTime = value;
    }
    /**
     * Ruft den Wert der immediateResponseFlag-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isImmediateResponseFlag() {
        if (immediateResponseFlag == null) {
            return false;
        } else {
            return immediateResponseFlag;
        }
    }
    /**
     * Legt den Wert der immediateResponseFlag-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setImmediateResponseFlag(Boolean value) {
        this.immediateResponseFlag = value;
    }
    /**
     * Ruft den Wert der minLength-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getMinLength() {
        return minLength;
    }
    /**
     * Legt den Wert der minLength-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setMinLength(BigInteger value) {
        this.minLength = value;
    }
    /**
     * Ruft den Wert der maxLength-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getMaxLength() {
        return maxLength;
    }
    /**
     * Legt den Wert der maxLength-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setMaxLength(BigInteger value) {
        this.maxLength = value;
    }
    /**
     * Ruft den Wert der maxDecimalLength-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getMaxDecimalLength() {
        return maxDecimalLength;
    }
    /**
     * Legt den Wert der maxDecimalLength-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setMaxDecimalLength(BigInteger value) {
        this.maxDecimalLength = value;
    }
    /**
     * Ruft den Wert der waitUserValidationFlag-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isWaitUserValidationFlag() {
        if (waitUserValidationFlag == null) {
            return true;
        } else {
            return waitUserValidationFlag;
        }
    }
    /**
     * Legt den Wert der waitUserValidationFlag-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setWaitUserValidationFlag(Boolean value) {
        this.waitUserValidationFlag = value;
    }
    /**
     * Ruft den Wert der fromRightToLeftFlag-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isFromRightToLeftFlag() {
        if (fromRightToLeftFlag == null) {
            return false;
        } else {
            return fromRightToLeftFlag;
        }
    }
    /**
     * Legt den Wert der fromRightToLeftFlag-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setFromRightToLeftFlag(Boolean value) {
        this.fromRightToLeftFlag = value;
    }
    /**
     * Ruft den Wert der maskCharactersFlag-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isMaskCharactersFlag() {
        if (maskCharactersFlag == null) {
            return false;
        } else {
            return maskCharactersFlag;
        }
    }
    /**
     * Legt den Wert der maskCharactersFlag-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setMaskCharactersFlag(Boolean value) {
        this.maskCharactersFlag = value;
    }
    /**
     * Ruft den Wert der beepKeyFlag-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isBeepKeyFlag() {
        if (beepKeyFlag == null) {
            return false;
        } else {
            return beepKeyFlag;
        }
    }
    /**
     * Legt den Wert der beepKeyFlag-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setBeepKeyFlag(Boolean value) {
        this.beepKeyFlag = value;
    }
    /**
     * Ruft den Wert der globalCorrectionFlag-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isGlobalCorrectionFlag() {
        if (globalCorrectionFlag == null) {
            return false;
        } else {
            return globalCorrectionFlag;
        }
    }
    /**
     * Legt den Wert der globalCorrectionFlag-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setGlobalCorrectionFlag(Boolean value) {
        this.globalCorrectionFlag = value;
    }
    /**
     * Ruft den Wert der disableCancelFlag-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isDisableCancelFlag() {
        if (disableCancelFlag == null) {
            return false;
        } else {
            return disableCancelFlag;
        }
    }
    /**
     * Legt den Wert der disableCancelFlag-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setDisableCancelFlag(Boolean value) {
        this.disableCancelFlag = value;
    }
    /**
     * Ruft den Wert der disableCorrectFlag-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isDisableCorrectFlag() {
        if (disableCorrectFlag == null) {
            return false;
        } else {
            return disableCorrectFlag;
        }
    }
    /**
     * Legt den Wert der disableCorrectFlag-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setDisableCorrectFlag(Boolean value) {
        this.disableCorrectFlag = value;
    }
    /**
     * Ruft den Wert der disableValidFlag-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isDisableValidFlag() {
        if (disableValidFlag == null) {
            return false;
        } else {
            return disableValidFlag;
        }
    }
    /**
     * Legt den Wert der disableValidFlag-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setDisableValidFlag(Boolean value) {
        this.disableValidFlag = value;
    }
    /**
     * Ruft den Wert der menuBackFlag-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isMenuBackFlag() {
        if (menuBackFlag == null) {
            return false;
        } else {
            return menuBackFlag;
        }
    }
    /**
     * Legt den Wert der menuBackFlag-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setMenuBackFlag(Boolean value) {
        this.menuBackFlag = value;
    }
}
