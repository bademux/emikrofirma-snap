package a.a.a.c.f.c.b;

import javafx.scene.Node;

public class FAS<_T extends Node> extends FAF<String> {
    protected _T GXX;

    public FAS(_T var1) {
        this.GXX = var1;
    }

    protected void IFV(String var1, String var2) {

        if (var2 != null && var2.length() > 0 && !var2.equals(var1)) {
            this.GXX.getStyleClass().add(var2);
        }

    }
}
