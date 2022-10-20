package a.a.a.c.f.a.f.a;

import a.a.a.c.f.b.JM;
import a.a.a.c.g.b.FCW;

public enum IQ implements JM {
    VAT(FCW.getInstance().getMessageForKey("micro.model.type.recordtype.vat"));

    private final String AMR;

    IQ(String var3) {

        this.AMR = var3;

    }

    public String getDescription() {
        return this.AMR;
    }

    public int DAQ(JM var1) {
        return this.compareTo((IQ) var1);
    }

    public JM[] getEnumTypeValues() {
        return values();
    }
}
