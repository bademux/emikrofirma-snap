package a.a.a.c.c.d.m;

import a.a.a.c.f.b.c.a.KK;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ComboBox;

public class QKO implements ChangeListener<Boolean> {
    private final ComboBox<KK> QNP;

    public QKO(ComboBox<KK> var1) {
        this.QNP = var1;
    }

    public void changed(ObservableValue<? extends Boolean> var1, Boolean var2, Boolean var3) {
        if (!var3) {
            QKM.setupComboBoxValues(this.QNP, null, false);
        }

    }
}
