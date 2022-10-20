package a.a.a.c.c.d.a;

import a.a.a.b.f.FFK;
import a.a.a.c.c.a.a.BaseProgressFxController;
import a.a.a.c.c.a.b.ELV;
import a.a.a.c.c.b.b.a.EMW;
import a.a.a.c.f.a.f.a.IR;
import com.github.bademux.emk.app.FXApp;

public abstract class ENL<_PROCESS extends ELV> extends BaseProgressFxController<_PROCESS> {
    public ENL(FXApp var1, EMW var2, String var3, String var4) {
        super(var1, var2, var3, var4);
    }

    public abstract void setReceiptRecordVat(IR var1) throws FFK;

    public abstract void setMode(ENM var1);

    public enum ENM {
        NEW,
        EDIT,
        VIEW;

        ENM() {
        }
    }
}
