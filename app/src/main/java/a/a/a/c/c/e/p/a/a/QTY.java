package a.a.a.c.c.e.p.a.a;

import a.a.a.c.c.e.p.a.QTW;
import a.a.a.c.f.a.n.InvoiceOtherElementPurchase;
import javafx.collections.ListChangeListener;

public class QTY implements ListChangeListener<InvoiceOtherElementPurchase> {
    private final QTW RCN;

    public QTY(QTW var1) {
        this.RCN = var1;
    }

    public void onChanged(ListChangeListener.Change<? extends InvoiceOtherElementPurchase> var1) {

        this.RCN.RMI();

    }
}
