package de.lavego.zvt.cmds;

import static de.lavego.zvt.api.Commons.BCDToNumber;
import static de.lavego.zvt.api.Commons.BCDToString;
import static de.lavego.zvt.api.Commons.Log;
import static de.lavego.zvt.api.Commons.asInt;
import static de.lavego.zvt.api.Commons.range;
import static de.lavego.zvt.api.Commons.toHex;

import android.annotation.SuppressLint;
import android.util.Log;

import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import de.lavego.zvt.api.Apdu;
import de.lavego.zvt.api.Hex;
import de.lavego.zvt.api.LLLVar;
import de.lavego.zvt.api.LLVar;
import de.lavego.zvt.api.ResultCode;
import de.lavego.zvt.api.Tag;
import de.lavego.zvt.api.Tlv;

@SuppressLint("DefaultLocale")
public class Status extends Apdu
{
    private Tlv        tlv                 = new Tlv();
    private ResultCode resultCode          = new ResultCode();  // chapter error-messages
    private long       amount              = 0L;
    private String     tid                 = "";
    private String     trace               = "";
    private String     trace_orig          = "";
    private int        time_hh             = - 1;
    private int        time_mm             = - 1;
    private int        time_ss             = - 1;
    private int        date_dd             = - 1;
    private int        date_mm             = - 1;
    private int        expiry_yy           = - 1;
    private int        expiry_mm           = - 1;
    private long       card_seq_no         = 0;
    private long       receipt_no          = 0;
    private long       turnover_no         = 0;
    private byte       cc_payment_type     = (byte) 0xFF;
    private int        card_type           = 0;
    private int        card_type_id        = 0;
    private String     aid                 = "";
    private String     cc_iso              = "0978";
    private String     pan_ef_id           = "";
    private String     blocked_goods_group = "";
    private String     card_name           = "";
    private String     cash_card_records   = "";
    private String     additional_text     = "";
    private byte       resultCodeAS        = (byte) 0xFF;
    private String     aidPar              = "";
    private String     vu                  = "";
    private String     single_amounts      = "";
    private String     track1              = "";
    private String     track2              = "";
    private String     track3              = "";
    private String     zka_chip_ef         = "";
    private String     chip_data           = "";
    
    public Status(Apdu apdu)
    {
        this(apdu.apdu());
    }
    
    public Status(byte[] apdu)
    {
        super(apdu);
        parse();
    }
    
    /**
     * 04 0F 4D
     * 27 00
     * 04 00 00 00 00 30 00
     * 60 F0 F5 F3
     * 01 70 01 72 03 00 00 00 00 30
     * 00 00 00 00 00 00 00 00 00 00
     * 00 00 00 00 00 00 00 00 00 00
     * 00 00 00 00 00 00 00 00 00 00
     * 00 00 00 00 00 00 00 00 00 00
     * 00 00 00
     * 0B 00 01 95
     * 0C 14 41 47
     * 0D 03 05
     */
    private void parse()
    {
        for (int idx = 0; idx < length(); ++ idx)
        {
            int bmp = asInt(data()[idx]);
            
            if (bmp == 0x27)
            {
                resultCode = new ResultCode(data()[++ idx]);
            }
            else if (bmp == 0x29)
            {
                tid = BCDToString(range(data(), idx + 1, 4));
                idx = idx + 4;
            }
            else if (bmp == 0x04)
            {
                amount = BCDToNumber(range(data(), idx + 1, 6));
                idx = idx + 6;
            }
            else if (bmp == 0x0b)
            {
                trace = BCDToString(range(data(), idx + 1, 3));
                idx = idx + 3;
            }
            else if (bmp == 0x37)
            {
                trace_orig = BCDToString(range(data(), idx + 1, 3));
                idx = idx + 3;
            }
            else if (bmp == 0x0c)
            {
                time_hh = (int) BCDToNumber(range(data(), idx + 1, 1));
                time_mm = (int) BCDToNumber(range(data(), idx + 2, 1));
                time_ss = (int) BCDToNumber(range(data(), idx + 3, 1));
                idx = idx + 3;
            }
            else if (bmp == 0x0d)
            {
                date_mm = (int) BCDToNumber(range(data(), idx + 1, 1));
                date_dd = (int) BCDToNumber(range(data(), idx + 2, 1));
                idx = idx + 2;
            }
            else if (bmp == 0x0e)
            {
                expiry_yy = (int) BCDToNumber(range(data(), idx + 1, 1));
                expiry_mm = (int) BCDToNumber(range(data(), idx + 2, 1));
                idx = idx + 2;
            }
            else if (bmp == 0x17)
            {
                card_seq_no = BCDToNumber(range(data(), idx + 1, 2));
                idx = idx + 2;
            }
            else if (bmp == 0x87)
            {
                receipt_no = BCDToNumber(range(data(), idx + 1, 2));
                idx = idx + 2;
            }
            else if (bmp == 0x88)
            {
                turnover_no = BCDToNumber(range(data(), idx + 1, 3));
                idx = idx + 3;
            }
            else if (bmp == 0x19)
            {
                cc_payment_type = data()[++ idx];
            }
            else if (bmp == 0x8a)
            {
                card_type = asInt(data()[++ idx]);
            }
            else if (bmp == 0x8c)
            {
                card_type_id = asInt(data()[++ idx]);
            }
            else if (bmp == 0x3b)
            {
                aid = new String(range(data(), idx + 1, 8), StandardCharsets.US_ASCII).trim();
                idx = idx + 8;
            }
            else if (bmp == 0x49)
            {
                cc_iso = Hex.encodeHexString(range(data(), idx + 1, 2));
                idx = idx + 2;
            }
            // LLVar
            else if (bmp == 0x22)
            {
                try
                {
                    int   length = LLVar.length(range(data(), idx + 1, 2));
                    LLVar var    = LLVar.extractLLVarFromBytes(range(data(), idx + 1, length + 2));
                    pan_ef_id = BCDToString(var.data());
                    idx = idx + length + 2;
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
            else if (bmp == 0x2d)
            {
                try
                {
                    int   length = LLVar.length(range(data(), idx + 1, 2));
                    LLVar var    = LLVar.extractLLVarFromBytes(range(data(), idx + 1, length + 2));
                    track1 = new String(var.data(), StandardCharsets.UTF_8);
                    idx = idx + length + 2;
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
            else if (bmp == 0x23)
            {
                try
                {
                    int   length = LLVar.length(range(data(), idx + 1, 2));
                    LLVar var    = LLVar.extractLLVarFromBytes(range(data(), idx + 1, length + 2));
                    track2 = BCDToString(var.data());
                    idx = idx + length + 2;
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
            else if (bmp == 0x24)
            {
                try
                {
                    int   length = LLVar.length(range(data(), idx + 1, 2));
                    LLVar var    = LLVar.extractLLVarFromBytes(range(data(), idx + 1, length + 2));
                    track3 = BCDToString(var.data());
                    idx = idx + length + 2;
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
            else if (bmp == 0xa7)
            {
                try
                {
                    int   length = LLVar.length(range(data(), idx + 1, 2));
                    LLVar var    = LLVar.extractLLVarFromBytes(range(data(), idx + 1, length + 2));
                    zka_chip_ef = Hex.encodeHexString(var.data());
                    idx = idx + length + 2;
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
            else if (bmp == 0x8b)
            {
                try
                {
                    int   length = LLVar.length(range(data(), idx + 1, 2));
                    LLVar var    = LLVar.extractLLVarFromBytes(range(data(), idx + 1, length + 2));
                    card_name = new String(var.data(), StandardCharsets.US_ASCII).trim();
                    idx = idx + length + 2;
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
            else if (bmp == 0x4c)
            {
                try
                {
                    int   length = LLVar.length(range(data(), idx + 1, 2));
                    LLVar var    = LLVar.extractLLVarFromBytes(range(data(), idx + 1, length + 2));
                    blocked_goods_group = BCDToString(var.data());
                    idx = idx + length + 2;
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
            else if (bmp == 0x9a)
            {
                try
                {
                    int    length = LLLVar.length(range(data(), idx + 1, 3));
                    LLLVar var    = LLLVar.extractLLLVarFromBytes(range(data(), idx + 1, length + 3));
                    cash_card_records = BCDToString(var.data());
                    idx = idx + length + 3;
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
            else if (bmp == 0x2e)
            {
                try
                {
                    int    length = LLLVar.length(range(data(), idx + 1, 3));
                    LLLVar var    = LLLVar.extractLLLVarFromBytes(range(data(), idx + 1, length + 3));
                    chip_data = Hex.encodeHexString(var.data());
                    idx = idx + length + 3;
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
            else if (bmp == 0x60)
            {
                try
                {
                    int    length = LLLVar.length(range(data(), idx + 1, 3));
                    LLLVar var    = LLLVar.extractLLLVarFromBytes(range(data(), idx + 1, length + 3));
                    single_amounts = BCDToString(var.data());
                    idx = idx + length + 3;
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
            else if (bmp == 0x3c)
            {
                try
                {
                    int    length = LLLVar.length(range(data(), idx + 1, 3));
                    LLLVar var    = LLLVar.extractLLLVarFromBytes(range(data(), idx + 1, length + 3));
                    additional_text = new String(var.data(), StandardCharsets.UTF_8);
                    idx = idx + length + 3;
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
            else if (bmp == 0xa0)
            {
                resultCodeAS = data()[++ idx];
            }
            else if (bmp == 0xba)
            {
                aidPar = Hex.encodeHexString(range(data(), idx + 1, 5));
                idx = idx + 5;
            }
            else if (bmp == 0x2a)
            {
                vu = new String(range(data(), idx + 1, 15), StandardCharsets.UTF_8);
                idx = idx + 15;
            }
            // It's a TLV 0x06
            else if (tlv.isA(bmp))
            {
                try
                {
                    Tag tlvTag = Tag.fromBytes(range(data(), idx, length() - idx));
                    this.tlv = new Tlv(tlvTag.all());
                    idx = idx + this.tlv.bitmap().length;
    
                    Log.i("040F", String.format("idx={%s} length={%s} data={%s}",idx,length(),toHex(this.tlv.value())));
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
            else
            {
                Log("STATUS", String.format("ToDo: {%s}", toHex(range(data(), idx, length() - idx))));
                idx = length();
            }
        }
    }
    
    public String additional_text()
    {
        return additional_text;
    }
    
    public String aid()
    {
        return aid;
    }
    
    public String aidPar()
    {
        return aidPar;
    }
    
    public long amount()
    {
        return amount;
    }
    
    public String blocked_goods_group()
    {
        return blocked_goods_group;
    }
    
    public String card_name()
    {
        return card_name;
    }
    
    public long card_seq_no()
    {
        return card_seq_no;
    }
    
    public int card_type()
    {
        return card_type;
    }
    
    public int card_type_id()
    {
        return card_type_id;
    }
    
    public String cash_card_records()
    {
        return cash_card_records;
    }
    
    public String cc_iso()
    {
        return cc_iso;
    }
    
    public byte cc_payment_type()
    {
        return cc_payment_type;
    }
    
    public String chip_data()
    {
        return chip_data;
    }
    
    public String dateFormatted() { return dateFormatted("dd.MM.yyyy"); }
    
    @SuppressLint("SimpleDateFormat")
    public String dateFormatted(String format)
    {
        Calendar calendar = Calendar.getInstance(Locale.getDefault());
        //noinspection MagicConstant
        calendar.set(calendar.get(Calendar.YEAR), date_mm() - 1, date_dd(), time_hh(), time_mm(), time_ss());
        
        return new SimpleDateFormat(format).format(calendar.getTime());
    }
    
    public String dateTimeFormatted() { return dateTimeFormatted("dd.MM.yyyy HH:mm:ss"); }
    
    public String dateTimeFormatted(String format)
    {
        Calendar calendar = Calendar.getInstance(Locale.getDefault());
        //noinspection MagicConstant
        calendar.set(calendar.get(Calendar.YEAR), date_mm() - 1, date_dd(), time_hh(), time_mm(), time_ss());
        
        return new SimpleDateFormat(format).format(calendar.getTime());
    }
    
    public int date_mm()
    {
        return date_mm;
    }
    
    public int date_dd()
    {
        return date_dd;
    }
    
    public int time_hh()
    {
        return time_hh;
    }
    
    public int time_mm()
    {
        return time_mm;
    }
    
    public int time_ss()
    {
        return time_ss;
    }
    
    public String date_dd_as_str()
    {
        return String.format("%02d", date_dd);
    }
    
    public String date_mm_as_str()
    {
        return String.format("%02d", date_mm);
    }
    
    public long expiry_mm()
    {
        return expiry_mm;
    }
    
    public String expiry_mm_as_str()
    {
        return String.format("%02d", expiry_mm);
    }
    
    public long expiry_yy()
    {
        return expiry_yy;
    }
    
    public String expiry_yy_as_str()
    {
        return String.format("%02d", expiry_yy);
    }
    
    public String pan_ef_id()
    {
        return pan_ef_id;
    }
    
    public long receipt_no()
    {
        return receipt_no;
    }
    
    public ResultCode result()
    {
        return resultCode;
    }
    
    public ResultCode resultCode()
    {
        return resultCode;
    }
    
    public byte resultCodeAS()
    {
        return resultCodeAS;
    }
    
    public String single_amounts()
    {
        return single_amounts;
    }
    
    public String tid()
    {
        return tid;
    }
    
    public String timeFormatted() { return timeFormatted("HH:mm:ss"); }
    
    public String timeFormatted(String format)
    {
        Calendar calendar = Calendar.getInstance(Locale.getDefault());
        //noinspection MagicConstant
        calendar.set(calendar.get(Calendar.YEAR), date_mm() - 1, date_dd(), time_hh(), time_mm(), time_ss());
        
        return new SimpleDateFormat(format).format(calendar.getTime());
    }
    
    public String time_hh_as_str()
    {
        return String.format("%02d", time_hh);
    }
    
    public String time_mm_as_str()
    {
        return String.format("%02d", time_mm);
    }
    
    public String time_ss_as_str()
    {
        return String.format("%02d", time_ss);
    }
    
    public Tlv tlv()
    {
        return tlv;
    }
    
    public String trace()
    {
        return trace;
    }
    
    public String trace_orig()
    {
        return trace_orig;
    }
    
    public String track1()
    {
        return track1;
    }
    
    public String track2()
    {
        return track2;
    }
    
    public String track3()
    {
        return track3;
    }
    
    public long turnover_no()
    {
        return turnover_no;
    }
    
    public String vu()
    {
        return vu;
    }
    
    public String zka_chip_ef()
    {
        return zka_chip_ef;
    }
}
