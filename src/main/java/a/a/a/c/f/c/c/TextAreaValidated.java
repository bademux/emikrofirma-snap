package a.a.a.c.f.c.c;

import a.a.a.c.f.a.EYF;
import javafx.beans.binding.BooleanBinding;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;

public class TextAreaValidated extends TextAreaChanged implements EYF {
   protected BooleanProperty GYO;
   protected BooleanProperty GYP;
   protected BooleanProperty GYQ;

   public TextAreaValidated() {
      this("");
   }

   public TextAreaValidated(String var1) {
      super(var1);
      this.GYO = new SimpleBooleanProperty(this, "valid", false);
      this.GYP = new SimpleBooleanProperty(this, "validExternal", true);
      this.GYQ = new SimpleBooleanProperty(this, "warning", false);
   }

   public final boolean IET() {
      return this.GYO.getValue();
   }

   public final void setValid(boolean var1) {
      this.GYO.setValue(var1);
   }

   public final BooleanProperty IEU() {
      return this.GYO;
   }

   public final boolean IEV() {
      return this.GYP.getValue();
   }

   public final void setValidExternal(boolean var1) {
      this.GYP.setValue(var1);
   }

   public final BooleanProperty IEW() {
      return this.GYP;
   }

   public final boolean IEX() {
      return this.GYQ.getValue();
   }

   public final void setWarning(boolean var1) {
      this.GYQ.setValue(var1);
   }

   public final BooleanProperty IEY() {
      return this.GYQ;
   }

   public BooleanBinding IEZ() {
      return this.textProperty().isEmpty();
   }

   public BooleanBinding IFA() {
      return this.textProperty().isNotEmpty();
   }
}
