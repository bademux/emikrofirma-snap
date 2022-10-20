package a.a.a.c.e.a.d;

public class ThreeValueBox<_FIRST, _SECOND, _THIRD> extends TwoValueBox<_FIRST, _SECOND> {
    protected _THIRD GQF;

    public ThreeValueBox() {
        this(null, null, null);
    }

    public ThreeValueBox(_FIRST var1, _SECOND var2, _THIRD var3) {
        super(var1, var2);
        this.GQF = var3;
    }

    public _THIRD getThirdValue() {
        return this.GQF;
    }

    public void setThirdValue(_THIRD var1) {
        this.GQF = var1;
    }

    public String toString() {
        return "ValueContainer3 [firstValue=" + this.GQG + ", secondValue=" + this.GQC + ", thirdValue=" + this.GQF + "]";
    }

    public int hashCode() {
        int var2 = super.hashCode();
        var2 = 31 * var2 + (this.GQF == null ? 0 : this.GQF.hashCode());
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
            ThreeValueBox var2 = (ThreeValueBox) var1;
            if (this.GQF == null) {
                return var2.GQF == null;
            } else return this.GQF.equals(var2.GQF);
        }
    }
}
