package a.a.a.c.c.e.r.a;

import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.c.d.d.EOQ;
import a.a.a.c.f.a.a.EZI;
import a.a.a.c.f.a.a.EZP;
import a.a.a.c.f.a.n.QSQ;
import a.a.a.c.f.b.c.a.KL;
import a.a.a.c.f.c.c.ComboBoxRequired;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.stage.Stage;

import java.util.ResourceBundle;

public class QUO {
    @FXML
    public Button fxml_button_save;
    @FXML
    public Button fxml_button_cancel;
    boolean REK = false;
    private Stage REL;
    private ResourceBundle REM;
    private QSQ REN;
    @FXML
    public EZI fxml_other_sale_new_add_other_element_netController;
    @FXML
    public EZI fxml_other_sale_new_add_other_element_taxController;
    @FXML
    public EZP<KL> fxml_other_sale_new_add_other_element_tax_typeController;

    public QUO() {
    }

    public void RNW() {

        switch (this.REN) {
            case SELL_REASON_1:
            case SELL_REASON_2:
                this.fxml_other_sale_new_add_other_element_netController.fxml_component_root_element.setRequired(true);
                this.fxml_other_sale_new_add_other_element_taxController.fxml_component_root_element.setRequired(false);
                this.fxml_other_sale_new_add_other_element_tax_typeController.fxml_component_root_element.setRequired(true);
                this.fxml_other_sale_new_add_other_element_netController.fxml_component_main_element.setDisable(false);
                this.fxml_other_sale_new_add_other_element_taxController.fxml_component_root_element.setManaged(false);
                this.fxml_other_sale_new_add_other_element_taxController.fxml_component_root_element.setVisible(false);
                this.fxml_other_sale_new_add_other_element_tax_typeController.fxml_component_main_element.setDisable(false);
                ((ComboBoxRequired) this.fxml_other_sale_new_add_other_element_tax_typeController.fxml_component_main_element).getItems().add(KL.RATE_23);
                ((ComboBoxRequired) this.fxml_other_sale_new_add_other_element_tax_typeController.fxml_component_main_element).getItems().add(KL.RATE_8);
                ((ComboBoxRequired) this.fxml_other_sale_new_add_other_element_tax_typeController.fxml_component_main_element).getItems().add(KL.RATE_5);
                ((ComboBoxRequired) this.fxml_other_sale_new_add_other_element_tax_typeController.fxml_component_main_element).getItems().add(KL.RATE_4);
                if (QSQ.SELL_REASON_1.equals(this.REN)) {
                    this.fxml_other_sale_new_add_other_element_netController.fxml_component_root_element.setAllowNegative(true);
                    this.fxml_other_sale_new_add_other_element_netController.fxml_component_root_element.setAllowOnlyNegative(true);
                    this.fxml_other_sale_new_add_other_element_netController.setNegativeOnlyMessage();
                } else if (QSQ.SELL_REASON_2.equals(this.REN)) {
                    this.fxml_other_sale_new_add_other_element_netController.fxml_component_root_element.setAllowNegative(false);
                    this.fxml_other_sale_new_add_other_element_netController.fxml_component_root_element.setAllowOnlyNegative(false);
                    this.fxml_other_sale_new_add_other_element_netController.setPositiveOnlyMessage();
                }
                break;
            case SELL_REASON_3:
            case SELL_REASON_4:
                this.fxml_other_sale_new_add_other_element_netController.fxml_component_root_element.setRequired(false);
                this.fxml_other_sale_new_add_other_element_taxController.fxml_component_root_element.setRequired(true);
                this.fxml_other_sale_new_add_other_element_tax_typeController.fxml_component_root_element.setRequired(false);
                this.fxml_other_sale_new_add_other_element_netController.fxml_component_root_element.setVisible(false);
                this.fxml_other_sale_new_add_other_element_netController.fxml_component_root_element.setManaged(false);
                this.fxml_other_sale_new_add_other_element_netController.fxml_component_main_element.setDisable(true);
                this.fxml_other_sale_new_add_other_element_taxController.fxml_component_main_element.setDisable(false);
                this.fxml_other_sale_new_add_other_element_tax_typeController.fxml_component_root_element.setVisible(false);
                this.fxml_other_sale_new_add_other_element_tax_typeController.fxml_component_root_element.setManaged(false);
                break;
            default:
                throw new FFI("Unknown type");
        }

    }

    @FXML
    private void initialize() {
        this.fxml_button_save.disableProperty().bind(this.fxml_other_sale_new_add_other_element_netController.requiredAndValidProperty().and(this.fxml_other_sale_new_add_other_element_taxController.requiredAndValidProperty().and(this.fxml_other_sale_new_add_other_element_tax_typeController.requiredAndValidProperty())).not());
        this.fxml_other_sale_new_add_other_element_tax_typeController.fxml_component_main_element.setCellFactory(new EOQ());
        this.fxml_other_sale_new_add_other_element_tax_typeController.fxml_component_main_element.setButtonCell((ListCell) ((ComboBoxRequired) this.fxml_other_sale_new_add_other_element_tax_typeController.fxml_component_main_element).getCellFactory().call(null));
        this.fxml_other_sale_new_add_other_element_netController.fxml_component_validation_element.setText("");
    }

    public void setDialogStage(Stage var1) {
        this.REL = var1;
    }

    public Stage getDialogStage() {
        return this.REL;
    }

    public void setOtherType(QSQ var1) {
        this.REN = var1;
    }

    public void setResources(ResourceBundle var1) {
        this.REM = var1;
    }

    public void setDefault() {

    }

    @FXML
    public void fxml_handleButton_save(ActionEvent var1) throws FFO, FFK {
        this.REK = true;
        this.REL.close();
    }

    @FXML
    public void fxml_handleButton_cancel(ActionEvent var1) {
        this.REL.close();
    }

    public boolean RNX() {
        return this.REK;
    }
}
