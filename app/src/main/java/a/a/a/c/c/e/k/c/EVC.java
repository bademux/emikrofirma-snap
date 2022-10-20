package a.a.a.c.c.e.k.c;

import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.b.EDF;
import a.a.a.c.c.a.b.ELV;
import a.a.a.c.c.d.a.ENL;
import a.a.a.c.c.e.k.b.EVB;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.f.a.RecordElementVat;
import a.a.a.c.f.a.f.a.RecordType;
import a.a.a.c.f.a.f.a.ReceiptRecordVat;
import a.a.a.c.f.a.g.ModelBusinessPeriodElementTypedCriteria;
import a.a.a.c.f.a.g.ReceiptRecordCriteria;
import a.a.a.c.f.a.h.Settlement;
import a.a.a.c.f.a.h.SettlementStatus;
import a.a.a.c.f.a.h.SettlementType;
import a.a.a.c.f.b.b.Period;
import a.a.a.c.f.b.c.Amount;
import a.a.a.c.f.b.c.RefId;
import a.a.a.c.g.b.FCW;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

public class EVC extends ELV {
    private ReceiptRecordVat GNP;
    private ENL.Mode GNQ;

    public EVC() {
        super(EVB.GNN.getProcessName());

    }

    protected void HHI() {

        this.GNP = new ReceiptRecordVat();
        this.GNP.setRefId(new RefId(FCW.getInstance().getMessageForKey("micro.process.cash_register_new.RefId_value")));
        this.GNP.setNet(new Amount(BigDecimal.ZERO));
        this.GNP.setGross(new Amount(BigDecimal.ZERO));
        this.GNP.setVat(new Amount(BigDecimal.ZERO));
        LocalDate var1 = LocalDate.now().minusMonths(1L);
        this.GNP.setPeriod(new Period(var1.getYear(), var1.getMonthValue()));

    }

    public void HYJ() {
        BigDecimal var1 = BigDecimal.ZERO;
        BigDecimal var2 = BigDecimal.ZERO;
        BigDecimal var3 = BigDecimal.ZERO;

        RecordElementVat var5;
        for (Iterator var4 = this.GNP.getReceiptRecordElements().iterator(); var4.hasNext(); var3 = var3.add(var5.DCH().getValue())) {
            var5 = (RecordElementVat) var4.next();
            BigDecimal var6 = var5.DCF().getValue();
            BigDecimal var7 = var5.DCG().getValue();
            var1 = var1.add(var6);
            var2 = var2.add(var7);
        }

        this.GNP.DCJ().setValue(var1);
        this.GNP.DCK().setValue(var2);
        this.GNP.DCL().setValue(var3);
    }

    protected void HHJ() {

        try {
            if (ENL.Mode.NEW.equals(this.GNQ)) {
                this.getModelManager().HJZ(this.getParentDefinition(), this.GNP);
            } else if (ENL.Mode.EDIT.equals(this.GNQ)) {
                this.getModelManager().HKB(this.getParentDefinition(), this.GNP);
            }

            this.getModelManager().HKL(this.getParentDefinition());
            this.GNP = null;
            this.GNQ = null;
        } catch (FFO | FFK var5) {
            throw new FFI(var5.getMessage());
        }

    }

    protected void resetAndCleanUpProcessImpl() {

    }

    public ReceiptRecordVat getReceiptRecord(Period var1) {
        try {
            ReceiptRecordCriteria var2 = new ReceiptRecordCriteria(ReceiptRecordVat.class, var1, RecordType.VAT, null, null, null);
            ValueContainer2 var3 = this.getModelManager().HJY(this.getParentDefinition(), var2);
            if (((List) var3.getSecondValue()).size() > 1) {
                throw new FFO("More than one ReceiptRecord per one period!");
            } else {
                return ((List) var3.getSecondValue()).size() > 0 ? (ReceiptRecordVat) ((EDF) ((List) var3.getSecondValue()).get(0)).getModelBaseElementWithIdObject() : null;
            }
        } catch (FFO | FFK var4) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var4);
            throw new FFI(var4);
        }
    }

    public boolean HYK(Period var1) throws FFK, FFO {

        boolean var10;
        ModelBusinessPeriodElementTypedCriteria var2 = new ModelBusinessPeriodElementTypedCriteria(Settlement.class, var1, SettlementType.VAT, null);
        ValueContainer2 var3 = this.getModelManager().HJY(this.getParentDefinition(), var2);
        if (((List) var3.getSecondValue()).size() > 1) {
            throw new FFO("More than one settlement per one period!");
        }

        Iterator var4 = ((List) var3.getSecondValue()).iterator();
        if (var4.hasNext()) {
            EDF var5 = (EDF) var4.next();
            boolean var6 = SettlementStatus.SETTLED.equals(((Settlement) var5.getModelBaseElementWithIdObject()).getSettlementStatus());
            return var6;
        }

        var10 = false;

        return var10;
    }

    public ReceiptRecordVat getReceiptRecord() {
        return this.GNP;
    }

    public void setReceiptRecord(ReceiptRecordVat var1) {
        this.GNP = var1;
    }

    public void HYL(RecordElementVat var1) {
        var1.setGross(new Amount(var1.getNet().getValue().add(var1.getVat().getValue())));
        this.GNP.DCM().add(var1);
        this.HYJ();
    }

    public void HYM(RecordElementVat var1) {
        this.GNP.DCM().remove(var1);
        this.HYJ();
    }

    public ENL.Mode getMode() {
        return this.GNQ;
    }

    public void setMode(ENL.Mode var1) {
        this.GNQ = var1;
    }
}
