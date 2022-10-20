package a.a.a.c.c.e.j.a.a;

import a.a.a.c.c.e.j.a.EUT;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import java.time.LocalDate;

public class EUQ implements ChangeListener<LocalDate> {
    private final EUT GLG;

    public EUQ(EUT var1) {
        this.GLG = var1;
    }

    public void changed(ObservableValue<? extends LocalDate> var1, LocalDate var2, LocalDate var3) {

        if (var3 != null) {
            this.GLG.HXO();
            org.slf4j.LoggerFactory.getLogger(getClass()).info("Payment date changed to " + var3);
        }

    }
}
