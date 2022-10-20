package a.a.a.c.f.b.c;

import a.a.a.c.f.LH;
import a.a.a.c.f.b.c.a.KK;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class KP extends LH<KK> {
    public KP(KK var1) {
        super(var1);

    }

    public KP() {

    }

    public KP DES() {

        KP var2;
        KP var1 = new KP();
        var1.setValue(this.getValue());
        var2 = var1;

        return var2;
    }
}
