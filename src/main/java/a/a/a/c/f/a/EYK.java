package a.a.a.c.f.a;

import a.a.a.c.f.c.a.RequiredGridPane;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class EYK<_PARENT extends RequiredGridPane, _CONTEXT extends EXV> extends EYI<_PARENT, _CONTEXT> {
   @FXML
   public Label fxml_component_label_element;
   @FXML
   public Label fxml_component_label_required_flag;

   public EYK() {
      this((String)null);
   }

   public EYK(String var1) {
      super(var1);
   }

   public void initialize() {
      super.initialize();
      ((EXV)this.fxml_component_main_element).promptTextProperty().unbindBidirectional(this.fxml_component_root_element.labelProperty());
      ((EXV)this.fxml_component_main_element).promptTextProperty().set("");
      this.fxml_component_label_element.textProperty().bind(this.fxml_component_root_element.labelProperty());
      if (this.fxml_component_label_required_flag != null) {
         this.fxml_component_label_required_flag.visibleProperty().bind(this.fxml_component_label_required_flag.managedProperty());
         this.fxml_component_label_required_flag.managedProperty().bind(this.GVI);
      }

   }
}
