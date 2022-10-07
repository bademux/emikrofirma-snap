package a.a.a.c.f.a.a;

import a.a.a.c.f.c.c.DatePickerRequired;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class EZD extends EYO {
   @FXML
   public Label fxml_component_label_element;
   @FXML
   public Label fxml_component_label_required_flag;

   public EZD() {
      this((String)null);
   }

   public EZD(String var1) {
      super(var1);
   }

   public void initialize() {
      super.initialize();
      ((DatePickerRequired)this.fxml_component_main_element).promptTextProperty().unbindBidirectional(this.fxml_component_root_element.labelProperty());
      ((DatePickerRequired)this.fxml_component_main_element).promptTextProperty().set("");
      this.fxml_component_label_element.textProperty().bind(this.fxml_component_root_element.labelProperty());
      if (this.fxml_component_label_required_flag != null) {
         this.fxml_component_label_required_flag.visibleProperty().bind(this.fxml_component_label_required_flag.managedProperty());
         this.fxml_component_label_required_flag.managedProperty().bind(this.GVI);
      }

   }
}
