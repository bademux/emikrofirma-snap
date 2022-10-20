package a.a.a.c.d.e.b;

import a.a.a.c.d.e.EQY;
import a.a.a.c.d.e.QRX;
import a.a.a.c.f.a.n.QSH;
import a.a.a.c.f.b.c.a.QSV;

import java.math.BigDecimal;

public class QSC implements QRX<QSH> {
    public QSC() {
    }

    public QSH RIB(QSH var1, QSH var2) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        if (var1 != null) {
            if (var2.RJE().compareTo(var1.RJE()) == 0 && var2.RJH().compareTo(var1.RJH()) == 0) {
                if (var2.RJE().compareTo(var1.RJE()) != 0) {
                    var4 = true;
                    var5 = true;
                } else if (var2.RJF().compareTo(var1.RJF()) != 0) {
                    var5 = true;
                }
            } else {
                var3 = true;
                var4 = true;
                var5 = true;
            }
        } else {
            var3 = true;
            var4 = true;
            var5 = true;
        }

        BigDecimal var6;
        if (var3) {
            var6 = var2.RJE().getValue();
            var2.RJE().setValue(var6);
        }

        if (var4) {
            var6 = BigDecimal.ZERO;
            if (!var2.RJH().getValue().DEQ()) {
                var6 = var2.RJH().getValue().getRate().divide(new BigDecimal(100)).setScale(EQY.FYD);
            }

            var6 = EQY.HRH(var2.RJE().getValue(), var6);
            var2.RJF().setValue(var6);
        }

        if (var5) {
            var6 = BigDecimal.ZERO;
            BigDecimal var7 = var2.RJE().getValue();
            if (!var2.RJH().getValue().DEQ()) {
                var6 = var2.RJF().getValue();
            }

            var6 = EQY.HRI(var7, var6);
            var2.RJG().setValue(var6);
        }

        var2.RJI().setValue(QSV.NET);
        return var2;
    }
}
