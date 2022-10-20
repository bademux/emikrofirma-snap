package a.a.a.c.f.a;

import a.a.a.c.f.b.b.Period;
import jakarta.xml.bind.annotation.XmlTransient;

@XmlTransient
public abstract class ModelBusinessPeriodElement extends ModelBusinessTopElement {
    protected Period AMH;
    private transient Period BQT;

    public ModelBusinessPeriodElement() {
        this(DAE());

    }

    public ModelBusinessPeriodElement(String var1) {
        super(var1);

    }

    public ModelBusinessPeriodElement(String var1, Period var2) {
        super(var1);

        this.AMH = var2;

    }

    public Period getPeriod() {
        return this.AMH;
    }

    public Period DAF() {
        if (this.AMH == null) {
            this.AMH = new Period();
        }

        return this.AMH;
    }

    public void setPeriod(Period var1) {
        this.AMH = var1;
    }

    public Period getPreviousPeriod() {
        return this.BQT;
    }

    public void setPreviousPeriod(Period var1) {
        this.BQT = var1;
    }

    public int hashCode() {
        int var2 = 1;
        var2 = 31 * var2 + (this.AMH == null ? 0 : this.AMH.hashCode());
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
            ModelBusinessPeriodElement var2 = (ModelBusinessPeriodElement) var1;
            if (this.AMH == null) {
                return var2.AMH == null;
            } else return this.AMH.equals(var2.AMH);
        }
    }

    public String toString() {
        return "ModelBusinessPeriodElement [period=" + this.AMH + ", toString()=" + super.toString() + "]";
    }
}
