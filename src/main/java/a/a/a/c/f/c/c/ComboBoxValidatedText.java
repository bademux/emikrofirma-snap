package a.a.a.c.f.c.c;

import a.a.a.c.f.a.EYF;
import a.a.a.c.f.b.QST;
import javafx.beans.binding.BooleanBinding;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ComboBoxValidatedText<_T extends QST> extends ComboBoxChanged<_T> implements EYF {
   protected BooleanProperty QVU;
   protected BooleanProperty QVV;
   protected BooleanProperty QVW;

   public ComboBoxValidatedText() {
      this(FXCollections.observableArrayList());
   }

   public ComboBoxValidatedText(ObservableList<_T> var1) {
      super(var1);
      this.QVU = new SimpleBooleanProperty(this, "valid", false);
      this.QVV = new SimpleBooleanProperty(this, "validExternal", true);
      this.QVW = new SimpleBooleanProperty(this, "warning", false);
   }

   public final boolean IET() {
      return this.QVU.getValue();
   }

   public final void setValid(boolean var1) {
      this.QVU.setValue(var1);
   }

   public final BooleanProperty IEU() {
      return this.QVU;
   }

   public final boolean IEV() {
      return this.QVV.getValue();
   }

   public final void setValidExternal(boolean var1) {
      this.QVV.setValue(var1);
   }

   public final BooleanProperty IEW() {
      return this.QVV;
   }

   public final boolean IEX() {
      return this.QVW.getValue();
   }

   public final void setWarning(boolean var1) {
      this.QVW.setValue(var1);
   }

   public final BooleanProperty IEY() {
      return this.QVW;
   }

   public BooleanBinding IEZ() {
      return this.getEditor().textProperty().isNull().or(this.getEditor().textProperty().isEqualTo(""));
   }

   public BooleanBinding IFA() {
      return this.getEditor().textProperty().isNotNull().and(this.getEditor().textProperty().isNotEqualTo(""));
   }
}
