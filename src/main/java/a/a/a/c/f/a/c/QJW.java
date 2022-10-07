package a.a.a.c.f.a.c;

import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.c.b.EDF;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.b.QST;

public class QJW implements QST {
    private final EDF<HI> QLG;
    private HI QLH;
    public static final int QWI = 1;
    public static final int QWJ = 2;
    private String QWK;
    private String QWL;
    private boolean QWM = false;

    public QJW(String var1) {
        this.QWK = var1;
        this.QLG = null;
        this.QWL = "";
        this.QWM = true;
    }

    public QJW(EDF<HI> var1) {
        this.QLG = var1;
    }

    public HI getContractor() {
        EXF.getInstance().ICO();

        HI var1;
        try {
            if (this.QLH == null) {
                this.QLH = this.QLG.getModelBaseElementWithIdObject();
            }

            var1 = this.QLH;
        } catch (FFK var5) {
            EXF.getInstance().ICA(var5);
            throw new FFI(var5);
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    public String getName() {
        if (this.QWK == null) {
            this.QWK = this.QLG.getValue("business_contractorName");
        }

        return this.QWK;
    }

    public String getNip() {
        if (this.QWL == null) {
            this.QWL = this.QLG.getValue("business_contractorNIP");
        }

        return this.QWL;
    }

    public boolean getShadow() {
        return this.QWM;
    }

    public String getTitle(int var1) {
        switch (var1) {
            case 1:
                return this.getName();
            case 2:
                return this.getNip();
            default:
                throw new FFI("title type not found");
        }
    }

    public void setTitle(String var1) {
    }
}
