package a.a.a.c.f.a.e;

import a.a.a.c.f.a.c.Contractor;
import a.a.a.c.f.b.c.JS;
import a.a.a.c.f.b.c.JV;
import a.a.a.c.f.b.c.KO;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(
        name = "invoiceSell"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class HU extends HX {
    private Contractor AKP;
    private KO AKQ;

    public HU() {

    }

    public Contractor getContractor() {
        return this.AKP;
    }

    public void setContractor(Contractor var1) {
        this.AKP = var1;
    }

    public Contractor DBV() {
        if (this.AKP == null) {
            this.AKP = new Contractor();
        }

        return this.AKP;
    }

    public KO getCreationPlace() {
        return this.AKQ;
    }

    public void setCreationPlace(KO var1) {
        this.AKQ = var1;
    }

    public KO DBW() {
        if (this.AKQ == null) {
            this.AKQ = new KO();
        }

        return this.AKQ;
    }

    public JV getInvoicingDate() {
        if (this.getUsingInvoicingDate() != null && this.getUsingInvoicingDate().getValue() != null && this.getUsingInvoicingDate().getValue()) {
            return this.IVO;
        } else {
            this.IVO = this.getCreationDate().DEF();
            this.setUsingInvoicingDate(new JS(true));
            return this.IVO;
        }
    }
}
