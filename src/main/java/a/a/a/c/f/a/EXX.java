package a.a.a.c.f.a;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;

public class EXX extends EYG {
   protected BooleanProperty GVM = new SimpleBooleanProperty(this, "required", true);
   protected BooleanProperty GVN = new SimpleBooleanProperty(this, "requiredAndValid", true);

   public EXX(String var1) {
      super(var1);
   }

   public final boolean isRequired() {
      return this.GVM.getValue();
   }

   public final void setRequired(boolean var1) {
      this.GVM.setValue(var1);
   }

   public final BooleanProperty requiredProperty() {
      return this.GVM;
   }

   public final boolean isRequiredAndValid() {
      return this.GVN.getValue();
   }

   public final void setRequiredAndValid(boolean var1) {
      this.GVN.setValue(var1);
   }

   public final BooleanProperty requiredAndValidProperty() {
      return this.GVN;
   }
}
