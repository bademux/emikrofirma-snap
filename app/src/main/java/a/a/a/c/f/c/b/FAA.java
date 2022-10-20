package a.a.a.c.f.c.b;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.c.c.CheckBoxChanged;

public class FAA<_T extends CheckBoxChanged> extends FAF<Boolean> {
    protected _T GXD;

    public FAA(_T var1) {
        this.GXD = var1;
    }

    protected void IFV(Boolean var1, Boolean var2) {
        EXF.getInstance().ICO();

        try {
            if (var2 != null && !var2.equals(var1) || var1 != null && !var1.equals(var2)) {
                this.GXD.changedProperty().set(true);
            }
        } finally {
            EXF.getInstance().ICP();
        }

    }
}
