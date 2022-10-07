package a.a.b.a.a.a.a;

import a.a.a.c.c.e.e.a.ETB;
import a.a.a.c.f.a.a.EZF;
import a.a.a.c.f.c.c.TextFieldValidated_NIP;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class ESY implements ChangeListener<String> {
   private final ETB GFH;
   private final EZF GFI;

   public ESY(ETB var1, EZF var2) {
      this.GFH = var1;
      this.GFI = var2;
   }

   public void changed(ObservableValue<? extends String> var1, String var2, String var3) {
      ((TextFieldValidated_NIP)this.GFI.fxml_component_main_element).IEW().set(true);
      if (this.GFI.isChanged() && var3 != null && var3.length() == 10 && !this.GFH.HUP(var3)) {
         ((TextFieldValidated_NIP)this.GFI.fxml_component_main_element).IEW().set(false);
      }

   }
}
