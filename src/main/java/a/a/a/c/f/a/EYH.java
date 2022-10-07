package a.a.a.c.f.a;

import a.a.a.c.f.c.a.RequiredGridPane;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.fxml.FXML;

public class EYH<_PARENT extends RequiredGridPane, _CONTEXT extends EYJ> extends EXU {
    @FXML
    public _PARENT fxml_component_root_element;
    @FXML
    public _CONTEXT fxml_component_main_element;
    protected BooleanProperty GVT = new SimpleBooleanProperty(this, "changed", false);

    public EYH(String var1) {
        super(var1);
    }

    public final boolean isChanged() {
        return this.GVT.getValue();
    }

    public final void setChanged(boolean var1) {
        this.GVT.setValue(var1);
    }

    public final BooleanProperty changedProperty() {
        return this.GVT;
    }

    public void initialize() {
        this.GVT.bind(this.fxml_component_main_element.changedProperty());
    }

    public void clearChangedProperty() {
        this.fxml_component_main_element.changedProperty().set(false);
    }
}
