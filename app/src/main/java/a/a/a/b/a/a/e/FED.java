package a.a.a.b.a.a.e;

import a.a.a.b.a.a.d.FDW;
import a.a.a.b.a.a.d.FDY;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FED extends FEH {
    protected final String HEN;
    protected final List<String> HEO;

    public FED(String var1) {
        super(FEG.FOREIGN);
        this.HEN = var1;
        this.HEO = new ArrayList();
    }

    public FED(String var1, FDY[] var2, FDY[] var3) {
        super(FEG.FOREIGN, var2);
        this.HEN = var1;
        this.HEO = new ArrayList();
        FDY[] var4 = var3;
        int var5 = var3.length;

        for (int var6 = 0; var6 < var5; ++var6) {
            FDY var7 = var4[var6];
            if (var7 instanceof FDW var8) {
                String var9 = var7.getName() + " " + var8.getOrder().getKeyWord();
                this.HEO.add(var9);
            } else {
                this.HEO.add(var7.getName());
            }
        }

    }

    public FED(String var1, List<String> var2, List<String> var3) {
        super(FEG.FOREIGN, var2);
        this.HEN = var1;
        this.HEO = var3;
    }

    public String getRefTableName() {
        return this.HEN;
    }

    public List<String> getRefColumns() {
        return this.HEO;
    }

    public int hashCode() {
        int var2 = super.hashCode();
        var2 = 31 * var2 + (this.HEN == null ? 0 : this.HEN.hashCode());
        var2 = 31 * var2 + (this.HEO == null ? 0 : this.HEO.hashCode());
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
            FED var2 = (FED) var1;
            if (this.HEN == null) {
                if (var2.HEN != null) {
                    return false;
                }
            } else if (!this.HEN.equals(var2.HEN)) {
                return false;
            }

            if (this.HEO == null) {
                return var2.HEO == null;
            } else return this.HEO.equals(var2.HEO);
        }
    }

    public String toString() {
        return "ConstraintFOREIGNDef [refTableName=" + this.HEN + ", refColumns=" + this.HEO + ", toString()=" + super.toString() + "]";
    }

    public FEF IJZ() {
        FED var1 = new FED(this.HEN);
        Iterator var2 = this.HER.iterator();

        String var3;
        while (var2.hasNext()) {
            var3 = (String) var2.next();
            var1.getColumns().add(var3);
        }

        var2 = this.HEO.iterator();

        while (var2.hasNext()) {
            var3 = (String) var2.next();
            var1.getRefColumns().add(var3);
        }

        return var1;
    }
}
