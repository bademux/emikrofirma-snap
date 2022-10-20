package a.a.a.b.a.a.e;

import a.a.a.b.a.a.d.CellDef;
import a.a.a.b.a.a.d.CellNamed;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConstraintFOREIGNDef extends ConstraintBase {
    protected final String HEN;
    protected final List<String> HEO;

    public ConstraintFOREIGNDef(String var1) {
        super(SqlColumnKeyword.FOREIGN);
        this.HEN = var1;
        this.HEO = new ArrayList();
    }

    public ConstraintFOREIGNDef(String var1, CellNamed[] var2, CellNamed[] var3) {
        super(SqlColumnKeyword.FOREIGN, var2);
        this.HEN = var1;
        this.HEO = new ArrayList();
        CellNamed[] var4 = var3;
        int var5 = var3.length;

        for (int var6 = 0; var6 < var5; ++var6) {
            CellNamed var7 = var4[var6];
            if (var7 instanceof CellDef var8) {
                String var9 = var7.getName() + " " + var8.getOrder().getKeyWord();
                this.HEO.add(var9);
            } else {
                this.HEO.add(var7.getName());
            }
        }

    }

    public ConstraintFOREIGNDef(String var1, List<String> var2, List<String> var3) {
        super(SqlColumnKeyword.FOREIGN, var2);
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
            ConstraintFOREIGNDef var2 = (ConstraintFOREIGNDef) var1;
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

    public ConstraintDef copy() {
        ConstraintFOREIGNDef var1 = new ConstraintFOREIGNDef(this.HEN);
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
