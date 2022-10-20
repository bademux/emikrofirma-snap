package a.a.a.c.e.a.d;

public class EVZ<_FIRST, _SECOND> extends EWD<_FIRST> {
    protected _SECOND GQC;

    public EVZ() {
        this(null, null);
    }

    public EVZ(_FIRST var1, _SECOND var2) {
        super(var1);
        this.GQC = var2;
    }

    public _SECOND getSecondValue() {
        return this.GQC;
    }

    public void setSecondValue(_SECOND var1) {
        this.GQC = var1;
    }

    public String toString() {
        return "ValueContainer2 [firstValue=" + this.GQG + ", secondValue=" + this.GQC + "]";
    }

    public int hashCode() {
        int var2 = super.hashCode();
        var2 = 31 * var2 + (this.GQC == null ? 0 : this.GQC.hashCode());
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
            EVZ var2 = (EVZ) var1;
            if (this.GQC == null) {
                return var2.GQC == null;
            } else return this.GQC.equals(var2.GQC);
        }
    }
}
