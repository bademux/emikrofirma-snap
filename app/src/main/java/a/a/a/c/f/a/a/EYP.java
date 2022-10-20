package a.a.a.c.f.a.a;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.EXX;
import a.a.a.c.f.c.a.RequiredGridPane;
import a.a.a.c.f.c.c.TextFieldValidated_RefIdPattern;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class EYP extends EXX {
    @FXML
    public RequiredGridPane fxml_component_root_element;
    @FXML
    public Label fxml_component_label_element;
    @FXML
    public TextFieldValidated_RefIdPattern fxml_component_main_element;
    @FXML
    public Button fxml_field_box_required_button_check;
    @FXML
    public Button fxml_field_box_required_button_default;
    @FXML
    public Text fxml_component_required_element;
    @FXML
    public Text fxml_component_validation_element;
    @FXML
    public Label fxml_types_refidpattern_view_label;
    @FXML
    public TextField fxml_demo_property_RefIdPattern;

    public EYP() {
        super(null);
    }

    public EYP(String var1) {
        super(var1);
    }

    @FXML
    protected void fxml_handleButton_default_button(ActionEvent var1) {
        EXF.getInstance().ICO();

        try {
            this.fxml_component_main_element.setText(this.fxml_component_root_element.getDefaultValue());
        } finally {
            EXF.getInstance().ICP();
        }

    }

    @FXML
    protected void fxml_handleButton_check_button(ActionEvent var1) {
        EXF.getInstance().ICO();
        EXF.getInstance().ICP();
    }

    public void initialize() {
        this.fxml_component_label_element.textProperty().bind(this.fxml_component_root_element.labelProperty());
        this.fxml_component_main_element.IFC().bind(this.fxml_component_root_element.requiredProperty());
        this.fxml_component_main_element.IFF().bind(this.fxml_component_root_element.maxLengthProperty());
        this.GVR.bindBidirectional(this.fxml_component_main_element.IEU());
        this.GVH.bind(this.fxml_component_main_element.changedProperty());
        this.GVM.bind(this.fxml_component_main_element.IFC());
        this.GVN.bind(this.fxml_component_main_element.IFE());
        this.fxml_types_refidpattern_view_label.textProperty().bind(this.fxml_component_root_element.IFU());
        this.fxml_component_required_element.managedProperty().bindBidirectional(this.fxml_component_required_element.visibleProperty());
        this.fxml_component_required_element.managedProperty().bind(this.fxml_component_main_element.changedProperty().and(this.fxml_component_main_element.IFC().and(this.fxml_component_main_element.textProperty().isEmpty())));
        this.fxml_component_validation_element.managedProperty().bindBidirectional(this.fxml_component_validation_element.visibleProperty());
        this.fxml_component_validation_element.managedProperty().bind(this.fxml_component_main_element.IEU().not().and(this.fxml_component_main_element.textProperty().isNotEmpty()));
    }

    public void clearChangedProperty() {
        this.fxml_component_main_element.changedProperty().set(false);
    }
}
