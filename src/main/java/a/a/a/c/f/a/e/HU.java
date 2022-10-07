package a.a.a.c.f.a.e;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.c.HI;
import a.a.a.c.f.b.c.JS;
import a.a.a.c.f.b.c.JV;
import a.a.a.c.f.b.c.KO;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(
        name = "invoiceSell"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class HU extends HX {
    private HI AKP;
    private KO AKQ;

    public HU() {
        EXF.getInstance().ICO();
        EXF.getInstance().ICP();
    }

    public HI getContractor() {
        return this.AKP;
    }

    public void setContractor(HI var1) {
        this.AKP = var1;
    }

    public HI DBV() {
        if (this.AKP == null) {
            this.AKP = new HI();
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
