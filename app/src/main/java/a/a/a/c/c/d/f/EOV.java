package a.a.a.c.c.d.f;

import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.f.a.a.EYZ;
import a.a.a.c.f.a.a.DictionaryEntry;
import a.a.a.c.f.a.b.SQQ;
import a.a.a.c.f.b.c.a.KL;

import java.util.*;

public abstract class EOV implements SQQ<String> {
    private final EOW FNZ;
    private final EYZ FOA;
    Map<String, DictionaryEntry> FOB = new HashMap();

    public EOV(final EOW var1, EYZ var2) {
        this.FNZ = var1;
        this.FOA = var2;
        this.FOA.setDeleteListener(new EYZ.EZA() {
            public void IFS(String var1x) {
                var1.HNZ(EOV.this.FOB.get(EOV.this.HNT(var1x)));
            }
        });
        var2.setChangeListener(new EYZ.EZB() {
            public void IFT(String var1) {
                if (EOV.this.FOB != null) {
                    DictionaryEntry var2 = EOV.this.FOB.get(EOV.this.HNT(var1));
                    if (var2 != null && var2.getTaxRateValue() != null) {
                        KL var3 = var2.getTaxRateValue().getValue();
                        if (var3 != null) {
                            EOV.this.HNV(var3);
                        }
                    }
                }

            }
        });
    }

    public Set<String> TEB(String var1) {
        String var2 = this.HNT(var1);
        if (var2.length() <= 0) {
            return new TreeSet();
        } else {
            List var3 = this.QGT(var2);
            TreeSet var4 = new TreeSet();
            Iterator var5 = var3.iterator();

            while (var5.hasNext()) {
                DictionaryEntry var6 = (DictionaryEntry) var5.next();
                var4.add(var6.IYX().getValue());
            }

            return var4;
        }
    }

    private List<DictionaryEntry> QGT(String var1) {
        List var2 = this.FNZ.HNW(var1);
        this.FOB = new HashMap();
        Iterator var3 = var2.iterator();

        while (var3.hasNext()) {
            DictionaryEntry var4 = (DictionaryEntry) var3.next();
            this.FOB.put(this.HNT(var4.IYX().getValue()), var4);
        }

        return var2;
    }

    public void HNS(String var1) throws FFK, FFO {
        String var2 = this.HNT(var1);
        String var3 = this.getName(var1);
        KL var4 = this.HNU();
        this.QGT(var2);
        DictionaryEntry var5 = this.FOB.get(var2);
        if (var5 != null) {
            String var6 = var5.IYX().getValue();
            KL var7 = var5.IYY().getValue();
            if (var6 == null || !var6.equals(var3) || var7 == null || !var7.equals(var4)) {
                var5.IYX().setValue(var3);
                var5.IYY().setValue(var4);
                this.FNZ.HNY(var5);
            }
        } else {
            var5 = new DictionaryEntry();
            var5.IYX().setValue(var3);
            var5.IYY().setValue(var4);
            this.FNZ.HNX(var5);
        }

    }

    private String HNT(String var1) {
        return this.getName(var1).toLowerCase();
    }

    private String getName(String var1) {
        return var1 == null ? "" : var1.trim();
    }

    public abstract KL HNU();

    public abstract void HNV(KL var1);
}
