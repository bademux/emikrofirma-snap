package a.a.a.c.f.a.d;

import a.a.a.c.f.b.EnumTypeValue;
import a.a.a.c.g.b.FCW;

public enum DeclarationType implements EnumTypeValue {
    JPK(FCW.getInstance().getMessageForKey("micro.model.type.declarationtype.jpk"));

    private final String AJE;

    DeclarationType(String var3) {

        this.AJE = var3;

    }

    public String getDescription() {
        return this.AJE;
    }

    public int DAQ(EnumTypeValue var1) {
        return this.compareTo((DeclarationType) var1);
    }

    public EnumTypeValue[] getEnumTypeValues() {
        return values();
    }
}
