package a.a.a.c.f.a;

import a.a.a.c.f.b.b.Period;
import a.a.a.c.f.b.c.JY;
import jakarta.xml.bind.annotation.XmlTransient;

@XmlTransient
public abstract class ModelBusinessPeriodAndDocIndexElement extends ModelBusinessPeriodElement {
    private JY FIJ;

    public ModelBusinessPeriodAndDocIndexElement() {
        this(DAE());

    }

    public ModelBusinessPeriodAndDocIndexElement(String var1) {
        super(var1);

    }

    public ModelBusinessPeriodAndDocIndexElement(String var1, Period var2) {
        super(var1);

        this.FIJ = new JY(0);

    }

    public ModelBusinessPeriodAndDocIndexElement(String var1, Period var2, JY var3) {
        super(var1);

        this.FIJ = var3;

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
            ModelBusinessPeriodAndDocIndexElement var2 = (ModelBusinessPeriodAndDocIndexElement) var1;
            if (this.FIJ == null) {
                return var2.FIJ == null;
            } else return this.FIJ.equals(var2.FIJ);
        }
    }

    public String toString() {
        return "ModelBusinessPeriodAndDocIndexElement [documentIndex=" + this.FIJ + ", toString()=" + super.toString() + "]";
    }
}
