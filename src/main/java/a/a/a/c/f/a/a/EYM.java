package a.a.a.c.f.a.a;

import a.a.a.c.f.a.EYK;
import a.a.a.c.f.c.a.RequiredGridPane;
import a.a.a.c.f.c.c.TextFieldValidated_AccountNumber;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class EYM extends EYK<RequiredGridPane, TextFieldValidated_AccountNumber> {
    private Tooltip QKY;
    @FXML
    public Button fxml_component_button_info;

    public EYM() {
        this(null);
    }

    public EYM(String var1) {
        super(var1);
    }

    public void initialize() {
        super.initialize();
        this.fxml_component_button_info.managedProperty().bind(this.fxml_component_button_info.visibleProperty());
        Image var1 = new Image(EYM.class.getResourceAsStream("/img/info-20.png"));
        this.fxml_component_button_info.setGraphic(new ImageView(var1));
        this.QKY = new Tooltip("");
        this.fxml_component_button_info.setOnMouseEntered(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent var1) {
                Node var2 = (Node) var1.getSource();
                EYM.this.QKY.show(var2, var1.getScreenX() + 20.0, var1.getScreenY() + 20.0);
            }
        });
        this.fxml_component_button_info.setOnMouseExited(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent var1) {
                EYM.this.QKY.hide();
            }
        });
        this.fxml_component_button_info.setVisible(false);
    }

    public void QOD(String var1) {
        this.QKY = new Tooltip(var1);
        this.fxml_component_button_info.setVisible(true);
    }
}
