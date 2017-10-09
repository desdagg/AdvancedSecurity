


public class Controller {


    public static void main(String[] args) {


        //shift of 3
        String message = "RQH YDULDWLRQ WR WKH VWDQGDUG FDHVDU FLSKHU LV ZKHQ WKH DOSKDEHW LV \"NHBHG\" EB XVLQJ D ZRUG. LQ WKH WUDGLWLRQDO YDULHWB, RQH FRXOG ZULWH WKH DOSKDEHW RQ WZR VWULSV DQG MXVW PDWFK XS WKH VWULSV DIWHU VOLGLQJ WKH ERWWRP VWULS WR WKH OHIW RU ULJKW. WR HQFRGH, BRX ZRXOG ILQG D OHWWHU LQ WKH WRS URZ DQG VXEVWLWXWH LW IRU WKH OHWWHU LQ WKH ERWWRP URZ. IRU D NHBHG YHUVLRQ, RQH ZRXOG QRW XVH D VWDQGDUG DOSKDEHW, EXW ZRXOG ILUVW ZULWH D ZRUG (RPLWWLQJ GXSOLFDWHG OHWWHUV) DQG WKHQ ZULWH WKH UHPDLQLQJ OHWWHUV RI WKH DOSKDEHW. IRU WKH HADPSOH EHORZ, L XVHG D NHB RI \"UXPNLQ.FRP\" DQG BRX ZLOO VHH WKDW WKH SHULRG LV UHPRYHG EHFDXVH LW LV QRW D OHWWHU. BRX ZLOO DOVR QRWLFH WKH VHFRQG \"P\" LV QRW LQFOXGHG EHFDXVH WKHUH ZDV DQ P DOUHDGB DQG BRX FDQ'W KDYH GXSOLFDWHV.";

        //shift of 17
        String messageTwo = "FEV MRIZRKZFE KF KYV JKREURIU TRVJRI TZGYVI ZJ NYVE KYV\n" +
                "RCGYRSVK ZJ \"BVPVU\" SP LJZEX R NFIU. ZE KYV KIRUZKZFERC\n" +
                "MRIZVKP, FEV TFLCU NIZKV KYV RCGYRSVK FE KNF JKIZGJ REU ALJK\n" +
                "DRKTY LG KYV JKIZGJ RWKVI JCZUZEX KYV SFKKFD JKIZG KF KYV\n" +
                "CVWK FI IZXYK. KF VETFUV, PFL NFLCU WZEU R CVKKVI ZE KYV KFG\n" +
                "IFN REU JLSJKZKLKV ZK WFI KYV CVKKVI ZE KYV SFKKFD IFN. WFI R\n" +
                "BVPVU MVIJZFE, FEV NFLCU EFK LJV R JKREURIU RCGYRSVK, SLK\n" +
                "NFLCU WZIJK NIZKV R NFIU (FDZKKZEX ULGCZTRKVU CVKKVIJ) REU\n" +
                "KYVE NIZKV KYV IVDRZEZEX CVKKVIJ FW KYV RCGYRSVK. WFI KYV\n" +
                "VORDGCV SVCFN, Z LJVU R BVP FW \"ILDBZE.TFD\" REU PFL NZCC JVV\n" +
                "KYRK KYV GVIZFU ZJ IVDFMVU SVTRLJV ZK ZJ EFK R CVKKVI. PFL\n" +
                "NZCC RCJF EFKZTV KYV JVTFEU \"D\" ZJ EFK ZETCLUVU SVTRLJV KYVIV\n" +
                "NRJ RE D RCIVRUP REU PFL TRE'K YRMV ULGCZTRKVJ.";

        String messageThree = "XQKP IZ IMWEB LK AUVZCXKW PHL VPE RIKD ASOZZSBZI TOIE ESTD\n" +
                "XEJWXM CPS-3. PHPA TA DPW NEZCWB YN S OIE-GPIB KGIPLBTBSWF, WNK\n" +
                "UJ WGV KGEPV TA YVW KF APP NSDW NETITVSVY BIUIWQCBK (KUA WQ\n" +
                "IX QFETPIW 64). QD'A HNOIIMTI BGK LHBP NYZ EA TV IQNOKL PHL NTVKT\n" +
                "VACPATWX, JMP I HU SWZQFC FVZ \"YW KESND.\" PB'D VYB LDAA BSM XMO\n" +
                "DAZP QCXKLEOUA LZOV'L WNF OZWN, QL'O TOIE EO LGJ'T YMLTVG FAEK\n" +
                "WYM. GPWJ WL AEIBBWZ TOQD XBWUASZ JLKU QF 2006, ET SWZSOL SO IM\n" +
                "EP EYCDZ BL VPMNQFC A UMH PKAZ BUUKEQYV KKOU. BSM CPS\n" +
                "BATQWG (GPAYH PA CMKTDU PHZE WP BZA MK4 IYL WL5 XWMPTJ), EKA\n" +
                "MJDLZ TVMZWWSPVR XBMKOUYM QZYU FAW AGAMC WX\n" +
                "YRFXEIXIDUSPA. HM NQVJ'T RVZE RWO HOUO EPO DSNIVCD ARI-2\n" +
                "NWRPIYBC EGQLK ZPUKQF OEJCCM. LCL ET'Z 2012, IYL CPS-512 ES ZBTTV\n" +
                "TGKKPVR OYWV.\n" +
                "AVLV HWBAW, JOUM ZN DPW OHH-3 KLVNQVWTLA TA CQYJIMQNIXBDU\n" +
                "BLBEMB. AGIE HZP NKALAR, ICE VYB GNDLZD WP USCNPBFLO NSOTLZ.\n" +
                "DWWM SNE ZULTVMJ EN OICLGIJA, BBB YWD WJZEYA ZN WIYJIACOM\n" +
                "CUSHLLZ. HPOV KDA-3 PA LVXWMJCLL, T'U QWAJG AW CMMWEIEUL\n" +
                "EPKB, MJLLAD BRM AIPYWGMWMFPS HZP KBQLECHT EW DPWER\n" +
                "HXATSKSPIVV, AMYXDA SAQNS GQLD TOM EZSMV WNK BCCO AZW-512.\n" +
                "AA TPICB XKR H ESQVM. A ZOU'B EPSVC JIZB TA QWAJG AW LVXWMJCL\n" +
                "\"VZ IGIJZ\"; I APTVU QL'O GVQYO DW HECR WYM. KVV KF APP NSDW\n" +
                "NETITVSVY, E DVV'E ZOIDHY OIGM K NSROYQEM. YN UKUYAP Q GIFP\n" +
                "SRMTV DW OEN, ICE BRIL'O OBB ZN ZMJOOUIW XBQVA, NVB QWB AGIE\n" +
                "VJUMMBARE YMLAYV. SJD DPTTO Q DEKL AZUO UGNE APLV YBZARZ, Q\n" +
                "EPSVC WNF EZCVL TA ORIJ. EOTD, IAFJP BRMJA'S VVP ZOIKKN UQDB\n" +
                "CPGQLK KSWYAW OKLQY. AUMAJ IZV'E REAL W HHAS NEVUPIVV, TB'C\n" +
                "BZA LHZRM-LTGYK JQAPOZ LDRLMQQCP SJD H UPKRIFEST BZ BEZF ET\n" +
                "PVEW K PSOH MCYKDQGJ. I APTVU BZA WVZWL KKLQASTJ VOMVO A\n" +
                "SICOO-JDKCR KTXRMJ, WNK QQ VSAL YHVWDMC ACAIU, EP'TV OWP OUM.";

        String messageSix = "FKDPD Fkd Pdslqgxcl sdprmd qd ylmdqd zdnh nxslwld xprmd zdr zd XYFFP,\n" +
                "nlphpvkxnld dolbhnxzd Pzhqbhnlwl zd Wxph bd Pdedglolnr bd Ndwled, Mdml Mrvhsk\n" +
                "Zdulred, nlnlpwdnd ddfkh nxmlgdqjdqbd, nzdql vxdod od Ndwled psbd kdolzhcl nxzd\n" +
                "dmhqgd bd xfkdjxcl pnxx, pzdndql. Nzd xsdqgh zd XYFFP, lphpwdnd Mdml Zdulred,\n" +
                "ddfkh pdud prmd nxwxpld gkdpdqd dolbrnxzd dphshzd bd nxzd Pzhqbhnlwl zd Wxph bd\n" +
                "Pdedglolnr bd Ndwled, nzdql pxgd zdnh xphlvkdpdolclnd nlvkhuld. Ndxol klcr\n" +
                "clolwrohzd nzd qbdndwl wridxwl qd ylrqjrcl zd fkdpd klfkr, lnlzd ql vlnx fkdfkh wdqjx\n" +
                "Mdml Zdulred dwrh pdrql bdnh nxkxvldqd qd Udvlpx lolbrshqghnhczd qd Exqjh Pddoxp\n" +
                "od Ndwled, dpedsr dolnrvrd nxwrndqd qd nxdfkzd nzd eddgkl bd pdrql bd zdqdqfkl.\n" +
                "Dlgkd, dphhqghohd nxvlvlwlcd nxzd, dwdnxzd Udlv zd Zdwdqcdqld, elod nxmdol glql,\n" +
                "ndelod dx ybdpd, klybr pdhqghohr bd vhulndol bdnh kdbdwdedjxd. Dnlcxqjxpcd mdqd\n" +
                "pmlql kdsd nzhqbh pnxwdqr zd ndpshql xolrkxgkxulzd qd pdhoix bd zdwx dpedr dolnlul\n" +
                "nxzd ql pnxezd dpedr kdmdzdkl nxxrqd, dphzdkdnlnlvkld nxzd dwdlhqghvkd qfkl nzd\n" +
                "xvwddudex qd vl nzd xglnwhwd ndpd dpedybr eddgkl bd zdwx zdphnxzd zdnlgdl.\n" +
                "Kdwd eddgd bd nxfkdjxolzd, plpl vlwdedglolnd, qlwdednl nxzd pwrwr zhqx bxoh bxoh\n" +
                "Mrkq Pdjxixol, dolvhpd qd nxrqjhcd; Qlwdlhqghvkd qfkl nzd xvwddudex, vlwdlhqghvkd\n" +
                "qfkl nzd xglnwhwd sdphnxzd qd zdwx zdqdcxqjxpcd, nzd vdedex qdcxqjxpcd xnzhol qd\n" +
                "xnzhol xwdednl xnzhol nzhol. Zdwx zdqdednl nxwlvkldqd. Qblh zdqd Fkdwr zdhohchql\n" +
                "xnzhol nzdped qlolsrnxzd zdclul qlolnxzd qdfkxqjd qj’rpeh, qlolnxzd qdndpxd pdclzd.";

        String vigenereKey = "KISWAHILI";
        Object vKey = (String) vigenereKey;

        int shift = 3;
        Object caesarKey = (int) shift;

        int shiftTwo = 17;
        Object caesarKeyTwo = (int) shiftTwo;

        //TODO: user input and such

        //instantiate the factory //TODO: make singleton
        Factory cipherFactory = new Factory();

        //create instance of caesar cipher
        Cipher caesarCipher = cipherFactory.getCipher("caesar");
        //create instance of vigenre cipher
        Cipher vigenereCipher = cipherFactory.getCipher("vigenere");

        //call the decrypt method on the caesar cipher passing the message and shift value
        System.out.println("Exercise one: \n" + caesarCipher.decrypt(message, caesarKey));

        //call the brute force method to run every shift value on the second message message
        //System.out.println("\n Exercise two: \n" + caesarCipher.bruteForce(messageTwo));
        System.out.println("\n Exercise two: \n" + caesarCipher.decrypt(messageTwo, caesarKeyTwo));

        //call decrypt on vigenere cipher
        System.out.println("\n Exercise three: \n" + vigenereCipher.decrypt(messageThree, vKey));

        System.out.println("\n Exercise four is a base64 Encryption  \n\n On Thursday Google announced that the next version of Android will have encryption enabled by default, protecting user data from anyone who lacks password access. It's a feature lauded by privacy advocates, and matches Apple's new iPhone policy. But Google's new policy isn't very helpful if you own an Android phone that won't be updated to Android L for a while (if ever). But let's not get too bent out of shape. We're here to share how you can encrypt your Android devices running the Jelly Bean and Kit Kat systems. That's right: Privacy features are already built in. You just need to turn them on.");

        System.out.println("\n Exercise five is a hex Encryption");

        //Swahili with a shift of 3
        //System.out.println("\n Exercise six:  \n" + caesarCipher.bruteForce(messageSix));
        System.out.println("\n Exercise six: \n" + caesarCipher.decrypt(messageSix, caesarKey));
    }
}
