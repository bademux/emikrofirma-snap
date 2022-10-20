package a.a.a.b.a.a.c;

import a.a.a.b.a.a.d.CellNamed;

import java.util.ArrayList;
import java.util.List;

public class FDN extends FDM {
    private final boolean HDU;
    private final boolean HDV;
    private final List<CellNamed> HDW;
    private final String HDX;

    public FDN(boolean var1, String var2, String var3, boolean var4, List<CellNamed> var5, String var6) {
        super(var2, null, var3);
        this.HDU = var1;
        this.HDV = var4;
        this.HDW = var5;
        this.HDX = var6;
    }

    public FDN(boolean var1, String var2, String var3, boolean var4, String var5) {
        this(var1, var2, var3, var4, new ArrayList(), var5);
    }

    public boolean IJT() {
        return this.HDU;
    }

    public boolean IJU() {
        return this.HDV;
    }

    public List<CellNamed> getColumns() {
        return this.HDW;
    }

    public String getDefinition() {
        return this.HDX;
    }

    public String toString() {
        return "ViewDef [temporary=" + this.HDU + ", failOnExisting=" + this.HDV + ", columns=" + this.HDW + ", definition=" + this.HDX + ", toString()=" + super.toString() + "]";
    }
}
