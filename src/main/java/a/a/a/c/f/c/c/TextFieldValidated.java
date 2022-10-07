package a.a.a.c.f.c.c;

import a.a.a.c.f.a.EYF;
import javafx.beans.binding.BooleanBinding;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;

public class TextFieldValidated extends TextFieldChanged implements EYF {
   protected BooleanProperty GYL;
   protected BooleanProperty GYM;
   protected BooleanProperty GYN;

   public TextFieldValidated() {
      this("");
   }

   public TextFieldValidated(String var1) {
      super(var1);
      this.GYL = new SimpleBooleanProperty(this, "valid", false);
      this.GYM = new SimpleBooleanProperty(this, "validExternal", true);
      this.GYN = new SimpleBooleanProperty(this, "warning", false);
   }

   public final boolean IET() {
      return this.GYL.getValue();
   }

   public final void setValid(boolean var1) {
      this.GYL.setValue(var1);
   }

   public final BooleanProperty IEU() {
      return this.GYL;
   }

   public final boolean IEV() {
      return this.GYM.getValue();
   }

   public final void setValidExternal(boolean var1) {
      this.GYM.setValue(var1);
   }

   public final BooleanProperty IEW() {
      return this.GYM;
   }

   public final boolean IEX() {
      return this.GYN.getValue();
   }

   public final void setWarning(boolean var1) {
      this.GYN.setValue(var1);
   }

   public final BooleanProperty IEY() {
      return this.GYN;
   }

   public BooleanBinding IEZ() {
      return this.textProperty().isEmpty();
   }

   public BooleanBinding IFA() {
      return this.textProperty().isNotEmpty();
   }
}
