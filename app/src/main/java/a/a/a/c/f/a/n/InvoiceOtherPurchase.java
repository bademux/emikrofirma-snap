package a.a.a.c.f.a.n;

import a.a.a.c.f.a.c.Contractor;
import a.a.a.c.f.b.c.InvoicingDate;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

@XmlRootElement(
        name = "invoiceOtherPurchase"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class InvoiceOtherPurchase extends BaseInvoicePurchase {
    private Contractor QYD;
    private InvoicingDate QYE;
    private InvoicingDate QYF;
    @XmlTransient
    private final ObjectProperty<ObservableList<InvoiceOtherElementPurchase>> QYG = new QSL(this);

    public InvoiceOtherPurchase() {

    }

    public Contractor getContractor() {
        return this.QYD;
    }

    public Contractor RJM() {
        if (this.QYD == null) {
            this.QYD = new Contractor();
        }

        return this.QYD;
    }

    public void setContractor(Contractor var1) {
        this.QYD = var1;
    }

    public InvoicingDate getReceiveDate() {
        return this.QYE;
    }

    public InvoicingDate RJN() {
        if (this.QYE == null) {
            this.QYE = new InvoicingDate();
        }

        return this.QYE;
    }

    public void setReceiveDate(InvoicingDate var1) {
        this.QYE = var1;
    }

    public InvoicingDate getInvoicingDate() {
        return this.QYF;
    }

    public InvoicingDate RJO() {
        if (this.QYF == null) {
            this.QYF = new InvoicingDate();
        }

        return this.QYF;
    }

    public void setInvoicingDate(InvoicingDate var1) {
        this.QYF = var1;
    }

    public final ObjectProperty<ObservableList<InvoiceOtherElementPurchase>> RJP() {
        return this.QYG;
    }

    public String toString() {
        return "InvoiceOtherPurchase [contractor=" + this.QYD + ", receiveDate=" + this.QYE + ", invoicingDate=" + this.QYF + "] " + super.toString();
    }

    private class QSL extends SimpleObjectProperty<ObservableList<InvoiceOtherElementPurchase>> {
        private final InvoiceOtherPurchase QYC;

        public QSL(InvoiceOtherPurchase var2) {
            this.QYC = var2;
        }

        public ObservableList<InvoiceOtherElementPurchase> get() {
            return FXCollections.observableList(this.QYC.getInvoiceOtherElements());
        }

        public void set(ObservableList<InvoiceOtherElementPurchase> var1) {
            if (var1 != null) {
                this.QYC.setInvoiceOtherElements(var1);
            }

        }
    }
}
