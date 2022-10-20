package a.a.a.c.d.a.b;

import a.a.a.c.f.a.b.CustomActionClass;

public class EPU implements CustomActionClass<String> {
    protected static final int FUJ = 10;
    protected static final int FUK = 2;
    private static final int FUL = 11;

    public EPU() {

    }

    public boolean AIBY(String var1) {

        boolean var2;
        if (var1 == null) {
            org.slf4j.LoggerFactory.getLogger(getClass()).debug("NIP is null");
            var2 = false;
            return var2;
        }

        var2 = this.HOS(var1);

        return var2;
    }

    private boolean HOS(String var1) {

        boolean var6;
        if (var1.length() != 10) {
            org.slf4j.LoggerFactory.getLogger(getClass()).debug("NIP is of invalid length");
            boolean var12 = false;
            return var12;
        }

        try {
            Long.parseLong(var1);
        } catch (NumberFormatException var10) {
            org.slf4j.LoggerFactory.getLogger(getClass()).debug("NIP is not a number");
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
        if (var14) {
            org.slf4j.LoggerFactory.getLogger(getClass()).debug("NIP checksum is valid");
        } else {
            org.slf4j.LoggerFactory.getLogger(getClass()).debug("NIP checksum is invalid");
        }

        var6 = var14;

        return var6;
    }

    public String getContextString(String var1) {

        org.slf4j.LoggerFactory.getLogger(getClass()).debug("value " + var1);

        String var2;
        var2 = var1;

        return var2;
    }
}
