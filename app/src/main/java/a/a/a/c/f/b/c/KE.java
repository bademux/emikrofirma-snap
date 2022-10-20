package a.a.a.c.f.b.c;

import a.a.a.c.f.LL;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class KE extends LL {
    public KE(String var1) {
        super(var1);

    }

    public KE() {

    }

    public KE(KE var1) {
        this(var1 != null ? var1.getValue() : null);

    }

    public KE DEL() {

        KE var2;
        KE var1 = new KE();
        var1.setValue(this.getValue());
        var2 = var1;

        return var2;
    }

    public String toString() {
        return "RefId [" + super.toString() + "]";
    }
}
