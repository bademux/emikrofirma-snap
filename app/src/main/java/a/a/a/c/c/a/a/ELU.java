package a.a.a.c.c.a.a;

import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.c.a.EMA;
import a.a.a.c.c.a.b.ELV;
import a.a.a.c.c.b.EMB;
import a.a.a.c.c.b.EMC;
import a.a.a.c.c.b.a.a.EMI;
import a.a.a.c.c.b.b.EMT;
import a.a.a.c.e.a.k.a.EXF;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public abstract class ELU<_PROCESS extends ELV> extends EMI {
    private final String FGD;
    private final EMT FGE;
    private _PROCESS FGF;
    @FXML
    private Text fxml_textVersions;

    public ELU(EMC var1, EMT var2, String var3, String var4) {
        super(var1, var4);
        EXF.getInstance().ICO();

        try {
            this.FGE = var2;
            this.FGD = var3;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public String getProcessName() {
        return this.FGD;
    }

    protected _PROCESS HHG() throws FFK, FFO {
        EXF.getInstance().ICO();

        ELV var1;
        try {
            this.FGF = (_PROCESS) this.FGE.HJR(this.FGD);
            var1 = this.FGF;
        } finally {
            EXF.getInstance().ICP();
        }

        return (_PROCESS) var1;
    }

    public _PROCESS getProcess() throws FFK, FFO {
        return this.FGF == null ? this.HHG() : this.FGF;
    }

    protected void HHH() throws FFK, FFO {
        EXF.getInstance().ICO();

        try {
            this.FGE.HJS(this.FGD);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    protected void resetAndCleanUpProcess() throws FFK, FFO {
        EXF.getInstance().ICO();

        try {
            this.FGE.resetAndCleanUpProcess(this.FGD);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    protected EMA getCurrentProcessMainStatus() throws FFK, FFO {
        EXF.getInstance().ICO();

        EMA var1;
        try {
            var1 = this.FGE.getMainStatus(this.FGD);
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    public String getTitle() throws FFK {
        return EMB.getInstance().getApplicationTitle(this.resources.getString("micro.application.title"));
    }

    public void HHE() throws FFK {
        EXF.getInstance().ICO();

        try {
            super.HHE();
            this.fxml_textVersions.setText(this.getVersionFromPackage(this.getClass().getPackage()));
        } finally {
            EXF.getInstance().ICP();
        }

    }
}
