package a.a.a.c.f.c.c;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;

public class PasswordFieldValidated extends PasswordFieldChanged {
   private BooleanProperty GZP = new SimpleBooleanProperty(this, "valid", false);

   public PasswordFieldValidated() {
   }

   public final boolean isValid() {
      return this.GZP.getValue();
   }

   public final void setValid(boolean var1) {
      this.GZP.setValue(var1);
   }

   public final BooleanProperty validProperty() {
      return this.GZP;
   }
}
