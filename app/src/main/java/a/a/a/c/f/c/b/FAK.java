package a.a.a.c.f.c.b;

import a.a.a.c.f.c.c.TextFieldRequired;

public class FAK<_T extends TextFieldRequired> extends FAO<_T> {
    private volatile boolean GXR = false;

    public FAK(_T var1) {
        super(var1);
    }

    protected void IFV(String var1, String var2) {

        if (var2 != null && var2.length() > 0) {
            if (this.GXU.IFF() != null && this.GXU.IFF().intValue() > 0 && var2.length() > this.GXU.IFF().intValue()) {
                this.GXR = true;
                this.GXU.textProperty().set(var1);
            } else if (this.GXR) {
                this.GXR = false;
            } else {
                this.GXU.IEU().set(true);
                super.IFV(var1, var2);
            }
        } else if (this.GXR) {
            this.GXR = false;
        } else {
            this.GXU.IEU().set(!this.GXU.IFB());
            super.IFV(var1, var2);
        }

    }
}
