package a.a.a.b.a.a.d;

import a.a.a.b.a.a.OrderType;
import lombok.Getter;
import lombok.ToString;

import java.util.Set;

@Getter
@ToString
public class MigrationCell<_T> extends CellDef<_T> {

    protected final Set<CellNamed> contextColumns;
    protected final MigrationAction<_T> migration;
    protected final Runnable postAction;

    public MigrationCell(String name, CellType type, Boolean nullable, Boolean unique, _T default_, OrderType order, Set<CellNamed> contextColumns, MigrationAction<_T> migration, Runnable action) {
        super(name, type, nullable, unique, default_, order);
        this.contextColumns = contextColumns;
        this.migration = migration;
        this.postAction = action;
    }

    public MigrationCell(CellTyped cellTyped, Boolean nullable, Boolean unique, _T default_, Set<CellNamed> contextColumns, MigrationAction<_T> migration, Runnable postAction) {
        this(cellTyped.name, cellTyped.type, nullable, unique, default_, OrderType.NONE, contextColumns, migration, postAction);
    }

    public MigrationCell(CellTyped cellTyped, Boolean nullable, Boolean unique, Set<CellNamed> contextColumns, MigrationAction<_T> migration, Runnable postAction) {
        this(cellTyped.name, cellTyped.type, nullable, unique, null, OrderType.NONE, contextColumns, migration, postAction);
    }

    public Copyable copy() {
        return new MigrationCell(this.name, this.type, this.nullable, this.unique, this.default_, this.order, this.contextColumns, this.migration, this.postAction);
    }

    public interface MigrationAction<_T> {
        _T action(Set<CellValue<?>> contextColumns);
    }
}
