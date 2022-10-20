package a.a.a.c.f.b.c.a;

import a.a.a.c.f.b.EnumTypeValue;
import a.a.a.c.g.b.FCW;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public enum PaymentMethod implements EnumTypeValue {
    CASH(FCW.getInstance().getMessageForKey("micro.model.type.paymentmethod.cash")),
    COD(FCW.getInstance().getMessageForKey("micro.model.type.paymentmethod.cod")),
    CARD(FCW.getInstance().getMessageForKey("micro.model.type.paymentmethod.card")),
    TRANSFER(FCW.getInstance().getMessageForKey("micro.model.type.paymentmethod.transfer")),
    OTHER(FCW.getInstance().getMessageForKey("micro.model.type.paymentmethod.other"));

    private final String AOQ;

    PaymentMethod(String var3) {

        this.AOQ = var3;

    }

    public String getDescription() {
        return this.AOQ;
    }

    public int DAQ(EnumTypeValue var1) {
        return this.compareTo((PaymentMethod) var1);
    }

    public EnumTypeValue[] getEnumTypeValues() {
        return values();
    }
}
