package a.a.a.c.c.e.c.a.a;

import a.a.a.c.c.e.c.a.ESG;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class ESD implements ChangeListener<Number> {
    private final ESG GBT;

    public ESD(ESG var1) {
        this.GBT = var1;
    }

    public void changed(ObservableValue<? extends Number> var1, Number var2, Number var3) {
        this.GBT.HTA();
    }
}
