package a.a.a.c.c.e.j.a;

import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.c.d.f.EOW;
import a.a.a.c.c.e.j.c.EUY;
import a.a.a.c.f.a.a.IJF;

import java.util.ArrayList;
import java.util.List;

public class EUW extends EOW {
    private final EUY GMP;

    public EUW(EUY var1) {
        this.GMP = var1;
    }

    public List<IJF> HNW(String var1) {
        try {
            return this.GMP.getModelManager().HKI(this.GMP.getParentDefinition(), "commodity", var1);
        } catch (FFO | FFK var3) {
            this.HOA("", var3);
            return new ArrayList();
        }
    }

    public void HNX(IJF var1) {
        try {
            this.GMP.getModelManager().HKF(this.GMP.getParentDefinition(), var1);
        } catch (FFO | FFK var3) {
            this.HOA("", var3);
        }

    }

    public void HNY(IJF var1) {
        try {
            this.GMP.getModelManager().HKG(this.GMP.getParentDefinition(), var1);
        } catch (FFO | FFK var3) {
            this.HOA("", var3);
        }

    }

    public void HNZ(IJF var1) {
        try {
            this.GMP.getModelManager().HKH(this.GMP.getParentDefinition(), var1);
        } catch (FFO | FFK var3) {
            this.HOA("", var3);
        }

    }
}
