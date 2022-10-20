package a.a.a.c.f.c.a;

import a.a.a.c.f.b.c.JT;
import a.a.a.c.f.b.c.KO;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class LR extends LQ<JT, byte[]> {
    public LR(KO var1, JT var2) {
        super(var1, var2);

    }

    public LR(String var1, byte[] var2) {
        this(new KO(var1), new JT(var2));

    }

    public LR(String var1) {
        this(var1, null);

    }

    public LR() {
        this(null);

    }

    public JT DEY() {
        if (this.AQH == null) {
            this.AQH = new JT();
        }

        return this.AQH;
    }
}
