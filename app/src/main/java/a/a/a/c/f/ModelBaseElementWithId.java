package a.a.a.c.f;

import a.a.a.c.f.b.c.a.QSW;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.UUID;

@XmlTransient
public abstract class ModelBaseElementWithId extends ModelBase {
    @XmlID
    @XmlAttribute
    protected final String APB;
    @XmlTransient
    private ModelBaseElementWithId APC;
    @XmlTransient
    private ModelBaseElementWithId APD;
    private transient QSW QYZ;

    public QSW getState() {
        return this.QYZ;
    }

    public void setState(QSW var1) {
        this.QYZ = var1;
    }

    protected static String DAE() {
        return UUID.randomUUID().toString();
    }

    protected ModelBaseElementWithId() {
        this(DAE());

    }

    protected ModelBaseElementWithId(String var1) {

        this.APB = var1;

    }

    public String getId() {
        return this.APB;
    }

    protected ModelBaseElementWithId getParent() {
        return this.APC;
    }

    protected ModelBaseElementWithId getParentOnlyActiveState() {
        ModelBaseElementWithId var1;
        for (var1 = this.APC; var1 != null && !var1.getState().equals(QSW.ACTIVE); var1 = var1.getParent()) {
        }

        return var1;
    }

    public void setParent(ModelBaseElementWithId var1) {
        this.APC = var1;
    }

    protected ModelBaseElementWithId getChild() {
        return this.APD;
    }

    protected ModelBaseElementWithId getChildOnlyActiveState() {
        ModelBaseElementWithId var1;
        for (var1 = this.APD; var1 != null && !var1.getState().equals(QSW.ACTIVE); var1 = var1.getChild()) {
        }

        return var1;
    }

    public void setChild(ModelBaseElementWithId var1) {
        this.APD = var1;
    }

    public int hashCode() {
        int var2 = 1;
        var2 = 31 * var2 + (this.APB == null ? 0 : this.APB.hashCode());
        return var2;
    }

    public boolean equals(Object var1) {
        if (this == var1) {
            return true;
        } else if (var1 == null) {
            return false;
        } else if (this.getClass() != var1.getClass()) {
            return false;
        } else {
            ModelBaseElementWithId var2 = (ModelBaseElementWithId) var1;
            if (this.APB == null) {
                return var2.APB == null;
            } else return this.APB.equals(var2.APB);
        }
    }

    public String toString() {
        return "ModelBaseElementWithId [id=" + this.APB + ", toString()=" + super.toString() + "]";
    }
}
