package a.a.a.c.f.a.a;

import a.a.a.c.f.a.EYK;
import a.a.a.c.f.c.a.RequiredGridPane;
import a.a.a.c.f.c.c.TextFieldValidated_Phone;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class EZH extends EYK<RequiredGridPane, TextFieldValidated_Phone> {
    private Tooltip QKZ;
    @FXML
    public Button fxml_component_button_info;

    public EZH() {
        this(null);
    }

    public EZH(String var1) {
        super(var1);
    }

    public void initialize() {
        super.initialize();
        this.fxml_component_button_info.managedProperty().bind(this.fxml_component_button_info.visibleProperty());
        Image var1 = new Image(EYM.class.getResourceAsStream("/img/info-20.png"));
        this.fxml_component_button_info.setGraphic(new ImageView(var1));
        this.QKZ = new Tooltip("");
        this.fxml_component_button_info.setOnMouseEntered(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent var1) {
                Node var2 = (Node) var1.getSource();
                EZH.this.QKZ.show(var2, var1.getScreenX() + 20.0, var1.getScreenY() + 20.0);
            }
        });
        this.fxml_component_button_info.setOnMouseExited(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent var1) {
                EZH.this.QKZ.hide();
            }
        });
        this.fxml_component_button_info.setVisible(false);
    }

    public void QOE(String var1) {
        this.QKZ = new Tooltip(var1);
        this.fxml_component_button_info.setVisible(true);
    }
}
