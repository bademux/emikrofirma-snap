package a.a.a.c.f.a.e;

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
        name = "invoicePurchase"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class HR extends HT {
    private HI AKL;
    private JV AKM;
    private JV AKN;
    @XmlTransient
    private final ObjectProperty<ObservableList<HP>> AKO;
    private Boolean QWQ;

    public HR() {
        this(IA.INVOICE);
        EXF.getInstance().ICQ();
    }

    public HR(IA var1) {
        super(var1);
        this.AKO = new HS(this);
        EXF.getInstance().ICQ();
    }

    public HI getContractor() {
        return this.AKL;
    }

    public HI DBQ() {
        if (this.AKL == null) {
            this.AKL = new HI();
        }

        return this.AKL;
    }

    public void setContractor(HI var1) {
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

    public final ObjectProperty<ObservableList<HP>> DBT() {
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

    private class HS extends SimpleObjectProperty<ObservableList<HP>> {
        private final HR AKK;

        public HS(HR var2) {
            this.AKK = var2;
        }

        public ObservableList<HP> get() {
            return FXCollections.observableList(this.AKK.getInvoiceElements());
        }

        public void set(ObservableList<HP> var1) {
            if (var1 != null) {
                this.AKK.setInvoiceElements(var1);
            }

        }
    }
}
