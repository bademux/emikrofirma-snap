package a.a.a.c.f.c.c;

import a.a.a.c.f.c.b.FAA;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.scene.control.CheckBox;

public class CheckBoxChanged extends CheckBox {
   protected FAA<CheckBoxChanged> GZW;
   protected BooleanProperty GZX;

   public CheckBoxChanged() {
      this("");
   }

   public CheckBoxChanged(String var1) {
      super(var1);
      this.GZX = new SimpleBooleanProperty(this, "changed", false);
      this.IGC();
   }

   public final boolean isChanged() {
      return this.GZX.getValue();
   }

   public final void setChanged(boolean var1) {
      this.GZX.setValue(var1);
   }

   public final BooleanProperty changedProperty() {
      return this.GZX;
   }

   private void IGC() {
      this.changedProperty().set(false);
      this.GZW = new FAA(this);
      this.selectedProperty().addListener(this.GZW);
   }
}
