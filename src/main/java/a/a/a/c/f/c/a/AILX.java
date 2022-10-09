package a.a.a.c.f.c.a;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.b.c.JS;
import a.a.a.c.f.b.c.KO;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class AILX extends LQ<JS, Boolean> {
    public AILX(KO var1, JS var2) {
        super(var1, var2);
        EXF.getInstance().ICQ();
    }

    public AILX(String var1, Boolean var2) {
        this(new KO(var1), new JS(var2));
        EXF.getInstance().ICQ();
    }

    public AILX(String var1) {
        this(var1, null);
        EXF.getInstance().ICQ();
    }

    public AILX() {
        this(null);
        EXF.getInstance().ICQ();
    }

    public JS DEY() {
        if (this.AQH == null) {
            this.AQH = new JS();
        }

        return this.AQH;
    }
}
