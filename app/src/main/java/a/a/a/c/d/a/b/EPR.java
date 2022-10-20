package a.a.a.c.d.a.b;

import a.a.a.c.f.a.b.AHCB;

public class EPR implements AHCB<String> {
    private static final int FTV = 9;
    private static final int FTW = 11;

    public EPR() {
    }

    public boolean AIBY(String var1) {

        boolean var15;
        if (var1 == null || var1.length() != 9) {
            org.slf4j.LoggerFactory.getLogger(getClass()).debug("regon is null or of invalid length");
            boolean var12 = false;
            return var12;
        }

        try {
            Long.parseLong(var1);
        } catch (NumberFormatException var10) {
            org.slf4j.LoggerFactory.getLogger(getClass()).debug("regon is not a number");
            boolean var3 = false;
            return var3;
        }

        int[] var2 = new int[]{8, 9, 2, 3, 4, 5, 6, 7};
        int var13 = 0;

        int var4;
        for (var4 = 0; var4 < 8; ++var4) {
            int var5 = Character.getNumericValue(var1.charAt(var4));
            int var6 = var5 * var2[var4];
            var13 += var6;
        }

        var4 = var13 % 11;
        if (var4 == 10) {
            var4 = 0;
        }

        boolean var14 = var4 == Character.getNumericValue(var1.charAt(8));
        if (var14) {
            org.slf4j.LoggerFactory.getLogger(getClass()).debug("regon is valid");
        } else {
            org.slf4j.LoggerFactory.getLogger(getClass()).debug("regon checksum is invalid");
        }

        var15 = var14;

        return var15;
    }

    public String getContextString(String var1) {

        org.slf4j.LoggerFactory.getLogger(getClass()).debug("value " + var1);

        String var2;
        var2 = var1;

        return var2;
    }
}
