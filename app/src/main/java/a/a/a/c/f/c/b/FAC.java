package a.a.a.c.f.c.b;

import a.a.a.c.f.c.c.PasswordFieldValidated;

public class FAC extends FAB<PasswordFieldValidated> {
    private final int GXF;
    private volatile boolean GXG = false;

    public FAC(PasswordFieldValidated var1, int var2) {
        super(var1);
        this.GXF = var2;
    }

    protected void IFV(String var1, String var2) {
        if (var2 != null && var2.length() > 0 && !var2.equals(var1)) {
            boolean var3 = true;
            char[] var4 = var2.toCharArray();
            int var5 = var4.length;

            for (int var6 = 0; var6 < var5; ++var6) {
                char var7 = var4[var6];
                if (var7 < ' ' || var7 > '~') {
                    var3 = false;
                    break;
                }
            }

            if (!var3) {
                this.GXG = true;
                this.GXE.textProperty().set(var1);
            } else {
                this.GXE.validProperty().set(var3 && var2.length() >= this.GXF);
                if (this.GXG) {
                    this.GXG = false;
                } else {
                    super.IFV(var1, var2);
                }
            }
        } else {
            this.GXE.validProperty().set(false);
        }

    }
}
