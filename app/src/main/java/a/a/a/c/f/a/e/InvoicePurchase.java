package a.a.a.c.f.a.e;

import a.a.a.c.f.a.c.Contractor;
import a.a.a.c.f.b.c.JV;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

@XmlRootElement(
        name = "invoicePurchase"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class InvoicePurchase extends HT {
    private Contractor AKL;
    private JV AKM;
    private JV AKN;
    @XmlTransient
    private final ObjectProperty<ObservableList<InvoiceElementPurchase>> AKO;
    private Boolean QWQ;

    public InvoicePurchase() {
        this(IA.INVOICE);

    }

    public InvoicePurchase(IA var1) {
        super(var1);
        this.AKO = new HS(this);

    }

    public Contractor getContractor() {
        return this.AKL;
    }

    public Contractor DBQ() {
        if (this.AKL == null) {
            this.AKL = new Contractor();
        }

        return this.AKL;
    }

    public void setContractor(Contractor var1) {
        this.AKL = var1;
    }

    public JV getReceiveDate() {
        return this.AKM;
    }

    public JV DBR() {
        if (this.AKM == null) {
            this.AKM = new JV();
        }

        return this.AKM;
    }

    public void setReceiveDate(JV var1) {
        this.AKM = var1;
    }

    public JV getInvoicingDate() {
        return this.AKN;
    }

    public JV DBS() {
        if (this.AKN == null) {
            this.AKN = new JV();
        }

        return this.AKN;
    }

    public void setInvoicingDate(JV var1) {
        this.AKN = var1;
    }

    public final ObjectProperty<ObservableList<InvoiceElementPurchase>> DBT() {
        return this.AKO;
    }

    public String toString() {
        return "InvoicePurchase [contractor=" + this.AKL + ", receiveDate=" + this.AKM + ", invoicingDate=" + this.AKN + "] " + super.toString();
    }

    public void setIsAggregatePurchase(Boolean var1) {
        this.QWQ = var1;
    }

    public Boolean getIsAggregatePurchase() {
        return this.QWQ;
    }

    private class HS extends SimpleObjectProperty<ObservableList<InvoiceElementPurchase>> {
        private final InvoicePurchase AKK;

        public HS(InvoicePurchase var2) {
            this.AKK = var2;
        }

        public ObservableList<InvoiceElementPurchase> get() {
            return FXCollections.observableList(this.AKK.getInvoiceElements());
        }

        public void set(ObservableList<InvoiceElementPurchase> var1) {
            if (var1 != null) {
                this.AKK.setInvoiceElements(var1);
            }

        }
    }
}
