package a.a.a.c.d.c.a;

import a.a.a.c.d.c.EQS;
import a.a.a.c.e.a.k.a.EXF;

import java.math.BigInteger;

public class EQU implements EQS<String> {
    public static final int FXM = 26;
    public static final int FXN = 2;
    private static final BigInteger FXO = BigInteger.valueOf(97L);

    public EQU() {
    }

    public boolean HRC(String var1) {
        EXF.getInstance().ICO();

        boolean var2;
        try {
            var2 = HRE(var1);
        } finally {
            EXF.getInstance().ICP();
        }

        return var2;
    }

    public static boolean HRE(String var0) {
        EXF.getInstance().ICO();

        try {
            if (var0 == null) {
                boolean var16 = false;
                return var16;
            } else {
                String var1 = var0.replaceAll("\\s", "");
                int var2 = var1.length();
                if (var2 != 26 && var2 != 28) {
                    boolean var17 = false;
                    return var17;
                } else {
                    String var3 = null;
                    String var4 = null;
                    if (var2 == 26) {
                        var3 = "PL";
                        var4 = var1;
                    } else {
                        var3 = var1.substring(0, 2).toUpperCase();
                        var4 = var1.substring(2);
                    }

                    try {
                        new BigInteger(var4);
                    } catch (NumberFormatException var14) {
                        boolean var6 = false;
                        return var6;
                    }

                    int var5 = var3.charAt(0) - 55;
                    int var18 = var3.charAt(1) - 55;
                    String var7 = var4.substring(2) + var5 + var18 + var4.substring(0, 2);
                    BigInteger var8 = new BigInteger(var7);
                    BigInteger var9 = var8.mod(FXO);
                    boolean var10 = var9.equals(BigInteger.ONE);
                    return var10;
                }
            }
        } finally {
            EXF.getInstance().ICP();
        }
    }
}
