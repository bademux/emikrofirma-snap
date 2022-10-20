package a.a.a.c.c.e.a.a.a;

import a.a.a.c.c.e.a.a.c.ERQ;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.scene.Node;

public class ERG implements ChangeListener<String> {
    private final ObservableList<Node> FZJ;
    private final StringProperty FZK;

    public ERG(ObservableList<Node> var1, StringProperty var2) {
        this.FZJ = var1;
        this.FZK = var2;
    }

    public void changed(ObservableValue<? extends String> var1, String var2, String var3) {
        this.FZK.set(ERQ.HSE(this.FZJ));
    }
}
