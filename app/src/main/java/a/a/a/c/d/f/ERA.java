package a.a.a.c.d.f;

import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.e.Invoice;
import a.a.a.c.f.a.e.InvoiceSell;
import a.a.a.c.f.a.n.InvoiceOther;
import a.a.a.c.f.a.n.InvoiceOtherSell;
import a.a.a.c.f.b.c.a.KL;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;

public class ERA extends ERC {
    public ERA(Invoice<?> var1) {
        super(true);
        InvoiceSell var2 = (InvoiceSell) var1;
        HashMap var3 = new HashMap();
        Iterator var4 = var2.getSumOfAmountsDividedByTaxRate().iterator();

        while (var4.hasNext()) {
            ValueContainer2 var5 = (ValueContainer2) var4.next();
            var3.put(var5.getFirstValue(), var5.getSecondValue());
        }

        this.getForAll().setGrossPrice(var2.DAV().getValue());
        this.getForAll().setNetPrice(var2.DAW().getValue());
        this.getForAll().setVatPrice(var2.DAX().getValue());
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
            ValueContainer2 var6 = (ValueContainer2) var7.next();
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

    public ERA(InvoiceOther<?> var1) {
        super(true);
        InvoiceOtherSell var2 = (InvoiceOtherSell) var1;
        HashMap var3 = new HashMap();
        Iterator var4 = var2.getSumOfAmountsDividedByTaxRate().iterator();

        while (var4.hasNext()) {
            ValueContainer2 var5 = (ValueContainer2) var4.next();
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
            ValueContainer2 var6 = (ValueContainer2) var7.next();
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
}
