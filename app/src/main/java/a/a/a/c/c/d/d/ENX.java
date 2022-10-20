package a.a.a.c.c.d.d;

import a.a.a.c.f.b.c.a.KL;
import javafx.util.StringConverter;

public class ENX extends StringConverter<KL> {
    public ENX() {
    }

    public KL fromString(String var1) {
        KL[] var2 = KL.values();
        int var3 = var2.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            KL var5 = var2[var4];
            if (var5.getDescription().equals(var1)) {
                return var5;
            }
        }

        return null;
    }

    public String toString(KL var1) {
        return var1.getDescription();
    }
}
