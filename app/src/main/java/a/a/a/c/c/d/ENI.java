package a.a.a.c.c.d;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import static com.github.bademux.emk.utils.LocaleUtils.LOCALE;

public class ENI {
    public ENI() {
    }

    public static DecimalFormat get() {
        DecimalFormat var0 = (DecimalFormat) DecimalFormat.getInstance(LOCALE);
        var0.setParseBigDecimal(true);
        var0.setDecimalSeparatorAlwaysShown(true);
        var0.setMinimumFractionDigits(2);
        var0.setMaximumFractionDigits(10);
        var0.setRoundingMode(RoundingMode.HALF_UP);
        return var0;
    }
}
