package a.a.a.c.c.e.k.a;

import a.a.a.c.c.d.d.ENX;
import a.a.a.c.d.e.EQY;
import a.a.a.c.f.a.a.EZI;
import a.a.a.c.f.a.a.EZP;
import a.a.a.c.f.a.f.a.IN;
import a.a.a.c.f.a.f.a.IP;
import a.a.a.c.f.b.c.JR;
import a.a.a.c.f.b.c.KQ;
import a.a.a.c.f.b.c.a.KL;
import a.a.a.c.f.c.c.ComboBoxRequired;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class EVA {
    @FXML
    private EZI fxml_item_netController;
    @FXML
    public EZP<KL> fxml_item_tax_rateController;
    @FXML
    private Button fxml_button_save;
    @FXML
    private Button fxml_button_cancel;
    private Stage stage;
    private IP GNL;
    private boolean GNM = false;

    public EVA() {
    }

    public void setDialogStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    private void initialize() {
        this.fxml_item_tax_rateController.fxml_component_main_element.getItems().addAll(IN.AMJ);
        this.fxml_item_tax_rateController.fxml_component_main_element.setConverter(new ENX());
        this.fxml_button_save.disableProperty().bind(Bindings.not(this.fxml_item_netController.validProperty()));
        this.fxml_item_tax_rateController.fxml_component_main_element.setValue(this.fxml_item_tax_rateController.fxml_component_main_element.getItems().get(0));
    }

    @FXML
    private void fxml_handleButton_save(ActionEvent var1) {

        this.GNL.setTaxRate(new KQ((KL) ((ComboBoxRequired) this.fxml_item_tax_rateController.fxml_component_main_element).getValue()));
        this.GNL.setNet(new JR(this.fxml_item_netController.fxml_component_main_element.getNumber()));
        this.GNL.setVat(new JR(EQY.getTaxValue(this.GNL.getNet().getValue(), this.GNL.getTaxRate().getValue())));
        this.GNM = true;
        this.stage.close();

    }

    @FXML
    private void fxml_handleButton_cancel(ActionEvent var1) {

        this.GNM = false;
        this.stage.close();

    }

    public IP getCashRegisterItem() {
        return this.GNL;
    }

    public void setRecordElementVat(IP var1) {
        this.GNL = var1;
    }

    public boolean HYI() {
        return this.GNM;
    }
}
