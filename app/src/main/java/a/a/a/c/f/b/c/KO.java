package a.a.a.c.f.b.c;

import a.a.a.c.f.LL;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class KO extends LL {
    public KO(String var1) {
        super(var1);

    }

    public KO() {

    }

    public KO DER() {

        KO var2;
        KO var1 = new KO();
        var1.setValue(this.getValue());
        var2 = var1;

        return var2;
    }
}
