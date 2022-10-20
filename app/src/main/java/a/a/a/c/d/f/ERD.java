package a.a.a.c.d.f;

import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.b.c.Amount;

import java.math.BigDecimal;

public class ERD {
    public ERD() {
    }

    public static ValueContainer2<Amount, Amount> HRV(ValueContainer2<Amount, Amount> var0, ValueContainer2<Amount, Amount> var1) {
        BigDecimal var2 = BigDecimal.ZERO;
        BigDecimal var3 = BigDecimal.ZERO;
        BigDecimal var4 = BigDecimal.ZERO;
        BigDecimal var5 = BigDecimal.ZERO;
        if (var0 != null) {
            if (var0.getFirstValue() != null && var0.getFirstValue().getValue() != null) {
                var2 = var0.getFirstValue().getValue();
            }

            if (var0.getSecondValue() != null && var0.getSecondValue().getValue() != null) {
                var3 = var0.getSecondValue().getValue();
            }
        }

        if (var1 != null) {
            if (var1.getFirstValue() != null && var1.getFirstValue().getValue() != null) {
                var4 = var1.getFirstValue().getValue();
            }

            if (var1.getSecondValue() != null && var1.getSecondValue().getValue() != null) {
                var5 = var1.getSecondValue().getValue();
            }
        }

        return new ValueContainer2(new Amount(var2.add(var4)), new Amount(var3.add(var5)));
    }
}
