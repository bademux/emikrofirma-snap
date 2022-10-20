package a.a.a.c.c.d.a;

import a.a.a.b.f.FFK;
import a.a.a.c.c.a.a.BaseProgressFxController;
import a.a.a.c.c.a.b.ELV;
import a.a.a.c.c.b.b.a.EMW;
import a.a.a.c.c.d.g.EPB;
import a.a.a.c.f.a.c.Contractor;
import a.a.a.c.f.a.n.InvoiceOther;
import com.github.bademux.emk.app.FXApp;

public abstract class QUV<_PROCESS extends ELV> extends BaseProgressFxController<_PROCESS> {
    public QUV(FXApp var1, EMW var2, String var3, String var4) {
        super(var1, var2, var3, var4);
    }

    public abstract void setInvoice(InvoiceOther<?> var1) throws FFK;

    public abstract void setMode(EPB var1);

    public abstract void setContractor(Contractor var1);
}
