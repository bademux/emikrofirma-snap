package a.a.a.b.a.a.d;

import a.a.a.b.a.a.FDL;

public class FEA extends FDY {
    protected final FDL HEM;

    public FEA(String var1, FDL var2) {
        super(var1);
        this.HEM = var2;
    }

    public FEA(FDY var1, FDL var2) {
        super(var1.HEL);
        this.HEM = var2;
    }

    public FEA(String var1) {
        this(var1, FDL.ASC);
    }

    public FEA(FDY var1) {
        this(var1, FDL.ASC);
    }

    public FDL getOrderType() {
        return this.HEM;
    }

    public String toString() {
        return "CellOrder [orderType=" + this.HEM + ", toString()=" + super.toString() + "]";
    }
}
