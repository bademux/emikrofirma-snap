package a.a.a.c.c.e.d.a.g;

import a.a.a.c.c.e.d.a.ESU;
import a.a.a.c.f.b.c.a.CalculationMethodType;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Toggle;

public class QTJ implements ChangeListener<Toggle> {
    private final ESU RAM;

    public QTJ(ESU var1) {
        this.RAM = var1;
    }

    public void changed(ObservableValue<? extends Toggle> var1, Toggle var2, Toggle var3) {
        if (var3 != null) {
            String var4 = var3.getUserData().toString();
            this.RAM.getCurrentPurchase().RIE().setValue(CalculationMethodType.valueOf(var4));
            this.RAM.RKS(var4);
            this.RAM.RKR(var4);
            org.slf4j.LoggerFactory.getLogger(getClass()).info("Calculation method changed to " + var4);
        }

    }
}
