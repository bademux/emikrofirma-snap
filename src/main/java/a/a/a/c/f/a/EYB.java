package a.a.a.c.f.a;

import a.a.a.c.f.c.a.RequiredGridPane;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class EYB<_PARENT extends RequiredGridPane, _CONTEXT extends EYF> extends EYH<_PARENT, _CONTEXT> {
   @FXML
   public Text fxml_component_validation_element;
   @FXML
   public Text fxml_component_validation_element_external;
   @FXML
   public Text fxml_component_warning_element;
   protected BooleanProperty GVO = new SimpleBooleanProperty(this, "valid", false);
   protected BooleanProperty GVP = new SimpleBooleanProperty(this, "validExternal", true);
   protected BooleanProperty GVQ = new SimpleBooleanProperty(this, "validationWhenDisabled", false);

   public EYB(String var1) {
      super(var1);
   }

   public final boolean isValid() {
      return this.GVO.getValue();
   }

   public final void setValid(boolean var1) {
      this.GVO.setValue(var1);
   }

   public final BooleanProperty validProperty() {
      return this.GVO;
   }

   public final boolean isValidExternal() {
      return this.GVP.getValue();
   }

   public final void setValidExternal(boolean var1) {
      this.GVP.setValue(var1);
   }

   public final BooleanProperty validExternalProperty() {
      return this.GVP;
   }

   public final boolean isValidationWhenDisabled() {
      return this.GVQ.getValue();
   }

   public final void setValidationWhenDisabled(boolean var1) {
      this.GVO.setValue(var1);
   }

   public final BooleanProperty validationWhenDisabledProperty() {
      return this.GVQ;
   }

   public void initialize() {
      super.initialize();
      this.GVO.bind(((EYF)this.fxml_component_main_element).IEU());
      this.GVP.bind(((EYF)this.fxml_component_main_element).IEW());
      if (this.fxml_component_validation_element != null) {
         this.fxml_component_validation_element.managedProperty().bindBidirectional(this.fxml_component_validation_element.visibleProperty());
         this.fxml_component_validation_element.managedProperty().bind(((EYF)this.fxml_component_main_element).disableProperty().not().or(this.GVQ).and(((EYF)this.fxml_component_main_element).IEU().not().and(((EYF)this.fxml_component_main_element).IFA())));
      }

      if (this.fxml_component_validation_element_external != null) {
         this.fxml_component_validation_element_external.managedProperty().bindBidirectional(this.fxml_component_validation_element_external.visibleProperty());
         this.fxml_component_validation_element_external.managedProperty().bind(((EYF)this.fxml_component_main_element).disableProperty().not().or(this.GVQ).and(((EYF)this.fxml_component_main_element).IEU().and(((EYF)this.fxml_component_main_element).IEW().not().and(((EYF)this.fxml_component_main_element).IFA()))));
      }

      if (this.fxml_component_warning_element != null) {
         this.fxml_component_warning_element.managedProperty().bindBidirectional(this.fxml_component_warning_element.visibleProperty());
         this.fxml_component_warning_element.managedProperty().bind(((EYF)this.fxml_component_main_element).disableProperty().not().or(this.GVQ).and(((EYF)this.fxml_component_main_element).IEU().and(((EYF)this.fxml_component_main_element).IEW().and(((EYF)this.fxml_component_main_element).IEY()))));
      }

   }

   public void clearValidProperty() {
      ((EYF)this.fxml_component_main_element).IEU().set(true);
      ((EYF)this.fxml_component_main_element).IEW().set(true);
      ((EYF)this.fxml_component_main_element).IEY().set(false);
   }
}
