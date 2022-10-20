package a.a.a.c.c.e.j.a.a;

import a.a.a.c.c.e.j.a.EUT;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class EUI implements ChangeListener<String> {
    private final EUT GKT;

    public EUI(EUT var1) {
        this.GKT = var1;
    }

    public void changed(ObservableValue<? extends String> var1, String var2, String var3) {

        if (var3 != null) {
            this.GKT.HXP();
            org.slf4j.LoggerFactory.getLogger(getClass()).info("Payment date days changed to " + var3);
        }

    }
}
