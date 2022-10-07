package a.a.a.c.f.c.c;

import a.a.a.c.f.a.EYJ;
import a.a.a.c.f.c.b.FAR;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.scene.control.TextArea;

public class TextAreaChanged extends TextArea implements EYJ {
   protected FAR<TextAreaChanged> HAD;
   protected BooleanProperty HAE;

   public TextAreaChanged() {
      this("");
   }

   public TextAreaChanged(String var1) {
      super(var1);
      this.HAE = new SimpleBooleanProperty(this, "changed", false);
      this.IFZ();
   }

   public final boolean isChanged() {
      return this.HAE.getValue();
   }

   public final void setChanged(boolean var1) {
      this.HAE.setValue(var1);
   }

   public final BooleanProperty changedProperty() {
      return this.HAE;
   }

   private void IFZ() {
      this.changedProperty().set(false);
      this.HAD = new FAR(this);
      this.textProperty().addListener(this.HAD);
   }
}
