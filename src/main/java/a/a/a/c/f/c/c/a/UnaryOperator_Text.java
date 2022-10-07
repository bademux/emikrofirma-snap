package a.a.a.c.f.c.c.a;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.g.a.FCR;
import a.a.a.c.g.b.FCW;
import javafx.beans.property.IntegerProperty;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;

import java.util.function.UnaryOperator;

public class UnaryOperator_Text implements UnaryOperator<TextFormatter.Change> {
    private final TextField GZZ;
    private final IntegerProperty HAA;

    public UnaryOperator_Text(TextField var1, IntegerProperty var2) {
        this.GZZ = var1;
        this.HAA = var2;
    }

    public TextFormatter.Change apply(TextFormatter.Change var1) {
        EXF.getInstance().ICO();

        TextFormatter.Change var7;
        try {
            if (var1.isContentChange()) {
                String var2 = var1.getControlNewText();
                if (var2 != null && var2.length() > 0) {
                    int var3 = this.HAA != null && this.HAA.get() > 0 ? this.HAA.get() : 2147483647;
                    if (var2.length() > var3) {
                        FCR.IGE(FCW.getInstance().getMessageForKey("micro.dialog.info.title"), FCW.getInstance().getMessageForKey("micro.dialog.info.textfield.header"), FCW.getInstance().getMessageForKey("micro.dialog.info.textfield.content") + " " + var3, false);
                    }

                    if (this.GZZ.getText() != null && this.GZZ.getText().length() > var3 || var2.length() > var3) {
                        var1.setText(var1.getControlText());
                        var1.setRange(0, var1.getControlText().length());
                        var1.setCaretPosition(var1.getControlCaretPosition());
                        var1.setAnchor(var1.getControlAnchor());
                    }
                }
            }

            var7 = var1;
        } finally {
            EXF.getInstance().ICP();
        }

        return var7;
    }
}
