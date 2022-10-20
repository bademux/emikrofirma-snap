package a.a.a.b.a.a.b;

import a.a.a.b.a.a.FEB;
import a.a.a.b.a.a.d.CellValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Expression {
    protected final FEB HDN;
    private final List<CellValue<?>> HDO;

    public Expression(FEB var1) {
        this.HDN = var1;
        this.HDO = new ArrayList();
    }

    public FEB getOperator() {
        return this.HDN;
    }

    public List<CellValue<?>> getKeys() {
        return this.HDO;
    }

    public <_T extends CellValue<?>> void IJR(_T var1) {
        if (var1 == null) {
            throw new RuntimeException("Column definitions cannot be null!");
        } else {
            this.HDO.add(var1);
        }
    }

    public <_T extends CellValue<?>> void IJS(_T[] var1) {
        this.IJS(Arrays.asList(var1));
    }

    public <_T extends CellValue<?>> void IJS(List<_T> var1) {
        if (var1 == null) {
            throw new RuntimeException("Column definitions cannot be null!");
        } else {
            Iterator var2 = var1.iterator();

            while (var2.hasNext()) {
                CellValue var3 = (CellValue) var2.next();
                this.IJR(var3);
            }

        }
    }

    public String toString() {
        return "Expression [operator=" + this.HDN + ", keys=" + this.HDO + "]";
    }
}
