package a.a.a.c.f;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.b.c.a.QSW;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlTransient;
import java.util.UUID;

@XmlTransient
public abstract class KV extends KU {
    @XmlID
    @XmlAttribute
    protected final String APB;
    @XmlTransient
    private KV APC;
    @XmlTransient
    private KV APD;
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

    protected KV() {
        this(DAE());
        EXF.getInstance().ICQ();
    }

    protected KV(String var1) {
        EXF.getInstance().ICO();

        try {
            this.APB = var1;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public String getId() {
        return this.APB;
    }

    protected KV getParent() {
        return this.APC;
    }

    protected KV getParentOnlyActiveState() {
        KV var1;
        for (var1 = this.APC; var1 != null && !var1.getState().equals(QSW.ACTIVE); var1 = var1.getParent()) {
        }

        return var1;
    }

    public void setParent(KV var1) {
        this.APC = var1;
    }

    protected KV getChild() {
        return this.APD;
    }

    protected KV getChildOnlyActiveState() {
        KV var1;
        for (var1 = this.APD; var1 != null && !var1.getState().equals(QSW.ACTIVE); var1 = var1.getChild()) {
        }

        return var1;
    }

    public void setChild(KV var1) {
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
            KV var2 = (KV) var1;
            if (this.APB == null) {
                return var2.APB == null;
            } else return this.APB.equals(var2.APB);
        }
    }

    public String toString() {
        return "ModelBaseElementWithId [id=" + this.APB + ", toString()=" + super.toString() + "]";
    }
}
