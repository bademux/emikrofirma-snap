package a.a.a.c.f.c.c;

import a.a.a.c.f.a.EYJ;
import a.a.a.c.f.c.b.FAM;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.scene.control.DatePicker;

import java.time.LocalDate;

public class DatePickerChanged extends DatePicker implements EYJ {
    protected FAM<DatePickerChanged> GYJ;
    protected BooleanProperty GYK;

    public DatePickerChanged() {
        this(null);
    }

    public DatePickerChanged(LocalDate var1) {
        super(var1);
        this.GYK = new SimpleBooleanProperty(this, "changed", false);
        this.IFX();
    }

    public final boolean isChanged() {
        return this.GYK.getValue();
    }

    public final void setChanged(boolean var1) {
        this.GYK.setValue(var1);
    }

    public final BooleanProperty changedProperty() {
        return this.GYK;
    }

    private void IFX() {
        this.changedProperty().set(false);
        this.GYJ = new FAM(this);
        this.valueProperty().addListener(this.GYJ);
    }
}
