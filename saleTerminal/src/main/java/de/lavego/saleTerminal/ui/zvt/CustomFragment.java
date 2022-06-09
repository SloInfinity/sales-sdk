package de.lavego.saleTerminal.ui.zvt;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import de.lavego.saleTerminal.R;
import de.lavego.zvt.api.Apdu;

public class CustomFragment extends ZvtSubFragment
{
    public CustomFragment() { setArguments(new Bundle()); }
    
    public static CustomFragment newInstance()
    {
        return new CustomFragment();
    }
    
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState)
    {
        final View    root           = inflater.inflate(R.layout.custom_fragment, container, false);
        final Spinner custom_command = root.findViewById(R.id.custom_command);
        final Button  send           = root.findViewById(R.id.send);
        
        /**
         * Examples:
         *
         * Reversal and Register samples. Compiled but not send!
         *
         * May be you need something special (extended data with auth command,
         * reversal, special configs related to terminal manufacturer, etc)
         */
        /*
        try
        {
            int  receiptNo    = 1234;
            Apdu cancellation = new Apdu(Commons.Command.CMD_0630);
            cancellation.add(Commons.StringNumberToBCD("010203", 3));
            cancellation.add(new Bmp((byte) 0x87, Commons.NumberToBCD(receiptNo, 2)));
            
            Log.d("TEST", "Reversal");
            
            ByteUtils.printData("TEST", "reversal 1: ", cancellation.apdu());
            ByteUtils.printData("TEST", "reversal 2: ", new Reversal("1234").apdu());
            ByteUtils.printData("TEST", "reversal 3: ", new Reversal("010203", "1234").apdu());
            ByteUtils.printData("TEST", "reversal 4: ", new Reversal(1234).apdu());
            ByteUtils.printData("TEST", "reversal 5: ", new Reversal("010203", 1234).apdu());
            
            Log.d("TEST", "Register");
            
            Tlv tlvTest = new Tlv("06 0C 12 01 30 27 03 14 01 FE 40 02 B0 B0");
            
            Log.d("TEST", String.format("bitmap.length=%s, length=%s, offset=%s", tlvTest.bitmap().length, tlvTest.length(), tlvTest.offset()));
            
            Tag _12 = new Tag((byte) 0x12, (byte) 0x30);
            Tag _27 = new Tag((byte) 0x27, new byte[]{
                    0x14,
                    0x01,
                    (byte) 0xfe
            });
            Tag _40 = new Tag((byte) 0x40, new byte[]{
                    (byte) 0xB0,
                    (byte) 0xB0
            });
            
            Tlv tlv = new Tlv();
            tlv.add(_12);
            tlv.add(_27);
            tlv.add(_40);
            
            ByteUtils.printData("TEST", "register 1: ", new DefaultRegister().apdu());
            ByteUtils.printData("TEST", "register 2: ", new DefaultRegister("010203").apdu());
            ByteUtils.printData("TEST", "register 3: ", new DefaultRegister((byte) 0x9e).apdu());
            ByteUtils.printData("TEST", "register 4: ", new DefaultRegister("010203", (byte) 0x9e).apdu());
            ByteUtils.printData("TEST", "register 5: ", new DefaultRegister((byte) 0x9e, "0978").apdu());
            ByteUtils.printData("TEST", "register 6: ", new DefaultRegister("010203", (byte) 0x9e, "0978").apdu());
            ByteUtils.printData("TEST", "register 7: ", new DefaultRegister("010203", (byte) 0x9e, "0978", tlv).apdu());
            ByteUtils.printData("TEST", "register 8: ", new DefaultRegister((byte) 0x9e, "0978", tlv).apdu());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        */
        send.setOnClickListener(v -> {
            try
            {
                doCustom(new Apdu(custom_command.getSelectedItem().toString()).apdu());
            }
            catch (org.apache.commons.codec.DecoderException e)
            {
                e.printStackTrace();
            }
        });
        
        return root;
    }
}
