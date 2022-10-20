package a.a.a.b.a.a.a;

import a.a.a.b.a.a.d.FDU;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FDG extends FDI {
    private final List<FDU<?>> HDH;

    public FDG(String var1, String var2) {
        this(var1, null, var2);
    }

    public FDG(String var1, String var2, String var3) {
        super(var1, var2, var3);
        this.HDH = new ArrayList();
    }

    public List<FDU<?>> getValues() {
        return this.HDH;
    }

    public <_T extends FDU<?>> void IJP(_T var1) {
        if (var1 == null) {
            throw new RuntimeException("Column definitions cannot be null!");
        } else {
            this.HDH.add(var1);
        }
    }

    public <_T extends FDU<?>> void IJQ(_T[] var1) {
        this.IJQ(Arrays.asList(var1));
    }

    public <_T extends FDU<?>> void IJQ(List<_T> var1) {
        if (var1 == null) {
            throw new RuntimeException("Column definitions cannot be null!");
        } else {
            Iterator var2 = var1.iterator();

            while (var2.hasNext()) {
                FDU var3 = (FDU) var2.next();
                this.IJP(var3);
            }

        }
    }

    public String toString() {
        return "TableValuesUpdate [values=" + this.HDH + ", toString()=" + super.toString() + "]";
    }
}
