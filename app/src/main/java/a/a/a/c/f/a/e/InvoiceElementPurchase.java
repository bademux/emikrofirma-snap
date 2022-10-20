package a.a.a.c.f.a.e;

import a.a.a.c.f.b.c.*;
import a.a.a.c.f.b.c.a.TaxRate;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class InvoiceElementPurchase extends InvoiceElement {
    private PrivtePerson AKI;
    private KR AKJ;

    public InvoiceElementPurchase() {

    }

    public PrivtePerson getTaxDeduction50P() {
        return this.AKI;
    }

    public PrivtePerson DBO() {
        if (this.AKI == null) {
            this.AKI = new PrivtePerson();
        }

        return this.AKI;
    }

    public void setTaxDeduction50P(PrivtePerson var1) {
        this.AKI = var1;
    }

    public KR getTaxReason() {
        return this.AKJ;
    }

    public KR DBP() {
        if (this.AKJ == null) {
            this.AKJ = new KR();
        }

        return this.AKJ;
    }

    public void setTaxReason(KR var1) {
        this.AKJ = var1;
    }

    public String toString() {
        return "InvoiceElementPurchase [taxDeduction50P=" + this.AKI + ", taxReason=" + this.AKJ + "] " + super.toString();
    }

    public Object RIH() {
        InvoiceElementPurchase var1 = new InvoiceElementPurchase();
        if (this.getPosition() != null && this.getPosition().getValue() != null) {
            var1.AJX = new JY(this.getPosition().getValue());
        }

        if (this.getName() != null && this.getName().getValue() != null) {
            var1.AJY = new Text(this.getName().getValue());
        }

        if (this.getDescription() != null && this.getDescription().getValue() != null) {
            var1.AJZ = new Text(this.getDescription().getValue());
        }

        if (this.getQuantity() != null && this.getQuantity().getValue() != null) {
            var1.AKA = (Amount) this.getQuantity().clone();
        }

        if (this.getUnit() != null && this.getUnit().getValue() != null) {
            var1.AKB = new Text(this.getUnit().getValue());
        }

        if (this.getNetPriceForUnit() != null && this.getNetPriceForUnit().getValue() != null) {
            var1.AKC = (Amount) this.getNetPriceForUnit().clone();
        }

        if (this.getGrossPriceForUnit() != null && this.getGrossPriceForUnit().getValue() != null) {
            var1.QWO = (Amount) this.getGrossPriceForUnit().clone();
        }

        if (this.getDiscountAmount() != null && this.getDiscountAmount().getValue() != null) {
            var1.AKD = (Amount) this.getDiscountAmount().clone();
        }

        if (this.getNetPriceForAll() != null && this.getNetPriceForAll().getValue() != null) {
            var1.AKE = (Amount) this.getNetPriceForAll().clone();
        }

        if (this.getTaxValueForAll() != null && this.getTaxValueForAll().getValue() != null) {
            var1.AKF = (Amount) this.getTaxValueForAll().clone();
        }

        if (this.getGrossValueForAll() != null && this.getGrossValueForAll().getValue() != null) {
            var1.AKG = (Amount) this.getGrossValueForAll().clone();
        }

        if (this.getLastCalculationMethod() != null && this.getLastCalculationMethod().getValue() != null) {
            var1.QWP = new QSU(this.getLastCalculationMethod().getValue());
        }

        if (this.getTaxDeduction50P() != null && this.getTaxDeduction50P().getValue() != null) {
            var1.AKI = new PrivtePerson(this.getTaxDeduction50P().getValue());
        }

        if (this.getTaxReason() != null && this.getTaxReason().getValue() != null) {
            var1.AKJ = new KR(this.getTaxReason().getValue());
        }

        if (this.getTaxRate() != null && this.getTaxRate().getValue() != null) {
            TaxRate[] var2 = TaxRate.values();
            int var3 = var2.length;

            for (int var4 = 0; var4 < var3; ++var4) {
                TaxRate var5 = var2[var4];
                if (var5.equals(this.getTaxRate().getValue())) {
                    var1.AKH = new TaxRateModel(var5);
                }
            }
        }

        return var1;
    }
}
