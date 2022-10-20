package a.a.a.c.c.b.a;

import a.a.a.b.f.FFK;
import a.a.a.c.c.b.EMC;
import a.a.a.c.g.c.FCZ;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.layout.Region;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public abstract class EME extends EMD implements EMN {
    @FXML
    protected Parent fxml_parent;

    public EME(EMC var1, String var2) {
        super(var1, var2);
    }

    public Parent getParent() {

        Parent var1;
        var1 = this.fxml_parent;

        return var1;
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

    protected abstract Stage getStageToHandle();

    public void HHE() throws FFK {

        if (this.fxml_parent == null || this.FGW == null) {
            throw FCZ.getInstance().IHD();
        }

    }

    @FXML
    protected void fxml_handleButton_generalButtonClose(ActionEvent var1) {

        this.getStageToHandle().fireEvent(new WindowEvent(this.getStageToHandle(), WindowEvent.WINDOW_CLOSE_REQUEST));

    }
}
