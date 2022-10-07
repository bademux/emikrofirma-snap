package a.a.a.c.f.c.c;

import a.a.a.c.f.a.EXV;
import a.a.a.c.f.c.b.EZZ;
import a.a.a.c.f.c.c.a.UnaryOperator_TextAreaRequired;
import a.a.a.c.f.c.c.b.StringConverter_String;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.control.TextFormatter;

public class TextAreaRequired extends TextAreaValidated implements EXV {
   protected EZZ<TextAreaRequired> GZQ;
   protected BooleanProperty GZR;
   protected BooleanProperty GZS;
   protected IntegerProperty GZT;
   protected BooleanProperty QWA;

   public TextAreaRequired() {
      this("");
   }

   public TextAreaRequired(String var1) {
      super(var1);
      this.GZR = new SimpleBooleanProperty(this, "required", true);
      this.GZS = new SimpleBooleanProperty(this, "requiredAndValid", true);
      this.GZT = new SimpleIntegerProperty(this, "maxLength", 2147483647);
      this.QWA = new SimpleBooleanProperty(this, "doTrim", true);
      this.IFZ();
   }

   public final boolean IFB() {
      return this.GZR.getValue();
   }

   public final void setRequired(boolean var1) {
      this.GZR.setValue(var1);
   }

   public final BooleanProperty IFC() {
      return this.GZR;
   }

   public final boolean IFD() {
      return this.GZS.getValue();
   }

   public final void setRequiredAndValid(boolean var1) {
      this.GZS.setValue(var1);
   }

   public final BooleanProperty IFE() {
      return this.GZS;
   }

   public final void setMaxLength(Integer var1) {
      this.GZT.set(var1);
   }

   public final Integer getMaxLength() {
      return this.GZT.getValue();
   }

   public final IntegerProperty IFF() {
      return this.GZT;
   }

   public final boolean RHR() {
      return this.QWA.getValue();
   }

   public final void setDoTrim(boolean var1) {
      this.QWA.setValue(var1);
   }

   public final BooleanProperty RHS() {
      return this.QWA;
   }

   private void IFZ() {
      this.GZS.bind(this.GZR.and(this.GYO.and(this.GYP)).or(this.GZR.not().and(this.textProperty().isEmpty().or(this.GYO.and(this.GYP)))));
      this.setTextFormatter(new TextFormatter(new StringConverter_String(this.RHS()), "", new UnaryOperator_TextAreaRequired(this)));
      this.textProperty().removeListener(this.HAD);
   }
}
