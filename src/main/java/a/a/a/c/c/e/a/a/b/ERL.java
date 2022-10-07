package a.a.a.c.c.e.a.a.b;

import a.a.a.c.c.e.a.a.c.ERP;
import a.a.a.c.c.e.a.a.c.ERQ;
import a.a.a.c.c.e.a.a.c.ERR;
import javafx.beans.property.StringProperty;
import javafx.event.EventHandler;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.Pane;

public class ERL implements EventHandler<DragEvent> {
    private final ERR FZU;
    private final StringProperty FZV;

    public ERL(ERR var1, StringProperty var2) {
        this.FZU = var1;
        this.FZV = var2;
    }

    public void handle(DragEvent var1) {
        Pane var2 = (Pane) var1.getSource();
        Dragboard var3 = var1.getDragboard();
        boolean var4 = false;
        if (var3.hasString()) {
            String var5 = var3.getString();
            ERP var6 = ERP.valueOf(var5);
            var4 = true;
            if (var1.getTransferMode() == TransferMode.COPY) {
                ERQ.HSF(var6, "", this.FZU, var2.getChildren(), this.FZV, true);
            }

            this.FZU.setDropped(true);
        }

        var1.setDropCompleted(var4);
        var1.consume();
    }
}
