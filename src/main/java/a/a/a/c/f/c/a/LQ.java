package a.a.a.c.f.c.a;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.KX;
import a.a.a.c.f.b.c.KO;

import javax.xml.bind.annotation.XmlTransient;

@XmlTransient
public abstract class LQ<_A extends KX<_B>, _B> extends LT {
    protected KO AQG;
    protected _A AQH;

    public LQ() {
        this(null, null);
        EXF.getInstance().ICQ();
    }

    public LQ(KO var1, _A var2) {
        EXF.getInstance().ICO();

        try {
            this.AQG = var1;
            this.AQH = var2;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public KO getName() {
        return this.AQG;
    }

    public KO DEX() {
        if (this.AQG == null) {
            this.AQG = new KO();
        }

        return this.AQG;
    }

    public void setName(KO var1) {
        this.AQG = var1;
    }

    public _A getValue() {
        return this.AQH;
    }

    public abstract _A DEY();

    public void setValue(_A var1) {
        this.AQH = var1;
    }

    public String toString() {
        return "ConfigurationProperty [name=" + this.AQG + ", value=" + this.AQH + "]";
    }
}
