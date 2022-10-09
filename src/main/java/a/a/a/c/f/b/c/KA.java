package a.a.a.c.f.b.c;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.LL;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlTransient;

@XmlAccessorType(XmlAccessType.FIELD)
public class KA extends LL {
    @XmlTransient
    public static final KA QYV = new KA("NIE DOTYCZY");

    public KA(String var1) {
        super(var1);
        EXF.getInstance().ICQ();
    }

    public KA() {
        EXF.getInstance().ICQ();
    }

    public KA DEJ() {
        EXF.getInstance().ICO();

        KA var2;
        try {
            KA var1 = new KA();
            var1.setValue(this.getValue());
            var2 = var1;
        } finally {
            EXF.getInstance().ICP();
        }

        return var2;
    }

    public void setValue(String var1) {
        EXF.getInstance().ICO();

        try {
            super.setValue(var1);
        } finally {
            EXF.getInstance().ICP();
        }

    }
}
