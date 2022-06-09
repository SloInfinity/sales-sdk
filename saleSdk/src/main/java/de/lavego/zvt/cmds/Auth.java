package de.lavego.zvt.cmds;

import de.lavego.zvt.api.Apdu;
import de.lavego.zvt.api.Bmp;
import de.lavego.zvt.api.Commons;

import static de.lavego.zvt.api.Commons.NumberToBCD;

public class Auth extends Apdu
{
    private int amount = 0;
    
    public Auth(int amount)
            throws Exception
    {
        super(Commons.Command.CMD_0601);
        add(new Bmp((byte) 0x04, NumberToBCD(amount, 6)));
        add(new Bmp("490978"));
        add(new Bmp("1944"));
    }
    
    public Auth(int amount, byte config)
            throws Exception
    {
        super(Commons.Command.CMD_0601);
        add(new Bmp((byte) 0x04, NumberToBCD(amount, 6)));
        add(new Bmp("490978"));
        add(new Bmp(0x19, config));
    }
    
    public Auth(int amount, String iso_currency)
            throws Exception
    {
        super(Commons.Command.CMD_0601);
        add(new Bmp((byte) 0x04, NumberToBCD(amount, 6)));
        add(new Bmp(String.format("49%s", iso_currency)));
        add(new Bmp("1944"));
    }
    
    public Auth(int amount, byte config, String iso_currency)
            throws Exception
    {
        super(Commons.Command.CMD_0601);
        add(new Bmp((byte) 0x04, NumberToBCD(amount, 6)));
        add(new Bmp(String.format("49%s", iso_currency)));
        add(new Bmp(0x19, config));
    }
}
