package a.a.a.c.c.e.d.c;

import a.a.a.b.a.a.SqlOperation;
import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.b.ParametrizedModel;
import a.a.a.c.b.EDH;
import a.a.a.c.c.a.b.ELX;
import a.a.a.c.c.e.d.b.ESW;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.e.a.d.ValueContainer3;
import a.a.a.c.f.a.a.EYL;
import a.a.a.c.f.a.c.Contractor;
import a.a.a.c.f.a.c.TitledContractor;
import a.a.a.c.f.a.e.InvoicePurchase;
import a.a.a.c.f.a.e.InvoiceType;
import a.a.a.c.f.a.g.ContractorModelCriteria;
import a.a.a.c.f.a.g.InvoiceCriteria;
import a.a.a.c.f.a.g.SettlementCriteria;
import a.a.a.c.f.a.h.SettlementStatus;
import a.a.a.c.f.a.h.SettlementType;
import a.a.a.c.f.a.h.SettlementVat;
import a.a.a.c.f.b.b.Period;
import a.a.a.c.f.b.c.Nip;
import a.a.a.c.f.b.c.RefId;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ESX extends ELX implements EYL {
    private InvoicePurchase GFE;
    private SqlOperation GFF;
    private ValueContainer3<Period, RefId, Nip> GFG;

    public ESX() {
        super(ESW.GFC.getProcessName());

        this.GFE = null;

    }

    protected void HHI() {

        try {
            if (this.GFE == null) {
                this.GFE = this.getModelManager().HJX(this.getParentDefinition(), InvoicePurchase.class);
                this.GFE.DAW().setValue(BigDecimal.ZERO);
                this.GFE.DAV().setValue(BigDecimal.ZERO);
                this.GFE.DAX().setValue(BigDecimal.ZERO);
                this.GFF = SqlOperation.insert;
            } else {
                this.GFF = SqlOperation.select;
            }
        } catch (FFO | FFK var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
            throw new FFI(var5);
        }

    }

    protected void HHJ() {

        try {
            switch (this.GFF) {
                case insert:
                    this.getModelManager().HJZ(this.getParentDefinition(), this.GFE);
                    this.HUB(this.GFE.getContractor());
                    this.GFF = SqlOperation.select;
                    this.getModelManager().HKL(this.getParentDefinition());
                    break;
                case update:
                    this.getModelManager().HKB(this.getParentDefinition(), this.GFE);
                    this.HUB(this.GFE.getContractor());
                    this.getModelManager().HKL(this.getParentDefinition());
            }

            this.GFE = null;
        } catch (FFO | FFK var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
            throw new FFI(var5);
        }

    }

    private void HUB(Contractor var1) {
        ContractorModelCriteria var2 = new ContractorModelCriteria(Contractor.class, var1.getNip().getValue());

        try {
            List var3 = (List) this.getModelManager().HJY(this.getParentDefinition(), var2).getSecondValue();
            Contractor var4;
            if (var3.size() == 0) {
                var4 = var1.AICD();
                this.getModelManager().HJZ(this.getParentDefinition(), var4);
            } else {
                var4 = (Contractor) ((ParametrizedModel) var3.get(0)).getModelBaseElementWithIdObject();
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
            this.GFE = null;
        } catch (FFK var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
            throw new FFI(var5);
        }

    }

    public InvoicePurchase getInvoicePurchase(Contractor var1) {
        if (var1 != null) {
            this.GFE.setContractor(var1.AICD());
        }

        return this.GFE;
    }

    public void setInvoicePurchase(InvoicePurchase var1) {
        this.GFE = var1;
    }

    public void setActionType(SqlOperation var1) {
        this.GFF = var1;
    }

    public void setInvoicePurchaseEditKey(ValueContainer3<Period, RefId, Nip> var1) {
        this.GFG = var1;
    }

    public boolean HUC(Period var1, RefId var2, Nip var3) {

        boolean var19;
        try {
            boolean var4 = false;
            if (var1 != null && var1.getYear() != null && var1.getMonth() != null && var2 != null && var2.getValue() != null) {
                InvoiceCriteria var5 = new InvoiceCriteria(InvoicePurchase.class, null, var1, InvoiceType.PURCHASE, null, new RefId(var2), var3, null);
                ValueContainer2 var6 = this.getModelManager().HJY(this.getParentDefinition(), var5);
                if (((List) var6.getSecondValue()).isEmpty()) {
                    var4 = true;
                } else {
                    boolean var7 = false;
                    if (this.GFG != null) {
                        Period var8 = this.GFG.getFirstValue();
                        RefId var9 = this.GFG.getSecondValue();
                        Nip var10 = this.GFG.getThirdValue();
                        if (var8 != null && var8.getYear() != null && var8.getMonth() != null && var9 != null && var9.getValue() != null && var10 != null && var10.getValue() != null) {
                            Iterator var11 = ((List) var6.getSecondValue()).iterator();

                            while (var11.hasNext()) {
                                ParametrizedModel var12 = (ParametrizedModel) var11.next();
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

    public boolean HUD(Period var1) {

        boolean var12;
        try {
            boolean var2 = false;
            if (var1 != null && var1.getYear() != null && var1.getMonth() != null) {
                SettlementCriteria var3 = new SettlementCriteria(SettlementVat.class, var1, SettlementType.VAT);
                ValueContainer2 var4 = this.getModelManager().HJY(this.getParentDefinition(), var3);
                if (((List) var4.getSecondValue()).isEmpty()) {
                    var2 = true;
                } else {
                    ParametrizedModel var5 = (ParametrizedModel) ((List) var4.getSecondValue()).get(0);
                    SettlementVat var6 = (SettlementVat) var5.getModelBaseElementWithIdObject();
                    if (var6 != null) {
                        var2 = !SettlementStatus.SETTLED.equals(var6.getSettlementStatus());
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
}
