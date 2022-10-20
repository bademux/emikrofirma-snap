package a.a.a.c.d.e;

import a.a.a.c.f.b.c.a.TaxRate;

import java.math.BigDecimal;

public class EQY {
    public static int FYD = 2;
    public static int FYE = 4;

    public EQY() {
    }

    public static BigDecimal getBrutValue(BigDecimal var0, TaxRate var1, boolean var2) {
        if (var0 != null && var1 != null) {
            BigDecimal var3 = BigDecimal.ZERO;
            if (!var1.DEQ() || var2) {
                var3 = var1.getRate().divide(new BigDecimal(100));
            }

            return var0.add(var0.multiply(var3)).setScale(FYD, FYE);
        } else {
            return BigDecimal.ZERO;
        }
    }

    public static BigDecimal getBrutValue(BigDecimal var0, TaxRate var1) {
        return getBrutValue(var0, var1, false);
    }

    public static BigDecimal getTaxValue(BigDecimal var0, TaxRate var1, boolean var2) {
        if (var0 != null && var1 != null) {
            BigDecimal var3 = BigDecimal.ZERO;
            if (!var1.DEQ() || var2) {
                var3 = var1.getRate().divide(new BigDecimal(100)).setScale(FYD);
            }

            return var0.multiply(var3).setScale(FYD, FYE);
        } else {
            return BigDecimal.ZERO;
        }
    }

    public static BigDecimal getTaxValue(BigDecimal var0, TaxRate var1) {
        return getTaxValue(var0, var1, false);
    }

    public static BigDecimal getNetValue(BigDecimal var0, BigDecimal var1) {
        return var0 != null && var1 != null ? var0.multiply(var1).setScale(FYD, FYE) : BigDecimal.ZERO;
    }

    public static BigDecimal HRH(BigDecimal var0, BigDecimal var1) {
        return var0 != null && var1 != null ? var0.multiply(var1).setScale(FYD, FYE) : BigDecimal.ZERO;
    }

    public static BigDecimal QOK(BigDecimal var0, BigDecimal var1) {
        if (var0 != null && var1 != null) {
            if (var1 == BigDecimal.ZERO) {
                throw new IllegalArgumentException("Divide by zero");
            } else {
                return var0.divide(var1, FYD, FYE).setScale(FYD, FYE);
            }
        } else {
            return BigDecimal.ZERO;
        }
    }

    public static BigDecimal HRI(BigDecimal var0, BigDecimal var1) {
        if (var0 == null && var1 == null) {
            return BigDecimal.ZERO;
        } else if (var0 == null) {
            return var1;
        } else {
            return var1 == null ? var0 : var0.add(var1).setScale(FYD, FYE);
        }
    }

    public static BigDecimal HRJ(BigDecimal var0, BigDecimal var1) {
        return var0 != null && var1 != null ? var0.subtract(var1).setScale(FYD, FYE) : BigDecimal.ZERO;
    }
}
