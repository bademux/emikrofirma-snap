package a.a.a.c.f.c.b;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.c.c.TextFieldChanged;

public class FAO<_T extends TextFieldChanged> extends FAF<String> {
    protected _T GXU;

    public FAO(_T var1) {
        this.GXU = var1;
    }

    protected void IFV(String var1, String var2) {
        EXF.getInstance().ICO();

        try {
            if (var2 != null && !var2.equals(var1) || var1 != null && !var1.equals(var2)) {
                this.GXU.changedProperty().set(true);
            }
        } finally {
            EXF.getInstance().ICP();
        }

    }
}
