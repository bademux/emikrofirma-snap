package a.a.a.c.d.c.a;

import a.a.a.c.d.c.EQS;

public class EQT implements EQS<String> {
    public static final int FXJ = 9;
    public static final int FXK = 14;
    private static final int FXL = 11;

    public EQT() {
    }

    public boolean HRC(String var1) {

        boolean var2;
        var2 = HRD(var1);

        return var2;
    }

    public static boolean HRD(String var0) {

        boolean var1;
        if (var0 != null) {
            if (var0.length() != 9 && var0.length() != 14) {
                var1 = false;
                return var1;
            }

            try {
                Long.parseLong(var0);
            } catch (NumberFormatException var9) {
                boolean var2 = false;
                return var2;
            }

            int var3;
            int var4;
            boolean var5;
            int[] var11;
            int var12;
            boolean var13;
            if (var0.length() == 9) {
                var11 = new int[]{8, 9, 2, 3, 4, 5, 6, 7};
                var12 = 0;

                for (var3 = 0; var3 < 8; ++var3) {
                    var4 = Character.getNumericValue(var0.charAt(var3));
                    var12 += var4 * var11[var3];
                }

                var3 = var12 % 11;
                if (var3 >= 10) {
                    var3 %= 10;
                }

                var13 = var3 == Character.getNumericValue(var0.charAt(8));
                var5 = var13;
                return var5;
            }

            var11 = new int[]{2, 4, 8, 5, 0, 9, 7, 3, 6, 1, 2, 4, 8};
            var12 = 0;

            for (var3 = 0; var3 < 13; ++var3) {
                var4 = Character.getNumericValue(var0.charAt(var3));
                var12 += var4 * var11[var3];
            }

            var3 = var12 % 11;
            if (var3 >= 10) {
                var3 %= 10;
            }

            var13 = var3 == Character.getNumericValue(var0.charAt(13));
            var5 = var13;
            return var5;
        }

        var1 = false;

        return var1;
    }
}
