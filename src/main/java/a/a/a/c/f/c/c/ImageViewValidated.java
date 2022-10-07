package a.a.a.c.f.c.c;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.scene.image.Image;

public class ImageViewValidated extends ImageViewChanged {
    protected BooleanProperty HAO;

    public ImageViewValidated() {
        this(null);
    }

    public ImageViewValidated(Image var1) {
        super(var1);
        this.HAO = new SimpleBooleanProperty(this, "valid", false);
    }

    public final boolean isValid() {
        return this.HAO.getValue();
    }

    public final void setValid(boolean var1) {
        this.HAO.setValue(var1);
    }

    public final BooleanProperty validProperty() {
        return this.HAO;
    }
}
