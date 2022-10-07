package a.a.a.c.f.a.a;

import a.a.a.c.f.a.EYC;
import a.a.a.c.f.c.a.RequiredGridPane;
import a.a.a.c.f.c.c.TextFieldValidated_Number;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class QRU extends EYC<RequiredGridPane, TextFieldValidated_Number> {
   private Tooltip QVL;
   @FXML
   public Button fxml_component_button_info;

   public QRU() {
      this((String)null);
   }

   public QRU(String var1) {
      super(var1);
   }

   public void initialize() {
      super.initialize();
      this.fxml_component_button_info.managedProperty().bind(this.fxml_component_button_info.visibleProperty());
      Image var1 = new Image(EYM.class.getResourceAsStream("/img/info-20.png"));
      this.fxml_component_button_info.setGraphic(new ImageView(var1));
      this.QVL = new Tooltip("");
      this.fxml_component_button_info.setOnMouseEntered(new EventHandler<MouseEvent>() {
         public void handle(MouseEvent var1) {
            Node var2 = (Node)var1.getSource();
            QRU.this.QVL.show(var2, var1.getScreenX() + 20.0, var1.getScreenY() + 20.0);
         }
      });
      this.fxml_component_button_info.setOnMouseExited(new EventHandler<MouseEvent>() {
         public void handle(MouseEvent var1) {
            QRU.this.QVL.hide();
         }
      });
      this.fxml_component_button_info.setVisible(false);
   }

   public void RHQ(String var1) {
      this.QVL = new Tooltip(var1);
      this.fxml_component_button_info.setVisible(true);
   }
}
