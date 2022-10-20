package a.a.a.b.a.a.d;

import a.a.a.b.a.a.AggregateType;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class CellQuery extends CellNamed {
    protected final String alias;
    protected final AggregateType aggregateType;

    public CellQuery(String name, String alias, AggregateType aggregateType) {
        super(name);
        this.alias = alias;
        this.aggregateType = aggregateType;
    }

    public CellQuery(CellNamed cellNamed, String alias, AggregateType aggregateType) {
        super(cellNamed.name);
        this.alias = alias;
        this.aggregateType = aggregateType;
    }

    public CellQuery(String var1, String var2) {
        this(var1, var2, AggregateType.NONE);
    }

    public CellQuery(CellNamed cellNamed, String alias) {
        this(cellNamed, alias, AggregateType.NONE);
    }

    public CellQuery(String name) {
        this(name, null);
    }

    public CellQuery(CellNamed cellNamed) {
        this(cellNamed, null);
    }

}
