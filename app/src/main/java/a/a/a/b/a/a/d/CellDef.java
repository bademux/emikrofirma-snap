package a.a.a.b.a.a.d;

import a.a.a.b.a.a.OrderType;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class CellDef<_T> extends CellTyped {
    protected final Boolean nullable;
    protected final Boolean unique;
    protected final _T default_;
    protected final OrderType order;

    public CellDef(String name, CellType type, Boolean nullable, Boolean unique, _T default_, OrderType order) {
        super(name, type);
        this.nullable = nullable;
        this.unique = unique;
        this.default_ = default_;
        this.order = order;
    }

    public CellDef(CellTyped cellTyped, Boolean nullable, Boolean unique, _T default_, OrderType order) {
        this(cellTyped.name, cellTyped.type, nullable, unique, default_, order);
    }

    public CellDef(CellTyped cellTyped, Boolean nullable, Boolean unique, OrderType order) {
        this(cellTyped.name, cellTyped.type, nullable, unique, null, order);
    }

    public CellDef(CellTyped cellTyped, Boolean nullable, Boolean unique, _T var4) {
        this(cellTyped, nullable, unique, var4, OrderType.NONE);
    }

    public CellDef(CellTyped cellTyped, Boolean nullable, Boolean unique) {
        this(cellTyped, nullable, unique, null, OrderType.NONE);
    }

    public _T getDefault_() {
        return this.default_;
    }

    public boolean isNullable() {
        return this.nullable != null ? this.nullable : false;
    }

    public boolean isUnique() {
        return this.unique != null ? this.unique : false;
    }

    public boolean hasDefault() {
        return this.default_ != null;
    }

    public Copyable copy() {
        return new CellDef(this.name, this.type, this.nullable, this.unique, this.default_, this.order);
    }
}
