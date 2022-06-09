//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import android.util.Log;

import androidx.annotation.NonNull;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.convert.Converter;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import de.lavego.nexo.Commons;

/**
 * Definition: Information related to the software and hardware feature
 * of the POI Terminal -- Usage: Allows in a session to identify the features of the
 * POI Terminal attached to a Sale Terminal per a Login Request
 * message.
 *
 * <p>Java-Klasse für POITerminalDataType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="POITerminalDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="POICapabilities" type="{}POICapabilitiesType"/>
 *         &lt;element name="POIProfile" type="{}POIProfileType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TerminalEnvironment" use="required" type="{}TerminalEnvironmentTypeCode" />
 *       &lt;attribute name="POISerialNumber" use="required" type="{}POISerialNumberType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@Order(elements = {
        "POICapabilities",
        "POIProfile"
}, attributes = {
        "TerminalEnvironment",
        "POISerialNumber"
})
public class POITerminalDataType implements Converter<POITerminalDataType>
{
    @ElementList(name = "POICapabilities", required = true, inline = true, entry = "POICapabilities")
    protected List<String> poiCapabilities = new ArrayList<>();
    
    @Element(name = "POIProfile", required = false)
    protected POIProfileType poiProfile;
    
    @Attribute(name = "TerminalEnvironment", required = true)
    protected String terminalEnvironment;
    
    @Attribute(name = "POISerialNumber", required = true)
    protected String poiSerialNumber;
    
    public void addPoiCapability(POICapabilitiesEnumeration value)
    {
        poiCapabilities.add(value.value());
    }
    
    @Override
    public POITerminalDataType read(InputNode node) throws Exception
    {
        Log.d("CONVERT_READ", "POITerminalDataType: name=" + node.getName());
        
        POITerminalDataType terminalData = new POITerminalDataType();
        
        for (String attr : node.getAttributes())
        {
            Log.d("CONVERT_READ", "attr with name " + attr);
            
            if (attr.equals("TerminalEnvironment")) { terminalData.setTerminalEnvironment(node.getAttribute("TerminalEnvironment").getValue()); }
            else if (attr.equals("POISerialNumber")) { terminalData.setPOISerialNumber(node.getAttribute("POISerialNumber").getValue()); }
        }
        
        InputNode inode;
        
        while ((inode = node.getNext()) != null)
        {
            Log.d("CONVERT_READ", String.format("name=%s, isElement=%s, isEmpty=%s, isRoot=%s"
                    , inode.getName()
                    , inode.isElement()
                    , inode.isEmpty()
                    , inode.isRoot()));
            
            if (inode.getName().equals("POIProfile"))
            {
                terminalData.setPOIProfile(extractProfileType(inode));
            }
            else if (inode.getName().equals("POICapabilities"))
            {
                for (String capability : extractCapabilities(inode)) { terminalData.getPOICapabilities().add(capability); }
            }
        }
        
        return terminalData;
    }
    
    private static POIProfileType extractProfileType(@NonNull InputNode node)
    {
        if (node.getName().equals("POIProfile"))
        {
            try
            {
                POIProfileType profile = new POIProfileType();
                InputNode      attr    = node.getAttribute("GenericProfile");
                
                if (attr != null)
                {
                    profile.setGenericProfile(attr.getValue());
                }
                
                InputNode service = node.getNext("ServiceProfiles");
                
                if (service != null)
                {
                    for (String val : service.getValue().split(" ")) { profile.getServiceProfiles().add(val); }
                }
                
                Log.d("CONVERT_READ", String.format("GenericProfile=%s, ServiceProfile=%s"
                        , profile.getGenericProfile()
                        , profile.getServiceProfiles()));
                
                return profile;
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        
        return null;
    }
    
    private static List<String> extractCapabilities(InputNode node)
    {
        ArrayList<String> capabilities = new ArrayList<>();
        
        if (node.getName().equals("POICapabilities"))
        {
            try
            {
                String value = node.getValue();
                
                Log.i("CONVERT_READ", "POICapabilities value " + value);
                
                // correct XML, validates against the XSD!
                if (value != null && !value.equals("POICapabilities"))
                {
                    Collections.addAll(capabilities, value.split(" "));
                }
                // HACK Try to parse Girmiti's bullshit
                else
                {
                    InputNode inode;
                    
                    while ((inode = node.getNext()) != null)
                    {
                        Log.i("CONVERT_READ", "POICapabilities value " + inode.getName());
                        if (inode.getName().equals("POICapabilities"))
                        {
                            Collections.addAll(capabilities, inode.getValue().split(" "));
                        }
                    }
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        
        Log.d("CONVERT_READ", String.format("POICapabilities=%s", capabilities));
        
        return capabilities;
    }
    
    /**
     * Gets the value of the poiCapabilities property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the poiCapabilities property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOICapabilities().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getPOICapabilities() { return this.poiCapabilities; }
    
    @Override
    public void write(OutputNode node, POITerminalDataType value) throws Exception
    {
        node.setAttribute("TerminalEnvironment", value.getTerminalEnvironment());
        node.setAttribute("POISerialNumber", value.getPOISerialNumber());
        
        if (value.getPOICapabilities() != null) { Commons.concatListElements(node.getChild("POICapabilities"), value.getPOICapabilities()); }
        if (value.getPOIProfile() != null)
        {
            OutputNode profile = node.getChild("POIProfile");
            
            if (value.getPOIProfile().getGenericProfile() != null && ! value.getPOIProfile().getGenericProfile().isEmpty())
            {
                profile.setAttribute("GenericProfile", value.getPOIProfile().getGenericProfile());
            }
            
            Commons.concatListElements(profile.getChild("ServiceProfiles"), value.getPOIProfile().getServiceProfiles());
        }
    }
    
    /**
     * Ruft den Wert der terminalEnvironment-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTerminalEnvironment() { return terminalEnvironment; }
    
    /**
     * Ruft den Wert der poiSerialNumber-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPOISerialNumber() { return poiSerialNumber; }
    
    /**
     * Ruft den Wert der poiProfile-Eigenschaft ab.
     *
     * @return possible object is
     * {@link POIProfileType }
     */
    public POIProfileType getPOIProfile() { return poiProfile; }
    
    /**
     * Legt den Wert der poiProfile-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link POIProfileType }
     */
    public void setPOIProfile(POIProfileType value) { this.poiProfile = value; }
    
    /**
     * Legt den Wert der poiSerialNumber-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPOISerialNumber(String value) { this.poiSerialNumber = value; }
    
    /**
     * Legt den Wert der terminalEnvironment-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTerminalEnvironment(String value) { this.terminalEnvironment = value; }
}
