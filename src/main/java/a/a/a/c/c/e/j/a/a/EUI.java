package a.a.a.c.c.e.j.a.a;

import a.a.a.c.c.e.j.a.EUT;
import a.a.a.c.e.a.k.a.EXF;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class EUI implements ChangeListener<String> {
    private final EUT GKT;

    public EUI(EUT var1) {
        this.GKT = var1;
    }

    public void changed(ObservableValue<? extends String> var1, String var2, String var3) {
        EXF.getInstance().ICO();

        try {
            if (var3 != null) {
                this.GKT.HXP();
                EXF.getInstance().ICE("Payment date days changed to " + var3);
            }
        } finally {
            EXF.getInstance().ICP();
        }

    }
}
