package a.a.a.c.f;

import a.a.a.c.e.a.k.a.EXF;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;
import java.util.Date;

@XmlTransient
public abstract class KW extends KV {
    @XmlAttribute
    private final Date APE;

    protected KW() {
        this(DAE());
        EXF.getInstance().ICQ();
    }

    protected KW(String var1) {
        super(var1);
        EXF.getInstance().ICO();

        try {
            this.APE = new Date();
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public Date getCreationDateTime() {
        return this.APE;
    }

    public String toString() {
        return "ModelBaseElementWithIdAndAuditTimestamp [creationDateTime=" + this.APE + ", toString()=" + super.toString() + "]";
    }
}
