package a.a.a.c.f.a.a;

import a.a.a.c.e.EXK;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.EYK;
import a.a.a.c.f.c.a.RequiredGridPane;
import a.a.a.c.f.c.c.PathFieldRequired;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.DirectoryChooser;

import java.io.File;

public class EZS extends EYK<RequiredGridPane, PathFieldRequired> {
    @FXML
    public Button fxml_field_box_required_button_open;
    @FXML
    public Button fxml_field_box_required_button_clear;

    public EZS() {
        this(null);
    }

    public EZS(String var1) {
        super(var1);
    }

    public void initialize() {
        super.initialize();
        this.fxml_component_main_element.editableProperty().set(false);
    }

    @FXML
    protected void fxml_handleButton_open_button(ActionEvent var1) {
        EXF.getInstance().ICO();

        try {
            EXF.getInstance().ICE("Button [select directory] clicked");
            DirectoryChooser var2 = new DirectoryChooser();
            var2.setTitle(this.resources.getString("micro.types.dir.directorychooser.title"));
            File var3 = new File(EXK.GPW);
            if (var3.exists() && var3.isDirectory()) {
                var2.setInitialDirectory(var3);
            }

            File var4 = var2.showDialog(this.getStageToHandle());
            if (var4 != null) {
                this.fxml_component_main_element.setText(var4.getAbsolutePath());
            }
        } finally {
            EXF.getInstance().ICP();
        }

    }

    @FXML
    protected void fxml_handleButton_clear_button(ActionEvent var1) {
        EXF.getInstance().ICO();

        try {
            this.fxml_component_main_element.setText(null);
            EXF.getInstance().ICE("Button [clear selected directory] clicked");
        } finally {
            EXF.getInstance().ICP();
        }

    }
}
