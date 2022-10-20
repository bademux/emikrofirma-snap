package a.a.a.c.f.a.f.a;

import a.a.a.c.f.b.EnumTypeValue;
import a.a.a.c.g.b.FCW;

public enum RecordType implements EnumTypeValue {
    VAT(FCW.getInstance().getMessageForKey("micro.model.type.recordtype.vat"));

    private final String AMR;

    RecordType(String var3) {

        this.AMR = var3;

    }

    public String getDescription() {
        return this.AMR;
    }

    public int DAQ(EnumTypeValue var1) {
        return this.compareTo((RecordType) var1);
    }

    public EnumTypeValue[] getEnumTypeValues() {
        return values();
    }
}
