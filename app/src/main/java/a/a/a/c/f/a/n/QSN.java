package a.a.a.c.f.a.n;

import a.a.a.c.f.a.c.HI;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(
        name = "invoiceSell"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class QSN extends QSO {
    private HI QYH;

    public QSN() {

    }

    public HI getContractor() {
        return this.QYH;
    }

    public void setContractor(HI var1) {
        this.QYH = var1;
    }

    public HI RJS() {
        if (this.QYH == null) {
            this.QYH = new HI();
        }

        return this.QYH;
    }

    public String toString() {
        return "InvoiceOtherSell [contractor=" + this.QYH + "] " + super.toString() + "";
    }
}
