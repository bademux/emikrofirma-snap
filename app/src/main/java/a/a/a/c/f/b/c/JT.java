package a.a.a.c.f.b.c;

import a.a.a.c.e.a.h.EWY;
import a.a.a.c.f.LC;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class JT extends LC {
    public JT(byte[] var1) {
        super(EWY.IBK(var1));

    }

    public JT() {

    }

    public JT DDX() {

        JT var2;
        JT var1 = new JT();
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
