package a.a.a.c.c.b.a.b.a;

import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.c.c.b.EMC;
import a.a.a.c.c.b.a.EMD;
import a.a.a.c.f.c.a.CustomAnchorPane;
import a.a.a.c.g.FCV;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class EMR extends EMD {
    @FXML
    public CustomAnchorPane fxml_top_menu;
    @FXML
    public Label fxml_top_menu_process_label_a;
    @FXML
    public Label fxml_top_menu_process_label_b;
    @FXML
    public Button fxml_top_menu_home_button;
    private EMS FIC;
    private EMS FID;

    public EMR(EMC var1, String var2) {
        super(var1, var2);
    }

    public void initialize() {

        try {
            this.FIC = new EMS(this.fxml_top_menu.labelProperty(), true);
            this.FID = new EMS(this.fxml_top_menu.labelProperty(), false);
            this.HJQ();
        } catch (FFK var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
            throw new FFI(var5);
        }

    }

    private void HJQ() throws FFK {

    }

    @FXML
    protected void fxml_handleButton_home_button(ActionEvent var1) {

        org.slf4j.LoggerFactory.getLogger(getClass()).info("Button [home] clicked");
        this.getApplication().HJD(this.getFxmlName(), FCV.MAIN.getFxmlFileName());

    }

    public boolean HHB() {

        boolean var1;
        this.fxml_top_menu_process_label_a.textProperty().unbind();
        this.fxml_top_menu_process_label_b.textProperty().unbind();
        var1 = true;

        return var1;
    }

    public void HHC() {

        this.fxml_top_menu_process_label_a.textProperty().bind(this.FIC);
        this.fxml_top_menu_process_label_b.textProperty().bind(this.FID);

    }

    private class EMS extends SimpleStringProperty {
        private final StringProperty FIA;
        private final Boolean FIB;

        public EMS(StringProperty var2, Boolean var3) {
            this.FIA = var2;
            this.FIB = var3;
        }

        public String get() {
            String var1 = this.FIA.get();
            if (var1 != null && var1.length() > 0) {
                return this.FIB ? this.FIA.get().substring(0, 1) : this.FIA.get().substring(1);
            } else {
                return "";
            }
        }

        public void set(String var1) {
            throw new FFI("Do NOT use!");
        }
    }
}
