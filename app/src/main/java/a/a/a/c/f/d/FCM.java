package a.a.a.c.f.d;

import a.a.a.c.f.b.ObjectWithTitle;
import a.a.a.c.f.c.c.ComboBoxRequiredText;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;

public class FCM implements EventHandler<KeyEvent> {
    private final FCL<?> HAV;
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
                        if (((ComboBoxRequiredText) this.HAV.fxml_component_main_element).getSelectionModel().getSelectedIndex() != -1 || ((ComboBoxRequiredText) this.HAV.fxml_component_main_element).getSelectionModel().getSelectedIndex() != this.HAW) {
                            this.HAV.HAR = this.HAV.fxml_component_main_element.getEditor().getText();
                            if (this.HAW == 0) {
                                this.HAX = this.HAV.HAQ;
                            }

                            this.HAV.fxml_component_main_element.getEditor().setText(this.HAX);
                            if (this.HAX != null) {
                                this.HAV.fxml_component_main_element.getEditor().positionCaret(this.HAV.fxml_component_main_element.getEditor().getText().length());
                            }

                            this.HAV.fxml_component_main_element.show();
                            this.HAV.IFQ();
                        }
                        break;
                    case ENTER:
                        if (((ComboBoxRequiredText) this.HAV.fxml_component_main_element).getSelectionModel().getSelectedIndex() != -1 && !((ObjectWithTitle) ((ComboBoxRequiredText) this.HAV.fxml_component_main_element).getValue()).getShadow()) {
                            this.HAV.fxml_component_main_element.getEditor().setText(this.HAV.HAR);
                            this.HAV.IFQ();
                            this.HAV.IFR();
                        }
                }
            case ESCAPE:
            case SHIFT:
                this.HAW = ((ComboBoxRequiredText) this.HAV.fxml_component_main_element).getSelectionModel().getSelectedIndex();
        }
    }
}
