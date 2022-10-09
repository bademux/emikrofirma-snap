package a.a.a.c.f.b.c.a;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.b.JM;
import a.a.a.c.g.b.FCW;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public enum QSV implements JM {
    NET(FCW.getInstance().getMessageForKey("micro.model.type.calculationmethodtype.net")),
    GROSS(FCW.getInstance().getMessageForKey("micro.model.type.calculationmethodtype.gross")),
    AGGREGATE(FCW.getInstance().getMessageForKey("micro.model.type.calculationmethodtype.aggregate"));

    private final String QYW;

    QSV(String var3) {
        EXF.getInstance().ICO();

        try {
            this.QYW = var3;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public String getDescription() {
        return this.QYW;
    }

    public int DAQ(JM var1) {
        return this.compareTo((QSV) var1);
    }

    public JM[] getEnumTypeValues() {
        return KG.values();
    }
}
