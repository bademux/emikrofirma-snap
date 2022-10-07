package a.a.a.c.f.c.c;

import a.a.a.c.e.a.j.EXC;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.EYE;
import a.a.a.c.f.c.c.a.UnaryOperator_Number;
import a.a.a.c.f.c.c.b.StringConverter_Number;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.control.TextFormatter;

public class TextFieldValidated_Number extends TextFieldRequired implements EYE {
   private BigDecimal GZF;
   private final DecimalFormat GZG;
   private BooleanProperty GZH;
   private BooleanProperty QWC;
   private IntegerProperty GZI;
   private IntegerProperty GZJ;
   private DoubleProperty GZK;
   private DoubleProperty GZL;

   public TextFieldValidated_Number() {
      this("");
   }

   public TextFieldValidated_Number(String var1) {
      super(var1);
      this.GZH = new SimpleBooleanProperty(this, "allowNegative", true);
      this.QWC = new SimpleBooleanProperty(this, "allowOnlyNegative", false);
      this.GZI = new SimpleIntegerProperty(this, "minimumFractionDigits", 2);
      this.GZJ = new SimpleIntegerProperty(this, "maximumFractionDigits", 2);
      this.GZK = new SimpleDoubleProperty(this, "minimumValue", -1.7976931348623157E308);
      this.GZL = new SimpleDoubleProperty(this, "maximumValue", 1.7976931348623157E308);
      this.GZF = BigDecimal.ZERO;
      this.GZG = (DecimalFormat)DecimalFormat.getInstance(EXC.getInstance().getCurrentLocale());
      this.GZG.setParseBigDecimal(true);
      this.IFW();
   }

   public BigDecimal getNumber() {
      return this.GZF;
   }

   public void setNumber(BigDecimal var1) {
      this.GZF = var1;
   }

   public final boolean IFG() {
      return this.GZH.getValue();
   }

   public final void setAllowNegative(boolean var1) {
      this.GZH.setValue(var1);
   }

   public final BooleanProperty IFH() {
      return this.GZH;
   }

   public final boolean RHT() {
      return this.QWC.getValue();
   }

   public final void setAllowOnlyNegative(boolean var1) {
      this.QWC.setValue(var1);
   }

   public final BooleanProperty RHU() {
      return this.QWC;
   }

   public final int getMinimumFractionDigits() {
      return this.GZI.getValue();
   }

   public final void setMinimumFractionDigits(int var1) {
      this.GZI.setValue(var1);
   }

   public final IntegerProperty IFI() {
      return this.GZI;
   }

   public final int getMaximumFractionDigits() {
      return this.GZJ.getValue();
   }

   public final void setMaximumFractionDigits(int var1) {
      this.GZJ.setValue(var1);
   }

   public final IntegerProperty IFJ() {
      return this.GZJ;
   }

   public final double getMinimumValue() {
      return this.GZK.getValue();
   }

   public final void setMinimumValue(double var1) {
      this.GZK.setValue(var1);
   }

   public final DoubleProperty IFK() {
      return this.GZK;
   }

   public final double getMaximumValue() {
      return this.GZL.getValue();
   }

   public final void setMaximumValue(double var1) {
      this.GZL.setValue(var1);
   }

   public final DoubleProperty IFL() {
      return this.GZL;
   }

   public DecimalFormat getDecimalFormat() {
      return this.GZG;
   }

   private void IFW() {
      EXF.getInstance().ICO();

      try {
         this.setTextFormatter(new TextFormatter(new StringConverter_Number(this), "", new UnaryOperator_Number(this)));
         this.IEU().set(false);
         this.textProperty().removeListener(this.GYR);
         this.textProperty().removeListener(this.GYY);
      } finally {
         EXF.getInstance().ICP();
      }

   }
}
