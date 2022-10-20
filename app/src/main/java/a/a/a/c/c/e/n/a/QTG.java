package a.a.a.c.c.e.n.a;

import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.c.a.a.BaseProgressFxController;
import a.a.a.c.c.b.a.b.a.EMP;
import a.a.a.c.c.b.a.b.a.EMR;
import a.a.a.c.c.b.b.a.EMW;
import a.a.a.c.c.e.n.c.QTI;
import com.github.bademux.emk.app.FXApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ScrollPane;

public class QTG extends BaseProgressFxController<QTI> {
    @FXML
    private ScrollPane fxml_include_container;
    @FXML
    public QTF fxml_include_infoProgramLogicController;
    @FXML
    private EMP fxml_include_left_barController;
    @FXML
    private EMR fxml_include_top_menuController;

    public QTG(FXApp var1, EMW var2, String var3, String var4) {
        super(var1, var2, var3, var4);
    }

    public void init() throws FFK {

        try {
            super.init();
        } catch (FFK var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
            throw new FFI(var5);
        }

    }

    public boolean HHB() {
        boolean var1 = true;
        if (var1) {
            this.fxml_include_infoProgramLogicController.HHB();
            this.fxml_include_left_barController.HHB();
            this.fxml_include_top_menuController.HHB();
            return true;
        } else {
            return false;
        }
    }

    public void HHC() {
        this.fxml_include_container.setVvalue(0.0);

        try {
            QTI var1 = this.HHG();
            this.fxml_include_infoProgramLogicController.HHC();
            this.fxml_include_left_barController.HHC();
            this.fxml_include_top_menuController.HHC();
            this.fxml_parent.requestFocus();
        } catch (FFO | FFK var2) {
            var2.printStackTrace();
        }

    }

    public void initialize() {

        this.fxml_include_top_menuController.fxml_top_menu.labelProperty().set(this.resources.getString("micro.infoProgram.label"));

    }

    @FXML
    public void fxml_handleButton_generalButtonCancel(ActionEvent var1) throws Exception {

        org.slf4j.LoggerFactory.getLogger(getClass()).info("Button [close] clicked");
        QTI var2 = this.getProcess();
        var2.resetAndCleanUpProcess();
        this.getApplication().initController(this.getFxmlName(), "main.fxml", null);

    }
}
