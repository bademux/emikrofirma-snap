package a.a.a.c.d.a.b;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.g.b.FCW;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EPQ extends EPU {
    private static final String FTT = "^PL\\d{10}$|^\\d{10}$";
    private static final String FTU = "BE\\d{10,11}|BG\\d{9,10}|BG\\d{13}|CZ\\d{8,10}|DK\\d{10}|DK\\d{8}|DE\\d{11}|EE\\d{8}|EE\\d{11}|IE\\d{7}[a-zA-Z]{1,2}|EL\\d{9}|ES[\\dLKMXYZ]{1}\\d{7}[a-zA-Z]{1}|ES[ABCDEFGHJNPQRSUVW]{1}\\d{7}[\\da-zA-Z]{1}|FR[0123]{1}\\d{12}|FR\\d{9}|HR\\d{11}|IT[a-zA-Z]{6}\\d{2}[a-zA-Z]{1}\\d{2}[a-zA-Z]{1}\\d{3}[a-zA-Z]{1}|IT\\d{11}|CY\\d{8}[A-Z]{1}|LV\\d{11}|LT\\d{9}|LT\\d{11}|LU\\d{11}|LU\\d{13}|HU\\d{10,11}|MT\\d{7}[MGAPLHBZ]{1}|MT\\d{9}|NL\\d{9}|AT\\d{9}|PL\\d{10,11}|PT\\d{9}|RO\\d{2,10}|RO\\d{13}|SI\\d{8}|SK\\d{9,10}|FI\\d{6}[+-A]{1}\\d{3}[\\da-zA-Z]{1}|FI\\d{7}-\\d{1}|SE((16)|(19)|(20)){0,1}\\d{10}|UK\\d{10}|UK[a-zA-Z]{2}\\d{6}[ABCD ]{1}";

    public EPQ() {
        EXF.getInstance().ICQ();
    }

    public boolean AIBY(String var1) {
        EXF.getInstance().ICO();

        boolean var2;
        try {
            if (var1 != null) {
                if (!"brak".equalsIgnoreCase(var1) && !FCW.getInstance().getMessageForKey("micro.process.general.empty").equalsIgnoreCase(var1)) {
                    Pattern var8 = Pattern.compile("^PL\\d{10}$|^\\d{10}$");
                    Matcher var3 = var8.matcher(var1);
                    boolean var4;
                    if (!var3.matches()) {
                        EXF.getInstance().ICK("assuming other NIP");
                        var4 = this.HOT(var1);
                        return var4;
                    }

                    if (var1.length() == 10) {
                        EXF.getInstance().ICK("assuming standard PL NIP");
                        var4 = super.AIBY(var1);
                        return var4;
                    }

                    EXF.getInstance().ICK("assuming prefixed PL NIP");
                    var4 = super.AIBY(var1.substring(2));
                    return var4;
                }

                EXF.getInstance().ICK("missing but acceptable");
                var2 = true;
                return var2;
            }

            EXF.getInstance().ICK("NIP is null");
            var2 = false;
        } finally {
            EXF.getInstance().ICP();
        }

        return var2;
    }

    public boolean HOT(String var1) {
        EXF.getInstance().ICO();

        boolean var4;
        try {
            Pattern var2 = Pattern.compile("BE\\d{10,11}|BG\\d{9,10}|BG\\d{13}|CZ\\d{8,10}|DK\\d{10}|DK\\d{8}|DE\\d{11}|EE\\d{8}|EE\\d{11}|IE\\d{7}[a-zA-Z]{1,2}|EL\\d{9}|ES[\\dLKMXYZ]{1}\\d{7}[a-zA-Z]{1}|ES[ABCDEFGHJNPQRSUVW]{1}\\d{7}[\\da-zA-Z]{1}|FR[0123]{1}\\d{12}|FR\\d{9}|HR\\d{11}|IT[a-zA-Z]{6}\\d{2}[a-zA-Z]{1}\\d{2}[a-zA-Z]{1}\\d{3}[a-zA-Z]{1}|IT\\d{11}|CY\\d{8}[A-Z]{1}|LV\\d{11}|LT\\d{9}|LT\\d{11}|LU\\d{11}|LU\\d{13}|HU\\d{10,11}|MT\\d{7}[MGAPLHBZ]{1}|MT\\d{9}|NL\\d{9}|AT\\d{9}|PL\\d{10,11}|PT\\d{9}|RO\\d{2,10}|RO\\d{13}|SI\\d{8}|SK\\d{9,10}|FI\\d{6}[+-A]{1}\\d{3}[\\da-zA-Z]{1}|FI\\d{7}-\\d{1}|SE((16)|(19)|(20)){0,1}\\d{10}|UK\\d{10}|UK[a-zA-Z]{2}\\d{6}[ABCD ]{1}");
            Matcher var3 = var2.matcher(var1);
            var4 = var3.matches();
        } finally {
            EXF.getInstance().ICP();
        }

        return var4;
    }
}
