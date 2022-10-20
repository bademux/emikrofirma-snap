package a.a.a.c.f.c.b;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.c.c.TextFieldRequired;

public class FAH extends FAO<TextFieldRequired> {
    private final String GXK;
    private final String GXL;
    private volatile boolean GXM = false;

    public FAH(String var1, String var2, TextFieldRequired var3) {
        super(var3);
        EXF.getInstance().ICO();

        try {
            this.GXK = var1;
            this.GXL = var2;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    protected void IFV(String var1, String var2) {
        EXF.getInstance().ICO();

        try {
            if (var2 != null && var2.length() > 0) {
                if ((this.GXU.IFF() == null || this.GXU.IFF().intValue() <= 0 || var2.length() <= this.GXU.IFF().intValue()) && var2.matches(this.GXL)) {
                    if (this.GXM) {
                        this.GXM = false;
                    } else {
                        this.GXU.IEU().set(var2.matches(this.GXK));
                        super.IFV(var1, var2);
                    }
                } else {
                    this.GXM = true;
                    this.GXU.textProperty().set(var1);
                }
            } else if (this.GXM) {
                this.GXM = false;
            } else {
                this.GXU.IEU().set(!this.GXU.IFB());
                super.IFV(var1, var2);
            }
        } finally {
            EXF.getInstance().ICP();
        }

    }
}
