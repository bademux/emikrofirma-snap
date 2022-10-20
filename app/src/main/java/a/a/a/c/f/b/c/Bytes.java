package a.a.a.c.f.b.c;

import a.a.a.c.e.a.h.EWY;
import a.a.a.c.f.LC;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class Bytes extends LC {
    public Bytes(byte[] var1) {
        super(EWY.IBK(var1));

    }

    public Bytes() {

    }

    public Bytes DDX() {

        Bytes var2;
        Bytes var1 = new Bytes();
        var1.setValue(this.getValue());
        var2 = var1;

        return var2;
    }

    public byte[] getValue() {
        return EWY.IBK(super.getValue());
    }

    public void setValue(byte[] var1) {
        super.setValue(EWY.IBK(var1));
    }
}
