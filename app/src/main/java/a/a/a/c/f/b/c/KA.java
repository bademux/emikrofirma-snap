package a.a.a.c.f.b.c;

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

    }

    public KA() {

    }

    public KA DEJ() {

        KA var2;
        KA var1 = new KA();
        var1.setValue(this.getValue());
        var2 = var1;

        return var2;
    }

    public void setValue(String var1) {

        super.setValue(var1);

    }
}
