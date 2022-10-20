package a.a.a.c.c.e.c.c;

import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.c.b.EDF;
import a.a.a.c.f.a.d.HK;
import a.a.a.c.f.a.h.JF;

public abstract class ESK {
    private JF GCZ;
    private HK QNE;
    protected final ESJ GDB;
    private final EDF<JF> GDC;
    private boolean QNF = false;

    public ESK(ESJ var1, EDF<JF> var2) {
        this.GDB = var1;
        this.GDC = var2;
    }

    public ESK(ESJ var1, JF var2) {
        this.GDB = var1;
        this.GCZ = var2;
        this.GDC = null;
    }

    public JF getSettlement() {

        JF var1;
        try {
            if (this.GCZ == null) {
                this.GCZ = this.GDC.getModelBaseElementWithIdObject();
            }

            var1 = this.GCZ;
        } catch (FFK var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
            throw new FFI(var5);
        }

        return var1;
    }

    public HK getDeclarationJPKVAT() {

        HK var1;
        if (this.QNE == null && !this.QNF) {
            this.QNE = this.GDB.getDeclarationJPK_VAT(this.getSettlement());
            if (this.QNE == null) {
                this.QNF = true;
            }
        }

        var1 = this.QNE;

        return var1;
    }

    protected void QPF() {
        this.QNE = null;
        this.QNF = false;
    }
}
