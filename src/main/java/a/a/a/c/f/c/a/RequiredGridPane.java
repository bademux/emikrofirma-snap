package a.a.a.c.f.c.a;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.layout.GridPane;

public class RequiredGridPane extends GridPane {
   private BooleanProperty GWO = new SimpleBooleanProperty(this, "required", true);
   private StringProperty GWP = new SimpleStringProperty(this, "label", "Missing Label");
   private StringProperty GWQ = new SimpleStringProperty(this, "label2", "Missing Label");
   private StringProperty GWR = new SimpleStringProperty(this, "defaultValue", "");
   private IntegerProperty GWS = new SimpleIntegerProperty(this, "maxLength", 2147483647);
   protected BooleanProperty QVN = new SimpleBooleanProperty(this, "doTrim", true);
   private BooleanProperty GWT = new SimpleBooleanProperty(this, "allowNegative", true);
   private BooleanProperty QVO = new SimpleBooleanProperty(this, "allowOnlyNegative", false);
   private IntegerProperty GWU = new SimpleIntegerProperty(this, "minimumFractionDigits", 2);
   private IntegerProperty GWV = new SimpleIntegerProperty(this, "maximumFractionDigits", 2);
   private DoubleProperty GWW = new SimpleDoubleProperty(this, "minimumValue", -1.7976931348623157E308);
   private DoubleProperty GWX = new SimpleDoubleProperty(this, "maximumValue", 1.7976931348623157E308);

   public RequiredGridPane() {
   }

   public final boolean isRequired() {
      return this.GWO.getValue();
   }

   public final void setRequired(boolean var1) {
      this.GWO.setValue(var1);
   }

   public final BooleanProperty requiredProperty() {
      return this.GWO;
   }

   public final void setLabel(String var1) {
      this.GWP.set(var1);
   }

   public final String getLabel() {
      return this.GWP.getValue();
   }

   public final StringProperty labelProperty() {
      return this.GWP;
   }

   public final void setLabel2(String var1) {
      this.GWQ.set(var1);
   }

   public final String getLabel2() {
      return this.GWQ.getValue();
   }

   public final StringProperty IFU() {
      return this.GWQ;
   }

   public final void setDefaultValue(String var1) {
      this.GWR.set(var1);
   }

   public final String getDefaultValue() {
      return this.GWR.getValue();
   }

   public final StringProperty defaultValueProperty() {
      return this.GWR;
   }

   public final void setMaxLength(Integer var1) {
      this.GWS.set(var1);
   }

   public final Integer getMaxLength() {
      return this.GWS.getValue();
   }

   public final IntegerProperty maxLengthProperty() {
      return this.GWS;
   }

   public final boolean isDoTrim() {
      return this.QVN.getValue();
   }

   public final void setDoTrim(boolean var1) {
      this.QVN.setValue(var1);
   }

   public final BooleanProperty doTrimProperty() {
      return this.QVN;
   }

   public final boolean isAllowNegative() {
      return this.GWT.getValue();
   }

   public final void setAllowNegative(boolean var1) {
      this.GWT.setValue(var1);
   }

   public final BooleanProperty allowNegativeProperty() {
      return this.GWT;
   }

   public final boolean isAllowOnlyNegative() {
      return this.QVO.getValue();
   }

   public final void setAllowOnlyNegative(boolean var1) {
      this.QVO.setValue(var1);
   }

   public final BooleanProperty allowOnlyNegativeProperty() {
      return this.QVO;
   }

   public final int getMinimumFractionDigits() {
      return this.GWU.getValue();
   }

   public final void setMinimumFractionDigits(int var1) {
      this.GWU.setValue(var1);
   }

   public final IntegerProperty minimumFractionDigitsProperty() {
      return this.GWU;
   }

   public final int getMaximumFractionDigits() {
      return this.GWV.getValue();
   }

   public final void setMaximumFractionDigits(int var1) {
      this.GWV.setValue(var1);
   }

   public final IntegerProperty maximumFractionDigitsProperty() {
      return this.GWV;
   }

   public final double getMinimumValue() {
      return this.GWW.getValue();
   }

   public final void setMinimumValue(double var1) {
      this.GWW.setValue(var1);
   }

   public final DoubleProperty minimumValueProperty() {
      return this.GWW;
   }

   public final double getMaximumValue() {
      return this.GWX.getValue();
   }

   public final void setMaximumValue(double var1) {
      this.GWX.setValue(var1);
   }

   public final DoubleProperty maximumValueProperty() {
      return this.GWX;
   }
}
