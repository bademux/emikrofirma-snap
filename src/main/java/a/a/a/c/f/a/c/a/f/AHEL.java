package a.a.a.c.f.a.c.a.f;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.c.a.AHDH;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlTransient;

@XmlTransient
@XmlSeeAlso({AHEN.class, AHEM.class, AHEP.class})
public abstract class AHEL<_T> extends AHDH {
    protected transient boolean AHWZ;
    @XmlElement(
            name = "value"
    )
    protected _T AHXA;

    protected AHEL() {
        EXF.getInstance().ICO();

        try {
            this.AHWZ = false;
            this.AHXA = null;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public AHEL(String var1, _T var2) {
        super(var1);
        EXF.getInstance().ICO();

        try {
            this.AHWZ = false;
            this.AHXA = var2;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public _T getValue() {
        return this.AHXA;
    }

    public void setValue(_T var1) {
        EXF.getInstance().ICK("value " + var1);
        this.AHXA = var1;
        this.AHWZ = true;
    }

    public boolean AIDV() {
        return this.AHWZ;
    }

    public String toString() {
        return "Variable [id=" + this.AHVJ + ", value=" + this.AHXA + ", set=" + this.AHWZ + "]";
    }

    public abstract String getValueAsString();
}
