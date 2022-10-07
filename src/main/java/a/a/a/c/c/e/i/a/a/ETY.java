package a.a.a.c.c.e.i.a.a;

import a.a.a.c.c.e.i.a.EUA;
import a.a.a.c.g.b.FCW;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class ETY implements ChangeListener<Boolean> {
   private EUA GJO;
   private final String GJP;

   public ETY(EUA var1) {
      this.GJO = var1;
      this.GJP = FCW.getInstance().getMessageForKey("micro.process.jpk_list.button.checkState");
   }

   public void changed(ObservableValue<? extends Boolean> var1, Boolean var2, Boolean var3) {
      if (var3 != null && var3) {
         this.GJO.fxml_generalButtonState.setText(this.GJP);
      }

   }
}
