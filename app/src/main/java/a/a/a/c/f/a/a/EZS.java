package a.a.a.c.f.a.a;

import com.github.bademux.emk.Application;
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

        org.slf4j.LoggerFactory.getLogger(getClass()).info("Button [select directory] clicked");
        DirectoryChooser var2 = new DirectoryChooser();
        var2.setTitle(this.resources.getString("micro.types.dir.directorychooser.title"));
        File var3 = Application.getHomeDir().toFile();
        if (var3.exists() && var3.isDirectory()) {
            var2.setInitialDirectory(var3);
        }

        File var4 = var2.showDialog(this.getStageToHandle());
        if (var4 != null) {
            this.fxml_component_main_element.setText(var4.getAbsolutePath());
        }

    }

    @FXML
    protected void fxml_handleButton_clear_button(ActionEvent var1) {

        this.fxml_component_main_element.setText(null);
        org.slf4j.LoggerFactory.getLogger(getClass()).info("Button [clear selected directory] clicked");

    }
}
