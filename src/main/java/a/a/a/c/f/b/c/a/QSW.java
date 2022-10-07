package a.a.a.c.f.b.c.a;

import a.a.a.b.f.FFI;
import a.a.a.c.f.b.JM;
import a.a.a.c.g.b.FCW;

public enum QSW implements JM {
    ACTIVE("ACTIVE", FCW.getInstance().getMessageForKey("micro.model.type.state.active")),
    CANCELED("CANCELED", FCW.getInstance().getMessageForKey("micro.model.type.state.canceled"));

    private final String QYX;
    private final String QYY;

    QSW(String var3, String var4) {
        this.QYX = var3;
        this.QYY = var4;
    }

    public String getDescription() {
        return this.QYY;
    }

    public String getKey() {
        return this.QYX;
    }

    public int DAQ(JM var1) {
        return this.compareTo((QSW) var1);
    }

    public JM[] getEnumTypeValues() {
        return values();
    }

    public static QSW getByKey(String var0) {
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
