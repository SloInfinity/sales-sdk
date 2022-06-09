package de.lavego.zvt.api;

import org.apache.commons.codec.DecoderException;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Objects;

import static de.lavego.zvt.api.Commons.asInt;

public class Bmp
{
    public final static byte BMPUNKNOWN = 0x00;
    public final static byte BMP01      = 0x01;  //1 byte binary
    public final static byte BMP02      = 0x02;  // 1 byte binary
    public final static byte BMP03      = 0x03;  // 1 byte binary
    public final static byte BMP04      = 0x04;  //6 byte BCD
    public final static byte BMP05      = 0x05;  //1 byte binary
    public final static byte BMP06      = 0x06;  //TLV-encoded
    public final static byte BMP0B      = 0x0B;  //3 byte BCD
    public final static byte BMP0C      = 0x0C;  //3 byte BCD
    public final static byte BMP0D      = 0x0D;  //2 byte BCD
    public final static byte BMP0E      = 0x0E;  //2 byte BCD
    public final static byte BMP17      = 0x17;  //2 byte BCD
    public final static byte BMP19      = 0x19;  // 1 byte binary
    public final static byte BMP22      = 0x22;  //LL-Var BCD
    public final static byte BMP23      = 0x23;  //LL-Var
    public final static byte BMP24      = 0x24;  //LLL-Var
    public final static byte BMP27      = 0x27;  //1 byte binary
    public final static byte BMP29      = 0x29;  //4 byte BCD
    public final static byte BMP2A      = 0x2A;  //15 byte ASCII
    public final static byte BMP2D      = 0x2D;  //LL-Var
    public final static byte BMP2E      = 0x2E;  //LLL-Var
    public final static byte BMP37      = 0x37;  //3 byte BCD
    public final static byte BMP3A      = 0x3A;  //2 byte BCD
    public final static byte BMP3B      = 0x3B;  //8 byte
    public final static byte BMP3C      = 0x3C;  //LLL-Var
    public final static byte BMP3D      = 0x3D;  //3 byte BCD
    public final static byte BMP49      = 0x49;  //2 byte BCD
    public final static byte BMP60      = 0x60;  //LLL-Var
    public final static byte BMP70      = 0x70;  //4 byte integer; Uniquely identifies Display Image request.
    public final static byte BMP71      = 0x71;  //4 byte integer; big endian
    public final static byte BMP72      = 0x72;  //1 byte integer
    public final static byte BMP73      = 0x73;  //1 byte integer
    public final static byte BMP74      = 0x74;  //1 byte integer
    public final static byte BMP75      = 0x75;  //1 byte integer
    public final static byte BMP87      = (byte) 0x87;  //2 byte BCD
    public final static byte BMP88      = (byte) 0x88;  //3 byte BCD
    public final static byte BMP8A      = (byte) 0x8A;  //1 byte binary
    public final static byte BMP8B      = (byte) 0x8B;  //LL-Var
    public final static byte BMP8C      = (byte) 0x8C;  //1 byte binary
    public final static byte BMP9A      = (byte) 0x9A;  //LLL-Var
    public final static byte BMPA0      = (byte) 0xA0;  //1 byte binary
    public final static byte BMPA7      = (byte) 0xA7;  // LL-Var
    public final static byte BMPAA      = (byte) 0xAA;  //3 byte BCD
    public final static byte BMPAF      = (byte) 0xAF;  //LLL-Var
    public final static byte BMPBA      = (byte) 0xBA;  //5 byte binary
    public final static byte BMPD0      = (byte) 0xD0;  //1 byte binary
    public final static byte BMPD1      = (byte) 0xD1;  //LL-Var
    public final static byte BMPD2      = (byte) 0xD2;  //	1 byte binary
    public final static byte BMPD3      = (byte) 0xD3;  //	1 byte binary
    public final static byte BMPE0      = (byte) 0xE0;  //1 byte binary
    public final static byte BMPE1      = (byte) 0xE1;  //LL-Var
    public final static byte BMPE2      = (byte) 0xE2;  //LL-Var
    public final static byte BMPE3      = (byte) 0xE3;  //LL-Var
    public final static byte BMPE4      = (byte) 0xE4;  //LL-Var
    public final static byte BMPE5      = (byte) 0xE5;  //LL-Var
    public final static byte BMPE6      = (byte) 0xE6;  //LL-Var
    public final static byte BMPE7      = (byte) 0xE7;  //LL-Var
    public final static byte BMPE8      = (byte) 0xE8;  //LL-Var
    public final static byte BMPE9      = (byte) 0xE9;  //1 byte binary
    public final static byte BMPEA      = (byte) 0xEA;  //1 byte binary
    public final static byte BMPEB      = (byte) 0xEB;  //8 byte binary
    public final static byte BMPF0      = (byte) 0xF0;  //1 byte binary
    public final static byte BMPF1      = (byte) 0xF1;  //LL-Var
    public final static byte BMPF2      = (byte) 0xF2;  //LL-Var
    public final static byte BMPF3      = (byte) 0xF3;  //LL-Var
    public final static byte BMPF4      = (byte) 0xF4;  //LL-Var
    public final static byte BMPF5      = (byte) 0xF5;  //LL-Var
    public final static byte BMPF6      = (byte) 0xF6;  //LL-Var
    public final static byte BMPF7      = (byte) 0xF7;  //LL-Var
    public final static byte BMPF8      = (byte) 0xF8;  //LL-Var
    public final static byte BMPF9      = (byte) 0xF9;  //1 byte binary
    public final static byte BMPFA      = (byte) 0xFA;  //1 byte binary

    protected byte   bmp    = 0x00;
    protected Format format = Format.Unknown;
    protected byte[] bitmap = null;

    protected Bmp()
    {

    }

    /**
     * construct BMP with zero length data (only the BMP is in the array)
     *
     * @param bmp
     */
    public Bmp(byte bmp)
    {
        this.bmp    = bmp;
        this.bitmap = new byte[]{this.bmp};
        initFormat();
    }

    private void initFormat()
    {
        switch (this.bmp)
        {
            case BMP01:
            case BMPFA:
            case BMPF9:
            case BMPF0:
            case BMPEA:
            case BMPE9:
            case BMPE0:
            case BMPD3:
            case BMPD2:
            case BMPD0:
            case BMPA0:
            case BMP8C:
            case BMP8A:
            case BMP27:
            case BMP19:
            case BMP05:
            case BMP03:
            case BMP02:
                this.format = Format.One_Byte_Binary;
                break;  //1 byte binary
            case BMP04:
                this.format = Format.Six_Byte_Bcd;
                break;  //6 byte BCD
            case BMP06:
                this.format = Format.Tlv_Encoded;
                break;  //TLV-encoded
            case BMP0B:
            case BMPAA:
            case BMP88:
            case BMP37:
            case BMP3D:
            case BMP0C:
                this.format = Format.Three_Byte_Bcd;
                break;  //3 byte BCD
            case BMP0D:
            case BMP87:
            case BMP3A:
            case BMP49:
            case BMP17:
            case BMP0E:
                this.format = Format.Two_Byte_Bcd;
                break;  //2 byte BCD
            case BMP22:
                this.format = Format.LL_Var_Bcd;
                break;  //LL-Var BCD
            case BMP23:
            case BMPF8:
            case BMPF7:
            case BMPF6:
            case BMPF5:
            case BMPF1:
            case BMPF2:
            case BMPF3:
            case BMPF4:
            case BMPE8:
            case BMPE7:
            case BMPE6:
            case BMPE5:
            case BMPE4:
            case BMPE3:
            case BMPE2:
            case BMPE1:
            case BMPD1:
            case BMPA7:
            case BMP8B:
            case BMP2D:
                this.format = Format.LL_Var;
                break;  //LL-Var
            case BMP24:
            case BMPAF:
            case BMP9A:
            case BMP60:
            case BMP2E:
            case BMP3C:
                this.format = Format.LLL_Var;
                break;  //LLL-Var
            case BMP29:
                this.format = Format.Four_Byte_Bcd;
                break;  //4 byte BCD
            case BMP2A:
                this.format = Format.Fifteen_Byte_Ascii;
                break;  //15 byte ASCII
            case BMP3B:
            case BMPEB:
                this.format = Format.Eight_Byte_Binary;
                break;  //8 byte
            case BMP70:
            case BMP71:
                this.format = Format.Four_Byte_Integer;
                break; //Uniquely identifies Display Image request.
            case BMP72:
            case BMP75:
            case BMP73:
            case BMP74:
                this.format = Format.One_Byte_Integer;
                break;  //1 byte integer
            case BMPBA:
                this.format = Format.Five_Byte_Binary;
                break;  //5 byte binary
        }
    }

    /**
     * 'bitmap' must contain the complete data incl. the BMP (eg. timeout 0110 --> 0x01 == bmp and 0x10 == value
     *
     * @param bitmap
     */
    public Bmp(byte[] bitmap)
            throws Exception
    {
        if (bitmap.length > 0)
        {
            this.bmp    = bitmap[0];
            this.bitmap = bitmap;
            initFormat();
        }
        else { throw new Exception("byte[] bitmap has a zero length"); }
    }


    /**
     * Like Bmp(byte[] bitmap)
     * The array is expected as HEX string. First byte must be the BMP.
     *
     * @param hex
     * @throws Exception
     */
    public Bmp(String hex)
            throws Exception
    {
        try
        {
            hex = hex.replaceAll(" ", "");

            if (!hex.isEmpty())
            {
                this.bitmap = Hex.decodeHex(hex.toCharArray());
                this.bmp    = this.bitmap[0];
                this.initFormat();
            }
            else { throw new Exception("String hex is null OR is empty!"); }
        }
        catch (DecoderException e)
        {
            throw new Exception("String hex has a odd number or illegal of characters supplied");
        }
    }

    /**
     * BMP and data (value) in seperate parameters.
     *
     * @param bmp
     * @param data
     */
    public Bmp(byte bmp, byte[] data)
            throws Exception
    {
        if (data != null && data.length > 0)
        {
            this.bmp       = bmp;
            this.bitmap    = new byte[data.length + 1];
            this.bitmap[0] = this.bmp;
            System.arraycopy(data, 0, this.bitmap, 1, data.length);
            initFormat();
        }
        else { throw new Exception("byte[] data is null or has a zero"); }
    }

    /**
     * Shortcut BMP with One_Byte
     *
     * @param bmp
     * @param first byte
     */
    public Bmp(byte bmp, int first)
    {
        this(bmp, (byte) (first & 0xff));
    }

    /**
     * Shortcut BMP with One_Byte
     *
     * @param bmp
     * @param first byte
     */
    public Bmp(byte bmp, byte first)
    {
        this.bmp    = bmp;
        this.bitmap = new byte[]{bmp, first};
        initFormat();
    }

    /**
     * Shortcut BMP with One_Byte
     *
     * @param bmp
     * @param first byte
     */
    public Bmp(int bmp, int first)
    {
        this((byte) (bmp & 0xff), (byte) (first & 0xff));
    }

    /**
     * Shortcut BMP with Two_Bytes
     *
     * @param bmp
     * @param first  byte
     * @param second byte
     */
    public Bmp(byte bmp, int first, int second)
            throws Exception
    {
        this(bmp, (byte) (first & 0xff), (byte) (second & 0xff));
    }

    /**
     * Shortcut BMP with Two_Bytes
     *
     * @param bmp
     * @param first  byte
     * @param second byte
     */
    public Bmp(byte bmp, byte first, byte second)
            throws Exception
    {
        this.bmp    = bmp;
        this.bitmap = new byte[]{bmp, first, second};
        initFormat();
    }

    /**
     * Shortcut BMP with Two_Bytes
     *
     * @param bmp
     * @param first  byte
     * @param second byte
     * @param third  byte
     */
    public Bmp(byte bmp, int first, int second, int third)
            throws Exception
    {
        this(bmp, (byte) first, (byte) (second & 0xff), (byte) (third & 0xff));
    }

    /**
     * Shortcut BMP with Two_Bytes
     *
     * @param bmp
     * @param first  byte
     * @param second byte
     * @param third  byte
     */
    public Bmp(byte bmp, byte first, byte second, byte third)
            throws Exception
    {
        this.bmp    = bmp;
        this.bitmap = new byte[]{bmp, first, second, third};
        initFormat();
    }

    public byte[] bitmap()       { return this.bitmap; }

    public Format format()       { return this.format; }

    public boolean isA(byte bmp) { return this.bmp == bmp; }

    public boolean isA(int bmp)  { return asInt(this.bmp) == bmp; }

    public boolean isA(Bmp bmp)  { return this.bmp == bmp.bmp(); }

    public byte bmp()            { return this.bmp; }

    /**
     * Depends on Bmp.Format and BMP.
     * <p>
     * if the value can be converted safely the content of the string corresponds e.g.
     * to ASCII or the BCD VALUE.
     * In case of binary the value is output as hex string. If nothing can be converted
     * (or zero length) the string is empty (not zero!).
     *
     * @return
     */
    public String valueAsString()
            throws Exception
    {
        byte[] value = value();

        if (value.length > 0)
        {
            switch (this.format)
            {
                case One_Byte_Binary:
                case Three_Byte_Binary:
                case Five_Byte_Binary:
                case Eight_Byte_Binary:
                case Tlv_Encoded:
                    return String.valueOf(Hex.encodeHex(value));
                case Two_Byte_Bcd:
                case Three_Byte_Bcd:
                case Four_Byte_Bcd:
                case Six_Byte_Bcd:
                    return Commons.BCDToString(value);
                case One_Byte_Integer:
                    return String.valueOf(value[0]);
                case Four_Byte_Integer:
                    return new BigInteger(value).toString();
                case Fifteen_Byte_Ascii:
                    return new String(value(), StandardCharsets.UTF_8);
                case LL_Var:
                    return new String(new LLVar(value).data(), StandardCharsets.US_ASCII);
                case LLL_Var:
                    return new String(new LLLVar(value).data(), StandardCharsets.US_ASCII);
                case LL_Var_Bcd:
                    return Commons.BCDToString(new LLVar(value).data());
            }
        }

        return "";
    }

    public byte[] value()
    {
        if (this.bitmap.length > 1)
        {
            byte[] value = new byte[this.bitmap.length - 1];
            System.arraycopy(this.bitmap, 1, value, 0, this.bitmap.length - 1);
            return value;
        }
        else { return new byte[0]; }
    }

    @Override
    public int hashCode()
    {
        int result = Objects.hash(bmp, format);
        result = 31 * result + Arrays.hashCode(bitmap);
        return result;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Bmp)) return false;
        Bmp bmp1 = (Bmp) o;
        return bmp == bmp1.bmp && format == bmp1.format && Arrays.equals(bitmap, bmp1.bitmap);
    }

    public boolean isKnown()
    {
        switch (this.bmp)
        {
            case BMP01:
            case BMP02:
            case BMP03:
            case BMP04:
            case BMP05:
            case BMP06:
            case BMP0B:
            case BMP0C:
            case BMP0D:
            case BMP0E:
            case BMP17:
            case BMP19:
            case BMP22:
            case BMP23:
            case BMP24:
            case BMP27:
            case BMP29:
            case BMP2A:
            case BMP2D:
            case BMP2E:
            case BMP37:
            case BMP3A:
            case BMP3B:
            case BMP3C:
            case BMP3D:
            case BMP49:
            case BMP60:
            case BMP70:
            case BMP71:
            case BMP72:
            case BMP73:
            case BMP74:
            case BMP75:
            case BMP87:
            case BMP88:
            case BMP8A:
            case BMP8B:
            case BMP8C:
            case BMP9A:
            case BMPA0:
            case BMPA7:
            case BMPAA:
            case BMPAF:
            case BMPBA:
            case BMPD0:
            case BMPD1:
            case BMPD2:
            case BMPD3:
            case BMPE0:
            case BMPE1:
            case BMPE2:
            case BMPE3:
            case BMPE4:
            case BMPE5:
            case BMPE6:
            case BMPE7:
            case BMPE8:
            case BMPE9:
            case BMPEA:
            case BMPEB:
            case BMPF0:
            case BMPF1:
            case BMPF2:
            case BMPF3:
            case BMPF4:
            case BMPF5:
            case BMPF6:
            case BMPF7:
            case BMPF8:
            case BMPF9:
            case BMPFA:
                return true;
            default:
                return false;
        }
    }

    public enum Format
    {
        Unknown,
        One_Byte_Binary,
        Three_Byte_Binary,
        Five_Byte_Binary,
        Eight_Byte_Binary,
        LL_Var,
        LL_Var_Bcd,
        LLL_Var,
        Two_Byte_Bcd,
        Three_Byte_Bcd,
        Four_Byte_Bcd,
        Six_Byte_Bcd,
        One_Byte_Integer,
        Four_Byte_Integer,
        Fifteen_Byte_Ascii,
        Tlv_Encoded
    }
}
