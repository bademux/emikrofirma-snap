package a.a.a.c.c.d.h;

import a.a.a.b.f.FFK;
import a.a.a.c.c.b.EMY;
import a.a.a.c.e.a.a.EVN;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ResourceBundle;

public abstract class EPF {
    protected final File FPP;
    protected final ResourceBundle FPQ;

    public EPF(ResourceBundle var1, File var2) {

        this.FPQ = var1;
        EPH.setResources(var1);
        this.FPP = var2;
        EMY.getInstance().HMZ(var2);

    }

    public final void HOE() throws FFK {

        this.HOF();
        this.HOH();

    }

    public abstract void HOF() throws FFK;

    protected abstract void HOG() throws FFK;

    public final void HOH() {

        if (Desktop.isDesktopSupported()) {
            (new EVN() {
                public void HZI() {
                    try {
                        Desktop.getDesktop().open(EPF.this.FPP);
                    } catch (IOException var2) {
                        org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var2);
                    }

                }
            }).start();
        }

    }
}
