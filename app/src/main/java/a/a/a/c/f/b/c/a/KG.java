package a.a.a.c.f.b.c.a;

import a.a.a.c.f.b.JM;
import a.a.a.c.g.b.FCW;

public enum KG implements JM {
    NIP(FCW.getInstance().getMessageForKey("micro.model.type.logintype.nip")),
    PESEL(FCW.getInstance().getMessageForKey("micro.model.type.logintype.pesel"));

    private final String AON;

    KG(String var3) {

        this.AON = var3;

    }

    public String getDescription() {
        return this.AON;
    }

    public int DAQ(JM var1) {
        return this.compareTo((KG) var1);
    }

    public JM[] getEnumTypeValues() {
        return values();
    }
}
