package a.a.a.c.c.d;

import a.a.a.c.e.a.j.EXC;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class ENI {
    public ENI() {
    }

    public static DecimalFormat get() {
        DecimalFormat var0 = (DecimalFormat) DecimalFormat.getInstance(EXC.getInstance().getCurrentLocale());
        var0.setParseBigDecimal(true);
        var0.setDecimalSeparatorAlwaysShown(true);
        var0.setMinimumFractionDigits(2);
        var0.setMaximumFractionDigits(10);
        var0.setRoundingMode(RoundingMode.HALF_UP);
        return var0;
    }
}
