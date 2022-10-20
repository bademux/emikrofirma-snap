package a.a.a.c.c.e.p.a.a;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import java.time.LocalDate;

public class ROS implements ChangeListener<LocalDate> {
    public ROS() {
    }

    public void changed(ObservableValue<? extends LocalDate> var1, LocalDate var2, LocalDate var3) {

        if (var3 != null) {
            org.slf4j.LoggerFactory.getLogger(getClass()).info("Issue date changed to " + var3);
        }

    }
}
