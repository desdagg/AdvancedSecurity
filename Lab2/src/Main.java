import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static int shift = 0;

    public static HashMap<Character, Integer> alphaToIndex = new HashMap<>();


    public static char[] alphabet;

    static {
        alphabet = new char[]{
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        };
    }

    public static void main(String[] args) {

        init();

        System.out.println("Enter shift value: ");
        Scanner input = new Scanner(System.in);
        String shiftStr = input.nextLine();
        shift = Integer.parseInt(shiftStr);
        System.out.println("shift is : " + shift);

        char[] shiftAlphabet = mapping();
        for (int i = 0; i < alphabet.length; i++)
            System.out.print(alphabet[i] + " ");
        System.out.println("");
        for (int i = 0; i < shiftAlphabet.length; i++)
            System.out.print(shiftAlphabet[i] + " ");

        String message = "RQH YDULDWLRQ WR WKH VWDQGDUG FDHVDU FLSKHU LV ZKHQ WKH DOSKDEHW LV \"NHBHG\" EB XVLQJ D ZRUG. LQ WKH WUDGLWLRQDO YDULHWB, RQH FRXOG ZULWH WKH DOSKDEHW RQ WZR VWULSV DQG MXVW PDWFK XS WKH VWULSV DIWHU VOLGLQJ WKH ERWWRP VWULS WR WKH OHIW RU ULJKW. WR HQFRGH, BRX ZRXOG ILQG D OHWWHU LQ WKH WRS URZ DQG VXEVWLWXWH LW IRU WKH OHWWHU LQ WKH ERWWRP URZ. IRU D NHBHG YHUVLRQ, RQH ZRXOG QRW XVH D VWDQGDUG DOSKDEHW, EXW ZRXOG ILUVW ZULWH D ZRUG (RPLWWLQJ GXSOLFDWHG OHWWHUV) DQG WKHQ ZULWH WKH UHPDLQLQJ OHWWHUV RI WKH DOSKDEHW. IRU WKH HADPSOH EHORZ, L XVHG D NHB RI \"UXPNLQ.FRP\" DQG BRX ZLOO VHH WKDW WKH SHULRG LV UHPRYHG EHFDXVH LW LV QRW D OHWWHU. BRX ZLOO DOVR QRWLFH WKH VHFRQG \"P\" LV QRW LQFOXGHG EHFDXVH WKHUH ZDV DQ P DOUHDGB DQG BRX FDQ'W KDYH GXSOLFDWHV.";

        String test = "YDULHWB";

        String decrypted = decrypt(test, shiftAlphabet);

        System.out.println(decrypted);

    }

    static void init(){
        for (int i = 0; i < alphabet.length; i++){
            alphaToIndex.put(alphabet[i], i);
        }
    }

    public static char[] mapping() {

        char[] tempAlphabet= new char[alphabet.length];

        for (int i = 0; i < alphabet.length; i++)
        {
            int modShift = i + shift;
            //int modShift = 26 - shift;
            //modShift = i + modShift;
            tempAlphabet[(modShift % 26)] = alphabet[i];
        }
        return tempAlphabet;
    }



    public static String decrypt(String message, char[] shiftAlphabet){
        int len = message.length();

        message = message.toLowerCase();

        String output = "";

        for (int i = 0; i<len; i++){

            char c = (message.charAt(i));
            for(int j = 0; j<alphabet.length; j++){

                if (alphabet[j] == c){
                    System.out.println("input " + c);
                    c = shiftAlphabet[j];
                    System.out.println("Chang " + c);
                }
            }
            output += c;
        }

        return output;
    }
}
