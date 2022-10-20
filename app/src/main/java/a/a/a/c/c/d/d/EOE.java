package a.a.a.c.c.d.d;

import a.a.a.c.f.b.c.a.KI;
import javafx.util.StringConverter;

public class EOE extends StringConverter<KI> {
    public EOE() {
    }

    public KI fromString(String var1) {
        KI[] var2 = KI.values();
        int var3 = var2.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            KI var5 = var2[var4];
            if (var5.getDescription().equals(var1)) {
                return var5;
            }
        }

        return null;
    }

    public String toString(KI var1) {
        return var1.getDescription();
    }
}
