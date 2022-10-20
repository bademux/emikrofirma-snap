package a.a.a.c.c.e.a.a.b;

import a.a.a.c.c.e.a.a.c.ERR;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;

import java.util.ArrayList;
import java.util.Iterator;

public class ERK implements EventHandler<DragEvent> {
    private final ERR FZS;
    private boolean FZT = false;

    public ERK(ERR var1) {
        this.FZS = var1;
    }

    public void handle(DragEvent var1) {
        Pane var2 = (Pane) var1.getSource();
        Object var3 = null;
        if (var1.getTransferMode() == TransferMode.MOVE) {
            var3 = this.FZS.getNode();
        } else if (var1.getTransferMode() == TransferMode.COPY) {
            var3 = this.FZS.getImageView();
        }

        double var4 = -1.0;
        double var6 = -1.0;
        Iterator var8 = var2.getChildren().iterator();

        while (var8.hasNext()) {
            Node var9 = (Node) var8.next();
            if (var9.equals(var3)) {
                if (var1.getTransferMode() == TransferMode.MOVE) {
                    Region var20 = (Region) var9;
                    var4 = var20.getLayoutX();
                    var6 = var20.getWidth();
                    break;
                }

                if (var1.getTransferMode() == TransferMode.COPY) {
                    ImageView var10 = (ImageView) var9;
                    var4 = var10.getLayoutX();
                    var6 = var10.getImage().getWidth();
                    break;
                }
            }
        }

        if (this.FZT || !(var1.getX() < var4) && !(var1.getX() > var4 + var6)) {
            this.FZT = false;
        } else {
            ArrayList var17 = new ArrayList();
            boolean var19 = false;
            Iterator var21 = var2.getChildren().iterator();

            while (var21.hasNext()) {
                Node var11 = (Node) var21.next();
                if (!var11.equals(var3)) {
                    Region var12 = (Region) var11;
                    double var13 = var12.getLayoutX();
                    double var15 = var12.getWidth();
                    if (var1.getX() > var13 && var1.getX() < var13 + var15) {
                        var17.add(var3);
                        var19 = true;
                    }

                    var17.add(var11);
                }
            }

            if (!var19) {
                var17.add(var3);
            }

            var2.getChildren().removeAll(var2.getChildren());
            var2.getChildren().addAll(var17);
            this.FZT = true;
        }

        Dragboard var18 = var1.getDragboard();
        if (var18.hasString()) {
            var1.acceptTransferModes(TransferMode.COPY_OR_MOVE);
        }

        var1.consume();
    }
}
