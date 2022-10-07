package a.a.a.c.c.d.o;

import a.a.a.c.e.a.k.a.EXF;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import java.time.LocalDate;

public class ROV implements ChangeListener<LocalDate> {
    public ROV() {
    }

    public void changed(ObservableValue<? extends LocalDate> var1, LocalDate var2, LocalDate var3) {
        EXF.getInstance().ICO();

        try {
            if (var3 != null) {
                EXF.getInstance().ICE("Receipt date changed to " + var3);
            }
        } finally {
            EXF.getInstance().ICP();
        }

    }
}
