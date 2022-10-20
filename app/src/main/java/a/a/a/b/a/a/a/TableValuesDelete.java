package a.a.a.b.a.a.a;

import lombok.ToString;

@ToString
public class TableValuesDelete extends TableValuesQuery {

    public TableValuesDelete(String schema, String name) {
        this(schema, null, name);
    }

    public TableValuesDelete(String schema, String alias, String name) {
        super(schema, alias, name);
    }
}
