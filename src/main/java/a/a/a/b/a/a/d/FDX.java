package a.a.a.b.a.a.d;

import a.a.a.b.a.a.FEI;

public class FDX extends FDY {
    protected final String HEJ;
    protected final FEI HEK;

    public FDX(String var1, String var2, FEI var3) {
        super(var1);
        this.HEJ = var2;
        this.HEK = var3;
    }

    public FDX(FDY var1, String var2, FEI var3) {
        super(var1.HEL);
        this.HEJ = var2;
        this.HEK = var3;
    }

    public FDX(String var1, String var2) {
        this(var1, var2, FEI.NONE);
    }

    public FDX(FDY var1, String var2) {
        this(var1, var2, FEI.NONE);
    }

    public FDX(String var1) {
        this(var1, null);
    }

    public FDX(FDY var1) {
        this(var1, null);
    }

    public String getAlias() {
        return this.HEJ;
    }

    public FEI getAggregateType() {
        return this.HEK;
    }

    public String toString() {
        return "CellQuery [alias=" + this.HEJ + ", aggregateType=" + this.HEK + ", toString()=" + super.toString() + "]";
    }
}
