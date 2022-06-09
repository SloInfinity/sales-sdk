//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;
import org.simpleframework.xml.Element;
/**
 * Definition: Body of the Abort Request message. -- Usage: It conveys
 * Information requested for identification of the message request carrying the
 * transaction to abort. A message to display on the CustomerError Device could be sent
 * by the Sale System (DisplayOutput).
 *
 * <p>Java-Klasse für AbortRequestType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="AbortRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageReference" type="{}MessageReferenceType"/>
 *         &lt;element name="AbortReason" type="{}AbortReasonType"/>
 *         &lt;element name="DisplayOutput" type="{}DisplayOutputType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
public class AbortRequestType
{
    @Element(name = "MessageReference", required = true)
    protected MessageReferenceType messageReference;
    @Element(name = "AbortReason", required = true)
    protected String               abortReason;
    @Element(name = "DisplayOutput", required = false)
    protected DisplayOutputType    displayOutput;
    /**
     * Ruft den Wert der messageReference-Eigenschaft ab.
     *
     * @return possible object is
     * {@link MessageReferenceType }
     */
    public MessageReferenceType getMessageReference()
    {
        return messageReference;
    }
    /**
     * Legt den Wert der messageReference-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link MessageReferenceType }
     */
    public void setMessageReference(MessageReferenceType value)
    {
        this.messageReference = value;
    }
    /**
     * Ruft den Wert der abortReason-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAbortReason()
    {
        return abortReason;
    }
    /**
     * Legt den Wert der abortReason-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAbortReason(String value)
    {
        this.abortReason = value;
    }
    /**
     * Ruft den Wert der displayOutput-Eigenschaft ab.
     *
     * @return possible object is
     * {@link DisplayOutputType }
     */
    public DisplayOutputType getDisplayOutput()
    {
        return displayOutput;
    }
    /**
     * Legt den Wert der displayOutput-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link DisplayOutputType }
     */
    public void setDisplayOutput(DisplayOutputType value)
    {
        this.displayOutput = value;
    }
}
