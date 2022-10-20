package a.a.a.b.a.a.d;

import a.a.a.b.a.a.OrderType;
import lombok.Getter;

@Getter
public class InitScriptCell<_T> extends CellDef<_T> {

    protected final String initScript;

    public InitScriptCell(String name, CellType type, Boolean nullable, Boolean unique, _T default_, OrderType order, String initScript) {
        super(name, type, nullable, unique, default_, order);
        this.initScript = initScript;
    }

    public InitScriptCell(CellTyped cellTyped, Boolean nullable, Boolean unique, String initScript) {
        this(cellTyped.name, cellTyped.type, nullable, unique, null, OrderType.NONE, initScript);
    }

    public Copyable copy() {
        return new InitScriptCell(this.name, this.type, this.nullable, this.unique, this.default_, this.order, this.initScript);
    }
}
