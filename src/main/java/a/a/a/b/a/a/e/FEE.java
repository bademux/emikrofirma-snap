package a.a.a.b.a.a.e;

import a.a.a.b.a.a.d.FDY;

import java.util.Iterator;
import java.util.List;

public class FEE extends FEH {
    public FEE() {
        super(FEG.PRIMARY);
    }

    public FEE(FDY... var1) {
        super(FEG.PRIMARY, var1);
    }

    public FEE(List<String> var1) {
        super(FEG.PRIMARY, var1);
    }

    public FEE(String... var1) {
        super(FEG.PRIMARY, var1);
    }

    public String toString() {
        return "ConstraintPRIMARYDef [toString()=" + super.toString() + "]";
    }

    public FEF IJZ() {
        FEE var1 = new FEE();
        Iterator var2 = this.HER.iterator();

        while (var2.hasNext()) {
            String var3 = (String) var2.next();
            var1.getColumns().add(var3);
        }

        return var1;
    }
}
