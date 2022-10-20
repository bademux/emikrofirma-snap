package a.a.a.c.d.e.b;

import a.a.a.c.d.e.EQY;
import a.a.a.c.d.e.QRX;
import a.a.a.c.f.a.e.InvoiceElement;

import java.math.BigDecimal;

public class QRZ implements QRX<InvoiceElement> {
    public QRZ() {
    }

    public InvoiceElement RIB(InvoiceElement var1, InvoiceElement var2) {
        boolean var3 = false;
        if (var1 != null) {
            if (var2.DBK().compareTo(var1.DBK()) != 0 || var2.DBL().compareTo(var1.DBL()) != 0) {
                var3 = true;
            }
        } else {
            var3 = true;
        }

        if (var3) {
            BigDecimal var4 = EQY.HRI(var2.DBK().getValue(), var2.DBL().getValue());
            var2.DBM().setValue(var4);
        }

        return var2;
    }
}
