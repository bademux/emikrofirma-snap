package a.a.a.c.f.d;

import a.a.a.c.f.b.QST;
import a.a.a.c.f.c.c.ComboBoxRequiredText;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;

public class FCM implements EventHandler<KeyEvent> {
   private FCL<?> HAV;
   private int HAW;
   private String HAX;

   public FCM(FCL<?> var1) {
      this.HAV = var1;
   }

   public void handle(KeyEvent var1) {
      switch (var1.getCode()) {
         default:
            switch (var1.getCode()) {
               case UP:
               case DOWN:
                  if (((ComboBoxRequiredText)this.HAV.fxml_component_main_element).getSelectionModel().getSelectedIndex() != -1 || ((ComboBoxRequiredText)this.HAV.fxml_component_main_element).getSelectionModel().getSelectedIndex() != this.HAW) {
                     this.HAV.HAR = ((ComboBoxRequiredText)this.HAV.fxml_component_main_element).getEditor().getText();
                     if (this.HAW == 0) {
                        this.HAX = this.HAV.HAQ;
                     }

                     ((ComboBoxRequiredText)this.HAV.fxml_component_main_element).getEditor().setText(this.HAX);
                     if (this.HAX != null) {
                        ((ComboBoxRequiredText)this.HAV.fxml_component_main_element).getEditor().positionCaret(((ComboBoxRequiredText)this.HAV.fxml_component_main_element).getEditor().getText().length());
                     }

                     ((ComboBoxRequiredText)this.HAV.fxml_component_main_element).show();
                     this.HAV.IFQ();
                  }
                  break;
               case ENTER:
                  if (((ComboBoxRequiredText)this.HAV.fxml_component_main_element).getSelectionModel().getSelectedIndex() != -1 && !((QST)((ComboBoxRequiredText)this.HAV.fxml_component_main_element).getValue()).getShadow()) {
                     ((ComboBoxRequiredText)this.HAV.fxml_component_main_element).getEditor().setText(this.HAV.HAR);
                     this.HAV.IFQ();
                     this.HAV.IFR();
                  }
            }
         case ESCAPE:
         case SHIFT:
            this.HAW = ((ComboBoxRequiredText)this.HAV.fxml_component_main_element).getSelectionModel().getSelectedIndex();
      }
   }
}
