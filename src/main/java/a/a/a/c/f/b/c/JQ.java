package a.a.a.c.f.b.c;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.LL;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class JQ extends LL {
    public JQ(String var1) {
        super(var1.trim());
        EXF.getInstance().ICQ();
    }

    public JQ() {
        EXF.getInstance().ICQ();
    }

    public JQ DDP() {
        EXF.getInstance().ICO();

        JQ var2;
        try {
            JQ var1 = new JQ();
            var1.setValue(this.getValue());
            var2 = var1;
        } finally {
            EXF.getInstance().ICP();
        }

        return var2;
    }

    public String getAccountNumber(String var1) {
        return var1.substring(0, 2) + " " + var1.substring(2, 6) + " " + var1.substring(6, 10) + " " + var1.substring(10, 14) + " " + var1.substring(14, 18) + " " + var1.substring(18, 22) + " " + var1.substring(22, 26);
    }
}
