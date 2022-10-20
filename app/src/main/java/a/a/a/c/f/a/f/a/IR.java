package a.a.a.c.f.a.f.a;

import a.a.a.c.f.b.c.JR;
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
public class IR extends ReceiptRecord {
    private JR AMT;
    private JR AMU;
    private JR AMV;
    private List<IP> AMW;
    @XmlTransient
    private final ObjectProperty<ObservableList<IP>> AMX = new IS(this);

    public IR() {
        super(IQ.VAT);

    }

    public JR getNet() {
        return this.AMT;
    }

    public JR DCJ() {
        if (this.AMT == null) {
            this.AMT = new JR();
        }

        return this.AMT;
    }

    public void setNet(JR var1) {
        this.AMT = var1;
    }

    public JR getVat() {
        return this.AMU;
    }

    public JR DCK() {
        if (this.AMU == null) {
            this.AMU = new JR();
        }

        return this.AMU;
    }

    public void setVat(JR var1) {
        this.AMU = var1;
    }

    public JR getGross() {
        return this.AMV;
    }

    public JR DCL() {
        if (this.AMV == null) {
            this.AMV = new JR();
        }

        return this.AMV;
    }

    public void setGross(JR var1) {
        this.AMV = var1;
    }

    public List<IP> getReceiptRecordElements() {
        return this.AMW;
    }

    public List<IP> DCM() {
        if (this.AMW == null) {
            this.AMW = new ArrayList();
        }

        return this.AMW;
    }

    public final ObjectProperty<ObservableList<IP>> DCN() {
        return this.AMX;
    }

    private class IS extends SimpleObjectProperty<ObservableList<IP>> {
        private final IR AMS;

        public IS(IR var2) {
            this.AMS = var2;
        }

        public ObservableList<IP> get() {
            return FXCollections.observableList(this.AMS.DCM());
        }

        public void set(ObservableList<IP> var1) {
            if (var1 != null) {
                this.AMS.DCM().clear();
                this.AMS.DCM().addAll(var1);
            }

        }
    }
}
