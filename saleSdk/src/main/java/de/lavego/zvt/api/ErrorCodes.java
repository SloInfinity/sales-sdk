package de.lavego.zvt.api;

public class ErrorCodes
{
    public static final int Error00 = 0x00; //(00)  no error
    //01-63 01 – 99 errorcodes from network-operator system/authorisation-system
    public static final int Error64 = 0x64; //(100) card not readable (LRC-/parity-error)
    public static final int Error65 = 0x65; //(101) card-data not present (neither track-data nor chip found)
    public static final int Error66 = 0x66; //(102) processing-error (also for problems with card-reader mechanism)
    public static final int Error67 = 0x67; //(103) function not permitted for ec- and Maestro-cards
    public static final int Error68 = 0x68; //(104) function not permitted for credit- and tank-cards
    public static final int Error6A = 0x6A; //(106) turnover-file full
    public static final int Error6B = 0x6B; //(107) function deactivated (PT not registered)
    public static final int Error6C = 0x6C; //(108) abort via timeout or abort-key
    public static final int Error6E = 0x6E; //(110) card in blocked-list (response to command 06 E4)
    public static final int Error6F = 0x6F; //(111) wrong currency
    public static final int Error71 = 0x71; //(113) credit not sufficient (chip-card)
    public static final int Error72 = 0x72; //(114) chip error
    public static final int Error73 = 0x73; //(115) card-data incorrect (e.g. country-key check, checksum-error)
    public static final int Error77 = 0x77; //(119) end-of-day batch not possible
    public static final int Error78 = 0x78; //(120) card expired
    public static final int Error79 = 0x79; //(121) card not yet valid
    public static final int Error7A = 0x7A; //(122) card unknown
    public static final int Error7B = 0x7B; //(123) fallback to magnetic stripe for girocard not possible
    public static final int Error7C = 0x7C; //(124) fallback to magnetic stripe not possible (used for non girocard cards)
    public static final int Error7D = 0x7D; //(125) communication error (communication module does not answer or is not present)
    public static final int Error7E = 0x7E; //(126) fallback to magnetic stripe not possible, debit advice possible (used only for girocard)
    public static final int Error83 = 0x83; //(131) function not possible
    public static final int Error85 = 0x85; //(133) key missing
    public static final int Error89 = 0x89; //(137) PIN-pad defective
    public static final int Error9A = 0x9A; //(154) ZVT protocol error. e. g. parsing error, mandatory message element missing
    public static final int Error9B = 0x9B; //(155) error from dial-up/communication fault
    public static final int Error9C = 0x9C; //(156) please wait
    public static final int ErrorA0 = 0xA0; //(160) receiver not ready
    public static final int ErrorA1 = 0xA1; //(161) remote station does not respond
    public static final int ErrorA3 = 0xA3; //(163) no connection
    public static final int ErrorA4 = 0xA4; //(164) submission of Geldkarte not possible
    public static final int ErrorB1 = 0xB1; //(177) memory full
    public static final int ErrorB2 = 0xB2; //(178) merchant-journal full
    public static final int ErrorB4 = 0xB4; //(180) already reversed
    public static final int ErrorB5 = 0xB5; //(181) reversal not possible
    public static final int ErrorB7 = 0xB7; //(183) pre-authorisation incorrect (amount too high) or amount wrong
    public static final int ErrorB8 = 0xB8; //(184) error pre-authorisation
    public static final int ErrorBF = 0xBF; //(191) voltage supply to low (external power supply)
    public static final int ErrorC0 = 0xC0; //(192) card locking mechanism defective
    public static final int ErrorC1 = 0xC1; //(193) merchant-card locked
    public static final int ErrorC2 = 0xC2; //(194) diagnosis required
    public static final int ErrorC3 = 0xC3; //(195) maximum amount exceeded
    public static final int ErrorC4 = 0xC4; //(196) card-profile invalid. New card-profiles must be loaded.
    public static final int ErrorC5 = 0xC5; //(197) payment method not supported
    public static final int ErrorC6 = 0xC6; //(198) currency not applicable
    public static final int ErrorC8 = 0xC8; //(200) amount too small
    public static final int ErrorC9 = 0xC9; //(201) max. transaction-amount too small
    public static final int ErrorCB = 0xCB; //(203) function only allowed in EURO
    public static final int ErrorCC = 0xCC; //(204) printer not ready
    public static final int ErrorCD = 0xCD; //(205) Cashback not possible
    public static final int ErrorD2 = 0xD2; //(210) function not permitted for service-cards/bank-customer-cards
    public static final int ErrorDC = 0xDC; //(220) card inserted
    public static final int ErrorDD = 0xDD; //(221) error during card-eject (for motor-insertion reader)
    public static final int ErrorDE = 0xDE; //(222) error during card-insertion (for motor-insertion reader)
    public static final int ErrorE0 = 0xE0; //(224) remote-maintenance activated
    public static final int ErrorE2 = 0xE2; //(226) card-reader does not answer / card-reader defective
    public static final int ErrorE3 = 0xE3; //(227) shutter closed
    public static final int ErrorE4 = 0xE4; //(228) Terminal activation required
    public static final int ErrorE7 = 0xE7; //(231) min. one goods-group not found
    public static final int ErrorE8 = 0xE8; //(232) no goods-groups-table loaded
    public static final int ErrorE9 = 0xE9; //(233) restriction-code not permitted
    public static final int ErrorEA = 0xEA; //(234) card-code not permitted (e.g. card not activated via Diagnosis)
    public static final int ErrorEB = 0xEB; //(235) function not executable (PIN-algorithm unknown)
    public static final int ErrorEC = 0xEC; //(236) PIN-processing not possible
    public static final int ErrorED = 0xED; //(237) PIN-pad defective
    public static final int ErrorF0 = 0xF0; //(240) open end-of-day batch present
    public static final int ErrorF1 = 0xF1; //(241) ec-cash/Maestro offline error
    public static final int ErrorF5 = 0xF5; //(245) OPT-error
    public static final int ErrorF6 = 0xF6; //(246) OPT-data not available (= OPT personalisation required)
    public static final int ErrorFA = 0xFA; //(250) error transmitting offline-transactions (clearing error)
    public static final int ErrorFB = 0xFB; //(251) turnover data-set defective
    public static final int ErrorFC = 0xFC; //(252) necessary device not present or defective
    public static final int ErrorFD = 0xFD; //(253) baudrate not supported
    public static final int ErrorFE = 0xFE; //(254) register unknown
    public static final int ErrorFF = 0xFF; //(255) system error (= other/unknown error), See TLV tags 1F16 and 1F17

    public static final String ErrorMessage00 = "no error";
    //01-63 01 – 99 errorcodes from network-operator system/authorisation-system
    public static final String ErrorMessage64 = "card not readable (LRC-/parity-error)";
    public static final String ErrorMessage65 = "card-data not present (neither track-data nor chip found)";
    public static final String ErrorMessage66 = "processing-error (also for problems with card-reader mechanism)";
    public static final String ErrorMessage67 = "function not permitted for ec- and Maestro-cards";
    public static final String ErrorMessage68 = "function not permitted for credit- and tank-cards";
    public static final String ErrorMessage6A = "turnover-file full";
    public static final String ErrorMessage6B = "function deactivated (PT not registered)";
    public static final String ErrorMessage6C = "abort via timeout or abort-key";
    public static final String ErrorMessage6E = "card in blocked-list (response to command 06 E4)";
    public static final String ErrorMessage6F = "wrong currency";
    public static final String ErrorMessage71 = "credit not sufficient (chip-card)";
    public static final String ErrorMessage72 = "chip error";
    public static final String ErrorMessage73 = "card-data incorrect (e.g. country-key check, checksum-error)";
    public static final String ErrorMessage77 = "end-of-day batch not possible";
    public static final String ErrorMessage78 = "card expired";
    public static final String ErrorMessage79 = "card not yet valid";
    public static final String ErrorMessage7A = "card unknown";
    public static final String ErrorMessage7B = "fallback to magnetic stripe for girocard not possible";
    public static final String ErrorMessage7C = "fallback to magnetic stripe not possible (used for non girocard cards)";
    public static final String ErrorMessage7D = "communication error (communication module does not answer or is not present)";
    public static final String ErrorMessage7E = "fallback to magnetic stripe not possible, debit advice possible (used only for girocard)";
    public static final String ErrorMessage83 = "function not possible";
    public static final String ErrorMessage85 = "key missing";
    public static final String ErrorMessage89 = "PIN-pad defective";
    public static final String ErrorMessage9A = "ZVT protocol error. e. g. parsing error, mandatory message element missing";
    public static final String ErrorMessage9B = "error from dial-up/communication fault";
    public static final String ErrorMessage9C = "please wait";
    public static final String ErrorMessageA0 = "receiver not ready";
    public static final String ErrorMessageA1 = "remote station does not respond";
    public static final String ErrorMessageA3 = "no connection";
    public static final String ErrorMessageA4 = "submission of Geldkarte not possible";
    public static final String ErrorMessageB1 = "memory full";
    public static final String ErrorMessageB2 = "merchant-journal full";
    public static final String ErrorMessageB4 = "already reversed";
    public static final String ErrorMessageB5 = "reversal not possible";
    public static final String ErrorMessageB7 = "or amount wrong";
    public static final String ErrorMessageB8 = "error pre-authorisation";
    public static final String ErrorMessageBF = "voltage supply to low (external power supply)";
    public static final String ErrorMessageC0 = "card locking mechanism defective";
    public static final String ErrorMessageC1 = "merchant-card locked";
    public static final String ErrorMessageC2 = "diagnosis required";
    public static final String ErrorMessageC3 = "maximum amount exceeded";
    public static final String ErrorMessageC4 = "card-profile invalid. New card-profiles must be loaded.";
    public static final String ErrorMessageC5 = "payment method not supported";
    public static final String ErrorMessageC6 = "currency not applicable";
    public static final String ErrorMessageC8 = "amount too small";
    public static final String ErrorMessageC9 = "max. transaction-amount too small";
    public static final String ErrorMessageCB = "function only allowed in EURO";
    public static final String ErrorMessageCC = "printer not ready";
    public static final String ErrorMessageCD = "Cashback not possible";
    public static final String ErrorMessageD2 = "function not permitted for service-cards/bank-customer-cards";
    public static final String ErrorMessageDC = "card inserted";
    public static final String ErrorMessageDD = "error during card-eject (for motor-insertion reader)";
    public static final String ErrorMessageDE = "error during card-insertion (for motor-insertion reader)";
    public static final String ErrorMessageE0 = "remote-maintenance activated";
    public static final String ErrorMessageE2 = "card-reader does not answer / card-reader defective";
    public static final String ErrorMessageE3 = "shutter closed";
    public static final String ErrorMessageE4 = "Terminal activation required";
    public static final String ErrorMessageE7 = "min. one goods-group not found";
    public static final String ErrorMessageE8 = "no goods-groups-table loaded";
    public static final String ErrorMessageE9 = "restriction-code not permitted";
    public static final String ErrorMessageEA = "card-code not permitted (e.g. card not activated via Diagnosis)";
    public static final String ErrorMessageEB = "function not executable (PIN-algorithm unknown)";
    public static final String ErrorMessageEC = "PIN-processing not possible";
    public static final String ErrorMessageED = "PIN-pad defective";
    public static final String ErrorMessageF0 = "open end-of-day batch present";
    public static final String ErrorMessageF1 = "ec-cash/Maestro offline error";
    public static final String ErrorMessageF5 = "OPT-error";
    public static final String ErrorMessageF6 = "OPT-data not available (= OPT personalisation required)";
    public static final String ErrorMessageFA = "error transmitting offline-transactions (clearing error)";
    public static final String ErrorMessageFB = "turnover data-set defective";
    public static final String ErrorMessageFC = "necessary device not present or defective";
    public static final String ErrorMessageFD = "baudrate not supported";
    public static final String ErrorMessageFE = "register unknown";
    public static final String ErrorMessageFF = "system error (= other/unknown error), See TLV tags 1F16 and 1F17";

    public static String errorByCode(int code)
    {
        if (code >= 0x01 && code <= 0x63) { return "network-operator system/authorisation-system"; }
        else
        {
            switch (code)
            {
                case 0x00:
                    return ErrorMessage00;
                //01-63 01 – 99 errorcodes from network-operator system/authorisation-system
                case 0x64:
                    return ErrorMessage64;
                case 0x65:
                    return ErrorMessage65;
                case 0x66:
                    return ErrorMessage66;
                case 0x67:
                    return ErrorMessage67;
                case 0x68:
                    return ErrorMessage68;
                case 0x6A:
                    return ErrorMessage6A;
                case 0x6B:
                    return ErrorMessage6B;
                case 0x6C:
                    return ErrorMessage6C;
                case 0x6E:
                    return ErrorMessage6E;
                case 0x6F:
                    return ErrorMessage6F;
                case 0x71:
                    return ErrorMessage71;
                case 0x72:
                    return ErrorMessage72;
                case 0x73:
                    return ErrorMessage73;
                case 0x77:
                    return ErrorMessage77;
                case 0x78:
                    return ErrorMessage78;
                case 0x79:
                    return ErrorMessage79;
                case 0x7A:
                    return ErrorMessage7A;
                case 0x7B:
                    return ErrorMessage7B;
                case 0x7C:
                    return ErrorMessage7C;
                case 0x7D:
                    return ErrorMessage7D;
                case 0x7E:
                    return ErrorMessage7E;
                case 0x83:
                    return ErrorMessage83;
                case 0x85:
                    return ErrorMessage85;
                case 0x89:
                    return ErrorMessage89;
                case 0x9A:
                    return ErrorMessage9A;
                case 0x9B:
                    return ErrorMessage9B;
                case 0x9C:
                    return ErrorMessage9C;
                case 0xA0:
                    return ErrorMessageA0;
                case 0xA1:
                    return ErrorMessageA1;
                case 0xA3:
                    return ErrorMessageA3;
                case 0xA4:
                    return ErrorMessageA4;
                case 0xB1:
                    return ErrorMessageB1;
                case 0xB2:
                    return ErrorMessageB2;
                case 0xB4:
                    return ErrorMessageB4;
                case 0xB5:
                    return ErrorMessageB5;
                case 0xB7:
                    return ErrorMessageB7;
                case 0xB8:
                    return ErrorMessageB8;
                case 0xBF:
                    return ErrorMessageBF;
                case 0xC0:
                    return ErrorMessageC0;
                case 0xC1:
                    return ErrorMessageC1;
                case 0xC2:
                    return ErrorMessageC2;
                case 0xC3:
                    return ErrorMessageC3;
                case 0xC4:
                    return ErrorMessageC4;
                case 0xC5:
                    return ErrorMessageC5;
                case 0xC6:
                    return ErrorMessageC6;
                case 0xC8:
                    return ErrorMessageC8;
                case 0xC9:
                    return ErrorMessageC9;
                case 0xCB:
                    return ErrorMessageCB;
                case 0xCC:
                    return ErrorMessageCC;
                case 0xCD:
                    return ErrorMessageCD;
                case 0xD2:
                    return ErrorMessageD2;
                case 0xDC:
                    return ErrorMessageDC;
                case 0xDD:
                    return ErrorMessageDD;
                case 0xDE:
                    return ErrorMessageDE;
                case 0xE0:
                    return ErrorMessageE0;
                case 0xE2:
                    return ErrorMessageE2;
                case 0xE3:
                    return ErrorMessageE3;
                case 0xE4:
                    return ErrorMessageE4;
                case 0xE7:
                    return ErrorMessageE7;
                case 0xE8:
                    return ErrorMessageE8;
                case 0xE9:
                    return ErrorMessageE9;
                case 0xEA:
                    return ErrorMessageEA;
                case 0xEB:
                    return ErrorMessageEB;
                case 0xEC:
                    return ErrorMessageEC;
                case 0xED:
                    return ErrorMessageED;
                case 0xF0:
                    return ErrorMessageF0;
                case 0xF1:
                    return ErrorMessageF1;
                case 0xF5:
                    return ErrorMessageF5;
                case 0xF6:
                    return ErrorMessageF6;
                case 0xFA:
                    return ErrorMessageFA;
                case 0xFB:
                    return ErrorMessageFB;
                case 0xFC:
                    return ErrorMessageFC;
                case 0xFD:
                    return ErrorMessageFD;
                case 0xFE:
                    return ErrorMessageFE;
                default:
                    return ErrorMessageFF;
            }
        }
    }
}
