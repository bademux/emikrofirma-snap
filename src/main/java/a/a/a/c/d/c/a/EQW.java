package a.a.a.c.d.c.a;

import a.a.a.c.d.c.EQS;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.g.b.FCW;

public class EQW implements EQS<String> {
    public static final int FXR = 10;
    public static final int FXS = 2;
    private static final int FXT = 11;
    private final String FXU = FCW.getInstance().getMessageForKey("micro.process.general.nip.null");

    public EQW() {
    }

    public boolean HRC(String var1) {
        EXF.getInstance().ICO();

        try {
            boolean var12;
            if (var1 == null) {
                var12 = false;
                return var12;
            } else if (this.FXU.equalsIgnoreCase(var1)) {
                EXF.getInstance().ICK("missing but acceptable");
                var12 = true;
                return var12;
            } else if (var1.length() != 10) {
                var12 = false;
                return var12;
            } else {
                try {
                    Long.parseLong(var1);
                } catch (NumberFormatException var10) {
                    boolean var3 = false;
                    return var3;
                }

                int[] var2 = new int[]{6, 5, 7, 2, 3, 4, 5, 6, 7};
                int var13 = 0;

                int var4;
                for (var4 = 0; var4 < 9; ++var4) {
                    int var5 = Character.getNumericValue(var1.charAt(var4));
                    var13 += var5 * var2[var4];
                }

                var4 = var13 % 11;
                boolean var14 = var4 == Character.getNumericValue(var1.charAt(9));
                boolean var6 = var14;
                return var6;
            }
        } finally {
            EXF.getInstance().ICP();
        }
    }

    public static boolean HRG(String var0) {
        EXF.getInstance().ICO();

        boolean var1;
        try {
            var1 = (new EQW()).HRC(var0);
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }
}
