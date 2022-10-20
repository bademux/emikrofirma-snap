package a.a.a.c.f.b.c.a;

import a.a.a.b.f.FFI;
import a.a.a.c.f.b.EnumTypeValue;
import a.a.a.c.g.b.FCW;

public enum InvoiceState implements EnumTypeValue {
    ACTIVE("ACTIVE", FCW.getInstance().getMessageForKey("micro.model.type.state.active")),
    CANCELED("CANCELED", FCW.getInstance().getMessageForKey("micro.model.type.state.canceled"));

    private final String QYX;
    private final String QYY;

    InvoiceState(String var3, String var4) {
        this.QYX = var3;
        this.QYY = var4;
    }

    public String getDescription() {
        return this.QYY;
    }

    public String getKey() {
        return this.QYX;
    }

    public int DAQ(EnumTypeValue var1) {
        return this.compareTo((InvoiceState) var1);
    }

    public EnumTypeValue[] getEnumTypeValues() {
        return values();
    }

    public static InvoiceState getByKey(String var0) {
        switch (var0) {
            case "ACTIVE":
                return ACTIVE;
            case "CANCELED":
                return CANCELED;
            default:
                throw new FFI("unknown invoice state");
        }
    }
}
