package a.a.a.c.c.e.m.c;

import a.a.a.b.a.a.FDO;
import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.b.EDF;
import a.a.a.c.b.EDH;
import a.a.a.c.c.a.b.ELX;
import a.a.a.c.c.e.m.b.QTA;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.e.a.d.ValueContainer3;
import a.a.a.c.f.a.a.EYL;
import a.a.a.c.f.a.c.Contractor;
import a.a.a.c.f.a.c.QJW;
import a.a.a.c.f.a.e.InvoicePurchase;
import a.a.a.c.f.a.e.IB;
import a.a.a.c.f.a.e.QSF;
import a.a.a.c.f.a.g.AGYN;
import a.a.a.c.f.a.g.IU;
import a.a.a.c.f.a.g.JE;
import a.a.a.c.f.a.h.JG;
import a.a.a.c.f.a.h.JH;
import a.a.a.c.f.a.h.JI;
import a.a.a.c.f.b.b.Period;
import a.a.a.c.f.b.c.KA;
import a.a.a.c.f.b.c.RefId;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class QTB extends ELX implements EYL {
    private InvoicePurchase QZO;
    private FDO QZP;
    private ValueContainer3<Period, RefId, KA> QZQ;

    public QTB() {
        super(QTA.QZM.getProcessName());

        this.QZO = null;

    }

    protected void HHI() {

        try {
            if (this.QZO == null) {
                this.QZO = this.getModelManager().HJX(this.getParentDefinition(), QSF.class);
                this.QZO.DAW().setValue(BigDecimal.ZERO);
                this.QZO.DAV().setValue(BigDecimal.ZERO);
                this.QZO.DAX().setValue(BigDecimal.ZERO);
                this.QZP = FDO.insert;
            } else {
                this.QZP = FDO.select;
            }
        } catch (FFO | FFK var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
            throw new FFI(var5);
        }

    }

    protected void HHJ() {

        try {
            switch (this.QZP) {
                case insert:
                    this.getModelManager().HJZ(this.getParentDefinition(), this.QZO);
                    this.RKE(this.QZO.getContractor());
                    this.QZP = FDO.select;
                    this.getModelManager().HKL(this.getParentDefinition());
                    break;
                case update:
                    this.getModelManager().HKB(this.getParentDefinition(), this.QZO);
                    this.RKE(this.QZO.getContractor());
                    this.getModelManager().HKL(this.getParentDefinition());
            }

            this.QZO = null;
        } catch (FFO | FFK var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
            throw new FFI(var5);
        }

    }

    private void RKE(Contractor var1) {
        AGYN var2 = new AGYN(Contractor.class, var1.getNip().getValue());

        try {
            List var3 = (List) this.getModelManager().HJY(this.getParentDefinition(), var2).getSecondValue();
            Contractor var4;
            if (var3.size() == 0) {
                var4 = var1.AICD();
                this.getModelManager().HJZ(this.getParentDefinition(), var4);
            } else {
                var4 = (Contractor) ((EDF) var3.get(0)).getModelBaseElementWithIdObject();
                var4.setName(var1.DAI());
                var4.setNip(var1.DAJ());
                var4.setAccountNumber(var1.DAL());
                var4.setRegon(var1.DAK());
                var4.setAddress(var1.DAM().DCU());
                var4.setTelephone(var1.DAN());
                var4.setEmail(var1.DAO());
                var4.setRemarks(var1.DAP());
                this.getModelManager().HKB(this.getParentDefinition(), var4);
            }
        } catch (FFO | FFK var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
        }

    }

    protected void resetAndCleanUpProcessImpl() {

        try {
            this.getModelManager().resetData(this.getParentDefinition());
            this.QZO = null;
        } catch (FFK var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
            throw new FFI(var5);
        }

    }

    public InvoicePurchase getInvoicePurchase(Contractor var1) {
        if (var1 != null) {
            this.QZO.setContractor(var1.AICD());
        }

        return this.QZO;
    }

    public void setInvoicePurchase(InvoicePurchase var1) {
        this.QZO = var1;
    }

    public void setActionType(FDO var1) {
        this.QZP = var1;
    }

    public void setInvoicePurchaseEditKey(ValueContainer3<Period, RefId, KA> var1) {
        this.QZQ = var1;
    }

    public boolean RKF(Period var1, RefId var2, KA var3) {

        boolean var19;
        try {
            boolean var4 = false;
            if (var1 != null && var1.getYear() != null && var1.getMonth() != null && var2 != null && var2.getValue() != null) {
                IU var5 = new IU(InvoicePurchase.class, null, var1, IB.PURCHASE, null, new RefId(var2), var3, null);
                ValueContainer2 var6 = this.getModelManager().HJY(this.getParentDefinition(), var5);
                if (((List) var6.getSecondValue()).isEmpty()) {
                    var4 = true;
                } else {
                    boolean var7 = false;
                    if (this.QZQ != null) {
                        Period var8 = this.QZQ.getFirstValue();
                        RefId var9 = this.QZQ.getSecondValue();
                        KA var10 = this.QZQ.getThirdValue();
                        if (var8 != null && var8.getYear() != null && var8.getMonth() != null && var9 != null && var9.getValue() != null && var10 != null && var10.getValue() != null) {
                            Iterator var11 = ((List) var6.getSecondValue()).iterator();

                            while (var11.hasNext()) {
                                EDF var12 = (EDF) var11.next();
                                EDH var13 = new EDH(var12);
                                if (var8.equals(var13.getPeriod()) && var9.equals(var13.getRefId()) && var10.equals(var13.getIssuerNumber())) {
                                    var7 = true;
                                    break;
                                }
                            }
                        }
                    }

                    var4 = var7;
                }
            } else {
                var4 = true;
            }

            var19 = var4;
        } catch (FFO | FFK var17) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var17);
            throw new FFI(var17);
        }

        return var19;
    }

    public boolean RKG(Period var1) {

        boolean var12;
        try {
            boolean var2 = false;
            if (var1 != null && var1.getYear() != null && var1.getMonth() != null) {
                JE var3 = new JE(JI.class, var1, JH.VAT);
                ValueContainer2 var4 = this.getModelManager().HJY(this.getParentDefinition(), var3);
                if (((List) var4.getSecondValue()).isEmpty()) {
                    var2 = true;
                } else {
                    EDF var5 = (EDF) ((List) var4.getSecondValue()).get(0);
                    JI var6 = (JI) var5.getModelBaseElementWithIdObject();
                    if (var6 != null) {
                        var2 = !JG.SETTLED.equals(var6.getSettlementStatus());
                    }
                }
            } else {
                var2 = true;
            }

            var12 = var2;
        } catch (FFO | FFK var10) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var10);
            throw new FFI(var10);
        }

        return var12;
    }

    public List<QJW> getContractorsByText(String var1) {

        ArrayList var2 = new ArrayList();

        ArrayList var4;
        try {
            AGYN var3 = new AGYN(Contractor.class, var1);
            ValueContainer2 var13 = this.getModelManager().HJY(this.getParentDefinition(), var3);
            if (var13 != null) {
                Iterator var5 = ((List) var13.getSecondValue()).iterator();

                while (var5.hasNext()) {
                    EDF var6 = (EDF) var5.next();
                    if (var6 != null) {
                        var2.add(new QJW(var6));
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
}
