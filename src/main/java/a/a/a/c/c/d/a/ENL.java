package a.a.a.c.c.d.a;

import a.a.a.b.f.FFK;
import a.a.a.c.c.a.a.ELU;
import a.a.a.c.c.a.b.ELV;
import a.a.a.c.c.b.EMC;
import a.a.a.c.c.b.b.EMT;
import a.a.a.c.f.a.f.a.IR;

public abstract class ENL<_PROCESS extends ELV> extends ELU<_PROCESS> {
    public ENL(EMC var1, EMT var2, String var3, String var4) {
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
