package a.a.a.c.c.e.b.c;

import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.c.c.a.b.ELV;
import a.a.a.c.c.b.EMB;
import a.a.a.c.c.e.b.b.ESB;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.g.JB;
import a.a.a.c.f.b.c.KA;
import a.a.a.c.f.b.c.a.KG;
import a.a.a.c.f.c.b.LX;
import a.a.a.c.f.c.b.LY;

public class ESC extends ELV {
    private LY GBS;

    public ESC() {
        super(ESB.GBR.getProcessName());
        EXF.getInstance().ICO();

        try {
            this.GBS = null;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    protected void HHI() {
        EXF.getInstance().ICO();

        try {
            if (this.GBS == null) {
                JB var1 = new JB(LY.class);
                this.GBS = (LY) this.getModelManager().HJT(this.getParentDefinition(), var1);
                if (this.GBS == null) {
                    String var2 = EMB.getInstance().getCurrentUser().getUsername().getValue();
                    if (var2 == null) {
                        throw new FFK("Not supposed to happen, userName is null!");
                    }

                    LX var3 = EMB.getInstance().getSimpleUserDataForUserName(var2);
                    if (var3.DFA().getValue() == KG.NIP) {
                        this.GBS = new LY();
                        this.GBS.DEW().setValue(1);
                        this.GBS.setNip(new KA(var3.getUsername().getValue()));
                    } else {
                        throw new FFK("Not implemented type [" + var3.getLoginType() + "]!");
                    }
                } else {
                    this.GBS.DEV();
                }
            }
        } catch (FFK var7) {
            EXF.getInstance().ICA(var7);
            throw new FFI(var7);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    protected void HHJ() {
        EXF.getInstance().ICO();

        try {
            this.getModelManager().HJU(this.getParentDefinition(), this.GBS);
            this.getModelManager().HKL(this.getParentDefinition());
            this.GBS = null;
        } catch (FFK var5) {
            EXF.getInstance().ICA(var5);
            throw new FFI(var5);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    protected void resetAndCleanUpProcessImpl() {
        EXF.getInstance().ICO();

        try {
            this.getModelManager().resetData(this.getParentDefinition());
            this.GBS = null;
        } catch (FFK var5) {
            EXF.getInstance().ICA(var5);
            throw new FFI(var5);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public LY getUserData() {
        return this.GBS;
    }
}
