package a.a.a.c.c.e.j.a.a;

import a.a.a.c.c.e.j.a.EUT;
import a.a.a.c.e.a.k.a.EXF;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import java.time.LocalDate;

public class EUQ implements ChangeListener<LocalDate> {
    private final EUT GLG;

    public EUQ(EUT var1) {
        this.GLG = var1;
    }

    public void changed(ObservableValue<? extends LocalDate> var1, LocalDate var2, LocalDate var3) {
        EXF.getInstance().ICO();

        try {
            if (var3 != null) {
                this.GLG.HXO();
                EXF.getInstance().ICE("Payment date changed to " + var3);
            }
        } finally {
            EXF.getInstance().ICP();
        }

    }
}
