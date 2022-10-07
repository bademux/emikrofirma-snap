package a.a.a.c.c.e.a.a.b;

import a.a.a.c.c.e.a.a.c.ERR;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.DragEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class ERH implements EventHandler<DragEvent> {
   private final DropShadow FZL;
   private final ERR FZM;
   private final Node FZN;

   public ERH(ERR var1, Node var2) {
      this.FZM = var1;
      this.FZN = var2;
      this.FZL = new DropShadow();
      this.FZL.setColor(Color.rgb(0, 150, 201, 0.5));
      this.FZL.setOffsetX(2.0);
      this.FZL.setOffsetY(2.0);
      this.FZL.setHeight(10.0);
      this.FZL.setWidth(10.0);
   }

   public void handle(DragEvent var1) {
      Pane var2 = (Pane)var1.getSource();
      this.FZN.setEffect(this.FZL);
      if (this.FZM.getNode() != null && var1.getTransferMode() == TransferMode.COPY) {
         var2.getChildren().add(this.FZM.getImageView());
      }

      var1.consume();
   }
}
