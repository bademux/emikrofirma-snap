package a.a.a.c.d.e.b;

import a.a.a.c.d.e.EQY;
import a.a.a.c.d.e.QRX;
import a.a.a.c.f.a.f.a.IP;

public class QSE implements QRX<IP> {
    public QSE() {
    }

    public IP RIB(IP var1, IP var2) {
        boolean var3 = false;
        boolean var4 = false;
        if (var1 != null && var1 instanceof IP) {
            if (var2.getNet().compareTo(var1.getNet()) == 0 && var2.getTaxRate().compareTo(var1.getTaxRate()) == 0) {
                if (var2.getVat().compareTo(var1.getVat()) != 0) {
                    var4 = true;
                }
            } else {
                var3 = true;
            }
        }

        if (var3) {
            var2.getVat().setValue(EQY.getTaxValue(var2.getNet().getValue(), var2.DCI().getValue()));
        }

        if (var3 || var4) {
            if (var4) {
                var2.getGross().setValue(var2.getNet().getValue().add(var2.getVat().getValue()));
            } else {
                var2.getGross().setValue(EQY.getBrutValue(var2.getNet().getValue(), var2.DCI().getValue()));
            }
        }

        return var2;
    }
}
