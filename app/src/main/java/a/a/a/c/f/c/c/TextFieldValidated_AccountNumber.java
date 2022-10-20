package a.a.a.c.f.c.c;

import a.a.a.b.f.FFI;
import a.a.a.c.f.c.b.FAG;
import javafx.scene.control.TextFormatter;
import javafx.util.StringConverter;
import lombok.extern.slf4j.Slf4j;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

@Slf4j
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

            try {
                this.HAI = new MaskFormatter("## #### #### #### #### #### ####");
                this.HAI.setValueContainsLiteralCharacters(false);
                this.HAJ = new MaskFormatter("UU ## #### #### #### #### #### ####");
                this.HAJ.setValueContainsLiteralCharacters(false);
            } catch (ParseException var6) {
                log.error("Something bad happened", var6);
                throw new FFI(var6);
            }

        }

        public String toString(String var1) {

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
                } catch (ParseException e) {
                    log.warn("Something bad happened", e);
                    String var4 = this.HAJ.valueToString(var2).trim();
                    return var4;
                }
            } catch (ParseException e) {
                log.error("Something bad happened", e);
                throw new FFI(e);
            }

            return var3;
        }

        public String fromString(String var1) {

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
        }
    }
}
