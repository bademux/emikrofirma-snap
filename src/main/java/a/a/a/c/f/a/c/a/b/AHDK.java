package a.a.a.c.f.a.c.a.b;

import a.a.a.c.e.a.k.a.EXF;
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
        EXF.getInstance().ICO();

        try {
            this.AHVP = null;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public AHDK(String var1, _T var2) {
        super(var1);
        EXF.getInstance().ICO();

        try {
            this.AHVP = var2;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public _T getValue() {
        return this.AHVP;
    }

    public String toString() {
        return "Constant [id=" + this.AHVJ + ", value=" + this.AHVP + "]";
    }
}
