package a.a.a.c.f.a.d;

import a.a.a.c.f.b.JM;
import a.a.a.c.g.b.FCW;

public enum HM implements JM {
    JPK(FCW.getInstance().getMessageForKey("micro.model.type.declarationtype.jpk"));

    private final String AJE;

    HM(String var3) {

        this.AJE = var3;

    }

    public String getDescription() {
        return this.AJE;
    }

    public int DAQ(JM var1) {
        return this.compareTo((HM) var1);
    }

    public JM[] getEnumTypeValues() {
        return values();
    }
}
