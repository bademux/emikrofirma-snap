package a.a.a.b.a.a.d;

import a.a.a.b.a.a.FDL;

import java.util.Set;

public class QJR<_T> extends FDW<_T> {
    protected final Set<FDY> QKP;
    protected final QJS<_T> QKQ;
    protected final QJT QKR;

    public QJR(String var1, FDV var2, Boolean var3, Boolean var4, _T var5, FDL var6, Set<FDY> var7, QJS<_T> var8, QJT var9) {
        super(var1, var2, var3, var4, var5, var6);
        this.QKP = var7;
        this.QKQ = var8;
        this.QKR = var9;
    }

    public QJR(FDR var1, Boolean var2, Boolean var3, _T var4, FDL var5, Set<FDY> var6, QJS<_T> var7, QJT var8) {
        this(var1.HEL, var1.HDZ, var2, var3, var4, var5, var6, var7, var8);
    }

    public QJR(String var1, FDV var2, Boolean var3, Boolean var4, FDL var5, Set<FDY> var6, QJS<_T> var7, QJT var8) {
        this(var1, var2, var3, var4, null, var5, var6, var7, var8);
    }

    public QJR(FDR var1, Boolean var2, Boolean var3, FDL var4, Set<FDY> var5, QJS<_T> var6, QJT var7) {
        this(var1.HEL, var1.HDZ, var2, var3, null, var4, var5, var6, var7);
    }

    public QJR(String var1, FDV var2, Boolean var3, Boolean var4, _T var5, Set<FDY> var6, QJS<_T> var7, QJT var8) {
        this(var1, var2, var3, var4, var5, FDL.NONE, var6, var7, var8);
    }

    public QJR(FDR var1, Boolean var2, Boolean var3, _T var4, Set<FDY> var5, QJS<_T> var6, QJT var7) {
        this(var1, var2, var3, var4, FDL.NONE, var5, var6, var7);
    }

    public QJR(String var1, FDV var2, Boolean var3, Boolean var4, Set<FDY> var5, QJS<_T> var6, QJT var7) {
        this(var1, var2, var3, var4, null, FDL.NONE, var5, var6, var7);
    }

    public QJR(FDR var1, Boolean var2, Boolean var3, Set<FDY> var4, QJS<_T> var5, QJT var6) {
        this(var1, var2, var3, null, FDL.NONE, var4, var5, var6);
    }

    public QJR(String var1, FDV var2, Set<FDY> var3, QJS<_T> var4, QJT var5) {
        this(var1, var2, null, null, null, FDL.NONE, var3, var4, var5);
    }

    public QJR(FDR var1, Set<FDY> var2, QJS<_T> var3, QJT var4) {
        this(var1, null, null, null, FDL.NONE, var2, var3, var4);
    }

    public Set<FDY> getContextColumns() {
        return this.QKP;
    }

    public QJS<_T> getMigration() {
        return this.QKQ;
    }

    public QJT getPostAction() {
        return this.QKR;
    }

    public FDZ IJV() {
        QJR var1 = new QJR(this.HEL, this.HDZ, this.HEF, this.HEG, this.HEH, this.HEI, this.QKP, this.QKQ, this.QKR);
        return var1;
    }

    public interface QJT {
        void QNX();
    }

    public interface QJS<_T> {
        _T QNW(Set<FDU<?>> var1);
    }
}
