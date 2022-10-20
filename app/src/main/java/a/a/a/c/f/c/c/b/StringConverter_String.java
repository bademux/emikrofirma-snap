package a.a.a.c.f.c.c.b;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.util.StringConverter;

public class StringConverter_String extends StringConverter<String> {
    BooleanProperty QVX;

    public StringConverter_String() {
        this.QVX = new SimpleBooleanProperty(true);
    }

    public StringConverter_String(BooleanProperty var1) {
        this.QVX = var1;
    }

    public String toString(String var1) {

        String var2;
        if (var1 != null) {
            if (this.QVX.get()) {
                var2 = var1.trim();
                return var2;
            }

            var2 = var1;
            return var2;
        }

        var2 = "";

        return var2;
    }

    public String fromString(String var1) {

        String var2;
        if (var1 == null) {
            var2 = "";
            return var2;
        }

        if (this.QVX.get()) {
            var2 = var1.trim();
            return var2;
        }

        var2 = var1;

        return var2;
    }
}
