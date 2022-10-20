package a.a.a.c.c.e.r.a.a;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import java.time.LocalDate;

public class ROT implements ChangeListener<LocalDate> {
    public ROT() {
    }

    public void changed(ObservableValue<? extends LocalDate> var1, LocalDate var2, LocalDate var3) {

        if (var3 != null) {
            org.slf4j.LoggerFactory.getLogger(getClass()).info("Creation date changed to " + var3);
        }

    }
}
