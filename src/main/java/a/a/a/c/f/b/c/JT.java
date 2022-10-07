package a.a.a.c.f.b.c;

import a.a.a.c.e.a.h.EWY;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.LC;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class JT extends LC {
    public JT(byte[] var1) {
        super(EWY.IBK(var1));
        EXF.getInstance().ICQ();
    }

    public JT() {
        EXF.getInstance().ICQ();
    }

    public JT DDX() {
        EXF.getInstance().ICO();

        JT var2;
        try {
            JT var1 = new JT();
            var1.setValue(this.getValue());
            var2 = var1;
        } finally {
            EXF.getInstance().ICP();
        }

        return var2;
    }

    public byte[] getValue() {
        return EWY.IBK(super.getValue());
    }

    public void setValue(byte[] var1) {
        super.setValue(EWY.IBK(var1));
    }
}
