package a.a.a.c.c.e.f.c;

import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.b.EDF;
import a.a.a.c.c.a.b.ELV;
import a.a.a.c.c.e.f.b.ETL;
import a.a.a.c.e.a.d.EVZ;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.e.a.IC;
import a.a.a.c.f.a.g.EYD;
import a.a.a.c.f.a.g.IY;
import a.a.a.c.f.a.g.JB;
import a.a.a.c.f.a.h.JF;
import a.a.a.c.f.b.b.JN;
import a.a.a.c.f.c.a.LP;
import a.a.a.c.f.c.a.LQ;
import a.a.a.c.f.c.a.LS;
import a.a.a.c.f.c.b.LY;
import a.a.a.c.g.FCQ;

import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ETM extends ELV {
    private LY GHO;
    private LP GHP;
    private LS GHQ;

    public ETM() {
        super(ETL.GHN.getProcessName());
        EXF.getInstance().ICO();

        try {
            this.GHO = null;
            this.GHQ = null;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    protected void HHI() {
        EXF.getInstance().ICO();

        try {
            JB var1 = new JB(LY.class);
            this.GHO = (LY) this.getModelManager().HJT(this.getParentDefinition(), var1);
            if (this.GHP == null) {
                JB var2 = new JB(LP.class);
                this.GHP = (LP) this.getModelManager().HJT(this.getParentDefinition(), var2);
                Iterator var3 = this.GHP.getConfigurationProperties().iterator();

                while (var3.hasNext()) {
                    LQ var4 = (LQ) var3.next();
                    if (FCQ.WorkingDir.getPropertyName().equals(var4.DEX().getValue())) {
                        this.GHQ = (LS) var4;
                    }
                }
            }
        } catch (FFK var8) {
            EXF.getInstance().ICA(var8);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    protected void HHJ() {
        EXF.getInstance().ICO();

        try {
            this.GHO = null;
            this.GHQ = null;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    protected void resetAndCleanUpProcessImpl() {
        EXF.getInstance().ICO();

        try {
            this.GHO = null;
            this.GHQ = null;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public Set<IC> getInvoiceRecords(JN var1) {
        try {
            HashSet var2 = new HashSet();
            IY var3 = new IY(IC.class, var1, null, null);
            EVZ var4 = this.getModelManager().HJY(this.getParentDefinition(), var3);
            if (var4 != null) {
                Iterator var5 = ((List) var4.getSecondValue()).iterator();

                while (var5.hasNext()) {
                    EDF var6 = (EDF) var5.next();
                    var2.add(var6.getModelBaseElementWithIdObject());
                }
            }

            return var2;
        } catch (FFO | FFK var7) {
            EXF.getInstance().ICA(var7);
            throw new FFI(var7);
        }
    }

    public Set<IC> getInvoiceRecords(JF var1) {
        EXF.getInstance().ICO();

        HashSet var12;
        try {
            EYD var2 = new EYD(IC.class, var1, null, null, null);
            EVZ var3 = this.getModelManager().HKD(this.getParentDefinition(), var2);
            HashSet var4 = new HashSet();
            if (var3 != null) {
                Iterator var5 = ((List) var3.getSecondValue()).iterator();

                while (var5.hasNext()) {
                    EDF var6 = (EDF) var5.next();
                    var4.add(var6.getModelBaseElementWithIdObject());
                }
            }

            var12 = var4;
        } catch (FFO | FFK var10) {
            EXF.getInstance().ICA(var10);
            throw new FFI(var10);
        } finally {
            EXF.getInstance().ICP();
        }

        return var12;
    }

    public LY getUserData() {
        return this.GHO;
    }

    public LY getUserData(Integer var1) throws FFK {
        JB var2 = new JB(LY.class, var1);
        LY var3 = (LY) this.getModelManager().HJT(this.getParentDefinition(), var2);
        return var3;
    }

    public File getWorkingDir() {
        EXF.getInstance().ICO();

        File var2;
        try {
            File var1 = new File(this.GHQ.DEY().getValue());
            var1.mkdirs();
            var2 = var1;
        } finally {
            EXF.getInstance().ICP();
        }

        return var2;
    }

    public File getTempFile(String var1) {
        EXF.getInstance().ICO();

        File var4;
        try {
            File var2 = this.getWorkingDir();
            File var3 = new File(var2, "temp_" + Thread.currentThread().getId() + "_" + System.nanoTime() + "." + var1);
            var4 = var3;
        } finally {
            EXF.getInstance().ICP();
        }

        return var4;
    }
}
