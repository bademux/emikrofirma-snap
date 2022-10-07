package a.a.a.c.f.a;

import a.a.a.c.f.c.a.RequiredGridPane;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class EXT<_PARENT extends RequiredGridPane, _CONTEXT extends EYA> extends EYB<_PARENT, _CONTEXT> {
    @FXML
    public Text fxml_component_required_element;
    protected BooleanProperty GVI = new SimpleBooleanProperty(this, "required", true);
    protected BooleanProperty GVJ = new SimpleBooleanProperty(this, "requiredAndValid", true);

    public EXT(String var1) {
        super(var1);
    }

    public final boolean isRequired() {
        return this.GVI.getValue();
    }

    public final void setRequired(boolean var1) {
        this.GVI.setValue(var1);
    }

    public final BooleanProperty requiredProperty() {
        return this.GVI;
    }

    public final boolean isRequiredAndValid() {
        return this.GVJ.getValue();
    }

    public final void setRequiredAndValid(boolean var1) {
        this.GVJ.setValue(var1);
    }

    public final BooleanProperty requiredAndValidProperty() {
        return this.GVJ;
    }

    public void initialize() {
        super.initialize();
        this.fxml_component_main_element.IFC().bind(this.fxml_component_root_element.requiredProperty());
        this.GVI.bind(this.fxml_component_main_element.IFC());
        this.GVJ.bind(this.fxml_component_main_element.IFE());
        this.fxml_component_required_element.managedProperty().bindBidirectional(this.fxml_component_required_element.visibleProperty());
        this.fxml_component_required_element.managedProperty().bind(this.fxml_component_main_element.changedProperty().and(this.fxml_component_main_element.IFC().and(this.fxml_component_main_element.IEZ())));
    }
}
