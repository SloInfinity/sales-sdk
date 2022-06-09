package de.lavego.nexo;

public class NexoMessage
{
    private String xml  = "";
    private int    type = 0;
    
    public NexoMessage()
    {
    }
    
    public NexoMessage(String xml, int type)
    {
        this.xml = xml;
        this.type = type;
    }
    
    public int getType()
    {
        return type;
    }
    
    public void setType(int type)
    {
        this.type = type;
    }
    
    public String getXml()
    {
        return xml;
    }
    
    public void setXml(String xml)
    {
        this.xml = xml;
    }
    
    public String getXmlOnOneLine() { return String.format("%s\n", xml.replaceAll("\\n", " ").replaceAll("[ ]+", " ")); }
}
