package a.a.a.c.c.d.d;

import a.a.a.c.f.b.c.a.KM;
import javafx.util.StringConverter;

public class ENY extends StringConverter<KM> {
    public ENY() {
    }

    public KM fromString(String var1) {
        KM[] var2 = KM.values();
        int var3 = var2.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            KM var5 = var2[var4];
            if (var5.getDescription().equals(var1)) {
                return var5;
            }
        }

        return null;
    }

    public String toString(KM var1) {
        return var1.getDescription();
    }
}
