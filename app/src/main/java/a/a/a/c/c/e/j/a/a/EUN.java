package a.a.a.c.c.e.j.a.a;

import a.a.a.c.c.e.j.a.EUT;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class EUN implements ChangeListener<String> {
    private final EUT GLA;

    public EUN(EUT var1) {
        this.GLA = var1;
    }

    public void changed(ObservableValue<? extends String> var1, String var2, String var3) {

        if (var3 != null && this.GLA.GLM.getFieldsEditable()) {
            this.GLA.QGQ(var3);
            org.slf4j.LoggerFactory.getLogger(getClass()).info("RefId changed");
        }

    }
}
