package a.a.a.b.a.a.d;

public class FDY implements FDZ {
    protected final String HEL;

    public FDY(String var1) {
        this.HEL = var1;
    }

    public FDY(FDY var1) {
        this(var1.HEL);
    }

    public String getName() {
        return this.HEL;
    }

    public String toString() {
        return "CellNamed [name=" + this.HEL + "]";
    }

    public int hashCode() {
        int var2 = 1;
        var2 = 31 * var2 + (this.HEL == null ? 0 : this.HEL.hashCode());
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
            FDY var2 = (FDY) var1;
            if (this.HEL == null) {
                return var2.HEL == null;
            } else return this.HEL.equals(var2.HEL);
        }
    }

    public FDZ IJV() {
        FDY var1 = new FDY(this.HEL);
        return var1;
    }
}
