package a.a.a.c.f.a;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;

public class EYG extends EXS {
    protected BooleanProperty GVR = new SimpleBooleanProperty(this, "valid", false);
    protected BooleanProperty GVS = new SimpleBooleanProperty(this, "validExternal", true);

    public EYG(String var1) {
        super(var1);
    }

    public final boolean isValid() {
        return this.GVR.getValue();
    }

    public final void setValid(boolean var1) {
        this.GVR.setValue(var1);
    }

    public final BooleanProperty validProperty() {
        return this.GVR;
    }

    public final boolean isValidExternal() {
        return this.GVS.getValue();
    }

    public final void setValidExternal(boolean var1) {
        this.GVS.setValue(var1);
    }

    public final BooleanProperty validExternalProperty() {
        return this.GVS;
    }
}
