package a.a.a.c.d.e.b;

import a.a.a.c.d.e.EQY;
import a.a.a.c.d.e.QRX;
import a.a.a.c.f.a.e.InvoiceElement;
import a.a.a.c.f.b.c.a.QSV;

import java.math.BigDecimal;

public class QSA implements QRX<InvoiceElement> {
    protected final boolean QWG;

    public QSA(boolean var1) {
        this.QWG = var1;
    }

    public InvoiceElement RIB(InvoiceElement var1, InvoiceElement var2) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        if (var1 != null) {
            if (var2.DBG().compareTo(var1.DBG()) == 0 && var2.RIF().compareTo(var1.RIF()) == 0 && var2.DBN().compareTo(var1.DBN()) == 0) {
                if (var2.DBM().compareTo(var1.DBM()) != 0) {
                    var4 = true;
                    var3 = true;
                } else if (var2.DBL().compareTo(var1.DBL()) != 0) {
                    var3 = true;
                }
            } else {
                var5 = true;
                var4 = true;
                var3 = true;
            }
        } else {
            var5 = true;
            var4 = true;
            var3 = true;
        }

        BigDecimal var6;
        if (var5) {
            var6 = EQY.HRH(var2.RIF().getValue(), var2.DBG().getValue());
            var2.DBM().setValue(var6);
        }

        if (var4) {
            var6 = BigDecimal.ZERO;
            if (!var2.DBN().getValue().DEQ() || !this.QWG) {
                var6 = var2.DBN().getValue().getRate().divide(new BigDecimal(100)).setScale(EQY.FYD);
            }

            BigDecimal var7 = EQY.HRH(var2.DBM().getValue(), var6);
            BigDecimal var8 = EQY.HRI(new BigDecimal(1), var6);
            BigDecimal var9 = EQY.QOK(var7, var8);
            var2.DBL().setValue(var9);
        }

        if (var3) {
            var6 = EQY.HRJ(var2.DBM().getValue(), var2.DBL().getValue());
            var2.DBK().setValue(var6);
        }

        var2.RIG().setValue(QSV.GROSS);
        var2.DBI().setValue(EQY.QOK(var2.DBK().getValue(), var2.DBG().getValue()));
        return var2;
    }
}
