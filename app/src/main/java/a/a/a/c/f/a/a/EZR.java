package a.a.a.c.f.a.a;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.EYK;
import a.a.a.c.f.c.a.RequiredGridPane;
import a.a.a.c.f.c.c.PathFieldRequired;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class EZR extends EYK<RequiredGridPane, PathFieldRequired> {
    @FXML
    public Button fxml_field_box_required_button_open;
    @FXML
    public Button fxml_field_box_required_button_clear;

    public EZR() {
        this(null);
    }

    public EZR(String var1) {
        super(var1);
    }

    public void initialize() {
        super.initialize();
        this.fxml_component_main_element.editableProperty().set(false);
    }

    @FXML
    protected void fxml_handleButton_open_button(ActionEvent var1) {
        throw new UnsupportedOperationException("reimplement without sun.security");
    }

    @FXML
    protected void fxml_handleButton_clear_button(ActionEvent var1) {
        EXF.getInstance().ICO();

        try {
            this.fxml_component_main_element.setText(null);
        } finally {
            EXF.getInstance().ICP();
        }

    }
}
