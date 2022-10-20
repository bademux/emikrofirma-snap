package a.a.a.c.f.a.n;

import a.a.a.c.f.a.c.Contractor;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(
        name = "invoiceSell"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class InvoiceOtherSell extends QSO {
    private Contractor QYH;

    public InvoiceOtherSell() {

    }

    public Contractor getContractor() {
        return this.QYH;
    }

    public void setContractor(Contractor var1) {
        this.QYH = var1;
    }

    public Contractor RJS() {
        if (this.QYH == null) {
            this.QYH = new Contractor();
        }

        return this.QYH;
    }

    public String toString() {
        return "InvoiceOtherSell [contractor=" + this.QYH + "] " + super.toString() + "";
    }
}
