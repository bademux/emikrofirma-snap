package a.a.a.c.f.a.e;

import a.a.a.c.f.b.c.Amount;
import a.a.a.c.f.b.c.PrivtePerson;
import a.a.a.c.f.b.c.InvoicingDate;
import a.a.a.c.f.b.c.Text;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.math.BigDecimal;

@XmlRootElement(
        name = "invoiceSellCorrection"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class InvoiceSellCorrection extends BaseInvoiceSellCorrection {
    private Text AKR;
    private InvoicingDate AKS;
    private Amount AKT;
    private Amount AKU;
    private Amount AKV;

    public InvoiceSellCorrection() {

    }

    public Text getCorrectionReason() {
        return this.AKR;
    }

    public void setCorrectionReason(Text var1) {
        this.AKR = var1;
    }

    public Text DBX() {
        if (this.AKR == null) {
            this.AKR = new Text();
        }

        return this.AKR;
    }

    public InvoicingDate getReceiveDate() {
        return this.AKS;
    }

    public InvoicingDate DBY() {
        if (this.AKS == null) {
            this.AKS = new InvoicingDate();
        }

        return this.AKS;
    }

    public Amount getDifferenceAmountSummaryWithTax() {
        return this.AKT;
    }

    public Amount DBZ() {
        if (this.AKT == null) {
            this.AKT = new Amount();
        }

        return this.AKT;
    }

    public void setDifferenceAmountSummaryWithTax(Amount var1) {
        this.AKT = var1;
    }

    public Amount getDifferenceAmountSummaryWithoutTax() {
        return this.AKU;
    }

    public Amount DCA() {
        if (this.AKU == null) {
            this.AKU = new Amount();
        }

        return this.AKU;
    }

    public void setDifferenceAmountSummaryWithoutTax(Amount var1) {
        this.AKU = var1;
    }

    public Amount getDifferenceAmountTax() {
        return this.AKV;
    }

    public Amount DCB() {
        if (this.AKV == null) {
            this.AKV = new Amount();
        }

        return this.AKV;
    }

    public void setDifferenceAmountTax(Amount var1) {
        this.AKV = var1;
    }

    public InvoicingDate getInvoicingDate() {
        if (this.getUsingInvoicingDate() != null && this.getUsingInvoicingDate().getValue() != null && this.getUsingInvoicingDate().getValue()) {
            return this.IVO;
        } else {
            if (this.AKT.getValue().compareTo(BigDecimal.ZERO) >= 0) {
                this.IVO = this.getCreationDate().DEF();
            } else {
                this.IVO = this.AKS.DEF();
            }

            this.setUsingInvoicingDate(new PrivtePerson(true));
            return this.IVO;
        }
    }
}
