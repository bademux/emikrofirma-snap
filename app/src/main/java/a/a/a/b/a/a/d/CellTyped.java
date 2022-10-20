package a.a.a.b.a.a.d;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class CellTyped extends CellNamed {

    protected final CellType type;

    public CellTyped(String name, CellType type) {
        super(name);
        this.type = type;
    }

    public CellTyped(CellTyped cellTyped) {
        this(cellTyped.name, cellTyped.type);
    }

    public Copyable copy() {
        return new CellTyped(this.name, this.type);
    }

}
