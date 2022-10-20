package a.a.a.c.c.e.c.c;

import a.a.a.b.a.a.OrderType;
import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.b.EDF;
import a.a.a.c.c.a.b.ELW;
import a.a.a.c.c.b.EMB;
import a.a.a.c.c.e.c.b.ESI;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.d.*;
import a.a.a.c.f.a.e.InvoiceSellCorrection;
import a.a.a.c.f.a.e.HY;
import a.a.a.c.f.a.e.IA;
import a.a.a.c.f.a.e.IB;
import a.a.a.c.f.a.e.a.InvoiceRecord;
import a.a.a.c.f.a.g.*;
import a.a.a.c.f.a.h.Settlement;
import a.a.a.c.f.a.h.JG;
import a.a.a.c.f.a.h.JH;
import a.a.a.c.f.b.b.Period;
import a.a.a.c.f.b.c.a.QSW;
import a.a.a.c.f.c.a.PropertyBoolean;
import a.a.a.c.f.c.a.ConfigurationProperties;
import a.a.a.c.f.c.a.ConfigurationProperty;
import a.a.a.c.f.c.a.PropertyString;
import a.a.a.c.f.c.b.UserData;
import a.a.a.c.g.FCQ;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Slf4j
public class ESJ extends ELW {
    private ConfigurationProperties GCU;
    private PropertyString GCV;
    private PropertyString GCW;
    private PropertyBoolean GCX;
    private UserData GCY;

    public ESJ() {
        super(ESI.GCR.getProcessName());

    }

    protected void HHI() {

        try {
            if (this.GCU == null) {
                JB var1 = new JB(ConfigurationProperties.class);
                this.GCU = (ConfigurationProperties) this.getModelManager().HJT(this.getParentDefinition(), var1);
                Iterator var2 = this.GCU.getConfigurationProperties().iterator();

                while (var2.hasNext()) {
                    ConfigurationProperty var3 = (ConfigurationProperty) var2.next();
                    if (FCQ.WorkingDir.getPropertyName().equals(var3.DEX().getValue())) {
                        this.GCV = (PropertyString) var3;
                    } else if (FCQ.Pkcs11LibraryFile.getPropertyName().equals(var3.DEX().getValue())) {
                        this.GCW = (PropertyString) var3;
                    } else if (FCQ.PerformVerification.getPropertyName().equals(var3.DEX().getValue())) {
                        this.GCX = (PropertyBoolean) var3;
                    }
                }
            }
        } catch (FFK var7) {
            log.error("Something bad happened", var7);
            throw new FFI(var7);
        }

    }

    protected void HHJ() {

        try {
            this.getModelManager().HKL(this.getParentDefinition());
            this.GCU = null;
            this.GCY = null;
        } catch (FFK var5) {
            log.error("Something bad happened", var5);
            throw new FFI(var5);
        }

    }

    protected void resetAndCleanUpProcessImpl() {

        try {
            this.getModelManager().resetData(this.getParentDefinition());
            this.GCU = null;
            this.GCY = null;
        } catch (FFK var5) {
            log.error("Something bad happened", var5);
            throw new FFI(var5);
        }

    }

    public List<ESL> getSettlementWithDeclarationList() {
        ArrayList var1 = new ArrayList();
        List var2 = this.getSettlements();
        Iterator var3 = var2.iterator();

        while (var3.hasNext()) {
            EDF var4 = (EDF) var3.next();
            if (!Period.AOE.equals(var4.getPeriod())) {
                EDF var5 = var4;
                ArrayList var6 = new ArrayList();

                ESL var7;
                while (var5.getParentWrapperWithCanceledState() != null) {
                    var5 = (EDF) var5.getParentWrapperWithCanceledState();
                    var7 = new ESL(var5, this, null, true, true, false);
                    var6.add(var7);
                }

                var7 = new ESL(var4, this, var6, false, false, true);
                var1.add(var7);
            }
        }

        ArrayList var11 = var1;
        return var11;
    }

    public DeclarationJPK_VAT getDeclarationJPK_VAT(Settlement var1) {

        DeclarationJPK_VAT var4;
        try {
            EYD var2 = new EYD(DeclarationJPK_VAT.class, var1, null, HM.JPK, AGWW.VAT);
            ValueContainer2 var3 = this.getModelManager().HKD(this.getParentDefinition(), var2);
            if (var3 == null || var3.getSecondValue() == null || ((List) var3.getSecondValue()).size() <= 0) {
                var4 = null;
                return var4;
            }

            var4 = (DeclarationJPK_VAT) ((EDF) ((List) var3.getSecondValue()).get(0)).getModelBaseElementWithIdObject();
        } catch (FFO | FFK var8) {
            log.error("Something bad happened", var8);
            throw new FFI(var8);
        }

        return var4;
    }

    public DeclarationJPK_FA getDeclarationJPK_FA(Settlement var1) {

        DeclarationJPK_FA var4;
        try {
            EYD var2 = new EYD(DeclarationJPK_FA.class, var1, null, HM.JPK, AGWW.FA);
            ValueContainer2 var3 = this.getModelManager().HKD(this.getParentDefinition(), var2);
            if (var3 == null || var3.getSecondValue() == null || ((List) var3.getSecondValue()).size() <= 0) {
                var4 = null;
                return var4;
            }

            var4 = (DeclarationJPK_FA) ((EDF) ((List) var3.getSecondValue()).get(0)).getModelBaseElementWithIdObject();
        } catch (FFO | FFK var8) {
            log.error("Something bad happened", var8);
            throw new FFI(var8);
        }

        return var4;
    }

    public List<EDF<Settlement>> getSettlements() {

        List var3;
        try {
            IY var1 = new IY(Settlement.class, null, JH.VAT, null, OrderType.DESC);
            ValueContainer2 var2 = this.getModelManager().HJY(this.getParentDefinition(), var1);
            var3 = (List) var2.getSecondValue();
        } catch (FFO | FFK var7) {
            log.error("Something bad happened", var7);
            throw new FFI(var7);
        }

        return var3;
    }

    public boolean isUnsettledInvoicesExist() {

        boolean var3;
        try {
            IU var1 = new IU(InvoiceSellCorrection.class, QSW.ACTIVE, Period.AOE, IB.SELL, IA.CORRECTION, null, null, OrderType.DESC);
            ValueContainer2 var2 = this.getModelManager().HJY(this.getParentDefinition(), var1);
            if (((List) var2.getSecondValue()).size() <= 0) {
                var3 = false;
                return var3;
            }

            var3 = true;
        } catch (FFO | FFK var7) {
            log.error("Something bad happened", var7);
            throw new FFI(var7);
        }

        return var3;
    }

    public void HTK(Settlement var1) {

        try {
            this.getModelManager().HJZ(this.getParentDefinition(), var1);
            this.getModelManager().HKL(this.getParentDefinition());
        } catch (FFO | FFK var6) {
            log.error("Something bad happened", var6);
            throw new FFI(var6);
        }

    }

    public void HTL(Declaration var1) {

        try {
            this.getModelManager().HKC(this.getParentDefinition(), var1);
            this.getModelManager().HKL(this.getParentDefinition());
        } catch (FFO | FFK var6) {
            log.error("Something bad happened", var6);
            throw new FFI(var6);
        }

    }

    public File getWorkingDir(Stage var1) throws FFK {
        return this.getOrSelectWorkingDir(var1);
    }

    public String getPkcs11LibraryFilePath() {
        return this.GCW != null && this.GCW.getValue() != null ? this.GCW.getValue().getValue() : null;
    }

    public boolean HTM() {
        return this.GCX != null && this.GCX.getValue() != null ? this.GCX.getValue().getValue() : true;
    }

    public UserData getUserData() throws FFK {
        if (this.GCY == null) {
            this.GCY = EMB.getInstance().HHV();
        }

        return this.GCY;
    }

    public File getTempFile(Stage var1, String var2) throws FFK {

        File var5;
        File var3 = this.getWorkingDir(var1);
        File var4 = new File(var3, "" + Thread.currentThread().getId() + "_" + System.nanoTime() + "." + var2);
        var5 = var4;

        return var5;
    }

    public void HTN(Settlement var1) {

        try {
            this.getModelManager().HKB(this.getParentDefinition(), var1);
            this.getModelManager().HKL(this.getParentDefinition());
        } catch (FFO | FFK var6) {
            log.error("Something bad happened", var6);
            throw new FFI(var6);
        }

    }

    public JG getSettlementStatus(Period var1) throws FFK, FFO {

        JG var6;
        IY var2 = new IY(Settlement.class, var1, JH.VAT, null);
        ValueContainer2 var3 = this.getModelManager().HJY(this.getParentDefinition(), var2);
        if (((List) var3.getSecondValue()).size() > 1) {
            throw new FFO("More than one settlement per one period!");
        }

        Iterator var4 = ((List) var3.getSecondValue()).iterator();
        if (!var4.hasNext()) {
            return null;
        }

        EDF var5 = (EDF) var4.next();
        var6 = ((Settlement) var5.getModelBaseElementWithIdObject()).getSettlementStatus();


        return var6;
    }

    public List<EDF<InvoiceRecord>> HTO(Period var1) {

        IV var2;
        try {
            if (var1 != null && var1.getMonth() != null && var1.getMonth().getValue() != null && var1.getYear() != null && var1.getYear().getValue() != null) {
                var2 = new IV(InvoiceRecord.class, var1, null);
                return (List) this.getModelManager().HJY(this.getParentDefinition(), var2).getSecondValue();
            }

            return null;
        } catch (FFK | FFO var8) {
            log.error("Something bad happened", var8);
            return null;
        }
    }

    public List<EDF<HY>> QPE(Period var1) {
        try {
            IU var2;
            if (var1 != null && var1.getMonth() != null && var1.getMonth().getValue() != null && var1.getYear() != null && var1.getYear().getValue() != null) {
                var2 = new IU(HY.class, QSW.ACTIVE, var1, IB.SELL, null, null, null, OrderType.DESC);
                return (List) this.getModelManager().HJY(this.getParentDefinition(), var2).getSecondValue();
            }

            return null;
        } catch (FFK | FFO var8) {
            log.error("Something bad happened", var8);
        }

        return null;
    }

    public Integer HTQ(Period var1, HM var2, AGWW var3) {

        Object var5;
        try {
            Integer var4 = this.getModelManager().getMaxDocumentIndex(this.getParentDefinition(), Declaration.class, var1, var2, var3);
            return var4;
        } catch (FFO | FFK var9) {
            log.error("Something bad happened", var9);
            var5 = null;
        }

        return (Integer) var5;
    }

    public void HTR(Declaration var1, Settlement var2) {

        try {
            if (var1 != null) {
                this.getModelManager().HKA(this.getParentDefinition(), var1, var2);
                this.getModelManager().HKL(this.getParentDefinition());
            }
        } catch (FFO | FFK var7) {
            log.error("Something bad happened", var7);
            throw new FFI(var7);
        }

    }
}
