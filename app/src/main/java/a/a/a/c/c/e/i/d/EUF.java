package a.a.a.c.c.e.i.d;

import a.a.a.b.a.a.OrderType;
import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.b.EDF;
import a.a.a.c.c.a.b.ELW;
import a.a.a.c.c.b.EMB;
import a.a.a.c.c.e.i.b.EUD;
import a.a.a.c.d.b.EQB;
import a.a.a.c.e.a.d.TwoValueBox;
import a.a.a.c.f.a.c.HI;
import a.a.a.c.f.a.d.*;
import a.a.a.c.f.a.g.AGYN;
import a.a.a.c.f.a.g.IY;
import a.a.a.c.f.a.g.JB;
import a.a.a.c.f.b.b.JN;
import a.a.a.c.f.c.a.AILX;
import a.a.a.c.f.c.a.LP;
import a.a.a.c.f.c.a.LQ;
import a.a.a.c.f.c.a.LS;
import a.a.a.c.f.c.b.LY;
import a.a.a.c.g.FCQ;
import javafx.stage.Stage;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EUF extends ELW {
    private LP GKK;
    private LS GKL;
    private LS GKM;
    private AILX MWO;

    public EUF() {
        super(EUD.GKG.getProcessName());

    }

    protected void HHI() {

        try {
            if (this.GKK == null) {
                JB var1 = new JB(LP.class);
                this.GKK = (LP) this.getModelManager().HJT(this.getParentDefinition(), var1);
                Iterator var2 = this.GKK.getConfigurationProperties().iterator();

                while (var2.hasNext()) {
                    LQ var3 = (LQ) var2.next();
                    if (FCQ.WorkingDir.getPropertyName().equals(var3.DEX().getValue())) {
                        this.GKL = (LS) var3;
                    } else if (FCQ.Pkcs11LibraryFile.getPropertyName().equals(var3.DEX().getValue())) {
                        this.GKM = (LS) var3;
                    } else if (FCQ.PerformVerification.getPropertyName().equals(var3.DEX().getValue())) {
                        this.MWO = (AILX) var3;
                    }
                }
            }
        } catch (FFK var7) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var7);
            throw new FFI(var7);
        }

    }

    protected void HHJ() {

        this.GKK = null;

    }

    protected void resetAndCleanUpProcessImpl() {

        this.GKK = null;

    }

    public List<AGWN> getDeclarations() {

        ArrayList var11;
        try {
            IY var1 = new IY(AGWN.class, null, HM.JPK, null, OrderType.DESC);
            TwoValueBox var2 = this.getModelManager().HJY(this.getParentDefinition(), var1);
            ArrayList var3 = new ArrayList();
            if (var2 != null) {
                Iterator var4 = ((List) var2.getSecondValue()).iterator();

                while (var4.hasNext()) {
                    EDF var5 = (EDF) var4.next();
                    if (var5 != null) {
                        var3.add(var5.getModelBaseElementWithIdObject());
                    }
                }
            }

            var11 = var3;
        } catch (FFO | FFK var9) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var9);
            throw new FFI(var9);
        }

        return var11;
    }

    public LP HWZ() {

        Object var2;
        try {
            LP var1 = EMB.getInstance().HHU();
            return var1;
        } catch (FFK var6) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var6);
            var2 = null;
        }

        return (LP) var2;
    }

    public File getWorkingDir(Stage var1) throws FFK {
        return this.getOrSelectWorkingDir(var1);
    }

    public String getPkcs11LibraryFilePath() {
        return this.GKM != null && this.GKM.getValue() != null ? this.GKM.getValue().getValue() : null;
    }

    public boolean MXD() {
        return this.MWO != null && this.MWO.getValue() != null ? this.MWO.getValue().getValue() : true;
    }

    public File getDeclarationTmpFile(Stage var1, HM var2, AGWW var3, String var4) throws FFK {

        File var7;
        File var5 = this.getWorkingDir(var1);
        File var6 = new File(var5, var2.name() + "_" + var3.name() + "_" + Thread.currentThread().getId() + "_" + System.nanoTime() + "." + var4);
        var7 = var6;

        return var7;
    }

    public Integer HXA(JN var1, HM var2, AGWW var3) {

        Object var5;
        try {
            Integer var4 = this.getModelManager().getMaxDocumentIndex(this.getParentDefinition(), HJ.class, var1, var2, var3);
            return var4;
        } catch (FFO | FFK var9) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var9);
            var5 = null;
        }

        return (Integer) var5;
    }

    public void HXB(HJ var1) {

        try {
            if (var1 != null) {
                this.getModelManager().HJZ(this.getParentDefinition(), var1);
                this.getModelManager().HKL(this.getParentDefinition());
            }
        } catch (FFO | FFK var6) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var6);
            throw new FFI(var6);
        }

    }

    public boolean QIX(QGX var1) throws FFK, FFO {

        boolean var2;
        if (!EQB.QIU(var1)) {
            var2 = false;
            return var2;
        }

        var2 = true;

        return var2;
    }

    public void QIY(HJ var1) throws FFK, FFO {

        this.getModelManager().HKC(this.getParentDefinition(), var1);
        this.getModelManager().HKL(this.getParentDefinition());

    }

    public LY getUserData() {

        LY var3;
        try {
            JB var1 = new JB(LY.class);
            LY var2 = (LY) this.getModelManager().HJT(this.getParentDefinition(), var1);
            var3 = var2;
        } catch (FFK var7) {
            throw new FFI(var7.getMessage());
        }

        return var3;
    }

    public HI getContractorByNip(String var1) {

        TwoValueBox var3;
        try {
            AGYN var2 = new AGYN(HI.class, var1);
            var3 = this.getModelManager().HJY(this.getParentDefinition(), var2);
            HI var4;
            if (((List) var3.getSecondValue()).size() > 0) {
                var4 = (HI) ((EDF) ((List) var3.getSecondValue()).get(0)).getModelBaseElementWithIdObject();
                if (var4.DAJ().getValue().equals(var1)) {
                    HI var5 = var4;
                    return var5;
                }
            }

            var4 = null;
            return var4;
        } catch (FFO | FFK var9) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var9);
            return null;
        }
    }
}
