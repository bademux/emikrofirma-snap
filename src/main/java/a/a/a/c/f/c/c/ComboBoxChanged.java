package a.a.a.c.f.c.c;

import a.a.a.c.f.c.b.FAE;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;

public class ComboBoxChanged<_T> extends ComboBox<_T> {
   protected FAE<_T, ComboBoxChanged<_T>> HAK;
   protected BooleanProperty HAL;

   public ComboBoxChanged() {
      this(FXCollections.observableArrayList());
   }

   public ComboBoxChanged(ObservableList<_T> var1) {
      super(var1);
      this.HAL = new SimpleBooleanProperty(this, "changed", false);
      this.IGA();
   }

   public final boolean isChanged() {
      return this.HAL.getValue();
   }

   public final void setChanged(boolean var1) {
      this.HAL.setValue(var1);
   }

   public final BooleanProperty changedProperty() {
      return this.HAL;
   }

   private void IGA() {
      this.changedProperty().set(false);
      this.HAK = new FAE(this);
      this.valueProperty().addListener(this.HAK);
   }
}
