package a.a.a.b.a.a.e;

import a.a.a.b.a.a.d.CellDef;
import a.a.a.b.a.a.d.CellNamed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class ConstraintBase implements FEF {
    protected final SqlColumnKeyword HEQ;
    protected final List<String> HER;

    public ConstraintBase(SqlColumnKeyword var1, String... var2) {
        this(var1);
        String[] var3 = var2;
        int var4 = var2.length;

        this.HER.addAll(Arrays.asList(var3).subList(0, var4));

    }

    public ConstraintBase(SqlColumnKeyword var1, CellNamed... var2) {
        this(var1);
        CellNamed[] var3 = var2;
        int var4 = var2.length;

        for (int var5 = 0; var5 < var4; ++var5) {
            CellNamed var6 = var3[var5];
            if (var6 instanceof CellDef var7) {
                String var8 = var6.getName() + " " + var7.getOrder().getKeyWord();
                this.HER.add(var8);
            } else {
                this.HER.add(var6.getName());
            }
        }

    }

    public ConstraintBase(SqlColumnKeyword var1, List<String> var2) {
        this.HEQ = var1;
        this.HER = var2;
    }

    public ConstraintBase(SqlColumnKeyword var1) {
        this.HEQ = var1;
        this.HER = new ArrayList();
    }

    public SqlColumnKeyword getConstraintType() {
        return this.HEQ;
    }

    public List<String> getColumns() {
        return this.HER;
    }

    public String toString() {
        return "ConstraintBase [constraintType=" + this.HEQ + ", columns=" + this.HER + ", toString()=" + super.toString() + "]";
    }

    public int hashCode() {
        int var2 = 1;
        var2 = 31 * var2 + (this.HEQ == null ? 0 : this.HEQ.hashCode());
        var2 = 31 * var2 + (this.HER == null ? 0 : this.HER.hashCode());
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
            ConstraintBase var2 = (ConstraintBase) var1;
            if (this.HEQ != var2.HEQ) {
                return false;
            } else {
                if (this.HER == null) {
                    return var2.HER == null;
                } else return this.HER.equals(var2.HER);
            }
        }
    }
}
