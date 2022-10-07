package a.a.a.c.f.c.c;

import a.a.a.c.f.c.b.FAN;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class PasswordFieldRequired extends PasswordFieldValidated {
    protected FAN<PasswordFieldRequired> GYD;
    private final BooleanProperty GYE = new SimpleBooleanProperty(this, "required", true);
    private final IntegerProperty GYF = new SimpleIntegerProperty(this, "maxLength", 2147483647);

    public PasswordFieldRequired() {
        this.IFY();
    }

    public final boolean isRequired() {
        return this.GYE.getValue();
    }

    public final void setRequired(boolean var1) {
        this.GYE.setValue(var1);
    }

    public final BooleanProperty requiredProperty() {
        return this.GYE;
    }

    public final void setMaxLength(Integer var1) {
        this.GYF.set(var1);
    }

    public final Integer getMaxLength() {
        return this.GYF.getValue();
    }

    public final IntegerProperty maxLengthProperty() {
        return this.GYF;
    }

    private void IFY() {
        this.textProperty().removeListener(this.GYW);
        this.GYD = new FAN(this);
        this.textProperty().addListener(this.GYD);
    }
}
