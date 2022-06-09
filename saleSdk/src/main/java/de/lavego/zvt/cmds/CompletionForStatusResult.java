package de.lavego.zvt.cmds;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

import de.lavego.zvt.api.Apdu;
import de.lavego.zvt.api.LLLVar;
import de.lavego.zvt.api.Tag;
import de.lavego.zvt.api.Tlv;

import static de.lavego.zvt.api.Commons.BCDToString;
import static de.lavego.zvt.api.Commons.Log;
import static de.lavego.zvt.api.Commons.asInt;
import static de.lavego.zvt.api.Commons.range;
import static de.lavego.zvt.api.Commons.toHex;

public class CompletionForStatusResult extends Apdu
{
    private final ArrayList<String> applications    = new ArrayList<>();
    private final ArrayList<String> serials         = new ArrayList<>();
    private final ArrayList<String> devices         = new ArrayList<>();
    private final ArrayList<String> versions        = new ArrayList<>();
    private       String            tid             = "";
    private       int               terminalStatus  = 0x00;
    private       String            terminalVersion = "";
    private       Tlv               tlv             = new Tlv();
    
    public CompletionForStatusResult(Apdu apdu)
    {
        super(apdu);
        parse();
    }
    
    public ArrayList<String> applications()
    {
        return applications;
    }
    
    public ArrayList<String> serials()
    {
        return serials;
    }
    
    public ArrayList<String> devices()
    {
        return devices;
    }
    
    public ArrayList<String> versions()
    {
        return versions;
    }
    
    private void parse()
    {
        Log("STATUS", String.format("apdu %s", toHex(apdu())));
        Log("STATUS", String.format("data %s", toHex(data())));
        
        // only terminal status was sent
        if (data().length == 1)
        {
            this.terminalStatus = asInt(data()[0]);
        }
        else if (data().length > 2)
        {
            int offset = 0;
            
            if (LLLVar.isLLLVar(data()))
            {
                LLLVar version = LLLVar.extractLLLVarFromBytes(data());
                this.terminalVersion = new String(version.data(), StandardCharsets.UTF_8);
                this.terminalStatus = asInt(data()[version.all().length]);
                // version.length + status byte
                offset = version.all().length + 1;
            }
            else
            {
                this.terminalStatus = asInt(data()[0]);
                offset = 1;
            }
            try
            {
                //[<version>]<status>[<tlv>]
                this.tlv = new Tlv(range(data(), offset, data().length - offset));
                
                for (Tag tag : this.tlv.find("1f59")) { applications.add(new String(tag.value(), StandardCharsets.UTF_8)); }
                for (Tag tag : this.tlv.find("1f42")) { serials.add(BCDToString(tag.value())); }
                for (Tag tag : this.tlv.find("1f40")) { devices.add(new String(tag.value(), StandardCharsets.UTF_8)); }
                for (Tag tag : this.tlv.find("1f41")) { versions.add(new String(tag.value(), StandardCharsets.UTF_8)); }
                for (Tag tag : this.tlv.find("1f44")) { tid = BCDToString(tag.value()); }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
    
    public CompletionForStatusResult(byte[] apdu)
    {
        super(apdu);
        parse();
    }
    
    public int status()
    {
        return terminalStatus;
    }
    
    public Tlv tlv()
    {
        return tlv;
    }
    
    public String version()
    {
        return terminalVersion;
    }
}
