package a.a.a.c.c.b.a;

import com.github.bademux.emk.app.FXApp;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ResourceBundle;

import static lombok.AccessLevel.PROTECTED;

@RequiredArgsConstructor
public abstract class BaseFxController implements FxController {
    @Getter(PROTECTED)
    private final FXApp application;
    @Getter
    private final String fxmlName;
    @Getter
    @Setter
    protected Stage primaryStage;
    @FXML
    protected ResourceBundle resources;

    protected String getVersionFromPackage(Package var1) {
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
        return var2;
    }

    protected void HHD(StringProperty var1, StringProperty var2) {
        var1.unbindBidirectional(var2);
        var1.set("");
    }
}
