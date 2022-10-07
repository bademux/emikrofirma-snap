package a.a.a.c.f.a.a;

import a.a.a.c.f.a.EXS;
import a.a.a.c.f.c.a.RequiredGridPane;
import a.a.a.c.f.c.c.CheckBoxChanged;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class EZQ extends EXS {
   @FXML
   public RequiredGridPane fxml_component_root_element;
   @FXML
   public Label fxml_component_label_element;
   @FXML
   public CheckBoxChanged fxml_component_main_element;

   public EZQ() {
      this((String)null);
   }

   public EZQ(String var1) {
      super(var1);
   }

   public void initialize() {
      this.fxml_component_label_element.textProperty().bind(this.fxml_component_root_element.labelProperty());
      this.GVH.bind(this.fxml_component_main_element.changedProperty());
   }

   public void clearChangedProperty() {
      this.fxml_component_main_element.changedProperty().set(false);
   }
}
