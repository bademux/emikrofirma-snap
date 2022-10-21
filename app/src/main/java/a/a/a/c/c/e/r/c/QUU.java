package a.a.a.c.c.e.r.c;

import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.b.ParametrizedModel;
import a.a.a.c.c.a.b.ELX;
import a.a.a.c.c.d.g.Mode;
import a.a.a.c.c.e.r.b.QUT;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.a.EYL;
import a.a.a.c.f.a.c.Contractor;
import a.a.a.c.f.a.c.TitledContractor;
import a.a.a.c.f.a.e.Invoice;
import a.a.a.c.f.a.g.ContractorModelCriteria;
import a.a.a.c.f.a.g.ModelBusinessPeriodElementTypedCriteria;
import a.a.a.c.f.a.g.ModelTechnicalElementCriteria;
import a.a.a.c.f.a.h.Settlement;
import a.a.a.c.f.a.h.SettlementStatus;
import a.a.a.c.f.a.h.SettlementType;
import a.a.a.c.f.a.n.InvoiceOtherSell;
import a.a.a.c.f.b.EZT;
import a.a.a.c.f.b.b.Period;
import a.a.a.c.f.c.a.ConfigurationProperties;
import a.a.a.c.f.c.a.PropertyString;
import a.a.a.c.f.c.b.UserData;
import a.a.a.c.g.ConfigurationProperty;

import java.io.File;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class QUU extends ELX implements EYL {
    private ConfigurationProperties REU;
    private PropertyString REV;
    private InvoiceOtherSell REW;
    private Mode REX;

    public QUU() {
        super(QUT.RES.getProcessName());

        this.REU = null;
        this.REV = null;

    }

    public void setMode(Mode var1) {
        this.REX = var1;
        this.HHI();
    }

    protected void HHI() {

        try {
            if (this.REU == null) {
                ModelTechnicalElementCriteria var1 = new ModelTechnicalElementCriteria(ConfigurationProperties.class);
                this.REU = (ConfigurationProperties) this.getModelManager().HJT(this.getParentDefinition(), var1);
                Iterator var2 = this.REU.getConfigurationProperties().iterator();

                while (var2.hasNext()) {
                    a.a.a.c.f.c.a.ConfigurationProperty var3 = (a.a.a.c.f.c.a.ConfigurationProperty) var2.next();
                    if (ConfigurationProperty.WorkingDir.getPropertyName().equals(var3.DEX().getValue())) {
                        this.REV = (PropertyString) var3;
                    }
                }
            }
        } catch (FFK var7) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var7);
            throw new FFI(var7);
        }

    }

    public SettlementStatus getSettlementStatus(LocalDate var1) throws FFK, FFO {

        SettlementStatus var7;
        Period var2 = new Period(Date.from(var1.atStartOfDay(ZoneId.systemDefault()).toInstant()));
        ModelBusinessPeriodElementTypedCriteria var3 = new ModelBusinessPeriodElementTypedCriteria(Settlement.class, var2, SettlementType.VAT, null);
        ValueContainer2 var4 = this.getModelManager().HJY(this.getParentDefinition(), var3);
        if (((List) var4.getSecondValue()).size() > 1) {
            throw new FFO("More than one settlement per one period!");
        }

        Iterator var5 = ((List) var4.getSecondValue()).iterator();
        if (!var5.hasNext()) {
            return null;
        }

        ParametrizedModel var6 = (ParametrizedModel) var5.next();
        var7 = ((Settlement) var6.getModelBaseElementWithIdObject()).getSettlementStatus();

        return var7;
    }

    public UserData getUserData() {

        UserData var3;
        try {
            ModelTechnicalElementCriteria var1 = new ModelTechnicalElementCriteria(UserData.class);
            UserData var2 = (UserData) this.getModelManager().HJT(this.getParentDefinition(), var1);
            var3 = var2;
        } catch (FFK var7) {
            throw new FFI(var7.getMessage());
        }

        return var3;
    }

    protected void HHJ() {

        try {
            switch (this.REX) {
                case NEW:
                    this.getModelManager().HJZ(this.getParentDefinition(), this.REW);
                    break;
                case EDIT:
                    this.getModelManager().HKB(this.getParentDefinition(), this.REW);
            }

            this.REW = null;
            this.getModelManager().HKL(this.getParentDefinition());
            this.REU = null;
        } catch (FFO | FFK var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
            throw new FFI(var5.getMessage());
        }

    }

    protected void resetAndCleanUpProcessImpl() {

        try {
            this.getModelManager().resetData(this.getParentDefinition());
            this.REW = null;
            this.REU = null;
            this.REV = null;
        } catch (FFK var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
            throw new FFI(var5);
        }

    }

    public void RNY() {

        try {
            this.getModelManager().resetData(this.getParentDefinition());
        } catch (FFK var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
            throw new FFI(var5);
        }

    }

    public List<EZT> getRangesWhereSettled(String var1) {

        ArrayList var2 = new ArrayList();

        ArrayList var4;
        try {
            ModelBusinessPeriodElementTypedCriteria var3 = new ModelBusinessPeriodElementTypedCriteria(Settlement.class, null, SettlementType.VAT, null);
            ValueContainer2 var18 = this.getModelManager().HJY(this.getParentDefinition(), var3);
            Iterator var5 = ((List) var18.getSecondValue()).iterator();

            while (var5.hasNext()) {
                ParametrizedModel var6 = (ParametrizedModel) var5.next();
                Settlement var7 = (Settlement) var6.getModelBaseElementWithIdObject();
                if (var7.getSettlementStatus().equals(SettlementStatus.SETTLED)) {
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

    public UserData getUserDataForInvoice(Invoice<?> var1) throws FFK {

        UserData var4;
        ModelTechnicalElementCriteria var2 = new ModelTechnicalElementCriteria(UserData.class, var1.DBC().getValue());
        UserData var3 = (UserData) this.getModelManager().HJT(this.getParentDefinition(), var2);
        var4 = var3;

        return var4;
    }

    public File getWorkingDir() {

        File var2;
        File var1 = new File(this.REV.DEY().getValue());
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

    public List<TitledContractor> getContractorsByText(String var1) {

        ArrayList var2 = new ArrayList();

        ArrayList var4;
        try {
            ContractorModelCriteria var3 = new ContractorModelCriteria(Contractor.class, var1);
            ValueContainer2 var13 = this.getModelManager().HJY(this.getParentDefinition(), var3);
            if (var13 != null) {
                Iterator var5 = ((List) var13.getSecondValue()).iterator();

                while (var5.hasNext()) {
                    ParametrizedModel var6 = (ParametrizedModel) var5.next();
                    if (var6 != null) {
                        var2.add(new TitledContractor(var6));
                    }
                }
            }

            ArrayList var12 = var2;
            return var12;
        } catch (FFO | FFK var10) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var10);
            var4 = var2;
        }

        return var4;
    }

    public void setInvoiceOtherSell(InvoiceOtherSell var1) {

        this.REW = var1;

    }

    public InvoiceOtherSell getInvoiceOtherSell() throws FFK, FFO {

        InvoiceOtherSell var1;
        if (this.REW == null) {
            this.REW = this.getModelManager().ROG(this.getParentDefinition(), InvoiceOtherSell.class);
        }

        var1 = this.REW;

        return var1;
    }
}
