package a.a.a.c.f.a.e;

import a.a.a.c.f.b.c.PrivtePerson;
import a.a.a.c.f.b.c.InvoicingDate;
import jakarta.xml.bind.annotation.XmlTransient;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

@XmlTransient
public abstract class BaseInvoiceSell extends Invoice<InvoiceElementSell> {
    protected InvoicingDate IVO;
    private PrivtePerson IVP;
    private PrivtePerson ROZ;
    @XmlTransient
    private final ObjectProperty<ObservableList<InvoiceElementSell>> AKX;

    protected BaseInvoiceSell(InvoiceSubtype var1) {
        super(InvoiceType.SELL, var1);
        this.AKX = new HZ(this);

    }

    protected BaseInvoiceSell() {
        this(null);
        this.IVO = new InvoicingDate();

    }

    public abstract InvoicingDate getInvoicingDate();

    public void setInvoicingDate(InvoicingDate var1) {
        this.IVO = var1;
    }

    public InvoicingDate IYZ() {
        if (this.getInvoicingDate() == null) {
            this.IVO = new InvoicingDate();
        }

        return this.IVO;
    }

    public PrivtePerson getUsingInvoicingDate() {
        return this.IVP;
    }

    public void setUsingInvoicingDate(PrivtePerson var1) {
        this.IVP = var1;
    }

    public PrivtePerson getMpp() {
        if (this.ROZ == null) {
            this.ROZ = new PrivtePerson(false);
        }

        return this.ROZ;
    }

    public void setMpp(Boolean var1) {
        this.getMpp().setValue(var1);
    }

    public final ObjectProperty<ObservableList<InvoiceElementSell>> DBU() {
        return this.AKX;
    }

    private class HZ extends SimpleObjectProperty<ObservableList<InvoiceElementSell>> {
        private final BaseInvoiceSell AKW;

        public HZ(BaseInvoiceSell var2) {
            this.AKW = var2;
        }

        public ObservableList<InvoiceElementSell> get() {
            return FXCollections.observableList(this.AKW.getInvoiceElements());
        }

        public void set(ObservableList<InvoiceElementSell> var1) {
            if (var1 != null) {
                this.AKW.setInvoiceElements(var1);
            }

        }
    }
}
