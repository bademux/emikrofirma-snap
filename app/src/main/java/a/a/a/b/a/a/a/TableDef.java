package a.a.a.b.a.a.a;

import a.a.a.b.a.a.d.CellDef;
import a.a.a.b.a.a.e.ConstraintDef;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@ToString
@Getter
public class TableDef extends BaseTable {
    private final boolean temporary;
    private final boolean failOnExisting;
    private final List<CellDef> columns;
    private final List<ConstraintDef> constraints;

    public TableDef(boolean temporary, String schema, String alias, String name, boolean failOnExisting, List<CellDef> columns, List<ConstraintDef> constraints) {
        super(schema, alias, name);
        this.temporary = temporary;
        this.failOnExisting = failOnExisting;
        this.columns = columns;
        this.constraints = constraints;
    }

    public TableDef(boolean temporary, String schema, String alias, String name, boolean failOnExisting) {
        this(temporary, schema, alias, name, failOnExisting, new ArrayList(), new ArrayList());
    }

    public TableDef(boolean temporary, String schema, String name, boolean failOnExisting) {
        this(temporary, schema, null, name, failOnExisting, new ArrayList(), new ArrayList());
    }

    public TableDef createFor(String name) {
        var tableDef = new TableDef(this.temporary, this.schema, name, this.failOnExisting);
        {
            Iterator it = this.columns.iterator();
            while (it.hasNext()) {
                CellDef var4 = (CellDef) it.next();
                tableDef.getColumns().add((CellDef) var4.copy());
            }
        }

        {
            Iterator it = this.constraints.iterator();
            while (it.hasNext()) {
                ConstraintDef var5 = (ConstraintDef) it.next();
                tableDef.getConstraints().add(var5.copy());
            }
        }

        return tableDef;
    }
}
