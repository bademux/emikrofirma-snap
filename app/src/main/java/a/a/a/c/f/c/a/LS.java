package a.a.a.c.f.c.a;

import a.a.a.c.f.b.c.KO;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class LS extends ConfigurationProperty<KO, String> {
    public LS(KO var1, KO var2) {
        super(var1, var2);

    }

    public LS(String var1, String var2) {
        this(new KO(var1), new KO(var2));

    }

    public LS(String var1) {
        this(var1, null);

    }

    public LS() {
        this(null);

    }

    public KO DEY() {
        if (this.AQH == null) {
            this.AQH = new KO();
        }

        return this.AQH;
    }
}
