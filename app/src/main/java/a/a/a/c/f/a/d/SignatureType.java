package a.a.a.c.f.a.d;

import a.a.a.c.f.b.EnumTypeValue;
import a.a.a.c.g.b.FCW;

public enum SignatureType implements EnumTypeValue {
    CC(FCW.getInstance().getMessageForKey("micro.model.type.signaturetype.cc")),
    PZ(FCW.getInstance().getMessageForKey("micro.model.type.signaturetype.pz")),
    KD(FCW.getInstance().getMessageForKey("micro.model.type.signaturetype.kd")),
    Unknown(FCW.getInstance().getMessageForKey("micro.model.type.signaturetype.unknown"));

    private final String FGA;

    SignatureType(String var3) {

        this.FGA = var3;

    }

    public String getDescription() {
        return this.FGA;
    }

    public int DAQ(EnumTypeValue var1) {
        return this.compareTo((SignatureType) var1);
    }

    public EnumTypeValue[] getEnumTypeValues() {
        return values();
    }
}
