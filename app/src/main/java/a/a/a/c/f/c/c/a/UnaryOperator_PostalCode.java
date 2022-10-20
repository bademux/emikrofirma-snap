package a.a.a.c.f.c.c.a;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.c.c.TextFieldValidated_PostalCode;
import javafx.scene.control.TextFormatter;

import java.util.function.UnaryOperator;

public class UnaryOperator_PostalCode implements UnaryOperator<TextFormatter.Change> {
    private final TextFieldValidated_PostalCode GZY;

    public UnaryOperator_PostalCode(TextFieldValidated_PostalCode var1) {
        this.GZY = var1;
    }

    public TextFormatter.Change apply(TextFormatter.Change var1) {
        EXF.getInstance().ICO();

        TextFormatter.Change var9;
        try {
            if (var1.isContentChange()) {
                String var2 = var1.getControlNewText();
                if (var2 != null && var2.length() > 0) {
                    String var3 = "(\\d{0,2})|(\\d{2}[-]?\\d{0,3})";
                    String var4 = "^\\d{2}\\d{3}$";
                    String var5 = var2.replaceAll("-", "");
                    if (var5.matches(var3)) {
                        this.GZY.setChanged(true);
                        this.GZY.setValid(var5.matches(var4));
                    } else {
                        var1.setText(var1.getControlText());
                        var1.setRange(0, var1.getControlText().length());
                        var1.setCaretPosition(var1.getControlCaretPosition());
                        var1.setAnchor(var1.getControlAnchor());
                    }
                } else {
                    this.GZY.setChanged(true);
                    this.GZY.setValid(false);
                }
            }

            var9 = var1;
        } finally {
            EXF.getInstance().ICP();
        }

        return var9;
    }
}
