package a.a.a.c.f.c.b;

import a.a.a.c.d.c.a.EQW;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.c.c.TextFieldRequired;
import a.a.a.c.g.b.FCW;

public class FAI extends FAO<TextFieldRequired> {
    private final String GXN = FCW.getInstance().getMessageForKey("micro.process.general.nip.null");
    private volatile boolean GXO = false;

    public FAI(TextFieldRequired var1) {
        super(var1);
    }

    protected void IFV(String var1, String var2) {
        EXF.getInstance().ICO();

        try {
            if (var2 != null && var2.length() > 0) {
                if (!var2.matches("\\d{0,10}") && !this.GXN.equalsIgnoreCase(var2)) {
                    this.GXO = true;
                    this.GXU.textProperty().set(var1);
                } else if (this.GXO) {
                    this.GXO = false;
                } else {
                    this.GXU.IEU().set(EQW.HRG(var2));
                    super.IFV(var1, var2);
                }
            } else if (this.GXO) {
                this.GXO = false;
            } else {
                this.GXU.IEU().set(!this.GXU.IFB());
                super.IFV(var1, var2);
            }
        } finally {
            EXF.getInstance().ICP();
        }

    }
}
