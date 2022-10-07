package a.a.a.c.d.f;

import a.a.a.c.e.a.d.EVZ;
import a.a.a.c.f.a.e.HN;
import a.a.a.c.f.a.e.HO;
import a.a.a.c.f.a.e.HP;
import a.a.a.c.f.a.e.HR;
import a.a.a.c.f.a.n.QSG;
import a.a.a.c.f.a.n.QSK;
import a.a.a.c.f.b.c.a.KL;
import a.a.a.c.f.b.c.a.KM;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class EQZ extends ERC {
    private ERB FYF;
    private ERB FYG;

    public EQZ(HN<?> var1) {
        super(false);
        HR var2 = (HR) var1;
        List var3 = var2.getInvoiceElements();
        this.FYF = new ERB(false);
        this.FYG = new ERB(false);
        Iterator var4;
        HP var5;
        if (var2.getIsAggregatePurchase() != null && var2.getIsAggregatePurchase()) {
            var4 = var3.iterator();

            while (var4.hasNext()) {
                var5 = (HP) var4.next();
                this.RID(var5);
            }
        } else {
            var4 = var3.iterator();

            while (var4.hasNext()) {
                var5 = (HP) var4.next();
                this.HRK(var5);
            }
        }

    }

    public EQZ(QSG<?> var1) {
        super(true);
        QSK var2 = (QSK) var1;
        HashMap var3 = new HashMap();
        Iterator var4 = var2.getSumOfAmountsDividedByTaxRate().iterator();

        while (var4.hasNext()) {
            EVZ var5 = (EVZ) var4.next();
            var3.put(var5.getFirstValue(), var5.getSecondValue());
        }

        this.getForAll().setGrossPrice(var2.RIT().getValue());
        this.getForAll().setNetPrice(var2.RIU().getValue());
        this.getForAll().setVatPrice(var2.RIV().getValue());
        this.getForAll().setVat23Amount((BigDecimal) var3.get(KL.RATE_23));
        this.getForAll().setVat8Amount((BigDecimal) var3.get(KL.RATE_8));
        this.getForAll().setVat5Amount((BigDecimal) var3.get(KL.RATE_5));
        this.getForAll().setVat4Amount((BigDecimal) var3.get(KL.RATE_4));
        this.getForAll().setVat0Amount((BigDecimal) var3.get(KL.RATE_0));
        this.getForAll().setVatZwAmount((BigDecimal) var3.get(KL.ZW));
        this.getForAll().setVatNpAmount((BigDecimal) var3.get(KL.NP));
        this.getForAll().setVatOo23Amount((BigDecimal) var3.get(KL.OO_23));
        this.getForAll().setVatOo8Amount((BigDecimal) var3.get(KL.OO_8));
        HashMap var8 = new HashMap();
        Iterator var7 = var2.getAmountOfTaxDividedByTaxRate().iterator();

        while (var7.hasNext()) {
            EVZ var6 = (EVZ) var7.next();
            var8.put(var6.getFirstValue(), var6.getSecondValue());
        }

        this.getForAll().setVat23Tax((BigDecimal) var8.get(KL.RATE_23));
        this.getForAll().setVat8Tax((BigDecimal) var8.get(KL.RATE_8));
        this.getForAll().setVat5Tax((BigDecimal) var8.get(KL.RATE_5));
        this.getForAll().setVat4Tax((BigDecimal) var8.get(KL.RATE_4));
        this.getForAll().setVat0Tax((BigDecimal) var8.get(KL.RATE_0));
        this.getForAll().setVatZwTax((BigDecimal) var8.get(KL.ZW));
        this.getForAll().setVatNpTax((BigDecimal) var8.get(KL.NP));
        this.getForAll().setVatOo23Tax((BigDecimal) var8.get(KL.OO_23));
        this.getForAll().setVatOo8Tax((BigDecimal) var8.get(KL.OO_8));
    }

    public void HRK(HO var1) {
        if (var1 instanceof HP) {
            switch (((HP) var1).DBP().getValue()) {
                case acquisition_of_general_goods:
                    this.FYF.HRQ(var1);
                    break;
                case acquisition_of_fixed_assets:
                    this.FYG.HRQ(var1);
            }
        }

        super.HRK(var1);
    }

    public void RID(HO var1) {
        if (var1 instanceof HP) {
            switch (((HP) var1).DBP().getValue()) {
                case acquisition_of_general_goods:
                    this.FYF.RIC(var1);
                    break;
                case acquisition_of_fixed_assets:
                    this.FYG.RIC(var1);
            }
        }

        super.RID(var1);
    }

    public ERB getForGeneralGoods() {
        return this.FYF;
    }

    public ERB getForFixedAssets() {
        return this.FYG;
    }

    public Boolean HRN() {
        return this.FYF.HRU();
    }

    public Boolean isForFixedAssetsEmpty() {
        return this.FYG.HRU();
    }

    public Boolean HRL() {
        return super.HRL() || this.FYF.getInvoiceIsOo() || this.FYG.getInvoiceIsOo();
    }
}
