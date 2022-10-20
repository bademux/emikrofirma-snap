package a.a.a.c.f.b.c.a;

import a.a.a.c.f.b.EnumTypeValue;
import a.a.a.c.g.b.FCW;

public enum LoginType implements EnumTypeValue {
    NIP(FCW.getInstance().getMessageForKey("micro.model.type.logintype.nip")),
    PESEL(FCW.getInstance().getMessageForKey("micro.model.type.logintype.pesel"));

    private final String AON;

    LoginType(String var3) {

        this.AON = var3;

    }

    public String getDescription() {
        return this.AON;
    }

    public int DAQ(EnumTypeValue var1) {
        return this.compareTo((LoginType) var1);
    }

    public EnumTypeValue[] getEnumTypeValues() {
        return values();
    }
}
