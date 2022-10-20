package a.a.a.c.f.a.n;

import a.a.a.c.f.b.c.Amount;
import a.a.a.c.f.b.c.JY;
import a.a.a.c.f.b.c.QSU;
import a.a.a.c.f.b.c.TaxRateModel;
import a.a.a.c.f.b.c.a.TaxRate;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class InvoiceOtherElementSell extends InvoiceOtherElement {
    public InvoiceOtherElementSell() {

    }

    public Object RJJ() {
        InvoiceOtherElementSell var1 = new InvoiceOtherElementSell();
        if (this.getPosition() != null && this.getPosition().getValue() != null) {
            var1.QXU = new JY(this.getPosition().getValue());
        }

        if (this.getNetPriceForAll() != null && this.getNetPriceForAll().getValue() != null) {
            var1.QXV = (Amount) this.getNetPriceForAll().clone();
        }

        if (this.getTaxValueForAll() != null && this.getTaxValueForAll().getValue() != null) {
            var1.QXW = (Amount) this.getTaxValueForAll().clone();
        }

        if (this.getGrossValueForAll() != null && this.getGrossValueForAll().getValue() != null) {
            var1.QXX = (Amount) this.getGrossValueForAll().clone();
        }

        if (this.getLastCalculationMethod() != null && this.getLastCalculationMethod().getValue() != null) {
            var1.QXZ = new QSU(this.getLastCalculationMethod().getValue());
        }

        if (this.getTaxRate() != null && this.getTaxRate().getValue() != null) {
            TaxRate[] var2 = TaxRate.values();
            int var3 = var2.length;

            for (int var4 = 0; var4 < var3; ++var4) {
                TaxRate var5 = var2[var4];
                if (var5.equals(this.getTaxRate().getValue())) {
                    var1.QXY = new TaxRateModel(var5);
                }
            }
        }

        return var1;
    }
}
