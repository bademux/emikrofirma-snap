package a.a.a.c.c.e.a.c;

import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.c.c.a.b.ELV;
import a.a.a.c.c.e.a.b.ERT;
import a.a.a.c.f.a.g.JB;
import a.a.a.c.f.c.a.LP;

public class ERU extends ELV {
    private LP GBI;
    private boolean GBJ;

    public ERU() {
        super(ERT.GBH.getProcessName());

        this.GBI = null;

    }

    protected void HHI() {

        try {
            if (this.GBI == null) {
                JB var1 = new JB(LP.class);
                this.GBI = (LP) this.getModelManager().HJT(this.getParentDefinition(), var1);
                if (this.GBI != null) {
                    this.GBJ = false;
                } else {
                    this.GBI = new LP();
                    this.GBJ = true;
                }
            }
        } catch (FFK var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
            throw new FFI(var5);
        }

    }

    protected void HHJ() {

        try {
            if (this.GBJ) {
                this.getModelManager().HJU(this.getParentDefinition(), this.GBI);
                this.GBJ = false;
            } else {
                this.getModelManager().HJV(this.getParentDefinition(), this.GBI);
            }

            this.getModelManager().HKL(this.getParentDefinition());
            this.GBI = null;
        } catch (FFK var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
            throw new FFI(var5);
        }

    }

    protected void resetAndCleanUpProcessImpl() {

        try {
            this.getModelManager().resetData(this.getParentDefinition());
            this.GBI = null;
        } catch (FFK var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
            throw new FFI(var5);
        }

    }

    public LP getConfigurationProperties() {
        return this.GBI;
    }
}
