package a.a.a.c.f;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;

@XmlTransient
public abstract class KW extends KV {
    @XmlAttribute
    private final Date APE;

    protected KW() {
        this(DAE());

    }

    protected KW(String var1) {
        super(var1);

        this.APE = new Date();

    }

    public Date getCreationDateTime() {
        return this.APE;
    }

    public String toString() {
        return "ModelBaseElementWithIdAndAuditTimestamp [creationDateTime=" + this.APE + ", toString()=" + super.toString() + "]";
    }
}
