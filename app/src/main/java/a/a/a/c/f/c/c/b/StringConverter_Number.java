package a.a.a.c.f.c.c.b;

import a.a.a.c.f.c.c.TextFieldValidated_Number;
import javafx.util.StringConverter;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;

public class StringConverter_Number extends StringConverter<String> {
    private final TextFieldValidated_Number HAM;

    public StringConverter_Number(TextFieldValidated_Number var1) {
        this.HAM = var1;
    }

    public String toString(String var1) {

        String var3;
        try {
            DecimalFormat var2 = this.HAM.getDecimalFormat();
            int var13 = this.HAM.getMinimumFractionDigits();
            int var4 = this.HAM.getMaximumFractionDigits();
            var2.setMinimumFractionDigits(var13);
            var2.setMaximumFractionDigits(var4);
            String var5;
            if (var1 != null) {
                var5 = var1.replaceAll("[\\" + var2.getDecimalFormatSymbols().getGroupingSeparator() + "\\s ]", "");
                if (var2.getNegativePrefix().equals(var5)) {
                    String var14 = var2.getNegativePrefix();
                    return var14;
                }

                BigDecimal var6 = (BigDecimal) var2.parseObject(var5);
                this.HAM.setNumber(var6);
                String var7 = var2.format(var6);
                return var7;
            }

            var5 = "";
            return var5;
        } catch (ParseException var11) {
            var3 = "";
        }

        return var3;
    }

    public String fromString(String var1) {

        String var2;
        var2 = var1;

        return var2;
    }
}
