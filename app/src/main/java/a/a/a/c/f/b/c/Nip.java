package a.a.a.c.f.b.c;

import a.a.a.c.f.LL;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlTransient;

@XmlAccessorType(XmlAccessType.FIELD)
public class Nip extends LL {
    @XmlTransient
    public static final Nip QYV = new Nip("NIE DOTYCZY");

    public Nip(String var1) {
        super(var1);

    }

    public Nip() {

    }

    public Nip DEJ() {

        Nip var2;
        Nip var1 = new Nip();
        var1.setValue(this.getValue());
        var2 = var1;

        return var2;
    }

    public void setValue(String var1) {

        super.setValue(var1);

    }
}
