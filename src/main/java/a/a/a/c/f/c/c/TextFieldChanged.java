package a.a.a.c.f.c.c;

import a.a.a.c.f.a.EYJ;
import a.a.a.c.f.c.b.FAO;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.scene.control.TextField;

public class TextFieldChanged extends TextField implements EYJ {
   protected FAO<TextFieldChanged> GYR;
   protected BooleanProperty GYS;

   public TextFieldChanged() {
      this("");
   }

   public TextFieldChanged(String var1) {
      super(var1);
      this.GYS = new SimpleBooleanProperty(this, "changed", false);
      this.IFW();
   }

   public final boolean isChanged() {
      return this.GYS.getValue();
   }

   public final void setChanged(boolean var1) {
      this.GYS.setValue(var1);
   }

   public final BooleanProperty changedProperty() {
      return this.GYS;
   }

   private void IFW() {
      this.changedProperty().set(false);
      this.GYR = new FAO(this);
      this.textProperty().addListener(this.GYR);
   }
}
