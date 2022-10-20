package a.a.a.c.f.c.b;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.b.QST;
import a.a.a.c.f.c.c.ComboBoxRequired;

public class FAD<_A, _B extends ComboBoxRequired<_A>> extends FAE<_A, _B> {
    private int QVP;

    public FAD(_B var1) {
        super(var1);
    }

    public FAD(_B var1, int var2) {
        super(var1);
        this.QVP = var2;
    }

    protected void IFV(_A var1, _A var2) {
        EXF.getInstance().ICO();

        try {
            if (var2 != null) {
                if (var2 instanceof String) {
                    String var3 = (String) var2;
                    if (var3.length() == 0) {
                        this.GXH.IEU().set(!this.GXH.IFB());
                    } else {
                        this.GXH.IEU().set(true);
                    }
                } else if (var2 instanceof QST) {
                    QST var7 = (QST) var2;
                    if (var7.getTitle(this.QVP).length() == 0) {
                        this.GXH.IEU().set(!this.GXH.IFB());
                    } else {
                        this.GXH.IEU().set(true);
                    }
                } else {
                    this.GXH.IEU().set(true);
                }
            } else {
                this.GXH.IEU().set(!this.GXH.IFB());
            }

            super.IFV(var1, var2);
        } finally {
            EXF.getInstance().ICP();
        }

    }
}
