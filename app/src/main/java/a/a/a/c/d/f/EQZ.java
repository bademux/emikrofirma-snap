package a.a.a.c.d.f;

import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.e.Invoice;
import a.a.a.c.f.a.e.InvoiceElement;
import a.a.a.c.f.a.e.InvoiceElementPurchase;
import a.a.a.c.f.a.e.InvoicePurchase;
import a.a.a.c.f.a.n.InvoiceOther;
import a.a.a.c.f.a.n.InvoiceOtherPurchase;
import a.a.a.c.f.b.c.a.TaxRate;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class EQZ extends ERC {
    private ERB FYF;
    private ERB FYG;

    public EQZ(Invoice<?> var1) {
        super(false);
        InvoicePurchase var2 = (InvoicePurchase) var1;
        List var3 = var2.getInvoiceElements();
        this.FYF = new ERB(false);
        this.FYG = new ERB(false);
        Iterator var4;
        InvoiceElementPurchase var5;
        if (var2.getIsAggregatePurchase() != null && var2.getIsAggregatePurchase()) {
            var4 = var3.iterator();

            while (var4.hasNext()) {
                var5 = (InvoiceElementPurchase) var4.next();
                this.RID(var5);
            }
        } else {
            var4 = var3.iterator();

            while (var4.hasNext()) {
                var5 = (InvoiceElementPurchase) var4.next();
                this.HRK(var5);
            }
        }

    }

    public EQZ(InvoiceOther<?> var1) {
        super(true);
        InvoiceOtherPurchase var2 = (InvoiceOtherPurchase) var1;
        HashMap var3 = new HashMap();
        Iterator var4 = var2.getSumOfAmountsDividedByTaxRate().iterator();

        while (var4.hasNext()) {
            ValueContainer2 var5 = (ValueContainer2) var4.next();
            var3.put(var5.getFirstValue(), var5.getSecondValue());
        }

        this.getForAll().setGrossPrice(var2.RIT().getValue());
        this.getForAll().setNetPrice(var2.RIU().getValue());
        this.getForAll().setVatPrice(var2.RIV().getValue());
        this.getForAll().setVat23Amount((BigDecimal) var3.get(TaxRate.RATE_23));
        this.getForAll().setVat8Amount((BigDecimal) var3.get(TaxRate.RATE_8));
        this.getForAll().setVat5Amount((BigDecimal) var3.get(TaxRate.RATE_5));
        this.getForAll().setVat4Amount((BigDecimal) var3.get(TaxRate.RATE_4));
        this.getForAll().setVat0Amount((BigDecimal) var3.get(TaxRate.RATE_0));
        this.getForAll().setVatZwAmount((BigDecimal) var3.get(TaxRate.ZW));
        this.getForAll().setVatNpAmount((BigDecimal) var3.get(TaxRate.NP));
        this.getForAll().setVatOo23Amount((BigDecimal) var3.get(TaxRate.OO_23));
        this.getForAll().setVatOo8Amount((BigDecimal) var3.get(TaxRate.OO_8));
        HashMap var8 = new HashMap();
        Iterator var7 = var2.getAmountOfTaxDividedByTaxRate().iterator();

        while (var7.hasNext()) {
            ValueContainer2 var6 = (ValueContainer2) var7.next();
            var8.put(var6.getFirstValue(), var6.getSecondValue());
        }

        this.getForAll().setVat23Tax((BigDecimal) var8.get(TaxRate.RATE_23));
        this.getForAll().setVat8Tax((BigDecimal) var8.get(TaxRate.RATE_8));
        this.getForAll().setVat5Tax((BigDecimal) var8.get(TaxRate.RATE_5));
        this.getForAll().setVat4Tax((BigDecimal) var8.get(TaxRate.RATE_4));
        this.getForAll().setVat0Tax((BigDecimal) var8.get(TaxRate.RATE_0));
        this.getForAll().setVatZwTax((BigDecimal) var8.get(TaxRate.ZW));
        this.getForAll().setVatNpTax((BigDecimal) var8.get(TaxRate.NP));
        this.getForAll().setVatOo23Tax((BigDecimal) var8.get(TaxRate.OO_23));
        this.getForAll().setVatOo8Tax((BigDecimal) var8.get(TaxRate.OO_8));
    }

    public void HRK(InvoiceElement var1) {
        if (var1 instanceof InvoiceElementPurchase) {
            switch (((InvoiceElementPurchase) var1).DBP().getValue()) {
                case acquisition_of_general_goods:
                    this.FYF.HRQ(var1);
                    break;
                case acquisition_of_fixed_assets:
                    this.FYG.HRQ(var1);
            }
        }

        super.HRK(var1);
    }

    public void RID(InvoiceElement var1) {
        if (var1 instanceof InvoiceElementPurchase) {
            switch (((InvoiceElementPurchase) var1).DBP().getValue()) {
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
