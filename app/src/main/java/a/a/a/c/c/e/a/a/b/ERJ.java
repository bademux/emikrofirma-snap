package a.a.a.c.c.e.a.a.b;

import a.a.a.c.c.e.a.a.c.ElementType;
import a.a.a.c.c.e.a.a.c.ERR;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.SnapshotParameters;
import javafx.scene.image.WritableImage;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.paint.Color;

public class ERJ implements EventHandler<MouseEvent> {
    private final ERR FZP;
    private final ElementType FZQ;
    private final TransferMode FZR;

    public ERJ(ERR var1, ElementType var2, TransferMode var3) {
        this.FZP = var1;
        this.FZQ = var2;
        this.FZR = var3;
    }

    public void handle(MouseEvent var1) {
        Node var2 = (Node) var1.getSource();
        this.FZP.setNode(var2);
        this.FZP.setDropped(false);
        Dragboard var3 = var2.startDragAndDrop(this.FZR);
        ClipboardContent var4 = new ClipboardContent();
        var4.putString(this.FZQ.name());
        var3.setContent(var4);
        SnapshotParameters var5 = new SnapshotParameters();
        var5.setFill(Color.TRANSPARENT);
        WritableImage var6 = var2.snapshot(var5, null);
        this.FZP.setImage(var6);
        var3.setDragView(var6);
        var1.consume();
    }
}
