package a.a.a.c.f.a.e.a;

import a.a.a.c.f.b.JM;
import a.a.a.c.g.b.FCW;

public enum IH implements JM {
    SELL(FCW.getInstance().getMessageForKey("micro.model.type.invoicerecordtype.sell")),
    PURCHASE(FCW.getInstance().getMessageForKey("micro.model.type.invoicerecordtype.purchase"));

    private final String AMF;

    IH(String var3) {

        this.AMF = var3;

    }

    public String getDescription() {
        return this.AMF;
    }

    public int DAQ(JM var1) {
        return this.compareTo((IH) var1);
    }

    public JM[] getEnumTypeValues() {
        return values();
    }
}
