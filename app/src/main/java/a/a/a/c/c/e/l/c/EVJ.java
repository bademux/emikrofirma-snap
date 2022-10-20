package a.a.a.c.c.e.l.c;

import a.a.a.b.a.a.OrderType;
import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.b.EDF;
import a.a.a.c.c.a.b.QVI;
import a.a.a.c.c.d.b.ENP;
import a.a.a.c.c.d.g.EPA;
import a.a.a.c.c.e.l.b.EVI;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.e.Invoice;
import a.a.a.c.f.a.e.InvoiceSellCorrection;
import a.a.a.c.f.a.e.HY;
import a.a.a.c.f.a.e.IB;
import a.a.a.c.f.a.g.IU;
import a.a.a.c.f.a.g.IY;
import a.a.a.c.f.a.g.JB;
import a.a.a.c.f.a.h.Settlement;
import a.a.a.c.f.a.h.JG;
import a.a.a.c.f.a.h.JH;
import a.a.a.c.f.b.EZT;
import a.a.a.c.f.b.b.Period;
import a.a.a.c.f.b.c.RefId;
import a.a.a.c.f.b.c.a.QSW;
import a.a.a.c.f.c.a.ConfigurationProperties;
import a.a.a.c.f.c.a.ConfigurationProperty;
import a.a.a.c.f.c.a.PropertyString;
import a.a.a.c.f.c.a.QJZ;
import a.a.a.c.f.c.b.UserData;
import a.a.a.c.g.FCQ;
import a.a.a.c.g.c.FCZ;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EVJ extends QVI {
    private ConfigurationProperties GPG;
    private PropertyString GPH;

    public EVJ() {
        super(EVI.GPE.getProcessName());

        this.GPG = null;
        this.GPH = null;

    }

    protected void HHI() {

        try {
            if (this.GPG == null) {
                JB var1 = new JB(ConfigurationProperties.class);
                this.GPG = (ConfigurationProperties) this.getModelManager().HJT(this.getParentDefinition(), var1);
                Iterator var2 = this.GPG.getConfigurationProperties().iterator();

                while (var2.hasNext()) {
                    ConfigurationProperty var3 = (ConfigurationProperty) var2.next();
                    if (FCQ.WorkingDir.getPropertyName().equals(var3.DEX().getValue())) {
                        this.GPH = (PropertyString) var3;
                    }
                }
            }
        } catch (FFK var7) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var7);
            throw new FFI(var7);
        }

    }

    protected void HHJ() {

    }

    protected void resetAndCleanUpProcessImpl() {

        try {
            this.getModelManager().resetData(this.getParentDefinition());
            this.GPG = null;
            this.GPH = null;
        } catch (FFK var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
            throw new FFI(var5);
        }

    }

    public List<EPA<HY>> getInvoices(ENP var1, Integer var2, Integer var3, String var4, String var5) throws FFK, FFO {

        ArrayList var15;
        IU var6;
        switch (var1) {
            case ONLY_EMPTY:
                var6 = new IU(HY.class, QSW.ACTIVE, Period.AOE, IB.SELL, null, null, null, OrderType.DESC);
                break;
            case ONLY_CANCELED:
                var6 = new IU(HY.class, QSW.CANCELED, null, IB.SELL, null, null, null, OrderType.DESC);
                break;
            case WITHOUT_EMPTY:
                var6 = new IU(HY.class, QSW.ACTIVE, new Period(var2, var3), IB.SELL, null, null, var4, OrderType.DESC);
                break;
            case ALL:
            default:
                var6 = new IU(HY.class, null, null, IB.SELL, null, null, var4, OrderType.DESC);
        }

        ValueContainer2 var7 = this.getModelManager().HJY(this.getParentDefinition(), var6);
        ArrayList var8 = new ArrayList();
        if (var7 != null) {
            int var9 = 0;
            Iterator var10 = ((List) var7.getSecondValue()).iterator();

            while (var10.hasNext()) {
                EDF var11 = (EDF) var10.next();
                ++var9;
                var8.add(new EPA(var11, var9));
            }
        }

        var15 = var8;

        return var15;
    }

    public void RKY(EDF<HY> var1) throws FFK, FFO {

        if (this.RKI(var1.getPeriod())) {
            throw FCZ.getInstance().createMicroBusinessException_cant_cancel_settled_invoice();
        }

        if (var1.getState().equals(QSW.CANCELED)) {
            throw FCZ.getInstance().QOB();
        }

        if (var1.getChildWrapperOnlyActiveState() != null) {
            throw FCZ.getInstance().QOC();
        }

        var1.setValue("business_state", QSW.CANCELED.getKey());
        this.getModelManager().ROH(var1, HY.class);
        this.getModelManager().HKL(this.getParentDefinition());

    }

    public void HZE(InvoiceSellCorrection var1) throws FFK, FFO {

        this.getModelManager().HKB(this.getParentDefinition(), var1);
        this.getModelManager().HKL(this.getParentDefinition());

    }

    public UserData getUserDataForInvoice(Invoice<?> var1) throws FFK {

        UserData var4;
        JB var2 = new JB(UserData.class, var1.DBC().getValue());
        UserData var3 = (UserData) this.getModelManager().HJT(this.getParentDefinition(), var2);
        var4 = var3;

        return var4;
    }

    public File getWorkingDir() {

        File var7;
        File var1 = new File(this.GPH.DEY().getValue());
        boolean var2 = var1.mkdirs();
        if (!var2) {
            PropertyString var3 = (PropertyString) QJZ.getDefaultConfigurationProperty(FCQ.WorkingDir);
            var1 = new File(var3.DEY().getValue());
        }

        var7 = var1;

        return var7;
    }

    public File getTempFile(String var1) {

        File var4;
        File var2 = this.getWorkingDir();
        File var3 = new File(var2, "temp_" + Thread.currentThread().getId() + "_" + System.nanoTime() + "." + var1);
        var4 = var3;

        return var4;
    }

    public List<EZT> getRangesWhereSettled(String var1) {

        ArrayList var2 = new ArrayList();

        ArrayList var4;
        try {
            IY var3 = new IY(Settlement.class, null, JH.VAT, null);
            ValueContainer2 var18 = this.getModelManager().HJY(this.getParentDefinition(), var3);
            Iterator var5 = ((List) var18.getSecondValue()).iterator();

            while (var5.hasNext()) {
                EDF var6 = (EDF) var5.next();
                Settlement var7 = (Settlement) var6.getModelBaseElementWithIdObject();
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
        } catch (FFO var16) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var16);
            var4 = var2;
            return var4;
        }

        return var4;
    }

    public boolean RKZ(Period var1, String var2) throws FFK, FFO {

        boolean var5;
        IU var3 = new IU(HY.class, null, var1, IB.SELL, null, new RefId(var2), null);
        ValueContainer2 var4 = this.getModelManager().HJY(this.getParentDefinition(), var3);
        if (((List) var4.getSecondValue()).size() <= 0) {
            var5 = true;
            return var5;
        }

        var5 = false;

        return var5;
    }
}
