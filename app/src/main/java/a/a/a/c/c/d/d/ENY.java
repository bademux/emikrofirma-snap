package a.a.a.c.c.d.d;

import a.a.a.c.f.b.c.a.TaxReason;
import javafx.util.StringConverter;

public class ENY extends StringConverter<TaxReason> {
    public ENY() {
    }

    public TaxReason fromString(String var1) {
        TaxReason[] var2 = TaxReason.values();
        int var3 = var2.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            TaxReason var5 = var2[var4];
            if (var5.getDescription().equals(var1)) {
                return var5;
            }
        }

        return null;
    }

    public String toString(TaxReason var1) {
        return var1.getDescription();
    }
}
