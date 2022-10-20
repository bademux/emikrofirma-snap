package a.a.a.c.c.d.o;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import java.time.LocalDate;

public class ROV implements ChangeListener<LocalDate> {
    public ROV() {
    }

    public void changed(ObservableValue<? extends LocalDate> var1, LocalDate var2, LocalDate var3) {

        if (var3 != null) {
            org.slf4j.LoggerFactory.getLogger(getClass()).info("Receipt date changed to " + var3);
        }

    }
}
