package a.a.a.c.f.c.c.a;

import a.a.a.c.f.c.c.TextFieldValidated_Number;
import javafx.scene.control.TextFormatter;

import java.text.DecimalFormat;
import java.util.function.UnaryOperator;

public class UnaryOperator_Number implements UnaryOperator<TextFormatter.Change> {
    private final TextFieldValidated_Number HAB;

    public UnaryOperator_Number(TextFieldValidated_Number var1) {
        this.HAB = var1;
    }

    public TextFormatter.Change apply(TextFormatter.Change var1) {

        TextFormatter.Change var23;
        if (var1.isContentChange()) {
            String var2 = var1.getControlNewText();
            if (var2 != null && var2.length() > 0) {
                DecimalFormat var3 = this.HAB.getDecimalFormat();
                int var4 = this.HAB.getMaximumFractionDigits();
                boolean var5 = this.HAB.IFG();
                boolean var6 = this.HAB.RHT();
                int var7 = this.HAB.getMaxLength() > 0 ? this.HAB.getMaxLength() : 2147483647;
                boolean var8 = var4 > 0;
                String var9;
                if (var6) {
                    var9 = (var5 ? "^[\\" + var3.getNegativePrefix() + "]{1}" : "") + "[\\d]{0," + var7 + "}" + (var8 ? "([\\" + var3.getDecimalFormatSymbols().getDecimalSeparator() + "][\\d]{0," + var4 + "})?" : "") + "$";
                } else {
                    var9 = (var5 ? "^[\\" + var3.getNegativePrefix() + "]{0,1}" : "") + "[\\d]{0," + var7 + "}" + (var8 ? "([\\" + var3.getDecimalFormatSymbols().getDecimalSeparator() + "][\\d]{0," + var4 + "})?" : "") + "$";
                }

                String var10 = var2.replaceAll("[\\" + var3.getDecimalFormatSymbols().getGroupingSeparator() + "\\s ]", "");
                if (var10.matches(var9)) {
                    this.HAB.setChanged(true);

                    try {
                        double var11 = this.HAB.getMinimumValue();
                        double var13 = this.HAB.getMaximumValue();
                        Number var15 = var3.parse(var10);
                        double var16 = var15.doubleValue();
                        this.HAB.setValid(var16 >= var11 && var16 <= var13);
                    } catch (Exception var21) {
                        this.HAB.setValid(false);
                    }
                } else {
                    var1.setText(var1.getControlText());
                    var1.setRange(0, var1.getControlText().length());
                    var1.setCaretPosition(var1.getControlCaretPosition());
                    var1.setAnchor(var1.getControlAnchor());
                }
            } else {
                this.HAB.setChanged(true);
                this.HAB.setValid(false);
            }
        }

        var23 = var1;

        return var23;
    }
}
