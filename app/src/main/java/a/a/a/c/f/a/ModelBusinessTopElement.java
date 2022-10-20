package a.a.a.c.f.a;

import a.a.a.c.f.ModelBaseElementWithIdAndAuditTimestamp;
import jakarta.xml.bind.annotation.XmlTransient;

@XmlTransient
public abstract class ModelBusinessTopElement extends ModelBaseElementWithIdAndAuditTimestamp {
    public ModelBusinessTopElement() {
        this(DAE());

    }

    public ModelBusinessTopElement(String var1) {
        super(var1);

    }

    public String toString() {
        return "ModelBusinessTopElement [toString()=" + super.toString() + "]";
    }
}
