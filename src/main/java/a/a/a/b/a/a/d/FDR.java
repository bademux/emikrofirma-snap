package a.a.a.b.a.a.d;

public class FDR extends FDY {
    protected final FDV HDZ;

    public FDR(String var1, FDV var2) {
        super(var1);
        this.HDZ = var2;
    }

    public FDR(String var1) {
        this(var1, FDV.NULL);
    }

    public FDR(FDR var1) {
        this(var1.HEL, var1.HDZ);
    }

    public FDV getType() {
        return this.HDZ;
    }

    public String toString() {
        return "CellTyped [type=" + this.HDZ + ", toString()=" + super.toString() + "]";
    }

    public FDZ IJV() {
        FDR var1 = new FDR(this.HEL, this.HDZ);
        return var1;
    }
}
