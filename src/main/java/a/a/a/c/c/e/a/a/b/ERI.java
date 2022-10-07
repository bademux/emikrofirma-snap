package a.a.a.c.c.e.a.a.b;

import a.a.a.c.c.e.a.a.c.ERR;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.input.DragEvent;

public class ERI implements EventHandler<DragEvent> {
   private final ERR FZO;

   public ERI(ERR var1) {
      this.FZO = var1;
   }

   public void handle(DragEvent var1) {
      this.FZO.setNode((Node)null);
      this.FZO.setImage((Image)null);
      this.FZO.setDropped(false);
      var1.consume();
   }
}
