package a.a.a.c.c.e.k.c;

import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.b.EDF;
import a.a.a.c.c.a.b.ELV;
import a.a.a.c.c.d.a.ENL;
import a.a.a.c.c.e.k.b.EVB;
import a.a.a.c.e.a.d.EVZ;
import a.a.a.c.f.a.f.a.IP;
import a.a.a.c.f.a.f.a.IQ;
import a.a.a.c.f.a.f.a.IR;
import a.a.a.c.f.a.g.IY;
import a.a.a.c.f.a.g.JD;
import a.a.a.c.f.a.h.JF;
import a.a.a.c.f.a.h.JG;
import a.a.a.c.f.a.h.JH;
import a.a.a.c.f.b.b.JN;
import a.a.a.c.f.b.c.JR;
import a.a.a.c.f.b.c.KE;
import a.a.a.c.g.b.FCW;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

public class EVC extends ELV {
    private IR GNP;
    private ENL.ENM GNQ;

    public EVC() {
        super(EVB.GNN.getProcessName());

    }

    protected void HHI() {

        this.GNP = new IR();
        this.GNP.setRefId(new KE(FCW.getInstance().getMessageForKey("micro.process.cash_register_new.RefId_value")));
        this.GNP.setNet(new JR(BigDecimal.ZERO));
        this.GNP.setGross(new JR(BigDecimal.ZERO));
        this.GNP.setVat(new JR(BigDecimal.ZERO));
        LocalDate var1 = LocalDate.now().minusMonths(1L);
        this.GNP.setPeriod(new JN(var1.getYear(), var1.getMonthValue()));

    }

    public void HYJ() {
        BigDecimal var1 = BigDecimal.ZERO;
        BigDecimal var2 = BigDecimal.ZERO;
        BigDecimal var3 = BigDecimal.ZERO;

        IP var5;
        for (Iterator var4 = this.GNP.getReceiptRecordElements().iterator(); var4.hasNext(); var3 = var3.add(var5.DCH().getValue())) {
            var5 = (IP) var4.next();
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
            if (ENL.ENM.NEW.equals(this.GNQ)) {
                this.getModelManager().HJZ(this.getParentDefinition(), this.GNP);
            } else if (ENL.ENM.EDIT.equals(this.GNQ)) {
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

    public IR getReceiptRecord(JN var1) {
        try {
            JD var2 = new JD(IR.class, var1, IQ.VAT, null, null, null);
            EVZ var3 = this.getModelManager().HJY(this.getParentDefinition(), var2);
            if (((List) var3.getSecondValue()).size() > 1) {
                throw new FFO("More than one ReceiptRecord per one period!");
            } else {
                return ((List) var3.getSecondValue()).size() > 0 ? (IR) ((EDF) ((List) var3.getSecondValue()).get(0)).getModelBaseElementWithIdObject() : null;
            }
        } catch (FFO | FFK var4) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var4);
            throw new FFI(var4);
        }
    }

    public boolean HYK(JN var1) throws FFK, FFO {

        boolean var10;
        IY var2 = new IY(JF.class, var1, JH.VAT, null);
        EVZ var3 = this.getModelManager().HJY(this.getParentDefinition(), var2);
        if (((List) var3.getSecondValue()).size() > 1) {
            throw new FFO("More than one settlement per one period!");
        }

        Iterator var4 = ((List) var3.getSecondValue()).iterator();
        if (var4.hasNext()) {
            EDF var5 = (EDF) var4.next();
            boolean var6 = JG.SETTLED.equals(((JF) var5.getModelBaseElementWithIdObject()).getSettlementStatus());
            return var6;
        }

        var10 = false;

        return var10;
    }

    public IR getReceiptRecord() {
        return this.GNP;
    }

    public void setReceiptRecord(IR var1) {
        this.GNP = var1;
    }

    public void HYL(IP var1) {
        var1.setGross(new JR(var1.getNet().getValue().add(var1.getVat().getValue())));
        this.GNP.DCM().add(var1);
        this.HYJ();
    }

    public void HYM(IP var1) {
        this.GNP.DCM().remove(var1);
        this.HYJ();
    }

    public ENL.ENM getMode() {
        return this.GNQ;
    }

    public void setMode(ENL.ENM var1) {
        this.GNQ = var1;
    }
}
