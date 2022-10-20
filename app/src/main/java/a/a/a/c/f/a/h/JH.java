package a.a.a.c.f.a.h;

import a.a.a.c.f.b.JM;
import a.a.a.c.g.b.FCW;

public enum JH implements JM {
    VAT(FCW.getInstance().getMessageForKey("micro.model.type.settlementtype.vat"));

    private final String ANQ;

    JH(String var3) {

        this.ANQ = var3;

    }

    public String getDescription() {
        return this.ANQ;
    }

    public int DAQ(JM var1) {
        return this.compareTo((JH) var1);
    }

    public JM[] getEnumTypeValues() {
        return values();
    }
}
