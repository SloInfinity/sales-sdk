package de.lavego.zvt.cmds;

import de.lavego.zvt.api.Apdu;
import de.lavego.zvt.api.Commons;
import de.lavego.zvt.api.Hex;
import de.lavego.zvt.api.StatusByte;
import de.lavego.zvt.api.Tlv;

import static de.lavego.zvt.api.Commons.Log;
import static de.lavego.zvt.api.Commons.range;
import static de.lavego.zvt.api.Commons.toHex;

public class CompletionForRegister extends Apdu
{
    private StatusByte statusByte = new StatusByte((byte) 0x00);
    private String     tid        = "";
    private String     currency   = "0978";
    private Tlv        tlv        = new Tlv();

    public CompletionForRegister(Apdu apdu)
    {
        super(apdu);
        parse();
    }

    private void parse()
    {
        Log("REGISTER", String.format("apdu %s", toHex(apdu())));
        Log("REGISTER", String.format("data %s", toHex(data())));

        for (int idx = 0; idx < data().length; ++idx)
        {
            byte b = data()[idx];

            if (b == 0x19)
            {
                this.statusByte = new StatusByte(data()[++idx]);
            }
            else if (b == 0x29)
            {
                this.tid = Commons.BCDToString(new byte[]{
                        data()[++idx],
                        data()[++idx],
                        data()[++idx],
                        data()[++idx]
                });
            }
            else if (b == 0x49)
            {
                currency = Hex.encodeHexString(new byte[]{
                        data()[++idx],
                        data()[++idx]});
            }
            else if (b == 0x06)
            {
                try
                {
                    this.tlv = new Tlv(range(data(), idx, data().length - idx));
                    Log("REGISTER", String.format("tlv %s", toHex(tlv.bitmap())));
                    idx = data().length;
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
    }

    public CompletionForRegister(byte[] apdu)
    {
        super(apdu);
        parse();
    }

    public StatusByte status()
    {
        return statusByte;
    }

    public String tid()
    {
        return tid;
    }

    public String currency()
    {
        return currency;
    }

    public Tlv tlv()
    {
        return tlv;
    }
}
