package a.a.a.c.f.a.e;

import a.a.a.c.f.b.JM;
import a.a.a.c.g.b.FCW;

public enum IB implements JM {
    SELL(FCW.getInstance().getMessageForKey("micro.model.type.invoicetype.sell")),
    PURCHASE(FCW.getInstance().getMessageForKey("micro.model.type.invoicetype.purchase"));

    private final String AKZ;

    IB(String var3) {

        this.AKZ = var3;

    }

    public String getDescription() {
        return this.AKZ;
    }

    public int DAQ(JM var1) {
        return this.compareTo((IB) var1);
    }

    public JM[] getEnumTypeValues() {
        return values();
    }
}
