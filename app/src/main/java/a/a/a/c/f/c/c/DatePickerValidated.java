package a.a.a.c.f.c.c;

import a.a.a.c.f.a.EYF;
import javafx.beans.binding.BooleanBinding;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;

import java.time.LocalDate;

public class DatePickerValidated extends DatePickerChanged implements EYF {
    protected BooleanProperty GZM;
    protected BooleanProperty GZN;
    protected BooleanProperty GZO;

    public DatePickerValidated() {
        this(null);
    }

    public DatePickerValidated(LocalDate var1) {
        super(var1);
        this.GZM = new SimpleBooleanProperty(this, "valid", false);
        this.GZN = new SimpleBooleanProperty(this, "validExternal", true);
        this.GZO = new SimpleBooleanProperty(this, "warning", false);
    }

    public final boolean IET() {
        return this.GZM.getValue();
    }

    public final void setValid(boolean var1) {
        this.GZM.setValue(var1);
    }

    public final BooleanProperty IEU() {
        return this.GZM;
    }

    public final boolean IEV() {
        return this.GZN.getValue();
    }

    public final void setValidExternal(boolean var1) {
        this.GZN.setValue(var1);
    }

    public final BooleanProperty IEW() {
        return this.GZN;
    }

    public final boolean IEX() {
        return this.GZO.getValue();
    }

    public final void setWarning(boolean var1) {
        this.GZO.setValue(var1);
    }

    public final BooleanProperty IEY() {
        return this.GZO;
    }

    public BooleanBinding IEZ() {
        return this.valueProperty().isNull();
    }

    public BooleanBinding IFA() {
        return this.valueProperty().isNotNull();
    }
}
