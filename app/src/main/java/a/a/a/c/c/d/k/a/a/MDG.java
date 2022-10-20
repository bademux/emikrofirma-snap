package a.a.a.c.c.d.k.a.a;

import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.c.b.EMB;
import a.a.a.c.f.a.a.*;
import a.a.a.c.f.c.b.UserData;
import a.a.a.c.g.b.FCW;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class MDG {
    @FXML
    public EZQ fxml_include_nipOrPeselController;
    @FXML
    public EZF fxml_include_nipController;
    @FXML
    public EZJ fxml_include_peselController;
    @FXML
    public EYQ fxml_include_firstNameController;
    @FXML
    public EYQ fxml_include_lastNameController;
    @FXML
    public EZD fxml_include_birthDateController;
    @FXML
    public EZI fxml_include_taxAmountController;
    @FXML
    public MOV fxml_include_emailController;
    @FXML
    private Button fxml_button_save;
    @FXML
    private Button fxml_button_cancel;
    @FXML
    private Button fxml_button_info;
    private Stage MWE;
    Boolean MWF = false;

    public MDG() {
    }

    @FXML
    private void initialize() {

        this.fxml_include_nipController.fxml_component_main_element.IFC().bind(this.fxml_include_nipOrPeselController.fxml_component_main_element.selectedProperty().not());
        this.fxml_include_peselController.fxml_component_main_element.IFC().bind(this.fxml_include_nipOrPeselController.fxml_component_main_element.selectedProperty());
        this.fxml_include_nipController.fxml_component_main_element.disableProperty().bind(this.fxml_include_nipController.requiredProperty().not());
        this.fxml_include_peselController.fxml_component_main_element.disableProperty().bind(this.fxml_include_peselController.requiredProperty().not());
        Image var1 = new Image(MDG.class.getResourceAsStream("/img/info-20.png"));
        this.fxml_button_info.setGraphic(new ImageView(var1));
        final Tooltip var2 = new Tooltip(FCW.getInstance().getMessageForKey("micro.jpk.sendout.signature.method.kd.dialog.declarationTaxValue.tooltip"));
        this.fxml_button_info.setOnMouseEntered(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent var1) {
                var2.show(MDG.this.MWE);
            }
        });
        this.fxml_button_info.setOnMouseExited(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent var1) {
                var2.hide();
            }
        });
        this.fxml_button_save.disableProperty().bind(this.fxml_include_nipController.requiredAndValidProperty().or(this.fxml_include_nipController.fxml_component_main_element.disabledProperty()).and(this.fxml_include_peselController.requiredAndValidProperty().or(this.fxml_include_peselController.fxml_component_main_element.disabledProperty()).and(this.fxml_include_firstNameController.requiredAndValidProperty().and(this.fxml_include_lastNameController.requiredAndValidProperty().and(this.fxml_include_birthDateController.requiredAndValidProperty().and(this.fxml_include_taxAmountController.requiredAndValidProperty().and(this.fxml_include_emailController.requiredAndValidProperty())))))).not());
        this.fxml_include_peselController.fxml_component_main_element.focusedProperty().addListener(new MDH(this.fxml_include_peselController, this.fxml_include_birthDateController));

    }

    public void setupDefaults() {

        try {
            UserData var1 = EMB.getInstance().HHV();
            this.fxml_include_nipController.fxml_component_main_element.setText(var1.DFF().getValue());
            this.fxml_include_firstNameController.fxml_component_main_element.setText(var1.DFI().getValue());
            this.fxml_include_lastNameController.fxml_component_main_element.setText(var1.DFJ().getValue());
            this.fxml_include_emailController.fxml_component_main_element.setText(var1.DFL().getValue());
        } catch (FFK var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
        }

    }

    public void setDialogStage(Stage var1) {

        this.MWE = var1;

    }

    public Boolean getResult() {
        return this.MWF;
    }

    @FXML
    private void fxml_handleButton_save(ActionEvent var1) throws FFO, FFK {

        this.MWF = true;
        this.MWE.close();

    }

    @FXML
    private void fxml_handleButton_cancel(ActionEvent var1) {

        this.MWF = false;
        this.MWE.close();

    }
}
