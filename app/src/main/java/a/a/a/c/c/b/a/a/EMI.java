package a.a.a.c.c.b.a.a;

import a.a.a.b.f.FFK;
import a.a.a.c.c.b.EMC;
import a.a.a.c.c.b.a.EME;
import a.a.a.c.e.a.k.a.EXF;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public abstract class EMI extends EME implements EMH {
    protected Scene FHC;

    public EMI(EMC var1, String var2) {
        super(var1, var2);
    }

    public void HHE() throws FFK {
        EXF.getInstance().ICO();

        try {
            super.HHE();
            this.FHC = new Scene(this.fxml_parent);
            this.FHC.setFill(Color.TRANSPARENT);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public Scene getScene() {
        EXF.getInstance().ICO();

        Scene var1;
        try {
            var1 = this.FHC;
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    public void setScene(Scene var1) {
        EXF.getInstance().ICO();

        try {
            this.FHC = var1;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    protected Stage getStageToHandle() {
        EXF.getInstance().ICO();

        Stage var1;
        try {
            var1 = this.FGW;
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    public boolean HHF() {
        EXF.getInstance().ICO();

        boolean var1;
        try {
            var1 = true;
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }
}
