package a.a.a.c.f.a.n;

import a.a.a.c.f.b.c.JV;
import jakarta.xml.bind.annotation.XmlTransient;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

@XmlTransient
public abstract class QSO extends InvoiceOther<QSJ> {
    protected JV QYJ;
    @XmlTransient
    private final ObjectProperty<ObservableList<QSJ>> QYK = new QSP(this);

    protected QSO() {
        super(QSR.SELL, null);

        this.QYJ = new JV();

    }

    public JV getInvoicingDate() {
        return this.QYJ;
    }

    public void setInvoicingDate(JV var1) {
        this.QYJ = var1;
    }

    public JV RJQ() {
        if (this.getInvoicingDate() == null) {
            this.QYJ = new JV();
        }

        return this.QYJ;
    }

    public final ObjectProperty<ObservableList<QSJ>> RJR() {
        return this.QYK;
    }

    private class QSP extends SimpleObjectProperty<ObservableList<QSJ>> {
        private final QSO QYI;

        public QSP(QSO var2) {
            this.QYI = var2;
        }

        public ObservableList<QSJ> get() {
            return FXCollections.observableList(this.QYI.getInvoiceOtherElements());
        }

        public void set(ObservableList<QSJ> var1) {
            if (var1 != null) {
                this.QYI.setInvoiceOtherElements(var1);
            }

        }
    }
}
