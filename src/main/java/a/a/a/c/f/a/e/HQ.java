package a.a.a.c.f.a.e;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.b.c.*;
import a.a.a.c.f.b.c.a.KL;
import a.a.a.c.f.b.c.a.QSV;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class HQ extends HO {
    public HQ() {
        EXF.getInstance().ICQ();
    }

    public Object RIH() {
        HQ var1 = new HQ();
        if (this.getPosition() != null && this.getPosition().getValue() != null) {
            var1.AJX = new JY(this.getPosition().getValue());
        }

        if (this.getName() != null && this.getName().getValue() != null) {
            var1.AJY = new KO(this.getName().getValue());
        }

        if (this.getDescription() != null && this.getDescription().getValue() != null) {
            var1.AJZ = new KO(this.getDescription().getValue());
        }

        if (this.getQuantity() != null && this.getQuantity().getValue() != null) {
            var1.AKA = (JR) this.getQuantity().clone();
        }

        if (this.getUnit() != null && this.getUnit().getValue() != null) {
            var1.AKB = new KO(this.getUnit().getValue());
        }

        if (this.getNetPriceForUnit() != null && this.getNetPriceForUnit().getValue() != null) {
            var1.AKC = (JR) this.getNetPriceForUnit().clone();
        }

        if (this.getGrossPriceForUnit() != null && this.getGrossPriceForUnit().getValue() != null) {
            var1.QWO = (JR) this.getGrossPriceForUnit().clone();
        }

        if (this.getDiscountAmount() != null && this.getDiscountAmount().getValue() != null) {
            var1.AKD = (JR) this.getDiscountAmount().clone();
        }

        if (this.getNetPriceForAll() != null && this.getNetPriceForAll().getValue() != null) {
            var1.AKE = (JR) this.getNetPriceForAll().clone();
        }

        if (this.getTaxValueForAll() != null && this.getTaxValueForAll().getValue() != null) {
            var1.AKF = (JR) this.getTaxValueForAll().clone();
        }

        if (this.getGrossValueForAll() != null && this.getGrossValueForAll().getValue() != null) {
            var1.AKG = (JR) this.getGrossValueForAll().clone();
        }

        if (this.getLastCalculationMethod() != null && this.getLastCalculationMethod().getValue() != null) {
            var1.QWP = new QSU(this.getLastCalculationMethod().getValue());
        }

        if (this.getTaxRate() != null && this.getTaxRate().getValue() != null) {
            KL[] var2 = KL.values();
            int var3 = var2.length;

            for (int var4 = 0; var4 < var3; ++var4) {
                KL var5 = var2[var4];
                if (var5.equals(this.getTaxRate().getValue())) {
                    var1.AKH = new KQ(var5);
                }
            }
        }

        return var1;
    }
}
