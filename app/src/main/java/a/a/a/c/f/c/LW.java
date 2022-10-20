package a.a.a.c.f.c;

import a.a.a.c.f.KW;
import a.a.a.c.f.b.c.JY;
import jakarta.xml.bind.annotation.XmlTransient;

@XmlTransient
public abstract class LW extends KW {
    protected JY AQJ;

    public LW() {
        this(DAE());

    }

    public LW(String var1) {
        super(var1);

    }

    public JY getVersion() {
        return this.AQJ;
    }

    public void DEV() {
        if (this.AQJ == null) {
            this.AQJ = new JY(1);
        }

        this.AQJ.setValue(this.AQJ.getValue() + 1);
    }

    public JY DEW() {
        if (this.AQJ == null) {
            this.AQJ = new JY();
        }

        return this.AQJ;
    }

    public void setVersion(JY var1) {
        this.AQJ = var1;
    }
}
