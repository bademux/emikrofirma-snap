package a.a.a.b.a.a.d;

import a.a.a.b.a.a.Condition;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class CellConditioned extends CellTyped {

    protected final Condition condition;

    public CellConditioned(String name, CellType type, Condition condition) {
        super(name, type);
        this.condition = condition;
    }

}
