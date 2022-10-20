package a.a.a.c.f.a.f.a;

import a.a.a.c.f.b.c.Amount;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement(
        name = "receiptRecordVat"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class ReceiptRecordVat extends ReceiptRecord {
    private Amount AMT;
    private Amount AMU;
    private Amount AMV;
    private List<RecordElementVat> AMW;
    @XmlTransient
    private final ObjectProperty<ObservableList<RecordElementVat>> AMX = new IS(this);

    public ReceiptRecordVat() {
        super(RecordType.VAT);

    }

    public Amount getNet() {
        return this.AMT;
    }

    public Amount DCJ() {
        if (this.AMT == null) {
            this.AMT = new Amount();
        }

        return this.AMT;
    }

    public void setNet(Amount var1) {
        this.AMT = var1;
    }

    public Amount getVat() {
        return this.AMU;
    }

    public Amount DCK() {
        if (this.AMU == null) {
            this.AMU = new Amount();
        }

        return this.AMU;
    }

    public void setVat(Amount var1) {
        this.AMU = var1;
    }

    public Amount getGross() {
        return this.AMV;
    }

    public Amount DCL() {
        if (this.AMV == null) {
            this.AMV = new Amount();
        }

        return this.AMV;
    }

    public void setGross(Amount var1) {
        this.AMV = var1;
    }

    public List<RecordElementVat> getReceiptRecordElements() {
        return this.AMW;
    }

    public List<RecordElementVat> DCM() {
        if (this.AMW == null) {
            this.AMW = new ArrayList();
        }

        return this.AMW;
    }

    public final ObjectProperty<ObservableList<RecordElementVat>> DCN() {
        return this.AMX;
    }

    private class IS extends SimpleObjectProperty<ObservableList<RecordElementVat>> {
        private final ReceiptRecordVat AMS;

        public IS(ReceiptRecordVat var2) {
            this.AMS = var2;
        }

        public ObservableList<RecordElementVat> get() {
            return FXCollections.observableList(this.AMS.DCM());
        }

        public void set(ObservableList<RecordElementVat> var1) {
            if (var1 != null) {
                this.AMS.DCM().clear();
                this.AMS.DCM().addAll(var1);
            }

        }
    }
}
