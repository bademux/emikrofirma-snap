package a.a.a.c.f.b.c;

import a.a.a.c.f.LL;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class Regon extends LL {
    public Regon(String var1) {
        super(var1);

    }

    public Regon() {

    }

    public Regon DEM() {

        Regon var2;
        Regon var1 = new Regon();
        var1.setValue(this.getValue());
        var2 = var1;

        return var2;
    }

    public void setValue(String var1) {

        super.setValue(var1);

    }
}
