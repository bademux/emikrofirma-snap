package a.a.a.c.f.a;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;

public class EXS extends EXU {
   protected BooleanProperty GVH = new SimpleBooleanProperty(this, "changed", false);

   public EXS(String var1) {
      super(var1);
   }

   public final boolean isChanged() {
      return this.GVH.getValue();
   }

   public final void setChanged(boolean var1) {
      this.GVH.setValue(var1);
   }

   public final BooleanProperty changedProperty() {
      return this.GVH;
   }
}
