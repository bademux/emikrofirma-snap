package a.a.a.c.f.a.a;

import a.a.a.c.f.a.EXZ;
import a.a.a.c.f.c.a.RequiredGridPane;
import a.a.a.c.f.c.c.ComboBoxRequired;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class EZP<_T> extends EXZ<_T, RequiredGridPane, ComboBoxRequired<_T>> {
    @FXML
    public Label fxml_component_label_required_flag;

    public EZP() {
        this(null);
    }

    public EZP(String var1) {
        super(var1);
    }

    public void initialize() {
        super.initialize();
        this.fxml_component_main_element.promptTextProperty().unbindBidirectional(this.fxml_component_root_element.labelProperty());
        this.fxml_component_main_element.promptTextProperty().set("");
        this.fxml_component_label_element.textProperty().bind(this.fxml_component_root_element.labelProperty());
        if (this.fxml_component_label_required_flag != null) {
            this.fxml_component_label_required_flag.visibleProperty().bind(this.fxml_component_label_required_flag.managedProperty());
            this.fxml_component_label_required_flag.managedProperty().bind(this.GVI);
        }

    }
}
