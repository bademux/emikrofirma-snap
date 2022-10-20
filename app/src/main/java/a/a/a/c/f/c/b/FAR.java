package a.a.a.c.f.c.b;

import a.a.a.c.f.c.c.TextAreaChanged;

public class FAR<_T extends TextAreaChanged> extends FAF<String> {
    protected _T GXW;

    public FAR(_T var1) {
        this.GXW = var1;
    }

    protected void IFV(String var1, String var2) {

        if (var2 != null && !var2.equals(var1) || var1 != null && !var1.equals(var2)) {
            this.GXW.changedProperty().set(true);
        }

    }
}
