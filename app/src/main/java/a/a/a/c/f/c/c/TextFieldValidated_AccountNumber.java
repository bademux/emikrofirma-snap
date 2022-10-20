package a.a.a.c.f.c.c;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.c.b.FAG;
import javafx.scene.control.TextFormatter;
import javafx.util.StringConverter;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class TextFieldValidated_AccountNumber extends TextFieldRequired {
    public TextFieldValidated_AccountNumber() {
        this("");
    }

    public TextFieldValidated_AccountNumber(String var1) {
        super(var1);
        this.IFW();
    }

    private void IFW() {
        this.setTextFormatter(new TextFormatter(new StringConverterAcc()));
        this.IEU().set(false);
        this.textProperty().removeListener(this.GYR);
        this.textProperty().removeListener(this.GYY);
        this.textProperty().addListener(new FAG(this));
    }

    private class StringConverterAcc extends StringConverter<String> {
        private final MaskFormatter HAI;
        private final MaskFormatter HAJ;

        public StringConverterAcc() {
            EXF.getInstance().ICO();

            try {
                this.HAI = new MaskFormatter("## #### #### #### #### #### ####");
                this.HAI.setValueContainsLiteralCharacters(false);
                this.HAJ = new MaskFormatter("UU ## #### #### #### #### #### ####");
                this.HAJ.setValueContainsLiteralCharacters(false);
            } catch (ParseException var6) {
                EXF.getInstance().ICA(var6);
                throw new FFI(var6);
            } finally {
                EXF.getInstance().ICP();
            }

        }

        public String toString(String var1) {
            EXF.getInstance().ICO();

            String var3;
            try {
                String var2;
                if (var1 == null) {
                    var2 = "";
                    return var2;
                }

                var2 = var1.replaceAll("\\s", "");

                try {
                    var3 = this.HAI.valueToString(var2).trim();
                } catch (ParseException var9) {
                    EXF.getInstance().ICI(var9);
                    String var4 = this.HAJ.valueToString(var2).trim();
                    return var4;
                }
            } catch (ParseException var10) {
                EXF.getInstance().ICA(var10);
                throw new FFI(var10);
            } finally {
                EXF.getInstance().ICP();
            }

            return var3;
        }

        public String fromString(String var1) {
            EXF.getInstance().ICO();

            try {
                String var2;
                if (var1 != null) {
                    var2 = var1.replaceAll("\\s", "");
                    if (var2.length() > 0) {
                        String var3 = var2;
                        return var3;
                    }
                }

                var2 = null;
                return var2;
            } finally {
                EXF.getInstance().ICP();
            }
        }
    }
}
