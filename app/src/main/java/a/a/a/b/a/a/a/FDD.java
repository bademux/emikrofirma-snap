package a.a.a.b.a.a.a;

import a.a.a.b.a.a.d.FDW;
import a.a.a.b.a.a.e.FEF;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FDD extends FDH {
    private final boolean HCX;
    private final boolean HCY;
    private final List<FDW> HCZ;
    private final List<FEF> HDA;

    public FDD(boolean var1, String var2, String var3, String var4, boolean var5, List<FDW> var6, List<FEF> var7) {
        super(var2, var3, var4);
        this.HCX = var1;
        this.HCY = var5;
        this.HCZ = var6;
        this.HDA = var7;
    }

    public FDD(boolean var1, String var2, String var3, String var4, boolean var5) {
        this(var1, var2, var3, var4, var5, new ArrayList(), new ArrayList());
    }

    public FDD(boolean var1, String var2, String var3, boolean var4) {
        this(var1, var2, null, var3, var4, new ArrayList(), new ArrayList());
    }

    public boolean IJE() {
        return this.HCX;
    }

    public boolean IJF() {
        return this.HCY;
    }

    public List<FDW> getColumns() {
        return this.HCZ;
    }

    public List<FEF> getConstraints() {
        return this.HDA;
    }

    public String toString() {
        return "TableDef [temporary=" + this.HCX + ", failOnExisting=" + this.HCY + ", columns=" + this.HCZ + ", constraints=" + this.HDA + ", toString()=" + super.toString() + "]";
    }

    public FDD IJG(String var1) {
        FDD var2 = new FDD(this.HCX, this.HDI, var1, this.HCY);
        Iterator var3 = this.HCZ.iterator();

        while (var3.hasNext()) {
            FDW var4 = (FDW) var3.next();
            var2.getColumns().add((FDW) var4.IJV());
        }

        var3 = this.HDA.iterator();

        while (var3.hasNext()) {
            FEF var5 = (FEF) var3.next();
            var2.getConstraints().add(var5.IJZ());
        }

        return var2;
    }
}
