package a.a.a.c.c.d.m;

import a.a.a.c.f.b.c.a.TaxOffice;
import javafx.scene.control.ComboBox;
import javafx.util.StringConverter;

public class QKL extends StringConverter<TaxOffice> {
    private final ComboBox<TaxOffice> QNO;

    public QKL(ComboBox<TaxOffice> var1) {
        this.QNO = var1;
    }

    public String toString(TaxOffice var1) {
        return var1 != null ? var1.getDescription() : null;
    }

    public TaxOffice fromString(String var1) {
        TaxOffice[] var2 = TaxOffice.DEO(var1);
        if (var2 != null && var2.length > 0) {
            TaxOffice[] var3 = var2;
            int var4 = var2.length;

            for (int var5 = 0; var5 < var4; ++var5) {
                TaxOffice var6 = var3[var5];
                if (var6.getDescription().equals(var1)) {
                    return var6;
                }
            }

            return var2[0];
        } else {
            QKM.setupComboBoxValues(this.QNO, null, false);
            return null;
        }
    }
}
