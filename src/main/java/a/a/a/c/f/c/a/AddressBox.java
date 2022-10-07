package a.a.a.c.f.c.a;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.layout.VBox;

public class AddressBox extends VBox {
   private BooleanProperty GXA = new SimpleBooleanProperty(this, "required", true);
   private StringProperty GXB = new SimpleStringProperty(this, "label", "Missing Label");

   public AddressBox() {
   }

   public final boolean isRequired() {
      return this.GXA.getValue();
   }

   public final void setRequired(boolean var1) {
      this.GXA.setValue(var1);
   }

   public final BooleanProperty requiredProperty() {
      return this.GXA;
   }

   public final void setLabel(String var1) {
      this.GXB.set(var1);
   }

   public final String getLabel() {
      return this.GXB.getValue();
   }

   public final StringProperty labelProperty() {
      return this.GXB;
   }
}
