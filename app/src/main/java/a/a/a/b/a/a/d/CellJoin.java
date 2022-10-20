package a.a.a.b.a.a.d;

import a.a.a.b.a.a.Condition;
import a.a.a.b.a.a.a.BaseTable;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class CellJoin extends CellConditioned {
    protected final BaseTable refTable;
    protected final CellNamed refCell;

    public CellJoin(String name, BaseTable refTable, CellNamed refCell, Condition condition) {
        super(name, CellType.NULL, condition);
        this.refTable = refTable;
        this.refCell = refCell;
    }

    public CellJoin(CellNamed cellNamed, BaseTable baseTable, CellNamed refCell, Condition condition) {
        this(cellNamed.name, baseTable, refCell, condition);
    }

}
