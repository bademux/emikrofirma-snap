package a.a.a.c.c.d.d;

import a.a.a.c.f.b.c.a.QSV;
import javafx.util.StringConverter;

public class QUY extends StringConverter<QSV> {
    public QUY() {
    }

    public QSV fromString(String var1) {
        QSV[] var2 = QSV.values();
        int var3 = var2.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            QSV var5 = var2[var4];
            if (var5.getDescription().equals(var1)) {
                return var5;
            }
        }

        return null;
    }

    public String toString(QSV var1) {
        return var1.getDescription();
    }
}
