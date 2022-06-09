package de.lavego.sdk;

import android.util.Log;

import java.util.HashMap;

import de.lavego.zvt.api.Hex;
import de.lavego.zvt.api.Tag;
import de.lavego.zvt.cmds.Status;

public class TransactionData
{
    public String                  data            = "";
    public int                     resultCode      = 0x00;
    public String                  resultText      = "";
    public long                    amount          = 0L;
    public String                  tid             = "";
    public String                  additional_text = "";
    public String                  aid             = "";
    public String                  card_name       = "";
    public long                    card_seq_no     = 0L;
    public String                  trace           = "";
    public int                     card_type       = 0;
    public String                  trace_orig      = "";
    public String                  vu              = "";
    public long                    receipt_no      = 0L;
    public String                  time            = "";
    public String                  date            = "";
    public String                  expiry          = "";
    public String                  single_amounts  = "";
    public String                  track1          = "";
    public String                  track2          = "";
    public String                  track3          = "";
    public String                  chip_data       = "";
    public HashMap<String, String> tags            = new HashMap<>();
    
    public TransactionData()
    {
    
    }
    
    public TransactionData(Status status)
    {
        resultCode = status.result().code();
        resultText = status.result().text();
        amount = status.amount();
        tid = status.tid();
        additional_text = status.additional_text();
        aid = status.aid();
        card_name = status.card_name();
        card_seq_no = status.card_seq_no();
        trace = status.trace();
        card_type = status.card_type();
        trace_orig = status.trace_orig();
        vu = status.vu();
        receipt_no = status.receipt_no();
        time = status.dateTimeFormatted();
        date = status.dateFormatted();
        expiry = String.format("%s/%s", status.expiry_mm_as_str(), status.expiry_yy_as_str());
        chip_data = status.chip_data();
        track1 = status.track1();
        track2 = status.track2();
        track3 = status.track3();
        single_amounts = status.single_amounts();
        
        for (Tag tag : status.tlv().tags())
        {
            Log.d("TransactionData", String.format("tag {%s} isPrimitiv {%s}", tag.tagAsStr(), tag.isPrimitive()));
            
            if (tag.isPrimitive())
            {
                this.tags.put(tag.tagAsStr(), Hex.encodeHexString(tag.value()));
                Log.d("TransactionData", String.format("value {%s} ", Hex.encodeHexString(tag.value())));
            }
            else
            {
                for (Tag stag : tag.subtags())
                {
                    Log.d("TransactionData", String.format("sub tag {%s} isPrimitiv {%s}", stag.tagAsStr(), stag.isPrimitive()));
                    
                    if (stag.isPrimitive())
                    {
                        this.tags.put(stag.tagAsStr(), Hex.encodeHexString(stag.value()));
                        Log.d("TransactionData", String.format("value {%s} ", Hex.encodeHexString(stag.value())));
                    }
                }
            }
        }
    }
}
