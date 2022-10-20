package a.a.a.c.c.d.d;

import a.a.a.c.f.b.c.a.TaxRate;

import java.math.BigDecimal;

public class EOL {
    public EOL() {
    }

    public TaxRate HNO(BigDecimal var1) {
        TaxRate[] var2 = TaxRate.values();
        int var3 = var2.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            TaxRate var5 = var2[var4];
            if (var5.getRate().equals(var1)) {
                return var5;
            }
        }

        return null;
    }

    public BigDecimal HNP(TaxRate var1) {
        return null == var1.getRate() ? BigDecimal.ZERO : var1.getRate();
    }
}
