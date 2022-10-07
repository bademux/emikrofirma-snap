package a.a.a.b.a.a.d;

import a.a.a.b.a.a.FDK;
import a.a.a.b.a.a.a.FDH;

public class FDT extends FDP {
    protected FDH HEB;
    protected FDY HEC;

    public FDT(String var1, FDH var2, FDY var3, FDK var4) {
        super(var1, FDV.NULL, var4);
        this.HEB = var2;
        this.HEC = var3;
    }

    public FDT(FDY var1, FDH var2, FDY var3, FDK var4) {
        this(var1.getName(), var2, var3, var4);
    }

    public FDT(String var1, FDH var2, FDY var3) {
        this(var1, var2, var3, FDK.EQUALS);
    }

    public FDT(FDY var1, FDH var2, FDY var3) {
        this(var1, var2, var3, FDK.EQUALS);
    }

    public FDH getRefTable() {
        return this.HEB;
    }

    public FDY getRefCell() {
        return this.HEC;
    }

    public void setRefCell(FDY var1) {
        this.HEC = var1;
    }

    public String toString() {
        return "CellJoin [refTable=" + this.HEB + ", refCell=" + this.HEC + ", toString()=" + super.toString() + "]";
    }
}
