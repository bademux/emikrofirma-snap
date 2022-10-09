package a.a.a.c.f.b.c;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.KY;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
public class JR extends KY implements Cloneable {
    public JR(BigDecimal var1) {
        super(var1);
        EXF.getInstance().ICQ();
    }

    public JR() {
        EXF.getInstance().ICQ();
    }

    public Object clone() {
        JR var1 = new JR(this.getValue());
        var1.setAllowNegative(this.DDQ());
        var1.setAllowOnlyNegative(this.RJU());
        var1.setPresicion(this.getPresicion());
        var1.setScale(this.getScale());
        return var1;
    }
}
