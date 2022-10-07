package a.a.a.c.f.a;

import a.a.a.c.f.c.a.RequiredGridPane;
import a.a.a.c.g.b.FCW;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

public class EXY<_PARENT extends RequiredGridPane, _CONTEXT extends EYE> extends EYC<_PARENT, _CONTEXT> {
   @FXML
   public Label fxml_component_label_element;
   @FXML
   public Text fxml_component_value_restriction_message;

   public EXY() {
      this((String)null);
   }

   public EXY(String var1) {
      super(var1);
   }

   public void initialize() {
      super.initialize();
      ((EYE)this.fxml_component_main_element).promptTextProperty().unbindBidirectional(this.fxml_component_root_element.labelProperty());
      ((EYE)this.fxml_component_main_element).promptTextProperty().set("");
      this.fxml_component_label_element.textProperty().bind(this.fxml_component_root_element.labelProperty());
      if (this.fxml_component_value_restriction_message != null) {
         this.fxml_component_value_restriction_message.setVisible(false);
      }

   }

   public void setPositiveOnlyMessage() {
      this.fxml_component_value_restriction_message.setVisible(true);
      this.fxml_component_value_restriction_message.setText(FCW.getInstance().getMessageForKey("micro.types.number.positive.number.only"));
   }

   public void setNegativeOnlyMessage() {
      this.fxml_component_value_restriction_message.setVisible(true);
      this.fxml_component_value_restriction_message.setText(FCW.getInstance().getMessageForKey("micro.types.number.negative.number.only"));
   }
}
