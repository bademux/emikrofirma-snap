package a.a.a.c.f.a.a;

import a.a.a.c.f.b.c.KQ;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(
        name = "dictionaryEntry"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class IJF extends IJE {
    public static final String IVM = "commodity";
    private KQ IVN;

    public IJF() {
        super("commodity");

    }

    public KQ getTaxRateValue() {
        return this.IVN;
    }

    public KQ IYY() {
        if (this.IVN == null) {
            this.IVN = new KQ();
        }

        return this.IVN;
    }

    public void setTaxRateValue(KQ var1) {
        this.IVN = var1;
    }
}
