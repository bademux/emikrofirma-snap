package a.a.a.c.f.c.b;

import a.a.a.c.f.c.c.PasswordFieldChanged;

public class FAB<_T extends PasswordFieldChanged> extends FAF<String> {
    protected _T GXE;

    public FAB(_T var1) {
        this.GXE = var1;
    }

    protected void IFV(String var1, String var2) {
        if (var2 != null && var2.length() > 0 && !var2.equals(var1)) {
            this.GXE.changedProperty().set(true);
        }

    }
}
