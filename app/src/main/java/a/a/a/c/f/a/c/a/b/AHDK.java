package a.a.a.c.f.a.c.a.b;

import a.a.a.c.f.a.c.a.AHDH;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlTransient;

@XmlTransient
@XmlSeeAlso({AHDM.class, AHDL.class, AHDN.class})
public abstract class AHDK<_T> extends AHDH {
    @XmlElement(
            name = "value"
    )
    protected final _T AHVP;

    protected AHDK() {

        this.AHVP = null;

    }

    public AHDK(String var1, _T var2) {
        super(var1);

        this.AHVP = var2;

    }

    public _T getValue() {
        return this.AHVP;
    }

    public String toString() {
        return "Constant [id=" + this.AHVJ + ", value=" + this.AHVP + "]";
    }
}
