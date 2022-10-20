package a.a.a.b.a.a.d;

import a.a.a.b.a.a.Condition;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class CellValue<_T> extends CellConditioned {

    protected _T value;

    public CellValue(String name, CellType type, _T value, Condition condition) {
        super(name, type, condition);
        this.value = value;
    }

    public CellValue(CellTyped cellTyped, _T value, Condition condition) {
        this(cellTyped.name, cellTyped.type, value, condition);
    }

    public CellValue(String name, CellType type, _T value) {
        this(name, type, value, Condition.EQUALS);
    }

    public CellValue(CellTyped cellTyped, _T value) {
        this(cellTyped, value, Condition.EQUALS);
    }

}
