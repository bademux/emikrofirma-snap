package a.a.a.c.d.e;

import a.a.a.c.d.e.b.QSA;
import a.a.a.c.d.e.b.QSB;
import a.a.a.c.d.e.b.QSD;
import a.a.a.c.d.e.b.QSE;
import a.a.a.c.f.b.c.a.CalculationMethodType;

public class QRY {
    public QRY() {
    }

    public static QRX getInvoiceCalculationMethod(CalculationMethodType var0, boolean var1) {
        if (var0 == CalculationMethodType.NET) {
            return new QSD(var1);
        } else {
            return var0 == CalculationMethodType.GROSS ? new QSA(var1) : null;
        }
    }

    public static QRX getReceiptCalculationMethod(CalculationMethodType var0) {
        if (var0 == CalculationMethodType.NET) {
            return new QSE();
        } else {
            return var0 == CalculationMethodType.GROSS ? new QSB() : null;
        }
    }
}
