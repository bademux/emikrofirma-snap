package a.a.a.c.f.c.b;

import a.a.a.c.f.b.QST;
import a.a.a.c.f.c.c.ComboBoxRequired;

public class QRW extends FAE<QST, ComboBoxRequired<QST>> {
    public QRW(ComboBoxRequired<QST> var1) {
        super(var1);
    }

    protected void IFV(QST var1, QST var2) {

        if (var2 != null && var2.getTitle(1) != null && var2.getTitle(1).length() > 0) {
            this.GXH.IEU().set(true);
            super.IFV(var1, var2);
        } else {
            this.GXH.IEU().set(false);
            super.IFV(var1, var2);
        }

    }
}
