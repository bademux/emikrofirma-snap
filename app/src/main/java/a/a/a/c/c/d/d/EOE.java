package a.a.a.c.c.d.d;

import a.a.a.c.f.b.c.a.PaymentMethod;
import javafx.util.StringConverter;

public class EOE extends StringConverter<PaymentMethod> {
    public EOE() {
    }

    public PaymentMethod fromString(String var1) {
        PaymentMethod[] var2 = PaymentMethod.values();
        int var3 = var2.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            PaymentMethod var5 = var2[var4];
            if (var5.getDescription().equals(var1)) {
                return var5;
            }
        }

        return null;
    }

    public String toString(PaymentMethod var1) {
        return var1.getDescription();
    }
}
