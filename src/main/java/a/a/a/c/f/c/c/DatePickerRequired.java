package a.a.a.c.f.c.c;

import a.a.a.c.f.a.EXW;
import a.a.a.c.f.c.b.FAL;
import a.a.a.c.f.c.c.a.UnaryOperator_TextFieldmaxLength;
import a.a.a.c.f.c.c.b.StringConverter_String;
import java.time.LocalDate;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.scene.control.TextFormatter;

public class DatePickerRequired extends DatePickerValidated implements EXW<LocalDate> {
   protected FAL<DatePickerRequired> GYA;
   protected BooleanProperty GYB;
   protected BooleanProperty GYC;

   public DatePickerRequired() {
      this((LocalDate)null);
   }

   public DatePickerRequired(LocalDate var1) {
      super(var1);
      this.GYB = new SimpleBooleanProperty(this, "required", true);
      this.GYC = new SimpleBooleanProperty(this, "requiredAndValid", true);
      this.IFX();
   }

   public final boolean IFB() {
      return this.GYB.getValue();
   }

   public final void setRequired(boolean var1) {
      this.GYB.setValue(var1);
   }

   public final BooleanProperty IFC() {
      return this.GYB;
   }

   public final boolean IFD() {
      return this.GYC.getValue();
   }

   public final void setRequiredAndValid(boolean var1) {
      this.GYC.setValue(var1);
   }

   public final BooleanProperty IFE() {
      return this.GYC;
   }

   private void IFX() {
      this.GYC.bind(this.GYB.and(this.GZM.and(this.GZN)).or(this.GYB.not().and(this.valueProperty().isNull().or(this.GZM.and(this.GZN)))));
      this.getEditor().setTextFormatter(new TextFormatter(new StringConverter_String(), "", new UnaryOperator_TextFieldmaxLength(this.getEditor(), 10)));
      this.valueProperty().removeListener(this.GYJ);
      this.GYA = new FAL(this);
      this.valueProperty().addListener(this.GYA);
   }
}
