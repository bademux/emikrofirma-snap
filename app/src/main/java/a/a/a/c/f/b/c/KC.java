package a.a.a.c.f.b.c;

import a.a.a.c.f.LH;
import a.a.a.c.f.b.c.a.PeriodType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class KC extends LH<PeriodType> {
    public KC(PeriodType var1) {
        super(var1);

    }

    public KC() {

    }

    public KC DEK() {

        KC var2;
        KC var1 = new KC();
        var1.setValue(this.getValue());
        var2 = var1;

        return var2;
    }
}
