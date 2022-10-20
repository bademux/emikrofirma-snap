package a.a.a.c.c.e.r.a.a;

import a.a.a.c.c.e.r.a.QUN;
import a.a.a.c.f.a.n.InvoiceOtherSubtype;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class QUQ implements ChangeListener<InvoiceOtherSubtype> {
    private final QUN REP;

    public QUQ(QUN var1) {
        this.REP = var1;
    }

    public void changed(ObservableValue<? extends InvoiceOtherSubtype> var1, InvoiceOtherSubtype var2, InvoiceOtherSubtype var3) {
        if (var3 != null) {
            this.REP.RNT();
            org.slf4j.LoggerFactory.getLogger(getClass()).info("Elements type changed");
        }

    }
}
