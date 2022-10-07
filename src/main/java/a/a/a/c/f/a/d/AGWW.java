package a.a.a.c.f.a.d;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.b.JM;
import a.a.a.c.g.b.FCW;

public enum AGWW implements JM {
    VAT(FCW.getInstance().getMessageForKey("micro.model.type.declarationsubtype.vat")),
    EWP(FCW.getInstance().getMessageForKey("micro.model.type.declarationsubtype.ewp")),
    FA(FCW.getInstance().getMessageForKey("micro.model.type.declarationsubtype.fa")),
    KR(FCW.getInstance().getMessageForKey("micro.model.type.declarationsubtype.kr")),
    MAG(FCW.getInstance().getMessageForKey("micro.model.type.declarationsubtype.mag")),
    PKPIR(FCW.getInstance().getMessageForKey("micro.model.type.declarationsubtype.pkpir")),
    WB(FCW.getInstance().getMessageForKey("micro.model.type.declarationsubtype.wb")),
    STATUS_TRACKER(FCW.getInstance().getMessageForKey("micro.model.type.declarationsubtype.status_tracker"));

    private final String AHST;

    AGWW(String var3) {
        EXF.getInstance().ICO();

        try {
            this.AHST = var3;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public String getDescription() {
        return this.AHST;
    }

    public int DAQ(JM var1) {
        return this.compareTo((AGWW) var1);
    }

    public JM[] getEnumTypeValues() {
        return values();
    }
}
