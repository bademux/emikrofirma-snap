package a.a.a.c.f.c.c;

import a.a.a.c.f.c.b.FAB;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.scene.control.PasswordField;

public class PasswordFieldChanged extends PasswordField {
   protected FAB<PasswordFieldChanged> GYW;
   private BooleanProperty GYX = new SimpleBooleanProperty(this, "changed", false);

   public PasswordFieldChanged() {
      this.IFY();
   }

   public final boolean isChanged() {
      return this.GYX.getValue();
   }

   public final void setChanged(boolean var1) {
      this.GYX.setValue(var1);
   }

   public final BooleanProperty changedProperty() {
      return this.GYX;
   }

   private void IFY() {
      this.changedProperty().set(false);
      this.GYW = new FAB(this);
      this.textProperty().addListener(this.GYW);
   }
}
