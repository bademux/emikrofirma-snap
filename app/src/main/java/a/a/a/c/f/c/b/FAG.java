package a.a.a.c.f.c.b;

import a.a.a.c.d.c.a.EQU;
import a.a.a.c.f.c.c.TextFieldRequired;

public class FAG extends FAO<TextFieldRequired> {
    private final EQU GXI = new EQU();
    private volatile boolean GXJ = false;

    public FAG(TextFieldRequired var1) {
        super(var1);
    }

    protected void IFV(String var1, String var2) {

        if (var2 != null && var2.length() > 0) {
            String var3 = var2.replaceAll("\\s", "");
            if (!var3.matches("([A-Z]{0,2})?\\d{0,26}")) {
                this.GXJ = true;
                this.GXU.textProperty().set(var1);
            } else if (this.GXJ) {
                this.GXJ = false;
            } else {
                this.GXU.IEU().set(this.GXI.HRC(var2));
                super.IFV(var1, var2);
            }
        } else if (this.GXJ) {
            this.GXJ = false;
        } else {
            this.GXU.IEU().set(!this.GXU.IFB());
            super.IFV(var1, var2);
        }

    }
}
