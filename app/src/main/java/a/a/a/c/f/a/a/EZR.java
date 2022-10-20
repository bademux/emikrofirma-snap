package a.a.a.c.f.a.a;

import a.a.a.c.f.a.EYK;
import a.a.a.c.f.c.a.RequiredGridPane;
import a.a.a.c.f.c.c.PathFieldRequired;
import a.a.a.c.g.a.FCR;
import a.a.a.c.g.c.FCZ;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import lombok.extern.slf4j.Slf4j;
import sun.security.pkcs11.wrapper.CK_INFO;
import sun.security.pkcs11.wrapper.PKCS11;
import sun.security.pkcs11.wrapper.PKCS11Exception;

import java.io.File;
import java.io.IOException;

@Slf4j
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
        try {
            log.debug("Button [select pkcs11 library] clicked");
            FileChooser var2 = new FileChooser();
            var2.setTitle(this.resources.getString("micro.config.pkcs11LibraryFile.dialog.pkcs11fileselect.fileselect"));
            FileChooser.ExtensionFilter var3 = new FileChooser.ExtensionFilter(this.resources.getString("micro.config.pkcs11LibraryFile.dialog.pkcs11fileselect.filetype") + " (*.dll, *.so)", "*.dll", "*.so");
            FileChooser.ExtensionFilter var4 = new FileChooser.ExtensionFilter(this.resources.getString("micro.dialog.filetypeselect.all"), "*.*");
            var2.getExtensionFilters().add(var3);
            var2.getExtensionFilters().add(var4);
            File var5 = new File(System.getProperty("user.home"));
            if (var5 != null && var5.exists() && var5.isDirectory()) {
                var2.setInitialDirectory(var5);
            }

            File var6 = var2.showOpenDialog(this.getStageToHandle());
            if (var6 != null) {
                String var7 = var6.getAbsolutePath();

                try {
                    PKCS11 var8 = PKCS11.getInstance(var7, "C_GetFunctionList", null, false);
                   log.debug("pkcs11 " + var8);
                    CK_INFO var9 = var8.C_GetInfo();
                   log.debug("ck_info " + var9);
                    FCR.IGF(this.resources.getString("micro.dialog.message.title"), this.resources.getString("micro.config.property.pkcs11LibraryFile"), var9.toString(), false, 300.0, 150.0);
                } catch (PKCS11Exception | NullPointerException | IOException e) {
                    log.error("Something bad happened", e);
                    throw FCZ.getInstance().IHU();
                }

                this.fxml_component_main_element.setText(var6.getAbsolutePath());
            }
        } catch (Exception e) {
            log.error("Something bad happened", e);
            FCR.IGO("", e, false);
        }

    }

    @FXML
    protected void fxml_handleButton_clear_button(ActionEvent var1) {

        this.fxml_component_main_element.setText(null);

    }
}
