package a.a.a.c.c.b.a.b.a;

import a.a.a.c.c.b.a.BaseFxController;
import com.github.bademux.emk.app.FXApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class EMQ extends BaseFxController {
    private String FHZ;

    public EMQ(FXApp var1, String var2) {
        super(var1, var2);
    }

    public void initialize() {

    }

    public String getFxmlNameDirection() {
        return this.FHZ;
    }

    public void setFxmlNameDirection(String var1) {
        this.FHZ = var1;
    }

    @FXML
    protected void fxml_handleButton_back(ActionEvent var1) {

        org.slf4j.LoggerFactory.getLogger(getClass()).info("Button [back] clicked");
        this.getApplication().initController(this.getFxmlName(), this.getFxmlNameDirection(), null);

    }

    public boolean HHB() {

        boolean var1;
        var1 = true;

        return var1;
    }

    public void HHC() {

    }
}
