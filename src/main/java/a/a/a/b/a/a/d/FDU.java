package a.a.a.b.a.a.d;

import a.a.a.b.a.a.FDK;

public class FDU<_T> extends FDP {
    protected _T HED;

    public FDU(String var1, FDV var2, _T var3, FDK var4) {
        super(var1, var2, var4);
        this.HED = var3;
    }

    public FDU(FDR var1, _T var2, FDK var3) {
        this(var1.HEL, var1.HDZ, var2, var3);
    }

    public FDU(String var1, FDV var2, _T var3) {
        this(var1, var2, var3, FDK.EQUALS);
    }

    public FDU(FDR var1, _T var2) {
        this(var1, var2, FDK.EQUALS);
    }

    public FDU(String var1, FDV var2) {
        this(var1, var2, null);
    }

    public FDU(FDR var1) {
        this(var1, null);
    }

    public _T getValue() {
        return this.HED;
    }

    public void setValue(_T var1) {
        this.HED = var1;
    }

    public String toString() {
        return "CellValue [value=" + this.HED + ", toString()=" + super.toString() + "]";
    }
}
