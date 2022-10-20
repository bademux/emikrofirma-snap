package a.a.a.b.a.a.e;

import a.a.a.b.a.a.d.CellNamed;

import java.util.Iterator;
import java.util.List;

public class ConstraintPRIMARYDef extends ConstraintBase {
    public ConstraintPRIMARYDef() {
        super(FEG.PRIMARY);
    }

    public ConstraintPRIMARYDef(CellNamed... var1) {
        super(FEG.PRIMARY, var1);
    }

    public ConstraintPRIMARYDef(List<String> var1) {
        super(FEG.PRIMARY, var1);
    }

    public ConstraintPRIMARYDef(String... var1) {
        super(FEG.PRIMARY, var1);
    }

    public String toString() {
        return "ConstraintPRIMARYDef [toString()=" + super.toString() + "]";
    }

    public FEF IJZ() {
        ConstraintPRIMARYDef var1 = new ConstraintPRIMARYDef();
        Iterator var2 = this.HER.iterator();

        while (var2.hasNext()) {
            String var3 = (String) var2.next();
            var1.getColumns().add(var3);
        }

        return var1;
    }
}
