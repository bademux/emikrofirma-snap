package a.a.a.c.f.a.a;

import a.a.a.c.f.b.c.TaxRateModel;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(
        name = "dictionaryEntry"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class DictionaryEntry extends Dictionary {
    public static final String IVM = "commodity";
    private TaxRateModel IVN;

    public DictionaryEntry() {
        super("commodity");

    }

    public TaxRateModel getTaxRateValue() {
        return this.IVN;
    }

    public TaxRateModel IYY() {
        if (this.IVN == null) {
            this.IVN = new TaxRateModel();
        }

        return this.IVN;
    }

    public void setTaxRateValue(TaxRateModel var1) {
        this.IVN = var1;
    }
}
