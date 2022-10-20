package a.a.a.c.f.a;

import a.a.a.b.c.FEL;
import a.a.a.b.c.FEM;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ResourceBundle;

@RequiredArgsConstructor
public abstract class BaseBoxController {
    @Getter
    private final String fxmlName;
    @FXML
    protected ResourceBundle resources;
    @Getter
    @Setter
    protected Stage primaryStage;

    public Stage getStageToHandle() {
        return getPrimaryStage();
    }

    protected void IES(final String var1, final String var2, final String var3) {
        FEL.IKS(new FEM<Void>() {
            public Void IKT() {
                Alert alert = new Alert(AlertType.ERROR);
                alert.getDialogPane().setMinWidth(550.0);
                alert.getDialogPane().setMinHeight(150.0);
                alert.setResizable(true);
                alert.setTitle(var1);
                alert.setHeaderText(var2);
                alert.setContentText(var3);
                alert.showAndWait();
                return null;
            }
        });

    }
}
