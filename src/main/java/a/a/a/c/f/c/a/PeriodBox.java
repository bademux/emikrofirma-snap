package a.a.a.c.f.c.a;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.scene.layout.GridPane;

public class PeriodBox extends GridPane {
   private BooleanProperty GWY = new SimpleBooleanProperty(this, "required", false);

   public PeriodBox() {
   }

   public final boolean isRequired() {
      return this.GWY.getValue();
   }

   public final void setRequired(boolean var1) {
      this.GWY.setValue(var1);
   }

   public final BooleanProperty requiredProperty() {
      return this.GWY;
   }
}
