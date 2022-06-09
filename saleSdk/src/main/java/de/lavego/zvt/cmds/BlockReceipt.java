package de.lavego.zvt.cmds;

import java.nio.charset.StandardCharsets;

import de.lavego.zvt.api.Apdu;
import de.lavego.zvt.api.Tag;
import de.lavego.zvt.api.Tlv;

import static de.lavego.zvt.api.Commons.asInt;

public class BlockReceipt extends Apdu
{
    private final Tlv tlv;

    public BlockReceipt(Apdu apdu)
            throws Exception
    {
        super(apdu);
        this.tlv = new Tlv(data());
    }

    public StringBuilder text()
    {
        final StringBuilder s = new StringBuilder();
        
        for(Tag tag: tlv.tags())
        {
            if(asInt(tag.tag()[0]) == 0x25)
            {
                for(Tag stag: tag.subtags())
                {
                    if(stag.tag()[0] == 0x07)
                    {
                        s.append(new String(stag.value(), StandardCharsets.UTF_8))
                         .append("\n");
                    }
                }
            }
        }
        
        return s;
    }
}
