package a.a.a.c.f.a.n;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.c.HI;
import a.a.a.c.f.b.c.JV;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

@XmlRootElement(
        name = "invoiceOtherPurchase"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class QSK extends QSM {
    private HI QYD;
    private JV QYE;
    private JV QYF;
    @XmlTransient
    private final ObjectProperty<ObservableList<QSI>> QYG = new QSL(this);

    public QSK() {
        EXF.getInstance().ICO();
        EXF.getInstance().ICP();
    }

    public HI getContractor() {
        return this.QYD;
    }

    public HI RJM() {
        if (this.QYD == null) {
            this.QYD = new HI();
        }

        return this.QYD;
    }

    public void setContractor(HI var1) {
        this.QYD = var1;
    }

    public JV getReceiveDate() {
        return this.QYE;
    }

    public JV RJN() {
        if (this.QYE == null) {
            this.QYE = new JV();
        }

        return this.QYE;
    }

    public void setReceiveDate(JV var1) {
        this.QYE = var1;
    }

    public JV getInvoicingDate() {
        return this.QYF;
    }

    public JV RJO() {
        if (this.QYF == null) {
            this.QYF = new JV();
        }

        return this.QYF;
    }

    public void setInvoicingDate(JV var1) {
        this.QYF = var1;
    }

    public final ObjectProperty<ObservableList<QSI>> RJP() {
        return this.QYG;
    }

    public String toString() {
        return "InvoiceOtherPurchase [contractor=" + this.QYD + ", receiveDate=" + this.QYE + ", invoicingDate=" + this.QYF + "] " + super.toString();
    }

    private class QSL extends SimpleObjectProperty<ObservableList<QSI>> {
        private final QSK QYC;

        public QSL(QSK var2) {
            this.QYC = var2;
        }

        public ObservableList<QSI> get() {
            return FXCollections.observableList(this.QYC.getInvoiceOtherElements());
        }

        public void set(ObservableList<QSI> var1) {
            if (var1 != null) {
                this.QYC.setInvoiceOtherElements(var1);
            }

        }
    }
}
