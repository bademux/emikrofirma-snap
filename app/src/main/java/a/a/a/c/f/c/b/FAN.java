package a.a.a.c.f.c.b;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.c.c.PasswordFieldRequired;

public class FAN<_T extends PasswordFieldRequired> extends FAB<_T> {
    private volatile boolean GXT = false;

    public FAN(_T var1) {
        super(var1);
    }

    protected void IFV(String var1, String var2) {
        EXF.getInstance().ICO();

        try {
            if (var2 != null && var2.length() > 0) {
                if (this.GXE.maxLengthProperty() != null && this.GXE.maxLengthProperty().intValue() > 0 && var2.length() > this.GXE.maxLengthProperty().intValue()) {
                    this.GXT = true;
                    this.GXE.textProperty().set(var1);
                } else if (this.GXT) {
                    this.GXT = false;
                } else {
                    this.GXE.validProperty().set(true);
                    super.IFV(var1, var2);
                }
            } else if (this.GXT) {
                this.GXT = false;
            } else {
                this.GXE.validProperty().set(!this.GXE.isRequired());
            }
        } finally {
            EXF.getInstance().ICP();
        }

    }
}
