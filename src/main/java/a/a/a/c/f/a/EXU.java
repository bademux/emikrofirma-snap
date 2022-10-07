package a.a.a.c.f.a;

import a.a.a.b.c.FEL;
import a.a.a.b.c.FEM;
import a.a.a.c.e.a.k.a.EXF;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

import java.util.ResourceBundle;

public abstract class EXU {
    @FXML
    protected ResourceBundle resources;
    private final String GVK;
    protected Stage GVL;

    public EXU(String var1) {
        this.GVK = var1;
    }

    protected String getFxmlName() {
        return this.GVK;
    }

    public void setPrimaryStage(Stage var1) {
        EXF.getInstance().ICO();

        try {
            this.GVL = var1;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public Stage getPrimaryStage() {
        EXF.getInstance().ICO();

        Stage var1;
        try {
            var1 = this.GVL;
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    public Stage getStageToHandle() {
        EXF.getInstance().ICO();

        Stage var1;
        try {
            var1 = this.getPrimaryStage();
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    protected void IES(final String var1, final String var2, final String var3) {
        EXF.getInstance().ICO();

        try {
            FEL.IKS(new FEM<Void>() {
                public Void IKT() {
                    Alert var1x = new Alert(AlertType.ERROR);
                    var1x.getDialogPane().setMinWidth(550.0);
                    var1x.getDialogPane().setMinHeight(150.0);
                    var1x.setResizable(true);
                    var1x.setTitle(var1);
                    var1x.setHeaderText(var2);
                    var1x.setContentText(var3);
                    var1x.showAndWait();
                    return null;
                }
            });
        } finally {
            EXF.getInstance().ICP();
        }

    }
}
