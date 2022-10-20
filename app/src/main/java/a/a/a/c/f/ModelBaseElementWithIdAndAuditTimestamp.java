package a.a.a.c.f;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;

@XmlTransient
public abstract class ModelBaseElementWithIdAndAuditTimestamp extends ModelBaseElementWithId {
    @XmlAttribute
    private final Date APE;

    protected ModelBaseElementWithIdAndAuditTimestamp() {
        this(DAE());

    }

    protected ModelBaseElementWithIdAndAuditTimestamp(String var1) {
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
