package a.a.a.c.d.a.b;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.b.AHCB;

public class EPU implements AHCB<String> {
    protected static final int FUJ = 10;
    protected static final int FUK = 2;
    private static final int FUL = 11;

    public EPU() {
        EXF.getInstance().ICO();
        EXF.getInstance().ICP();
    }

    public boolean AIBY(String var1) {
        EXF.getInstance().ICO();

        boolean var2;
        try {
            if (var1 == null) {
                EXF.getInstance().ICK("NIP is null");
                var2 = false;
                return var2;
            }

            var2 = this.HOS(var1);
        } finally {
            EXF.getInstance().ICP();
        }

        return var2;
    }

    private boolean HOS(String var1) {
        EXF.getInstance().ICO();

        boolean var6;
        try {
            if (var1.length() != 10) {
                EXF.getInstance().ICK("NIP is of invalid length");
                boolean var12 = false;
                return var12;
            }

            try {
                Long.parseLong(var1);
            } catch (NumberFormatException var10) {
                EXF.getInstance().ICK("NIP is not a number");
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
                EXF.getInstance().ICK("NIP checksum is valid");
            } else {
                EXF.getInstance().ICK("NIP checksum is invalid");
            }

            var6 = var14;
        } finally {
            EXF.getInstance().ICP();
        }

        return var6;
    }

    public String getContextString(String var1) {
        EXF.getInstance().ICO();
        EXF.getInstance().ICK("value " + var1);

        String var2;
        try {
            var2 = var1;
        } finally {
            EXF.getInstance().ICP();
        }

        return var2;
    }
}
