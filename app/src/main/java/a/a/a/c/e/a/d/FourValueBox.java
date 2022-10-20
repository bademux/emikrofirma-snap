package a.a.a.c.e.a.d;

public class FourValueBox<_FIRST, _SECOND, _THIRD, _FOURTH> extends ThreeValueBox<_FIRST, _SECOND, _THIRD> {
    protected _FOURTH GQD;

    public FourValueBox() {
        this(null, null, null, null);
    }

    public FourValueBox(_FIRST var1, _SECOND var2, _THIRD var3, _FOURTH var4) {
        super(var1, var2, var3);
        this.GQD = var4;
    }

    public _FOURTH getFourthValue() {
        return this.GQD;
    }

    public void setFourthValue(_FOURTH var1) {
        this.GQD = var1;
    }

    public String toString() {
        return "ValueContainer4 [firstValue=" + this.GQG + ", secondValue=" + this.GQC + ", thirdValue=" + this.GQF + ", fourthValue=" + this.GQD + "]";
    }

    public int hashCode() {
        int var2 = super.hashCode();
        var2 = 31 * var2 + (this.GQD == null ? 0 : this.GQD.hashCode());
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
            FourValueBox var2 = (FourValueBox) var1;
            if (this.GQD == null) {
                return var2.GQD == null;
            } else return this.GQD.equals(var2.GQD);
        }
    }
}
