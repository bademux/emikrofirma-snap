package a.a.a.c.f.b.c;

import a.a.a.c.f.LL;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class Telephone extends LL {
    public Telephone(String var1) {
        super(var1);

    }

    public Telephone() {

    }

    public Telephone DET() {

        Telephone var2;
        Telephone var1 = new Telephone();
        var1.setValue(this.getValue());
        var2 = var1;

        return var2;
    }
}
