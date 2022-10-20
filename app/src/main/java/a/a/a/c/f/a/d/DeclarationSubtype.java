package a.a.a.c.f.a.d;

import a.a.a.c.f.b.EnumTypeValue;
import a.a.a.c.g.b.FCW;

public enum DeclarationSubtype implements EnumTypeValue {
    VAT(FCW.getInstance().getMessageForKey("micro.model.type.declarationsubtype.vat")),
    EWP(FCW.getInstance().getMessageForKey("micro.model.type.declarationsubtype.ewp")),
    FA(FCW.getInstance().getMessageForKey("micro.model.type.declarationsubtype.fa")),
    KR(FCW.getInstance().getMessageForKey("micro.model.type.declarationsubtype.kr")),
    MAG(FCW.getInstance().getMessageForKey("micro.model.type.declarationsubtype.mag")),
    PKPIR(FCW.getInstance().getMessageForKey("micro.model.type.declarationsubtype.pkpir")),
    WB(FCW.getInstance().getMessageForKey("micro.model.type.declarationsubtype.wb")),
    STATUS_TRACKER(FCW.getInstance().getMessageForKey("micro.model.type.declarationsubtype.status_tracker"));

    private final String AHST;

    DeclarationSubtype(String var3) {

        this.AHST = var3;

    }

    public String getDescription() {
        return this.AHST;
    }

    public int DAQ(EnumTypeValue var1) {
        return this.compareTo((DeclarationSubtype) var1);
    }

    public EnumTypeValue[] getEnumTypeValues() {
        return values();
    }
}
