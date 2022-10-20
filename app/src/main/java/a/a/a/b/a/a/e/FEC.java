package a.a.a.b.a.a.e;

import a.a.a.b.a.a.d.CellNamed;

import java.util.Iterator;
import java.util.List;

public class FEC extends FEH {
    public FEC() {
        super(FEG.UNIQUE);
    }

    public FEC(CellNamed... var1) {
        super(FEG.UNIQUE, var1);
    }

    public FEC(List<String> var1) {
        super(FEG.UNIQUE, var1);
    }

    public FEC(String... var1) {
        super(FEG.UNIQUE, var1);
    }

    public String toString() {
        return "ConstraintUNIQUEDef [toString()=" + super.toString() + "]";
    }

    public FEF IJZ() {
        FEC var1 = new FEC();
        Iterator var2 = this.HER.iterator();

        while (var2.hasNext()) {
            String var3 = (String) var2.next();
            var1.getColumns().add(var3);
        }

        return var1;
    }
}
