package a.a.a.c.c.e.j.a.a;

import a.a.a.c.c.e.j.a.EUT;
import a.a.a.c.e.a.k.a.EXF;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class EUN implements ChangeListener<String> {
   private EUT GLA;

   public EUN(EUT var1) {
      this.GLA = var1;
   }

   public void changed(ObservableValue<? extends String> var1, String var2, String var3) {
      EXF.getInstance().ICO();

      try {
         if (var3 != null && this.GLA.GLM.getFieldsEditable()) {
            this.GLA.QGQ(var3);
            EXF.getInstance().ICE("RefId changed");
         }
      } finally {
         EXF.getInstance().ICP();
      }

   }
}
