package a.a.a.c.f.a.e;

import a.a.a.c.f.b.c.JS;
import a.a.a.c.f.b.c.JV;
import jakarta.xml.bind.annotation.XmlTransient;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

@XmlTransient
public abstract class HY extends Invoice<InvoiceElementSell> {
    protected JV IVO;
    private JS IVP;
    private JS ROZ;
    @XmlTransient
    private final ObjectProperty<ObservableList<InvoiceElementSell>> AKX;

    protected HY(IA var1) {
        super(IB.SELL, var1);
        this.AKX = new HZ(this);

    }

    protected HY() {
        this(null);
        this.IVO = new JV();

    }

    public abstract JV getInvoicingDate();

    public void setInvoicingDate(JV var1) {
        this.IVO = var1;
    }

    public JV IYZ() {
        if (this.getInvoicingDate() == null) {
            this.IVO = new JV();
        }

        return this.IVO;
    }

    public JS getUsingInvoicingDate() {
        return this.IVP;
    }

    public void setUsingInvoicingDate(JS var1) {
        this.IVP = var1;
    }

    public JS getMpp() {
        if (this.ROZ == null) {
            this.ROZ = new JS(false);
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
        private final HY AKW;

        public HZ(HY var2) {
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
