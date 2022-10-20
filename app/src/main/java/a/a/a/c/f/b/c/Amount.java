package a.a.a.c.f.b.c;

import a.a.a.c.f.KY;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
public class Amount extends KY implements Cloneable {
    public Amount(BigDecimal var1) {
        super(var1);

    }

    public Amount() {

    }

    public Object clone() {
        Amount var1 = new Amount(this.getValue());
        var1.setAllowNegative(this.DDQ());
        var1.setAllowOnlyNegative(this.RJU());
        var1.setPresicion(this.getPresicion());
        var1.setScale(this.getScale());
        return var1;
    }
}
