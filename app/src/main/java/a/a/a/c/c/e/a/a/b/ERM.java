package a.a.a.c.c.e.a.a.b;

import a.a.a.c.c.e.a.a.c.ERQ;
import a.a.a.c.c.e.a.a.c.ERR;
import javafx.beans.property.StringProperty;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.DragEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.Pane;

public class ERM implements EventHandler<DragEvent> {
    private final ERR FZW;
    private final StringProperty FZX;
    private final Node FZY;

    public ERM(ERR var1, StringProperty var2, Node var3) {
        this.FZW = var1;
        this.FZX = var2;
        this.FZY = var3;
    }

    public void handle(DragEvent var1) {
        Pane var2 = (Pane) var1.getSource();
        this.FZY.setEffect(null);
        if (this.FZW.HSG()) {
            this.FZW.setDropped(false);
        } else if (var1.getTransferMode() == TransferMode.MOVE) {
            var2.getChildren().remove(this.FZW.getNode());
        } else if (var1.getTransferMode() == TransferMode.COPY) {
            var2.getChildren().remove(this.FZW.getImageView());
        }

        this.FZX.set(ERQ.HSE(var2.getChildren()));
        var1.consume();
    }
}
