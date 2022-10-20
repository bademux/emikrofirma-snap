package a.a.a.b.a.a.a;

import a.a.a.b.a.a.d.CellJoin;
import a.a.a.b.a.a.d.CellValue;
import a.a.a.b.a.a.d.CellQuery;
import a.a.a.b.a.a.d.CellOrder;
import a.a.a.c.e.a.d.TwoValueBox;
import lombok.Getter;
import lombok.ToString;

import java.util.*;

@Getter
@ToString
public class TableValuesSelect extends TableValuesQuery {

    private TwoValueBox<String, Set<CellJoin>> joins;
    private final List<CellQuery> parameters;
    private final List<CellOrder> order;
    private final List<Map<String, CellValue<?>>> results;

    public TableValuesSelect(String scheme, String alias, String name) {
        super(scheme, alias, name);
        this.joins = null;
        this.parameters = new ArrayList();
        this.order = new ArrayList();
        this.results = new ArrayList();
    }

    public TableValuesSelect(String scheme, String name) {
        this(scheme, null, name);
    }

    public <_T extends CellQuery> void IJH(_T var1) {
        if (var1 == null) {
            throw new RuntimeException("Column definition cannot be null!");
        }
        this.parameters.add(var1);

    }

    public <_T extends CellQuery> void IJI(List<_T> var1) {
        if (var1 == null) {
            throw new RuntimeException("Column definitions cannot be null!");
        }
        Iterator var2 = var1.iterator();

        while (var2.hasNext()) {
            CellQuery var3 = (CellQuery) var2.next();
            this.IJH(var3);
        }
    }

    public <_T extends CellOrder> void IJJ(_T var1) {
        if (var1 == null) {
            throw new RuntimeException("Column definition cannot be null!");
        }
        this.order.add(var1);
    }

    public <_T extends CellOrder> void IJK(List<_T> var1) {
        if (var1 == null) {
            throw new RuntimeException("Column definitions cannot be null!");
        }
        Iterator var2 = var1.iterator();

        while (var2.hasNext()) {
            CellOrder var3 = (CellOrder) var2.next();
            this.IJJ(var3);
        }
    }

    public void setJoin(String var1, CellJoin... var2) {
        if (var1 == null || var1.length() == 0 || var2.length == 0) {
            throw new RuntimeException("Join definition cannot be empty!");
        }
        HashSet var3 = new HashSet(Arrays.asList(var2));
        this.joins = new TwoValueBox(var1, var3);
    }

}
