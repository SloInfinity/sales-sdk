package de.lavego.zvt.cmds;

import java.nio.charset.StandardCharsets;

import de.lavego.zvt.api.Apdu;
import de.lavego.zvt.api.Tag;
import de.lavego.zvt.api.Tlv;

import static de.lavego.zvt.api.Commons.asInt;
import static de.lavego.zvt.api.Commons.range;

public class IntermediateStatus extends Apdu
{
    private int status  = 0x00;
    private int timeout = 0;
    private Tlv tlv     = new Tlv();
    
    public IntermediateStatus(Apdu apdu)
    {
        this(apdu.apdu());
    }
    
    public IntermediateStatus(byte[] apdu)
    {
        super(apdu);
        parse();
    }
    
    private void parse()
    {
        if (length() > 0)
        {
            this.status = asInt(data()[0]);
            
            if (length() == 2)
            {
                this.timeout = asInt(data()[1]);
            }
            else if (length() > 2)
            {
                try
                {
                    tlv = new Tlv(range(data(), 2, length() - 2));
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
    
    public String message()
    {
        StringBuilder sb = new StringBuilder();
        
        for (Tag tag : tlv.tags())
        {
            if (tag.tag()[0] == 0x24)
            {
                for (Tag stag : tag.subtags())
                {
                    if (stag.tag()[0] == 0x07) { sb.append(new String(stag.value(), StandardCharsets.UTF_8)).append("\n"); }
                }
            }
        }
        
        return sb.toString();
    }
    
    public int status()
    {
        return status;
    }
    
    public int timeout()
    {
        return timeout;
    }
    
    public Tlv tlv()
    {
        return tlv;
    }
}
