package a.a.a.c.f.b.c.a;

import a.a.a.c.f.b.EnumTypeValue;
import a.a.a.c.g.b.FCW;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public enum CalculationMethodType implements EnumTypeValue {
    NET(FCW.getInstance().getMessageForKey("micro.model.type.calculationmethodtype.net")),
    GROSS(FCW.getInstance().getMessageForKey("micro.model.type.calculationmethodtype.gross")),
    AGGREGATE(FCW.getInstance().getMessageForKey("micro.model.type.calculationmethodtype.aggregate"));

    private final String QYW;

    CalculationMethodType(String var3) {

        this.QYW = var3;

    }

    public String getDescription() {
        return this.QYW;
    }

    public int DAQ(EnumTypeValue var1) {
        return this.compareTo((CalculationMethodType) var1);
    }

    public EnumTypeValue[] getEnumTypeValues() {
        return LoginType.values();
    }
}
