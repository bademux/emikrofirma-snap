package a.a.a.c.f.c.b;

import a.a.a.c.d.c.a.EQV;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.c.c.TextFieldRequired;

public class FAT extends FAO<TextFieldRequired> {
    private volatile boolean GXY = false;

    public FAT(TextFieldRequired var1) {
        super(var1);
    }

    protected void IFV(String var1, String var2) {
        EXF.getInstance().ICO();

        try {
            if (var2 != null && var2.length() > 0) {
                if (!var2.matches("\\d{0,11}")) {
                    this.GXY = true;
                    this.GXU.textProperty().set(var1);
                } else if (this.GXY) {
                    this.GXY = false;
                } else {
                    this.GXU.IEU().set(EQV.HRF(var2));
                    super.IFV(var1, var2);
                }
            } else if (this.GXY) {
                this.GXY = false;
            } else {
                this.GXU.IEU().set(!this.GXU.IFB());
                super.IFV(var1, var2);
            }
        } finally {
            EXF.getInstance().ICP();
        }

    }
}
