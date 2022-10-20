package a.a.a.b.a.a.a;

import a.a.a.b.a.a.d.CellValue;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@Getter
@ToString
public class TableValuesUpdate extends TableValuesQuery {

    private final List<CellValue<?>> values;

    public TableValuesUpdate(String schema, String name) {
        this(schema, null, name);
    }

    public TableValuesUpdate(String schema, String alias, String name) {
        super(schema, alias, name);
        this.values = new ArrayList();
    }

    public <_T extends CellValue<?>> void IJP(_T var1) {
        if (var1 == null) {
            throw new RuntimeException("Column definitions cannot be null!");
        } else {
            this.values.add(var1);
        }
    }

    public <_T extends CellValue<?>> void IJQ(_T[] var1) {
        this.IJQ(Arrays.asList(var1));
    }

    public <_T extends CellValue<?>> void IJQ(List<_T> var1) {
        if (var1 == null) {
            throw new RuntimeException("Column definitions cannot be null!");
        } else {
            Iterator var2 = var1.iterator();

            while (var2.hasNext()) {
                CellValue var3 = (CellValue) var2.next();
                this.IJP(var3);
            }
        }
    }

}
