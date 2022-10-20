package a.a.a.c.f.a.e;

import a.a.a.c.f.a.c.Contractor;
import a.a.a.c.f.b.c.PrivtePerson;
import a.a.a.c.f.b.c.InvoicingDate;
import a.a.a.c.f.b.c.Text;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(
        name = "invoiceSell"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class InvoiceSell extends BaseInvoiceSellInvoice {
    private Contractor AKP;
    private Text AKQ;

    public InvoiceSell() {

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

    public Text getCreationPlace() {
        return this.AKQ;
    }

    public void setCreationPlace(Text var1) {
        this.AKQ = var1;
    }

    public Text DBW() {
        if (this.AKQ == null) {
            this.AKQ = new Text();
        }

        return this.AKQ;
    }

    public InvoicingDate getInvoicingDate() {
        if (this.getUsingInvoicingDate() != null && this.getUsingInvoicingDate().getValue() != null && this.getUsingInvoicingDate().getValue()) {
            return this.IVO;
        } else {
            this.IVO = this.getCreationDate().DEF();
            this.setUsingInvoicingDate(new PrivtePerson(true));
            return this.IVO;
        }
    }
}
