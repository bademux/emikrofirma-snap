package a.a.a.c.c.d.d;

import a.a.a.c.f.b.c.a.CalculationMethodType;
import javafx.util.StringConverter;

public class QUY extends StringConverter<CalculationMethodType> {
    public QUY() {
    }

    public CalculationMethodType fromString(String var1) {
        CalculationMethodType[] var2 = CalculationMethodType.values();
        int var3 = var2.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            CalculationMethodType var5 = var2[var4];
            if (var5.getDescription().equals(var1)) {
                return var5;
            }
        }

        return null;
    }

    public String toString(CalculationMethodType var1) {
        return var1.getDescription();
    }
}
