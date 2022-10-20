package a.a.a.b.a.a.a;

import a.a.a.b.a.a.d.CellValue;
import a.a.a.b.a.a.d.CellNamed;
import lombok.Getter;
import lombok.ToString;

import java.util.*;

@Getter
@ToString
public class TableValuesInsert extends BaseTable {
    private final List<CellNamed> parameters;
    private final List<Map<String, CellValue<?>>> values;

    public TableValuesInsert(String schema, String name) {
        this(schema, null, name);
    }

    public TableValuesInsert(String schema, String alias, String name) {
        super(schema, alias, name);
        this.parameters = new ArrayList();
        this.values = new ArrayList();
    }

    public <_T extends CellNamed> void IJM(_T var1) {
        if (var1 == null) {
            throw new RuntimeException("Column definition cannot be null!");
        } else {
            this.parameters.add(var1);
        }
    }

    public <_T extends CellNamed> void IJN(List<_T> var1) {
        if (var1 == null) {
            throw new RuntimeException("Column definitions cannot be null!");
        } else {
            Iterator var2 = var1.iterator();

            while (var2.hasNext()) {
                CellNamed var3 = (CellNamed) var2.next();
                this.IJM(var3);
            }

        }
    }

    public <_T extends CellValue<?>> void IJO(_T[] var1) {
        this.IJO(Arrays.asList(var1));
    }

    public <_T extends CellValue<?>> void IJO(List<_T> columnDef) {
        if (columnDef == null) {
            throw new RuntimeException("Column definitions cannot be null!");
        }
        HashMap resulr = new HashMap();
        Iterator var3 = columnDef.iterator();

        while (var3.hasNext()) {
            CellValue var4 = (CellValue) var3.next();
            resulr.put(var4.getName(), var4);
        }

        this.values.add(resulr);
    }

    public <_T extends CellValue<?>> void IJO(Map<String, _T> var1) {
        this.values.add((Map<String, CellValue<?>>) var1);
    }

}
