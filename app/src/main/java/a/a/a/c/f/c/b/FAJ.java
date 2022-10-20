package a.a.a.c.f.c.b;

import a.a.a.c.d.c.a.EQW;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.b.QST;
import a.a.a.c.f.c.c.ComboBoxRequiredText;
import a.a.a.c.g.b.FCW;

public class FAJ extends FAE<QST, ComboBoxRequiredText<QST>> {
    private final String GXP = FCW.getInstance().getMessageForKey("micro.process.general.nip.null");
    private volatile boolean GXQ = false;

    public FAJ(ComboBoxRequiredText<QST> var1) {
        super(var1);
    }

    protected void IFV(QST var1, QST var2) {
        EXF.getInstance().ICO();

        try {
            if (var2 != null && var2.getTitle(2) != null && var2.getTitle(2).length() > 0) {
                if (!var2.getTitle(2).matches("\\d{0,10}") && !this.GXP.equalsIgnoreCase(var2.getTitle(2))) {
                    this.GXQ = true;
                    ((ComboBoxRequiredText) this.GXH).valueProperty().set(var1);
                } else if (this.GXQ) {
                    this.GXQ = false;
                } else {
                    this.GXH.IEU().set(EQW.HRG(var2.getTitle(2)));
                    super.IFV(var1, var2);
                }
            } else if (this.GXQ) {
                this.GXQ = false;
            } else {
                this.GXH.IEU().set(!this.GXH.IFB());
                super.IFV(var1, var2);
            }
        } finally {
            EXF.getInstance().ICP();
        }

    }
}
