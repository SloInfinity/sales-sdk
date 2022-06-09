package de.lavego.zvt.cmds;

import de.lavego.zvt.api.Apdu;
import de.lavego.zvt.api.Bmp;
import de.lavego.zvt.api.Commons;

public class Reversal extends Apdu
{
    public Reversal()
    {
        super(0x06, 0x30);
    }
    
    public Reversal(int receiptNo) throws Exception
    {
        super(0x06, 0x30);
        add(Commons.StringNumberToBCD("010203", 3));
        add(new Bmp((byte) 0x87, Commons.NumberToBCD(receiptNo, 2)));
    }
    
    public Reversal(String receiptNo) throws Exception
    {
        super(0x06, 0x30);
        add(Commons.StringNumberToBCD("010203", 3));
        add(new Bmp((byte) 0x87, Commons.StringNumberToBCD(receiptNo, 2)));
    }
    
    public Reversal(String password, int receiptNo) throws Exception
    {
        super(0x06, 0x30);
        add(Commons.StringNumberToBCD(password, 3));
        add(new Bmp((byte) 0x87, Commons.NumberToBCD(receiptNo, 2)));
    }
    
    public Reversal(String password, String receiptNo) throws Exception
    {
        super(0x06, 0x30);
        add(Commons.StringNumberToBCD(password, 3));
        add(new Bmp((byte) 0x87, Commons.StringNumberToBCD(receiptNo, 2)));
    }
}
