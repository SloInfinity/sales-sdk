package de.lavego.zvt.api;

import android.util.Log;

import org.apache.commons.codec.DecoderException;

import java.io.ByteArrayOutputStream;

public class Commons
{
    public final static int  APDU_ONE_BYTE_LENGTH   = 0x01;
    public final static int  APDU_THREE_BYTE_LENGTH = 0x03;
    /**
     * Terminal Status Codes
     * Error-ID Status- (hexa- Code decimal) (decimal)
     */
    public final static byte TSC_00                 = 0x00;  // dec -> 00 	PT ready
    public final static byte TSC_51                 = 0x51;  // dec -> 81 Initialisation required
    public final static byte TSC_62                 = 0x62;  // dec -> 98 Date/time incorrect
    public final static byte TSC_9C                 = (byte) 0x9c;  // dec -> 156 Please wait (e.g. software-update still running)
    public final static byte TSC_9D                 = (byte) 0x9d;  // dec -> 157 Partial issue of goods
    public final static byte TSC_B1                 = (byte) 0xb1;  // dec -> 177 Memory full
    public final static byte TSC_B2                 = (byte) 0xb2;  // dec -> 178 Merchant-journal full
    public final static byte TSC_BF                 = (byte) 0xbf;  // dec -> 191 Voltage supply too low (external power supply)
    public final static byte TSC_C0                 = (byte) 0xc0;  // dec -> 192 Card locking mechanism defect
    public final static byte TSC_C1                 = (byte) 0xc1;  // dec -> 193 Merchant card locked
    public final static byte TSC_C2                 = (byte) 0xc2;  // dec -> 194 Diagnosis required
    public final static byte TSC_C4                 = (byte) 0xc4;  // dec -> 196 Card-profile invalid. New card-profiles must be loaded
    public final static byte TSC_CC                 = (byte) 0xcc;  // dec -> 204 Printer not ready
    public final static byte TSC_DC                 = (byte) 0xdc;  // dec -> 220 Card inserted
    public final static byte TSC_DF                 = (byte) 0xdf;  // dec -> 223 Out-of-order
    public final static byte TSC_E0                 = (byte) 0xe0;  // dec -> 224 Remote-maintenance activated
    public final static byte TSC_E1                 = (byte) 0xe1;  // dec -> 225 Card not completely removed
    public final static byte TSC_E2                 = (byte) 0xe2;  // dec -> 226 Card-reader does not answer / card-reader defective
    public final static byte TSC_E3                 = (byte) 0xe3;  // dec -> 227 Shutter closed
    public final static byte TSC_E4                 = (byte) 0xe4;  // dec -> 228 Terminal activation required
    public final static byte TSC_F0                 = (byte) 0xf0;  // dec -> 240 Reconciliation required
    public final static byte TSC_F6                 = (byte) 0xf6;  // dec -> 246 OPT-data not available (= OPT-Personalisation required)
    public final static byte TSC_Unknown            = (byte) 0xff;

    public static byte[] controlFields(Command command)
    {
        switch (command)
        {
            case CMD_0401:
                return new byte[]{0x04, 0x01};
            case CMD_040D:
                return new byte[]{0x04, 0x0d};
            case CMD_040E:
                return new byte[]{0x04, 0x0e};
            case CMD_040F:
                return new byte[]{0x04, 0x0f};
            case CMD_04FF:
                return new byte[]{0x04, (byte) 0xff};
            case CMD_0501:
                return new byte[]{0x05, 0x01};
            case CMD_0600:
                return new byte[]{0x06, 0x00};
            case CMD_0601:
                return new byte[]{0x06, 0x01};
            case CMD_0602:
                return new byte[]{0x06, 0x02};
            case CMD_0603:
                return new byte[]{0x06, 0x03};
            case CMD_0604:
                return new byte[]{0x06, 0x04};
            case CMD_0605:
                return new byte[]{0x06, 0x05};
            case CMD_0609:
                return new byte[]{0x06, 0x09};
            case CMD_060A:
                return new byte[]{0x06, 0x00};
            case CMD_060B:
                return new byte[]{0x06, 0x0b};
            case CMD_060C:
                return new byte[]{0x06, 0x0c};
            case CMD_060F:
                return new byte[]{0x06, 0x0f};
            case CMD_0610:
                return new byte[]{0x06, 0x10};
            case CMD_0611:
                return new byte[]{0x06, 0x11};
            case CMD_0612:
                return new byte[]{0x06, 0x12};
            case CMD_0618:
                return new byte[]{0x06, 0x18};
            case CMD_061A:
                return new byte[]{0x06, 0x1a};
            case CMD_061B:
                return new byte[]{0x06, 0x1b};
            case CMD_061E:
                return new byte[]{0x06, 0x1e};
            case CMD_0620:
                return new byte[]{0x06, 0x20};
            case CMD_0621:
                return new byte[]{0x06, 0x21};
            case CMD_0622:
                return new byte[]{0x06, 0x22};
            case CMD_0623:
                return new byte[]{0x06, 0x23};
            case CMD_0624:
                return new byte[]{0x06, 0x24};
            case CMD_0625:
                return new byte[]{0x06, 0x25};
            case CMD_0626:
                return new byte[]{0x06, 0x26};
            case CMD_0630:
                return new byte[]{0x06, 0x30};
            case CMD_0631:
                return new byte[]{0x06, 0x31};
            case CMD_0650:
                return new byte[]{0x06, 0x50};
            case CMD_0651:
                return new byte[]{0x06, 0x51};
            case CMD_0670:
                return new byte[]{0x06, 0x70};
            case CMD_0679:
                return new byte[]{0x06, 0x79};
            case CMD_0682:
                return new byte[]{0x06, (byte) 0x82};
            case CMD_0685:
                return new byte[]{0x06, (byte) 0x85};
            case CMD_0686:
                return new byte[]{0x06, (byte) 0x86};
            case CMD_0687:
                return new byte[]{0x06, (byte) 0x87};
            case CMD_0688:
                return new byte[]{0x06, (byte) 0x88};
            case CMD_0690:
                return new byte[]{0x06, (byte) 0x90};
            case CMD_0691:
                return new byte[]{0x06, (byte) 0x91};
            case CMD_0693:
                return new byte[]{0x06, (byte) 0x93};
            case CMD_0695:
                return new byte[]{0x06, (byte) 0x95};
            case CMD_06B0:
                return new byte[]{0x06, (byte) 0xb0};
            case CMD_06C0:
                return new byte[]{0x06, (byte) 0xc0};
            case CMD_06C1:
                return new byte[]{0x06, (byte) 0xc1};
            case CMD_06C2:
                return new byte[]{0x06, (byte) 0xc2};
            case CMD_06C3:
                return new byte[]{0x06, (byte) 0xc3};
            case CMD_06C4:
                return new byte[]{0x06, (byte) 0xc4};
            case CMD_06C5:
                return new byte[]{0x06, (byte) 0xc5};
            case CMD_06C6:
                return new byte[]{0x06, (byte) 0xc6};
            case CMD_06CE:
                return new byte[]{0x06, (byte) 0xce};
            case CMD_06D1:
                return new byte[]{0x06, (byte) 0xd1};
            case CMD_06D3:
                return new byte[]{0x06, (byte) 0xd3};
            case CMD_06D4:
                return new byte[]{0x06, (byte) 0xd4};
            case CMD_06D8:
                return new byte[]{0x06, (byte) 0xd8};
            case CMD_06D9:
                return new byte[]{0x06, (byte) 0xd9};
            case CMD_06DA:
                return new byte[]{0x06, (byte) 0xda};
            case CMD_06DB:
                return new byte[]{0x06, (byte) 0xdb};
            case CMD_06DD:
                return new byte[]{0x06, (byte) 0xdd};
            case CMD_06E0:
                return new byte[]{0x06, (byte) 0xe0};
            case CMD_06E1:
                return new byte[]{0x06, (byte) 0xe1};
            case CMD_06E2:
                return new byte[]{0x06, (byte) 0xe2};
            case CMD_06E3:
                return new byte[]{0x06, (byte) 0xe3};
            case CMD_06E4:
                return new byte[]{0x06, (byte) 0xe4};
            case CMD_06E5:
                return new byte[]{0x06, (byte) 0xe5};
            case CMD_06E6:
                return new byte[]{0x06, (byte) 0xe6};
            case CMD_06E8:
                return new byte[]{0x06, (byte) 0xe8};
            case CMD_06E9:
                return new byte[]{0x06, (byte) 0xe9};
            case CMD_0801:
                return new byte[]{0x08, (byte) 0x01};
            case CMD_0802:
                return new byte[]{0x08, (byte) 0x02};
            case CMD_0810:
                return new byte[]{0x08, (byte) 0x10};
            case CMD_0811:
                return new byte[]{0x08, (byte) 0x11};
            case CMD_0812:
                return new byte[]{0x08, (byte) 0x12};
            case CMD_0813:
                return new byte[]{0x08, (byte) 0x13};
            case CMD_0820:
                return new byte[]{0x08, (byte) 0x20};
            case CMD_0821:
                return new byte[]{0x08, (byte) 0x21};
            case CMD_0822:
                return new byte[]{0x08, (byte) 0x22};
            case CMD_0823:
                return new byte[]{0x08, (byte) 0x23};
            case CMD_0824:
                return new byte[]{0x08, (byte) 0x24};
            case CMD_0830:
                return new byte[]{0x08, (byte) 0x30};
            case CMD_0840:
                return new byte[]{0x08, (byte) 0x40};
            case CMD_0850:
                return new byte[]{0x08, (byte) 0x50};
            case CMD_8000:
                return new byte[]{(byte) 0x80, (byte) 0x00};
            case CMD_84xx:
            case CMD_8400:
                return new byte[]{(byte) 0x84, (byte) 0x00};
            case CMD_849A:
                return new byte[]{(byte) 0x84, (byte) 0x9a};
            case CMD_849C:
                return new byte[]{(byte) 0x84, (byte) 0x9c};
            default:
                return new byte[]{0x00, 0x00};
        }
    }

    public static Command isA(Apdu apdu) { return isA(apdu.apdu()); }

    public static Command isA(byte[] apdu)
    {
        if (apdu.length > 1)
        {
            if (asInt(apdu[0]) == 0x80 && asInt(apdu[1]) == 0x00) { return Command.CMD_8000; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0x0F) { return Command.CMD_060F; }
            else if (asInt(apdu[0]) == 0x04 && asInt(apdu[1]) == 0x01) { return Command.CMD_0401; }
            else if (asInt(apdu[0]) == 0x04 && asInt(apdu[1]) == 0x0D) { return Command.CMD_040D; }
            else if (asInt(apdu[0]) == 0x04 && asInt(apdu[1]) == 0x0E) { return Command.CMD_040E; }
            else if (asInt(apdu[0]) == 0x04 && asInt(apdu[1]) == 0x0F) { return Command.CMD_040F; }
            else if (asInt(apdu[0]) == 0x04 && asInt(apdu[1]) == 0xFF) { return Command.CMD_04FF; }
            else if (asInt(apdu[0]) == 0x05 && asInt(apdu[1]) == 0x01) { return Command.CMD_0501; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0x00) { return Command.CMD_0600; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0x01) { return Command.CMD_0601; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0x02) { return Command.CMD_0602; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0x03) { return Command.CMD_0603; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0x04) { return Command.CMD_0604; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0x05) { return Command.CMD_0605; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0x09) { return Command.CMD_0609; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0x0A) { return Command.CMD_060A; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0x0B) { return Command.CMD_060B; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0x0C) { return Command.CMD_060C; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0x10) { return Command.CMD_0610; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0x11) { return Command.CMD_0611; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0x12) { return Command.CMD_0612; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0x18) { return Command.CMD_0618; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0x1A) { return Command.CMD_061A; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0x1B) { return Command.CMD_061B; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0x1E) { return Command.CMD_061E; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0x20) { return Command.CMD_0620; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0x21) { return Command.CMD_0621; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0x22) { return Command.CMD_0622; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0x23) { return Command.CMD_0623; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0x24) { return Command.CMD_0624; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0x25) { return Command.CMD_0625; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0x26) { return Command.CMD_0626; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0x30) { return Command.CMD_0630; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0x31) { return Command.CMD_0631; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0x50) { return Command.CMD_0650; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0x51) { return Command.CMD_0651; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0x70) { return Command.CMD_0670; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0x79) { return Command.CMD_0679; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0x82) { return Command.CMD_0682; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0x85) { return Command.CMD_0685; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0x86) { return Command.CMD_0686; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0x87) { return Command.CMD_0687; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0x88) { return Command.CMD_0688; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0x90) { return Command.CMD_0690; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0x91) { return Command.CMD_0691; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0x93) { return Command.CMD_0693; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0x95) { return Command.CMD_0695; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0xB0) { return Command.CMD_06B0; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0xC0) { return Command.CMD_06C0; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0xC1) { return Command.CMD_06C1; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0xC2) { return Command.CMD_06C2; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0xC3) { return Command.CMD_06C3; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0xC4) { return Command.CMD_06C4; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0xC5) { return Command.CMD_06C5; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0xC6) { return Command.CMD_06C6; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0xCE) { return Command.CMD_06CE; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0xD1) { return Command.CMD_06D1; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0xD3) { return Command.CMD_06D3; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0xD4) { return Command.CMD_06D4; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0xD8) { return Command.CMD_06D8; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0xD9) { return Command.CMD_06D9; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0xDA) { return Command.CMD_06DA; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0xDB) { return Command.CMD_06DB; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0xDD) { return Command.CMD_06DD; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0xE0) { return Command.CMD_06E0; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0xE1) { return Command.CMD_06E1; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0xE2) { return Command.CMD_06E2; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0xE3) { return Command.CMD_06E3; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0xE4) { return Command.CMD_06E4; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0xE5) { return Command.CMD_06E5; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0xE6) { return Command.CMD_06E6; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0xE8) { return Command.CMD_06E8; }
            else if (asInt(apdu[0]) == 0x06 && asInt(apdu[1]) == 0xE9) { return Command.CMD_06E9; }
            else if (asInt(apdu[0]) == 0x08 && asInt(apdu[1]) == 0x01) { return Command.CMD_0801; }
            else if (asInt(apdu[0]) == 0x08 && asInt(apdu[1]) == 0x02) { return Command.CMD_0802; }
            else if (asInt(apdu[0]) == 0x08 && asInt(apdu[1]) == 0x10) { return Command.CMD_0810; }
            else if (asInt(apdu[0]) == 0x08 && asInt(apdu[1]) == 0x11) { return Command.CMD_0811; }
            else if (asInt(apdu[0]) == 0x08 && asInt(apdu[1]) == 0x12) { return Command.CMD_0812; }
            else if (asInt(apdu[0]) == 0x08 && asInt(apdu[1]) == 0x13) { return Command.CMD_0813; }
            else if (asInt(apdu[0]) == 0x08 && asInt(apdu[1]) == 0x20) { return Command.CMD_0820; }
            else if (asInt(apdu[0]) == 0x08 && asInt(apdu[1]) == 0x21) { return Command.CMD_0821; }
            else if (asInt(apdu[0]) == 0x08 && asInt(apdu[1]) == 0x22) { return Command.CMD_0822; }
            else if (asInt(apdu[0]) == 0x08 && asInt(apdu[1]) == 0x23) { return Command.CMD_0823; }
            else if (asInt(apdu[0]) == 0x08 && asInt(apdu[1]) == 0x24) { return Command.CMD_0824; }
            else if (asInt(apdu[0]) == 0x08 && asInt(apdu[1]) == 0x30) { return Command.CMD_0830; }
            else if (asInt(apdu[0]) == 0x08 && asInt(apdu[1]) == 0x40) { return Command.CMD_0840; }
            else if (asInt(apdu[0]) == 0x08 && asInt(apdu[1]) == 0x50) { return Command.CMD_0850; }
            else if (asInt(apdu[0]) == 0x84 && asInt(apdu[1]) == 0x00) { return Command.CMD_8400; }
            else if (asInt(apdu[0]) == 0x84 && asInt(apdu[1]) == 0x9A) { return Command.CMD_849A; }
            else if (asInt(apdu[0]) == 0x84 && asInt(apdu[1]) == 0x9C) { return Command.CMD_849C; }
            else if (asInt(apdu[0]) == 0x84) { return Command.CMD_84xx; }
        }

        return Command.CMD_UNKNOWN;
    }

    public static int asInt(byte b)            { return (b & 0xff); }

    public static boolean isPrintable(Tag tag) { return isPrintableAs(tag) == PrintableAs.Ascii; }

    public static PrintableAs isPrintableAs(Tag tag)
    {
        switch (tag.tag().length)
        {
            case 1:
            {
                byte b = tag.tag()[0];

                if (b == 0x07) return PrintableAs.Ascii;
                break;
            }
            case 2:
            {
                byte b1 = tag.tag()[0];
                byte b2 = tag.tag()[1];

                if (b1 == 0x1f)
                {
                    if (b2 == 0x59) return PrintableAs.Ascii;
                    if (b2 == 0x40) return PrintableAs.Ascii;
                    if (b2 == 0x41) return PrintableAs.Ascii;
                    if (b2 == 0x42) return PrintableAs.Bcd;
                    if (b2 == 0x44) return PrintableAs.Bcd;
                }
                else { Log("TAG", String.format("not implemented yet! %s", toHex(tag.tag()))); }
                break;
            }
            default:
                break;
        }

        return PrintableAs.Unknown;
    }

    public static void Log(String tag, String msg) { Log.v(tag, String.format("%-8s: %s%n", tag, msg)); }

    public static String toHex(byte[] data)
    {
        StringBuffer sb = new StringBuffer();

        if (data != null)
        {
            for (int idx = 0; idx < data.length; ++idx)
            {
                sb.append(String.format((idx == data.length - 1 ? "%02X" : "%02X "), data[idx]));
            }
        }

        return sb.toString();
    }

    public static void Log(String tag, long msg) { Log.d("ZVT", String.format("%-8s: %s%n", tag, msg)); }

    /**
     * give number and the needed bytes.
     * <p>
     * number -> 1234 with bytes=2 --> 0x12, 0x34
     * number -> 1234 with bytes=3 --> 0x00, 0x12, 0x34
     * <p>
     * <p>
     * Todo:
     * Check that the number fits into the bytes! That should be handled...
     * <p>
     * number -> 123456 with byte=2 --> error 0x12,0x34 and 0x56 are truncated.
     * <p>
     * 1 bytes -> 0x00 - 0x99
     * 2 bytes -> 0x00,0x00 - 0x99,0x99
     * N bytes ...
     * <p>
     * Negative number are not allowed too...
     */
    public static byte[] NumberToBCD(long number, int bytes)
    {
        byte[] bcd = new byte[bytes];
        String num = String.valueOf(number);

        // 3 bytes are 3*2 single values for example
        for (int idx = num.length(); idx < (2 * bytes); ++idx)
        {
            num = "0" + num;
        }

        try
        {
            bcd = Hex.decodeHex(num.toCharArray());
        }
        catch (DecoderException e)
        {
            e.printStackTrace();
        }

        return bcd;
    }

    /**
     * give number and the needed bytes.
     * <p>
     * number -> 1234 with bytes=2 --> 0x12, 0x34
     * number -> 1234 with bytes=3 --> 0x00, 0x12, 0x34
     * <p>
     * <p>
     * Todo:
     * Check that the number fits into the bytes! That should be handled...
     * <p>
     * number -> 123456 with byte=2 --> error 0x12,0x34 and 0x56 are truncated.
     * <p>
     * 1 bytes -> 0x00 - 0x99
     * 2 bytes -> 0x00,0x00 - 0x99,0x99
     * N bytes ...
     * <p>
     * Negative number are not allowed too...
     */
    public static byte[] StringNumberToBCD(String num, int bytes)
    {
        byte[] bcd = new byte[bytes];

        // Input validation
        if (num == null || num.isEmpty()) {
            num = "0";
        }

        // Remove any non-numeric characters and handle negative numbers
        num = num.replaceAll("[^0-9]", "");
        if (num.isEmpty()) {
            num = "0";
        }

        // Calculate required string length (2 characters per byte for BCD)
        int requiredLength = 2 * bytes;

        // Pad with leading zeros to reach required length
        while (num.length() < requiredLength) {
            num = "0" + num;
        }

        // Truncate if too long (as mentioned in the TODO)
        if (num.length() > requiredLength) {
            num = num.substring(num.length() - requiredLength);
        }

        // Ensure even number of characters (should always be true now, but safety check)
        if (num.length() % 2 != 0) {
            num = "0" + num;
        }

        try
        {
            bcd = Hex.decodeHex(num.toCharArray());
        }
        catch (DecoderException e)
        {
            Log.e("StringNumberToBCD", "Failed to decode hex string: '" + num + "' (length: " + num.length() + ")", e);
            e.printStackTrace();
        }

        return bcd;
    }

    public static long BCDToNumber(byte[] data)
    {
        try
        {
            return Long.parseLong(BCDToString(data));
        }
        catch (NumberFormatException e)
        {
            e.printStackTrace();
        }
        
        return 0L;
    }

    public static String BCDToString(byte[] data)
    {
        return String.valueOf(Hex.encodeHex(data));
    }

    public static byte bit(byte value, int position)
    {
        return (byte) ((value >> position) & 1);
    }

    public static byte bit(int value, int position)
    {
        return (byte) ((value >> position) & 1);
    }

    public static int bitAsInt(byte value, int position)
    {
        return ((value >> position) & 1);
    }

    public static int bitAsInt(int value, int position)
    {
        return ((value >> position) & 1);
    }

    public static byte[] range(byte[] data, int pos, int length)
    {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(data, pos, length);
        return baos.toByteArray();
    }

    public enum Command
    {
        CMD_UNKNOWN,
        CMD_0401,
        CMD_040D,
        CMD_040E,
        CMD_040F,
        CMD_04FF,
        CMD_0501,
        CMD_0600,
        CMD_0601,
        CMD_0602,
        CMD_0603,
        CMD_0604,
        CMD_0605,
        CMD_0609,
        CMD_060A,
        CMD_060B,
        CMD_060C,
        CMD_060F,
        CMD_0610,
        CMD_0611,
        CMD_0612,
        CMD_0618,
        CMD_061A,
        CMD_061B,
        CMD_061E,
        CMD_0620,
        CMD_0621,
        CMD_0622,
        CMD_0623,
        CMD_0624,
        CMD_0625,
        CMD_0626,
        CMD_0630,
        CMD_0631,
        CMD_0650,
        CMD_0651,
        CMD_0670,
        CMD_0679,
        CMD_0682,
        CMD_0685,
        CMD_0686,
        CMD_0687,
        CMD_0688,
        CMD_0690,
        CMD_0691,
        CMD_0693,
        CMD_0695,
        CMD_06B0,
        CMD_06C0,
        CMD_06C1,
        CMD_06C2,
        CMD_06C3,
        CMD_06C4,
        CMD_06C5,
        CMD_06C6,
        CMD_06CE,
        CMD_06D1,
        CMD_06D3,
        CMD_06D4,
        CMD_06D8,
        CMD_06D9,
        CMD_06DA,
        CMD_06DB,
        CMD_06DD,
        CMD_06E0,
        CMD_06E1,
        CMD_06E2,
        CMD_06E3,
        CMD_06E4,
        CMD_06E5,
        CMD_06E6,
        CMD_06E8,
        CMD_06E9,
        CMD_0801,
        CMD_0802,
        CMD_0810,
        CMD_0811,
        CMD_0812,
        CMD_0813,
        CMD_0820,
        CMD_0821,
        CMD_0822,
        CMD_0823,
        CMD_0824,
        CMD_0830,
        CMD_0840,
        CMD_0850,
        CMD_8000,
        CMD_8400,
        CMD_849A,
        CMD_84xx,
        CMD_849C
    }

    public enum PrintableAs
    {
        Unknown,
        Ascii,
        Flag,
        Bcd
    }
}
