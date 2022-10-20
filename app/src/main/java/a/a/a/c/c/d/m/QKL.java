package a.a.a.c.c.d.m;

import a.a.a.c.f.b.c.a.KK;
import javafx.scene.control.ComboBox;
import javafx.util.StringConverter;

public class QKL extends StringConverter<KK> {
    private final ComboBox<KK> QNO;

    public QKL(ComboBox<KK> var1) {
        this.QNO = var1;
    }

    public String toString(KK var1) {
        return var1 != null ? var1.getDescription() : null;
    }

    public KK fromString(String var1) {
        KK[] var2 = KK.DEO(var1);
        if (var2 != null && var2.length > 0) {
            KK[] var3 = var2;
            int var4 = var2.length;

            for (int var5 = 0; var5 < var4; ++var5) {
                KK var6 = var3[var5];
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
