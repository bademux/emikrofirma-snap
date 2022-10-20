package a.a.a.c.f.c.c.b;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.k.a.EXF;
import javafx.util.StringConverter;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class StringConverter_PostalCode extends StringConverter<String> {
    private final MaskFormatter HAN;

    public StringConverter_PostalCode() {
        EXF.getInstance().ICO();

        try {
            this.HAN = new MaskFormatter("##-###");
            this.HAN.setValueContainsLiteralCharacters(false);
        } catch (ParseException var5) {
            EXF.getInstance().ICA(var5);
            throw new FFI(var5);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public String toString(String var1) {
        EXF.getInstance().ICO();

        String var3;
        try {
            String var2;
            if (var1 == null || var1.length() <= 0) {
                var2 = "";
                return var2;
            }

            var2 = var1.replaceAll("-", "");
            if (var2.trim().length() != 5) {
                var3 = var1.trim();
                return var3;
            }

            var3 = this.HAN.valueToString(var2.trim());
        } catch (ParseException var7) {
            EXF.getInstance().ICA(var7);
            throw new FFI(var7);
        } finally {
            EXF.getInstance().ICP();
        }

        return var3;
    }

    public String fromString(String var1) {
        EXF.getInstance().ICO();

        String var2;
        try {
            if (var1 != null) {
                var2 = var1.replaceAll("-", "");
                if (var2.length() > 0) {
                    String var3 = var2;
                    return var3;
                }
            }

            var2 = "";
        } finally {
            EXF.getInstance().ICP();
        }

        return var2;
    }
}
