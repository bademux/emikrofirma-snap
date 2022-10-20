package a.a.a.c.c.d.g;

import javafx.scene.control.Label;

public class EPC {
    private Label FPI;
    private Boolean FPJ;
    private boolean FPK = false;

    public EPC(Label var1, Boolean var2) {
        this.FPI = var1;
        this.FPJ = var2;
        this.FPI.setText("");
    }

    public Label getLabel() {
        return this.FPI;
    }

    public void setLabel(Label var1) {
        this.FPI = var1;
    }

    public Boolean getCorrect() {
        return this.FPJ;
    }

    public void setCorrect(Boolean var1) {
        this.FPJ = var1;
    }

    public void setChanged(boolean var1) {
        this.FPK = var1;
    }

    public boolean getChanged() {
        return this.FPK;
    }
}
