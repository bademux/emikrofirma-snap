package a.a.a.c.f.a;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.b.b.JN;
import a.a.a.c.f.b.c.JY;

import jakarta.xml.bind.annotation.XmlTransient;

@XmlTransient
public abstract class EXM extends IK {
    private JY FIJ;

    public EXM() {
        this(DAE());
        EXF.getInstance().ICQ();
    }

    public EXM(String var1) {
        super(var1);
        EXF.getInstance().ICQ();
    }

    public EXM(String var1, JN var2) {
        super(var1);
        EXF.getInstance().ICO();

        try {
            this.FIJ = new JY(0);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public EXM(String var1, JN var2, JY var3) {
        super(var1);
        EXF.getInstance().ICO();

        try {
            this.FIJ = var3;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public void setDocumentIndex(JY var1) {
        this.FIJ = var1;
    }

    public JY getDocumentIndex() {
        return this.FIJ;
    }

    public JY FJI() {
        if (this.FIJ == null) {
            this.FIJ = new JY();
        }

        return this.FIJ;
    }

    public int hashCode() {
        int var2 = super.hashCode();
        var2 = 31 * var2 + (this.FIJ == null ? 0 : this.FIJ.hashCode());
        return var2;
    }

    public boolean equals(Object var1) {
        if (this == var1) {
            return true;
        } else if (!super.equals(var1)) {
            return false;
        } else if (this.getClass() != var1.getClass()) {
            return false;
        } else {
            EXM var2 = (EXM) var1;
            if (this.FIJ == null) {
                return var2.FIJ == null;
            } else return this.FIJ.equals(var2.FIJ);
        }
    }

    public String toString() {
        return "ModelBusinessPeriodAndDocIndexElement [documentIndex=" + this.FIJ + ", toString()=" + super.toString() + "]";
    }
}
