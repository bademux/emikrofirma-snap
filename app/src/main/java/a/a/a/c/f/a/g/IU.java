package a.a.a.c.f.a.g;

import a.a.a.b.a.a.FDL;
import a.a.a.c.e.a.d.EVZ;
import a.a.a.c.f.a.e.HN;
import a.a.a.c.f.a.e.IA;
import a.a.a.c.f.a.e.IB;
import a.a.a.c.f.b.b.JN;
import a.a.a.c.f.b.c.KA;
import a.a.a.c.f.b.c.KE;
import a.a.a.c.f.b.c.a.QSW;

import java.util.Date;

public class IU<_T extends HN<?>> extends IZ<_T, IB, IA, KE> {
    private final QSW QYN;
    private final KA AMY;
    private final KA QLW;
    private final EVZ<Date, Date> QLX;
    private final EVZ<Date, Date> QLY;
    private final String AMZ;

    public IU(Class<_T> var1, QSW var2, JN var3, IB var4, IA var5, KE var6, KA var7, KA var8, EVZ<Date, Date> var9, EVZ<Date, Date> var10, String var11, FDL var12, Integer var13, Integer var14) {
        super(var1, var3, var4, var5, var6, var12, var13, var14);

        this.QYN = var2;
        this.AMY = var7;
        this.QLW = var8;
        this.QLX = var9;
        this.QLY = var10;
        this.AMZ = var11;

    }

    public IU(Class<_T> var1, QSW var2, JN var3, IB var4, IA var5, KE var6, KA var7, EVZ<Date, Date> var8, EVZ<Date, Date> var9, String var10, FDL var11, Integer var12, Integer var13) {
        this(var1, var2, var3, var4, var5, var6, var7, null, var8, var9, var10, var11, var12, var13);

    }

    public IU(Class<_T> var1, QSW var2, JN var3, IB var4, IA var5, KE var6, KA var7, String var8, FDL var9, Integer var10, Integer var11) {
        this(var1, var2, var3, var4, var5, var6, var7, null, null, var8, var9, var10, var11);

    }

    public IU(Class<_T> var1, QSW var2, JN var3, IB var4, IA var5, KE var6, KA var7, String var8, FDL var9) {
        this(var1, var2, var3, var4, var5, var6, var7, var8, var9, null, null);

    }

    public IU(Class<_T> var1, QSW var2, JN var3, IB var4, IA var5, KE var6, String var7, FDL var8) {
        this(var1, var2, var3, var4, var5, var6, null, var7, var8);

    }

    public IU(Class<_T> var1, QSW var2, JN var3, IB var4, IA var5, KE var6, KA var7, String var8) {
        this(var1, var2, var3, var4, var5, var6, var7, var8, FDL.ASC);

    }

    public IU(Class<_T> var1, QSW var2, JN var3, IB var4, IA var5, KE var6, String var7) {
        this(var1, var2, var3, var4, var5, var6, null, var7);

    }

    public KA getIssuerNumber() {
        return this.AMY;
    }

    public KA getContractorNIP() {
        return this.QLW;
    }

    public QSW getState() {
        return this.QYN;
    }

    public EVZ<Date, Date> getCreationDate() {
        return this.QLX;
    }

    public EVZ<Date, Date> getTransactionDate() {
        return this.QLY;
    }

    public String getSearch() {
        return this.AMZ;
    }
}
