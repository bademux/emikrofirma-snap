package a.a.a.c.c.b.a.a;

import a.a.a.b.f.FFK;
import a.a.a.c.c.b.a.BaseFxController;
import a.a.a.c.c.b.a.FxController;
import a.a.a.c.g.c.FCZ;
import com.github.bademux.emk.app.FXApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import lombok.Getter;
import lombok.Setter;

public abstract class BaseSceneFxController extends BaseFxController implements FxController {

    @Getter
    @Setter
    protected Scene scene;
    @FXML
    protected Parent fxml_parent;

    public BaseSceneFxController(FXApp fxApp, String fxmlName) {
        super(fxApp, fxmlName);
    }

    public void init() throws FFK {

        if (this.fxml_parent == null || this.primaryStage == null) {
            throw FCZ.getInstance().IHD();
        }

        this.scene = new Scene(this.fxml_parent);
        this.scene.setFill(Color.TRANSPARENT);

    }

    protected Stage getStageToHandle() {
        return this.primaryStage;
    }

    public boolean HHF() {
        return true;
    }

    public abstract String getTitle() throws FFK;

    public Parent getParent() {
        return this.fxml_parent;
    }

    public double getPrefWidth() {

        double var4;
        if (this.fxml_parent == null) {
            double var9 = 400.0;
            return var9;
        }

        Region var1 = (Region) this.fxml_parent;
        double var2 = var1.getPrefWidth();
        if (!(var2 < 0.0)) {
            var4 = var2;
            return var4;
        }

        var4 = 0.0;

        return var4;
    }

    public double getMinWidth() {

        double var4;
        if (this.fxml_parent == null) {
            double var9 = 400.0;
            return var9;
        }

        Region var1 = (Region) this.fxml_parent;
        double var2 = var1.getMinWidth();
        if (!(var2 < 0.0)) {
            var4 = var2;
            return var4;
        }

        var4 = 0.0;

        return var4;
    }

    public double getMaxWidth() {

        double var4;
        if (this.fxml_parent == null) {
            double var9 = 400.0;
            return var9;
        }

        Region var1 = (Region) this.fxml_parent;
        double var2 = var1.getMaxWidth();
        if (var2 < 0.0) {
            var4 = 0.0;
            return var4;
        }

        var4 = var2;

        return var4;
    }

    public double getPrefHeight() {

        double var4;
        if (this.fxml_parent == null) {
            double var9 = 400.0;
            return var9;
        }

        Region var1 = (Region) this.fxml_parent;
        double var2 = var1.getPrefHeight();
        if (!(var2 < 0.0)) {
            var4 = var2;
            return var4;
        }

        var4 = 0.0;

        return var4;
    }

    public double getMinHeight() {

        double var1;
        if (this.fxml_parent != null) {
            Region var9 = (Region) this.fxml_parent;
            double var2 = var9.getMinHeight();
            double var4;
            if (var2 < 0.0) {
                var4 = 0.0;
                return var4;
            }

            var4 = var2;
            return var4;
        }

        var1 = 400.0;

        return var1;
    }

    public double getMaxHeight() {

        double var4;
        if (this.fxml_parent == null) {
            double var9 = 400.0;
            return var9;
        }

        Region var1 = (Region) this.fxml_parent;
        double var2 = var1.getMaxHeight();
        if (!(var2 < 0.0)) {
            var4 = var2;
            return var4;
        }

        var4 = 0.0;

        return var4;
    }

    @FXML
    protected void fxml_handleButton_generalButtonClose(ActionEvent var1) {
        this.getStageToHandle().fireEvent(new WindowEvent(this.getStageToHandle(), WindowEvent.WINDOW_CLOSE_REQUEST));
    }
}
