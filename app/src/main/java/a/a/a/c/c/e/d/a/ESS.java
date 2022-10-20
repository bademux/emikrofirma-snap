package a.a.a.c.c.e.d.a;

import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.c.d.f.EOW;
import a.a.a.c.c.e.d.c.ESX;
import a.a.a.c.f.a.a.DictionaryEntry;

import java.util.ArrayList;
import java.util.List;

public class ESS extends EOW {
    private final ESX GEL;

    public ESS(ESX var1) {
        this.GEL = var1;
    }

    public List<DictionaryEntry> HNW(String var1) {
        try {
            return this.GEL.getModelManager().HKI(this.GEL.getParentDefinition(), "commodity", var1);
        } catch (FFO | FFK var3) {
            this.HOA("", var3);
            return new ArrayList();
        }
    }

    public void HNX(DictionaryEntry var1) {
        try {
            this.GEL.getModelManager().HKF(this.GEL.getParentDefinition(), var1);
        } catch (FFO | FFK var3) {
            this.HOA("", var3);
        }

    }

    public void HNY(DictionaryEntry var1) {
        try {
            this.GEL.getModelManager().HKG(this.GEL.getParentDefinition(), var1);
        } catch (FFO | FFK var3) {
            this.HOA("", var3);
        }

    }

    public void HNZ(DictionaryEntry var1) {
        try {
            this.GEL.getModelManager().HKH(this.GEL.getParentDefinition(), var1);
        } catch (FFO | FFK var3) {
            this.HOA("", var3);
        }

    }
}
