package a.a.a.c.f.d;

import a.a.a.c.f.b.QST;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class FCO implements ChangeListener<QST> {
    private final FCL<?> HAZ;

    public FCO(FCL<?> var1) {
        this.HAZ = var1;
    }

    public void changed(ObservableValue<? extends QST> var1, QST var2, QST var3) {

        if (var3 != null && !var3.getShadow()) {
            this.HAZ.IFQ();
            this.HAZ.IFR();
            this.HAZ.fxml_component_main_element.hide();
        }

        this.HAZ.IFQ();

    }
}
