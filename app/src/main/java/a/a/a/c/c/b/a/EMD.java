package a.a.a.c.c.b.a;

import a.a.a.c.c.b.EMC;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.stage.Stage;

import java.util.ResourceBundle;

public abstract class EMD implements EMG {
    private final EMC FGU;
    private final String FGV;
    protected Stage FGW;
    @FXML
    protected ResourceBundle resources;

    public EMD(EMC var1, String var2) {

        this.FGU = var1;
        this.FGV = var2;

    }

    protected EMC getApplication() {
        return this.FGU;
    }

    protected String getFxmlName() {
        return this.FGV;
    }

    public void setPrimaryStage(Stage var1) {

        this.FGW = var1;

    }

    public Stage getPrimaryStage() {

        Stage var1;
        var1 = this.FGW;

        return var1;
    }

    protected String getVersionFromPackage(Package var1) {

        String var3;
        String var2 = "";
        if (var1 != null) {
            if (var1.getSpecificationTitle() != null) {
                var2 = var1.getSpecificationTitle();
            }

            if (var1.getImplementationVersion() != null) {
                if (var2.length() > 0) {
                    var2 = var2 + " - ";
                }

                var2 = var2 + var1.getImplementationVersion();
            }
        }

        var3 = var2;

        return var3;
    }

    protected void HHD(StringProperty var1, StringProperty var2) {
        var1.unbindBidirectional(var2);
        var1.set("");
    }

    protected void HHD(ObjectProperty<String> var1, ObjectProperty<String> var2) {
        var1.unbindBidirectional(var2);
        var1.set("");
    }

    protected void HHD(ObjectProperty<String> var1, StringProperty var2) {
        var1.unbindBidirectional(var2);
        var1.set("");
    }

    protected void HHD(StringProperty var1, ObjectProperty<String> var2) {
        var1.unbindBidirectional(var2);
        var1.set("");
    }
}
