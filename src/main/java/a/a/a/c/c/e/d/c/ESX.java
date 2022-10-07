package a.a.a.c.c.e.d.c;

import a.a.a.b.a.a.FDO;
import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.b.EDF;
import a.a.a.c.b.EDH;
import a.a.a.c.c.a.b.ELX;
import a.a.a.c.c.e.d.b.ESW;
import a.a.a.c.e.a.d.EVZ;
import a.a.a.c.e.a.d.EWC;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.a.EYL;
import a.a.a.c.f.a.c.HI;
import a.a.a.c.f.a.c.QJW;
import a.a.a.c.f.a.e.HR;
import a.a.a.c.f.a.e.IA;
import a.a.a.c.f.a.e.IB;
import a.a.a.c.f.a.g.AGYN;
import a.a.a.c.f.a.g.IU;
import a.a.a.c.f.a.g.JE;
import a.a.a.c.f.a.h.JG;
import a.a.a.c.f.a.h.JH;
import a.a.a.c.f.a.h.JI;
import a.a.a.c.f.b.b.JN;
import a.a.a.c.f.b.c.KA;
import a.a.a.c.f.b.c.KE;
import a.a.a.c.f.b.c.a.QSW;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ESX extends ELX implements EYL {
    private HR GFE;
    private FDO GFF;
    private EWC<JN, KE, KA> GFG;

    public ESX() {
        super(ESW.GFC.getProcessName());
        EXF.getInstance().ICO();

        try {
            this.GFE = null;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    protected void HHI() {
        EXF.getInstance().ICO();

        try {
            if (this.GFE == null) {
                this.GFE = this.getModelManager().HJX(this.getParentDefinition(), HR.class);
                this.GFE.DAW().setValue(BigDecimal.ZERO);
                this.GFE.DAV().setValue(BigDecimal.ZERO);
                this.GFE.DAX().setValue(BigDecimal.ZERO);
                this.GFF = FDO.insert;
            } else {
                this.GFF = FDO.select;
            }
        } catch (FFO | FFK var5) {
            EXF.getInstance().ICA(var5);
            throw new FFI(var5);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    protected void HHJ() {
        EXF.getInstance().ICO();

        try {
            switch (this.GFF) {
                case insert:
                    this.getModelManager().HJZ(this.getParentDefinition(), this.GFE);
                    this.HUB(this.GFE.getContractor());
                    this.GFF = FDO.select;
                    this.getModelManager().HKL(this.getParentDefinition());
                    break;
                case update:
                    this.getModelManager().HKB(this.getParentDefinition(), this.GFE);
                    this.HUB(this.GFE.getContractor());
                    this.getModelManager().HKL(this.getParentDefinition());
            }

            this.GFE = null;
        } catch (FFO | FFK var5) {
            EXF.getInstance().ICA(var5);
            throw new FFI(var5);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private void HUB(HI var1) {
        AGYN var2 = new AGYN(HI.class, var1.getNip().getValue());

        try {
            List var3 = (List) this.getModelManager().HJY(this.getParentDefinition(), var2).getSecondValue();
            HI var4;
            if (var3.size() == 0) {
                var4 = var1.AICD();
                this.getModelManager().HJZ(this.getParentDefinition(), var4);
            } else {
                var4 = (HI) ((EDF) var3.get(0)).getModelBaseElementWithIdObject();
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
            EXF.getInstance().ICA(var5);
        }

    }

    protected void resetAndCleanUpProcessImpl() {
        EXF.getInstance().ICO();

        try {
            this.getModelManager().resetData(this.getParentDefinition());
            this.GFE = null;
        } catch (FFK var5) {
            EXF.getInstance().ICA(var5);
            throw new FFI(var5);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public HR getInvoicePurchase(HI var1) {
        if (var1 != null) {
            this.GFE.setContractor(var1.AICD());
        }

        return this.GFE;
    }

    public void setInvoicePurchase(HR var1) {
        this.GFE = var1;
    }

    public void setActionType(FDO var1) {
        this.GFF = var1;
    }

    public void setInvoicePurchaseEditKey(EWC<JN, KE, KA> var1) {
        this.GFG = var1;
    }

    public boolean HUC(JN var1, KE var2, KA var3) {
        EXF.getInstance().ICO();

        boolean var19;
        try {
            boolean var4 = false;
            if (var1 != null && var1.getYear() != null && var1.getMonth() != null && var2 != null && var2.getValue() != null) {
                IU var5 = new IU(HR.class, null, var1, IB.PURCHASE, null, new KE(var2), var3, null);
                EVZ var6 = this.getModelManager().HJY(this.getParentDefinition(), var5);
                if (((List) var6.getSecondValue()).isEmpty()) {
                    var4 = true;
                } else {
                    boolean var7 = false;
                    if (this.GFG != null) {
                        JN var8 = this.GFG.getFirstValue();
                        KE var9 = this.GFG.getSecondValue();
                        KA var10 = this.GFG.getThirdValue();
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
            EXF.getInstance().ICA(var17);
            throw new FFI(var17);
        } finally {
            EXF.getInstance().ICP();
        }

        return var19;
    }

    public boolean HUD(JN var1) {
        EXF.getInstance().ICO();

        boolean var12;
        try {
            boolean var2 = false;
            if (var1 != null && var1.getYear() != null && var1.getMonth() != null) {
                JE var3 = new JE(JI.class, var1, JH.VAT);
                EVZ var4 = this.getModelManager().HJY(this.getParentDefinition(), var3);
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
            EXF.getInstance().ICA(var10);
            throw new FFI(var10);
        } finally {
            EXF.getInstance().ICP();
        }

        return var12;
    }

    public List<QJW> getContractorsByText(String var1) {
        EXF.getInstance().ICO();
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
                        var2.add(new QJW(var6));
                    }
                }
            }

            ArrayList var12 = var2;
            return var12;
        } catch (FFO | FFK var10) {
            EXF.getInstance().ICA(var10);
            var4 = var2;
        } finally {
            EXF.getInstance().ICP();
        }

        return var4;
    }
}
