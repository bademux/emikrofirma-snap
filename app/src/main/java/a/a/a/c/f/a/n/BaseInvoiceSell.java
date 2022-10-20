package a.a.a.c.f.a.n;

import a.a.a.c.f.b.c.InvoicingDate;
import jakarta.xml.bind.annotation.XmlTransient;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

@XmlTransient
public abstract class BaseInvoiceSell extends InvoiceOther<InvoiceOtherElementSell> {
    protected InvoicingDate QYJ;
    @XmlTransient
    private final ObjectProperty<ObservableList<InvoiceOtherElementSell>> QYK = new QSP(this);

    protected BaseInvoiceSell() {
        super(InvoiceOtherType.SELL, null);

        this.QYJ = new InvoicingDate();

    }

    public InvoicingDate getInvoicingDate() {
        return this.QYJ;
    }

    public void setInvoicingDate(InvoicingDate var1) {
        this.QYJ = var1;
    }

    public InvoicingDate RJQ() {
        if (this.getInvoicingDate() == null) {
            this.QYJ = new InvoicingDate();
        }

        return this.QYJ;
    }

    public final ObjectProperty<ObservableList<InvoiceOtherElementSell>> RJR() {
        return this.QYK;
    }

    private class QSP extends SimpleObjectProperty<ObservableList<InvoiceOtherElementSell>> {
        private final BaseInvoiceSell QYI;

        public QSP(BaseInvoiceSell var2) {
            this.QYI = var2;
        }

        public ObservableList<InvoiceOtherElementSell> get() {
            return FXCollections.observableList(this.QYI.getInvoiceOtherElements());
        }

        public void set(ObservableList<InvoiceOtherElementSell> var1) {
            if (var1 != null) {
                this.QYI.setInvoiceOtherElements(var1);
            }

        }
    }
}
