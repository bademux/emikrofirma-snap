package a.a.a.c.c.d.d;

import a.a.a.c.f.b.c.a.TaxRate;
import javafx.util.StringConverter;

public class ENX extends StringConverter<TaxRate> {
    public ENX() {
    }

    public TaxRate fromString(String var1) {
        TaxRate[] var2 = TaxRate.values();
        int var3 = var2.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            TaxRate var5 = var2[var4];
            if (var5.getDescription().equals(var1)) {
                return var5;
            }
        }

        return null;
    }

    public String toString(TaxRate var1) {
        return var1.getDescription();
    }
}
