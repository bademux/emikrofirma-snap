package a.a.a.c.f.a.n;

import a.a.a.c.f.b.c.*;
import a.a.a.c.f.b.c.a.TaxRate;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class InvoiceOtherElementPurchase extends InvoiceOtherElement {
    private PrivtePerson QYA;
    private KR QYB;

    public InvoiceOtherElementPurchase() {

    }

    public PrivtePerson getTaxDeduction50P() {
        return this.QYA;
    }

    public PrivtePerson RJK() {
        if (this.QYA == null) {
            this.QYA = new PrivtePerson();
        }

        return this.QYA;
    }

    public void setTaxDeduction50P(PrivtePerson var1) {
        this.QYA = var1;
    }

    public KR getTaxReason() {
        return this.QYB;
    }

    public KR RJL() {
        if (this.QYB == null) {
            this.QYB = new KR();
        }

        return this.QYB;
    }

    public void setTaxReason(KR var1) {
        this.QYB = var1;
    }

    public String toString() {
        return "InvoiceOtherElementPurchase [taxDeduction50P=" + this.QYA + ", taxReason=" + this.QYB + "] " + super.toString();
    }

    public Object RJJ() {
        InvoiceOtherElementPurchase var1 = new InvoiceOtherElementPurchase();
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

        if (this.getTaxDeduction50P() != null && this.getTaxDeduction50P().getValue() != null) {
            var1.QYA = new PrivtePerson(this.getTaxDeduction50P().getValue());
        }

        if (this.getTaxReason() != null && this.getTaxReason().getValue() != null) {
            var1.QYB = new KR(this.getTaxReason().getValue());
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
