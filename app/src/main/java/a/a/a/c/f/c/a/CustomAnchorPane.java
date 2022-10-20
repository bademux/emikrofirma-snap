package a.a.a.c.f.c.a;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.layout.AnchorPane;

public class CustomAnchorPane extends AnchorPane {
    private final StringProperty GWZ = new SimpleStringProperty(this, "label", "Missing Label");

    public CustomAnchorPane() {
    }

    public final void setLabel(String var1) {
        this.GWZ.set(var1);
    }

    public final String getLabel() {
        return this.GWZ.getValue();
    }

    public final StringProperty labelProperty() {
        return this.GWZ;
    }
}
