package a.a.a.b.a.a.e;

import a.a.a.b.a.a.d.CellNamed;

import java.util.Iterator;
import java.util.List;

public class ConstraintUNIQUEDef extends ConstraintBase {
    public ConstraintUNIQUEDef() {
        super(SqlColumnKeyword.UNIQUE);
    }

    public ConstraintUNIQUEDef(CellNamed... var1) {
        super(SqlColumnKeyword.UNIQUE, var1);
    }

    public ConstraintUNIQUEDef(List<String> var1) {
        super(SqlColumnKeyword.UNIQUE, var1);
    }

    public ConstraintUNIQUEDef(String... var1) {
        super(SqlColumnKeyword.UNIQUE, var1);
    }

    public String toString() {
        return "ConstraintUNIQUEDef [toString()=" + super.toString() + "]";
    }

    public ConstraintDef copy() {
        ConstraintUNIQUEDef var1 = new ConstraintUNIQUEDef();
        Iterator var2 = this.HER.iterator();

        while (var2.hasNext()) {
            String var3 = (String) var2.next();
            var1.getColumns().add(var3);
        }

        return var1;
    }
}
