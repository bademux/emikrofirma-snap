package a.a.a.c.e.a.d;

public class ValueContainer1<_FIRST> {
    protected _FIRST GQG;

    public ValueContainer1() {
        this(null);
    }

    public ValueContainer1(_FIRST var1) {
        this.GQG = var1;
    }

    public _FIRST getFirstValue() {
        return this.GQG;
    }

    public void setFirstValue(_FIRST var1) {
        this.GQG = var1;
    }

    public String toString() {
        return "ValueContainer1 [firstValue=" + this.GQG + "]";
    }

    public int hashCode() {
        int var2 = 1;
        var2 = 31 * var2 + (this.GQG == null ? 0 : this.GQG.hashCode());
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
            ValueContainer1 var2 = (ValueContainer1) var1;
            if (this.GQG == null) {
                return var2.GQG == null;
            } else return this.GQG.equals(var2.GQG);
        }
    }
}
