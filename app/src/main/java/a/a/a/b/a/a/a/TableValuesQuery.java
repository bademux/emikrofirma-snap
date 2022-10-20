package a.a.a.b.a.a.a;

import a.a.a.b.a.a.b.Expression;
import a.a.a.b.a.a.d.CellConditioned;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@Getter
@ToString
public abstract class TableValuesQuery extends BaseTable {
    protected final List<CellConditioned> keys = new ArrayList();
    protected final List<Expression> expressions = new ArrayList();

    public TableValuesQuery(String scheme, String alias, String name) {
        super(scheme, alias, name);
    }

    public <_T extends CellConditioned> void IJA(_T var1) {
        if (var1 == null) {
            throw new RuntimeException("Column definition cannot be null!");
        }
        this.keys.add(var1);
    }

    public <_T extends Expression> void IJB(_T var1) {
        if (var1 == null) {
            throw new RuntimeException("Expression definition cannot be null!");
        }
        this.expressions.add(var1);
    }

    public <_T extends CellConditioned> void IJC(_T[] var1) {
        this.IJC(Arrays.asList(var1));
    }

    public <_T extends CellConditioned> void IJC(List<_T> var1) {
        if (var1 == null) {
            throw new RuntimeException("Column definitions cannot be null!");
        }
        Iterator var2 = var1.iterator();

        while (var2.hasNext()) {
            CellConditioned var3 = (CellConditioned) var2.next();
            this.IJA(var3);
        }
    }

    public <_T extends Expression> void IJD(List<_T> var1) {
        if (var1 == null) {
            throw new RuntimeException("Expression definitions cannot be null!");
        }
        Iterator var2 = var1.iterator();

        while (var2.hasNext()) {
            Expression var3 = (Expression) var2.next();
            this.IJB(var3);
        }
    }

}
