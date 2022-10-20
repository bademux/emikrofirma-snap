package a.a.a.c.f.a.n;

import a.a.a.c.f.b.c.JR;
import a.a.a.c.f.b.c.JY;
import a.a.a.c.f.b.c.KQ;
import a.a.a.c.f.b.c.QSU;
import a.a.a.c.f.b.c.a.KL;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class QSJ extends QSH {
    public QSJ() {

    }

    public Object RJJ() {
        QSJ var1 = new QSJ();
        if (this.getPosition() != null && this.getPosition().getValue() != null) {
            var1.QXU = new JY(this.getPosition().getValue());
        }

        if (this.getNetPriceForAll() != null && this.getNetPriceForAll().getValue() != null) {
            var1.QXV = (JR) this.getNetPriceForAll().clone();
        }

        if (this.getTaxValueForAll() != null && this.getTaxValueForAll().getValue() != null) {
            var1.QXW = (JR) this.getTaxValueForAll().clone();
        }

        if (this.getGrossValueForAll() != null && this.getGrossValueForAll().getValue() != null) {
            var1.QXX = (JR) this.getGrossValueForAll().clone();
        }

        if (this.getLastCalculationMethod() != null && this.getLastCalculationMethod().getValue() != null) {
            var1.QXZ = new QSU(this.getLastCalculationMethod().getValue());
        }

        if (this.getTaxRate() != null && this.getTaxRate().getValue() != null) {
            KL[] var2 = KL.values();
            int var3 = var2.length;

            for (int var4 = 0; var4 < var3; ++var4) {
                KL var5 = var2[var4];
                if (var5.equals(this.getTaxRate().getValue())) {
                    var1.QXY = new KQ(var5);
                }
            }
        }

        return var1;
    }
}
