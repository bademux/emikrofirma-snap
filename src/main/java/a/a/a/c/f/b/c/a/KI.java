package a.a.a.c.f.b.c.a;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.b.JM;
import a.a.a.c.g.b.FCW;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public enum KI implements JM {
    CASH(FCW.getInstance().getMessageForKey("micro.model.type.paymentmethod.cash")),
    COD(FCW.getInstance().getMessageForKey("micro.model.type.paymentmethod.cod")),
    CARD(FCW.getInstance().getMessageForKey("micro.model.type.paymentmethod.card")),
    TRANSFER(FCW.getInstance().getMessageForKey("micro.model.type.paymentmethod.transfer")),
    OTHER(FCW.getInstance().getMessageForKey("micro.model.type.paymentmethod.other"));

    private final String AOQ;

    KI(String var3) {
        EXF.getInstance().ICO();

        try {
            this.AOQ = var3;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public String getDescription() {
        return this.AOQ;
    }

    public int DAQ(JM var1) {
        return this.compareTo((KI) var1);
    }

    public JM[] getEnumTypeValues() {
        return values();
    }
}
