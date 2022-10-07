package a.a.a.c.f.a;

import a.a.a.c.f.c.a.RequiredGridPane;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class EXZ<_TYPE, _PARENT extends RequiredGridPane, _CONTEXT extends EXW<_TYPE>> extends EYD<_TYPE, _PARENT, _CONTEXT> {
   @FXML
   public Label fxml_component_label_element;

   public EXZ() {
      this((String)null);
   }

   public EXZ(String var1) {
      super(var1);
   }

   public void initialize() {
      super.initialize();
      ((EXW)this.fxml_component_main_element).promptTextProperty().unbindBidirectional(this.fxml_component_root_element.labelProperty());
      ((EXW)this.fxml_component_main_element).promptTextProperty().set("");
      this.fxml_component_label_element.textProperty().bind(this.fxml_component_root_element.labelProperty());
   }
}
