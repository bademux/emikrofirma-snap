package a.a.a.c.c.e.p.c;

import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.b.EDF;
import a.a.a.c.c.a.b.ELX;
import a.a.a.c.c.d.g.Mode;
import a.a.a.c.c.e.p.b.QUC;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.a.EYL;
import a.a.a.c.f.a.c.Contractor;
import a.a.a.c.f.a.c.TitledContractor;
import a.a.a.c.f.a.g.ContractorModelCriteria;
import a.a.a.c.f.a.g.ModelBusinessPeriodElementTypedCriteria;
import a.a.a.c.f.a.h.Settlement;
import a.a.a.c.f.a.h.SettlementStatus;
import a.a.a.c.f.a.h.SettlementType;
import a.a.a.c.f.a.n.InvoiceOtherPurchase;
import a.a.a.c.f.b.b.Period;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class QUD extends ELX implements EYL {
    private InvoiceOtherPurchase RCT;
    private Mode RCU;

    public QUD() {
        super(QUC.RCR.getProcessName());

    }

    protected void HHI() {

    }

    protected void HHJ() {

        try {
            switch (this.RCU) {
                case NEW:
                    this.getModelManager().HJZ(this.getParentDefinition(), this.RCT);
                    break;
                case EDIT:
                    this.getModelManager().HKB(this.getParentDefinition(), this.RCT);
            }

            this.RCT = null;
            this.getModelManager().HKL(this.getParentDefinition());
        } catch (FFO | FFK var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
            throw new FFI(var5.getMessage());
        }

    }

    protected void resetAndCleanUpProcessImpl() {

        try {
            this.getModelManager().resetData(this.getParentDefinition());
            this.RCT = null;
        } catch (FFK var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
            throw new FFI(var5);
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

        EDF var6 = (EDF) var5.next();
        var7 = ((Settlement) var6.getModelBaseElementWithIdObject()).getSettlementStatus();

        return var7;
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
                    EDF var6 = (EDF) var5.next();
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

    public void setMode(Mode var1) {
        this.RCU = var1;
        this.HHI();
    }

    public void setInvoiceOtherPurchase(InvoiceOtherPurchase var1) {

        this.RCT = var1;

    }

    public InvoiceOtherPurchase getInvoiceOtherPurchase() throws FFK, FFO {

        InvoiceOtherPurchase var1;
        if (this.RCT == null) {
            this.RCT = this.getModelManager().ROG(this.getParentDefinition(), InvoiceOtherPurchase.class);
        }

        var1 = this.RCT;

        return var1;
    }
}
