package a.a.a.c.c.e.p.a.a;

import a.a.a.c.c.e.p.a.QTW;
import a.a.a.c.f.a.n.InvoiceOtherSubtype;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class QTZ implements ChangeListener<InvoiceOtherSubtype> {
    private final QTW RCO;

    public QTZ(QTW var1) {
        this.RCO = var1;
    }

    public void changed(ObservableValue<? extends InvoiceOtherSubtype> var1, InvoiceOtherSubtype var2, InvoiceOtherSubtype var3) {
        if (var3 != null) {
            this.RCO.RMK();
            org.slf4j.LoggerFactory.getLogger(getClass()).info("Elements type changed");
        }

    }
}
