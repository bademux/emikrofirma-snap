package a.a.a.c.c.a.a;

import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.c.a.Status;
import a.a.a.c.c.a.b.ELV;
import a.a.a.c.c.b.EMB;
import a.a.a.c.c.b.a.a.BaseSceneFxController;
import a.a.a.c.c.b.b.a.EMW;
import com.github.bademux.emk.app.FXApp;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public abstract class BaseProgressFxController<_PROCESS extends ELV> extends BaseSceneFxController {
    private final String FGD;
    private final EMW FGE;
    private _PROCESS FGF;
    @FXML
    private Text fxml_textVersions;

    public BaseProgressFxController(FXApp fxApp, EMW var2, String var3, String fxmlName) {
        super(fxApp, fxmlName);
        this.FGE = var2;
        this.FGD = var3;

    }

    public String getProcessName() {
        return this.FGD;
    }

    protected _PROCESS HHG() throws FFK, FFO {

        ELV var1;
        this.FGF = (_PROCESS) this.FGE.HJR(this.FGD);
        var1 = this.FGF;

        return (_PROCESS) var1;
    }

    public _PROCESS getProcess() throws FFK, FFO {
        return this.FGF == null ? this.HHG() : this.FGF;
    }

    protected void HHH() throws FFK, FFO {

        this.FGE.HJS(this.FGD);

    }

    protected void resetAndCleanUpProcess() throws FFK, FFO {
        this.FGE.resetAndCleanUpProcess(this.FGD);

    }

    protected Status getCurrentProcessMainStatus() throws FFK, FFO {
        return this.FGE.getMainStatus(this.FGD);
    }

    public String getTitle() throws FFK {
        return EMB.getInstance().getApplicationTitle(this.resources.getString("micro.application.title"));
    }

    public void init() throws FFK {

        super.init();
        this.fxml_textVersions.setText(this.getVersionFromPackage(this.getClass().getPackage()));

    }
}
