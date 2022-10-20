package a.a.a.c.c.e.j.c;

import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.b.EDF;
import a.a.a.c.c.a.b.ELX;
import a.a.a.c.c.d.g.EPB;
import a.a.a.c.c.e.j.b.EUX;
import a.a.a.c.e.a.d.EVZ;
import a.a.a.c.f.a.a.EYL;
import a.a.a.c.f.a.c.HI;
import a.a.a.c.f.a.c.QJW;
import a.a.a.c.f.a.e.*;
import a.a.a.c.f.a.g.AGYN;
import a.a.a.c.f.a.g.IU;
import a.a.a.c.f.a.g.IY;
import a.a.a.c.f.a.g.JB;
import a.a.a.c.f.a.h.JF;
import a.a.a.c.f.a.h.JG;
import a.a.a.c.f.a.h.JH;
import a.a.a.c.f.b.EZT;
import a.a.a.c.f.b.b.JN;
import a.a.a.c.f.b.c.JS;
import a.a.a.c.f.b.c.KE;
import a.a.a.c.f.c.a.LP;
import a.a.a.c.f.c.a.LQ;
import a.a.a.c.f.c.a.LS;
import a.a.a.c.f.c.b.LY;
import a.a.a.c.g.FCQ;

import java.io.File;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EUY extends ELX implements EYL {
    private LP GMS;
    private LS GMT;
    private LS GMU;
    private LS GMV;
    private HU GMW;
    private HV GMX;
    private EPB GMY;

    public EUY() {
        super(EUX.GMQ.getProcessName());

        this.GMS = null;
        this.GMT = null;
        this.GMU = null;
        this.GMV = null;
        this.GMW = null;

    }

    public void setMode(EPB var1) {
        this.GMY = var1;
        this.HHI();
    }

    public void setInvoiceSell(HU var1) {
        this.GMW = var1;
    }

    public void setInvoiceSellCorrection(HV var1) {
        this.GMX = var1;
    }

    protected void HHI() {

        try {
            if (this.GMS == null) {
                JB var1 = new JB(LP.class);
                this.GMS = (LP) this.getModelManager().HJT(this.getParentDefinition(), var1);
                Iterator var2 = this.GMS.getConfigurationProperties().iterator();

                while (var2.hasNext()) {
                    LQ var3 = (LQ) var2.next();
                    if (FCQ.SellRefIdPattern.getPropertyName().equals(var3.DEX().getValue())) {
                        this.GMT = (LS) var3;
                    } else if (FCQ.SellCorrectionRefIdPattern.getPropertyName().equals(var3.DEX().getValue())) {
                        this.GMU = (LS) var3;
                    } else if (FCQ.WorkingDir.getPropertyName().equals(var3.DEX().getValue())) {
                        this.GMV = (LS) var3;
                    }
                }
            }
        } catch (FFK var7) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var7);
            throw new FFI(var7);
        }

    }

    public HU getInvoiceSell(HI var1) throws FFK, FFO {

        HU var2;
        if (this.GMW == null) {
            this.GMW = this.getModelManager().HJX(this.getParentDefinition(), HU.class);
            if (var1 != null) {
                this.GMW.setContractor(var1);
            }
        }

        var2 = this.GMW;

        return var2;
    }

    public HV getInvoiceSellCorrection() throws FFK, FFO {

        HV var1;
        if (this.GMX == null) {
            this.GMX = this.getModelManager().HJX(this.getParentDefinition(), HV.class);
        }

        var1 = this.GMX;

        return var1;
    }

    public String getRefId(LocalDate var1) throws FFK {

        String var4;
        String var2 = null;
        if (this.GMY != EPB.CORRECT && this.GMY != EPB.EDIT_CORRECTION) {
            var2 = this.GMT.DEY().getValue();
        } else {
            var2 = this.GMU.DEY().getValue();
        }

        String var3 = this.getModelManager().HKJ(Date.from(var1.atStartOfDay(ZoneId.systemDefault()).toInstant()), var2);
        var4 = var3;

        return var4;
    }

    public JG getSettlementStatus(LocalDate var1) throws FFK, FFO {

        Iterator var5;
        JN var2 = new JN(Date.from(var1.atStartOfDay(ZoneId.systemDefault()).toInstant()));
        IY var3 = new IY(JF.class, var2, JH.VAT, null);
        EVZ var4 = this.getModelManager().HJY(this.getParentDefinition(), var3);
        if (((List) var4.getSecondValue()).size() > 1) {
            throw new FFO("More than one settlement per one period!");
        }

        var5 = ((List) var4.getSecondValue()).iterator();
        if (var5.hasNext()) {
            EDF var6 = (EDF) var5.next();
            JG var7 = ((JF) var6.getModelBaseElementWithIdObject()).getSettlementStatus();
            return var7;
        }

        return null;

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

    protected void HHJ() {

        try {
            switch (this.GMY) {
                case EDIT:
                    this.GMW.setUsingInvoicingDate(new JS(true));
                    this.getModelManager().HKB(this.getParentDefinition(), this.GMW);
                    this.GMW = null;
                    break;
                case NEW:
                    this.GMW.setUsingInvoicingDate(new JS(true));
                    this.getModelManager().HJZ(this.getParentDefinition(), this.GMW);
                    this.GMW = null;
                    break;
                case CORRECT:
                    this.GMX.setUsingInvoicingDate(new JS(true));
                    this.getModelManager().HJZ(this.getParentDefinition(), this.GMX);
                    this.GMX = null;
                    this.GMW = null;
                    break;
                case EDIT_CORRECTION:
                    this.GMX.setUsingInvoicingDate(new JS(true));
                    this.getModelManager().HKB(this.getParentDefinition(), this.GMX);
                    this.GMX = null;
                    this.GMW = null;
            }

            this.getModelManager().HKL(this.getParentDefinition());
            this.GMS = null;
            this.GMT = null;
            this.GMU = null;
        } catch (FFO | FFK var5) {
            throw new FFI(var5.getMessage());
        }

    }

    protected void resetAndCleanUpProcessImpl() {

        try {
            this.getModelManager().resetData(this.getParentDefinition());
            this.GMS = null;
            this.GMT = null;
            this.GMU = null;
            this.GMV = null;
            this.GMW = null;
            this.GMX = null;
        } catch (FFK var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
            throw new FFI(var5);
        }

    }

    public void HYA() {

        try {
            this.getModelManager().resetData(this.getParentDefinition());
        } catch (FFK var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
            throw new FFI(var5);
        }

    }

    public boolean HYB(JN var1, String var2) throws FFK, FFO {

        boolean var5;
        IU var3 = new IU(HY.class, null, var1, IB.SELL, null, new KE(var2), null);
        EVZ var4 = this.getModelManager().HJY(this.getParentDefinition(), var3);
        if (((List) var4.getSecondValue()).size() > 0) {
            var5 = false;
            return var5;
        }

        var5 = true;

        return var5;
    }

    public List<EZT> getRangesWhereSettled(String var1) {

        ArrayList var2 = new ArrayList();

        ArrayList var4;
        try {
            IY var3 = new IY(JF.class, null, JH.VAT, null);
            EVZ var18 = this.getModelManager().HJY(this.getParentDefinition(), var3);
            Iterator var5 = ((List) var18.getSecondValue()).iterator();

            while (var5.hasNext()) {
                EDF var6 = (EDF) var5.next();
                JF var7 = (JF) var6.getModelBaseElementWithIdObject();
                if (var7.getSettlementStatus().equals(JG.SETTLED)) {
                    LocalDate var8 = LocalDate.of(var7.getPeriod().getYear().getValue(), var7.getPeriod().getMonth().getValue(), 1);
                    LocalDate var9 = LocalDate.of(var7.getPeriod().getYear().getValue(), var7.getPeriod().getMonth().getValue(), var8.lengthOfMonth());
                    EZT var10 = new EZT(var8, var9, var1, false);
                    var2.add(var10);
                }
            }

            ArrayList var19 = var2;
            return var19;
        } catch (FFK var15) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var15);
            var4 = var2;
            return var4;
        } catch (FFO var16) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var16);
            var4 = var2;
        }

        return var4;
    }

    public LY getUserDataForInvoice(HN<?> var1) throws FFK {

        LY var4;
        JB var2 = new JB(LY.class, var1.DBC().getValue());
        LY var3 = (LY) this.getModelManager().HJT(this.getParentDefinition(), var2);
        var4 = var3;

        return var4;
    }

    public File getWorkingDir() {

        File var2;
        File var1 = new File(this.GMV.DEY().getValue());
        var1.mkdirs();
        var2 = var1;

        return var2;
    }

    public File getTempFile(String var1) {

        File var4;
        File var2 = this.getWorkingDir();
        File var3 = new File(var2, "temp_" + Thread.currentThread().getId() + "_" + System.nanoTime() + "." + var1);
        var4 = var3;

        return var4;
    }

    public List<QJW> getContractorsByText(String var1) {

        ArrayList var2 = new ArrayList();

        ArrayList var4;
        try {
            AGYN var3 = new AGYN(HI.class, var1);
            EVZ var13 = this.getModelManager().HJY(this.getParentDefinition(), var3);
            if (var13 != null) {
                Iterator var5 = ((List) var13.getSecondValue()).iterator();

                while (var5.hasNext()) {
                    EDF var6 = (EDF) var5.next();
                    if (var6 != null) {
                        QJW var7 = new QJW(var6);
                        var2.add(var7);
                    }
                }
            }

            ArrayList var14 = var2;
            return var14;
        } catch (FFO | FFK var11) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var11);
            var4 = var2;
        }

        return var4;
    }
}
