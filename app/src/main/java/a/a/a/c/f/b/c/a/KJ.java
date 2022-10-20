package a.a.a.c.f.b.c.a;

import a.a.a.c.f.b.JM;
import a.a.a.c.g.b.FCW;

public enum KJ implements JM {
    monthly(FCW.getInstance().getMessageForKey("micro.model.type.periodtype.monthly")),
    quarterly(FCW.getInstance().getMessageForKey("micro.model.type.periodtype.quarterly"));

    private final String AOR;

    KJ(String var3) {

        this.AOR = var3;

    }

    public String getDescription() {
        return this.AOR;
    }

    public int DAQ(JM var1) {
        return this.compareTo((KJ) var1);
    }

    public JM[] getEnumTypeValues() {
        return values();
    }
}
