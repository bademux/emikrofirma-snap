package a.a.a.c.f.a.n;

import a.a.a.c.f.b.JM;
import a.a.a.c.g.b.FCW;

public enum QSR implements JM {
    SELL(FCW.getInstance().getMessageForKey("micro.model.type.invoiceothertype.sell")),
    PURCHASE(FCW.getInstance().getMessageForKey("micro.model.type.invoiceothertype.purchase"));

    private final String QYM;

    QSR(String var3) {

        this.QYM = var3;

    }

    public String getDescription() {
        return this.QYM;
    }

    public int DAQ(JM var1) {
        return this.compareTo((QSR) var1);
    }

    public JM[] getEnumTypeValues() {
        return values();
    }
}
