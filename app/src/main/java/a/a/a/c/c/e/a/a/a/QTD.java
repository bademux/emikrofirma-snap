package a.a.a.c.c.e.a.a.a;

import a.a.a.c.f.b.c.a.CalculationMethodType;
import a.a.a.c.f.c.a.PropertyString;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class QTD implements ChangeListener<CalculationMethodType> {
    private final PropertyString QZZ;

    public QTD(PropertyString var1) {
        this.QZZ = var1;
    }

    public void changed(ObservableValue<? extends CalculationMethodType> var1, CalculationMethodType var2, CalculationMethodType var3) {
        this.QZZ.DEY().setValue(var3.name());
    }
}
