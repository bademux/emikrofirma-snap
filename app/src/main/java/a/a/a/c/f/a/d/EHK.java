package a.a.a.c.f.a.d;

import a.a.a.c.f.b.JM;
import a.a.a.c.g.b.FCW;

public enum EHK implements JM {
    CC(FCW.getInstance().getMessageForKey("micro.model.type.signaturetype.cc")),
    PZ(FCW.getInstance().getMessageForKey("micro.model.type.signaturetype.pz")),
    KD(FCW.getInstance().getMessageForKey("micro.model.type.signaturetype.kd")),
    Unknown(FCW.getInstance().getMessageForKey("micro.model.type.signaturetype.unknown"));

    private final String FGA;

    EHK(String var3) {

        this.FGA = var3;

    }

    public String getDescription() {
        return this.FGA;
    }

    public int DAQ(JM var1) {
        return this.compareTo((EHK) var1);
    }

    public JM[] getEnumTypeValues() {
        return values();
    }
}
