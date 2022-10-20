package a.a.a.c.c.e.p.a;

import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.c.d.d.EOQ;
import a.a.a.c.f.a.a.EZI;
import a.a.a.c.f.a.a.EZP;
import a.a.a.c.f.a.n.InvoiceOtherSubtype;
import a.a.a.c.f.b.c.a.TaxRate;
import a.a.a.c.f.c.c.ComboBoxRequired;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.stage.Stage;

public class QTX {
    @FXML
    public Button fxml_button_save;
    @FXML
    public Button fxml_button_cancel;
    @FXML
    public EZI fxml_other_purchase_new_add_other_element_netController;
    @FXML
    public EZI fxml_other_purchase_new_add_other_element_taxController;
    @FXML
    public EZP<TaxRate> fxml_other_purchase_new_add_other_element_tax_typeController;
    boolean RCK = false;
    private Stage RCL;
    private InvoiceOtherSubtype RCM;

    public QTX() {
    }

    public void RMM() {

        switch (this.RCM) {
            case PURCHASE_REASON_1:
                this.fxml_other_purchase_new_add_other_element_tax_typeController.fxml_component_root_element.setRequired(false);
                this.fxml_other_purchase_new_add_other_element_tax_typeController.fxml_component_root_element.setManaged(false);
                this.fxml_other_purchase_new_add_other_element_tax_typeController.fxml_component_root_element.setVisible(false);
                this.fxml_other_purchase_new_add_other_element_taxController.fxml_component_root_element.setRequired(true);
                this.fxml_other_purchase_new_add_other_element_taxController.fxml_component_root_element.setAllowNegative(true);
                this.fxml_other_purchase_new_add_other_element_taxController.fxml_component_root_element.setAllowOnlyNegative(true);
                this.fxml_other_purchase_new_add_other_element_taxController.setNegativeOnlyMessage();
                this.fxml_other_purchase_new_add_other_element_taxController.fxml_component_validation_element.setText("");
                this.fxml_other_purchase_new_add_other_element_netController.fxml_component_root_element.setRequired(false);
                this.fxml_other_purchase_new_add_other_element_netController.fxml_component_root_element.setManaged(false);
                this.fxml_other_purchase_new_add_other_element_netController.fxml_component_root_element.setVisible(false);
                break;
            case PURCHASE_REASON_2:
                this.fxml_other_purchase_new_add_other_element_tax_typeController.fxml_component_root_element.setRequired(false);
                this.fxml_other_purchase_new_add_other_element_tax_typeController.fxml_component_root_element.setManaged(false);
                this.fxml_other_purchase_new_add_other_element_tax_typeController.fxml_component_root_element.setVisible(false);
                this.fxml_other_purchase_new_add_other_element_taxController.fxml_component_root_element.setRequired(true);
                this.fxml_other_purchase_new_add_other_element_taxController.fxml_component_root_element.setAllowNegative(false);
                this.fxml_other_purchase_new_add_other_element_taxController.fxml_component_root_element.setAllowOnlyNegative(false);
                this.fxml_other_purchase_new_add_other_element_taxController.setPositiveOnlyMessage();
                this.fxml_other_purchase_new_add_other_element_taxController.fxml_component_validation_element.setText("");
                this.fxml_other_purchase_new_add_other_element_netController.fxml_component_root_element.setRequired(false);
                this.fxml_other_purchase_new_add_other_element_netController.fxml_component_root_element.setManaged(false);
                this.fxml_other_purchase_new_add_other_element_netController.fxml_component_root_element.setVisible(false);
                break;
            case PURCHASE_REASON_3:
            case PURCHASE_REASON_4:
                this.fxml_other_purchase_new_add_other_element_tax_typeController.fxml_component_root_element.setRequired(false);
                this.fxml_other_purchase_new_add_other_element_tax_typeController.fxml_component_root_element.setManaged(false);
                this.fxml_other_purchase_new_add_other_element_tax_typeController.fxml_component_root_element.setVisible(false);
                this.fxml_other_purchase_new_add_other_element_taxController.fxml_component_root_element.setRequired(true);
                this.fxml_other_purchase_new_add_other_element_taxController.fxml_component_root_element.setAllowNegative(true);
                this.fxml_other_purchase_new_add_other_element_taxController.fxml_component_root_element.setAllowOnlyNegative(false);
                this.fxml_other_purchase_new_add_other_element_taxController.fxml_component_validation_element.setText("");
                this.fxml_other_purchase_new_add_other_element_netController.fxml_component_root_element.setRequired(false);
                this.fxml_other_purchase_new_add_other_element_netController.fxml_component_root_element.setManaged(false);
                this.fxml_other_purchase_new_add_other_element_netController.fxml_component_root_element.setVisible(false);
                break;
            default:
                throw new FFI("Unknown type");
        }

    }

    @FXML
    private void initialize() {
        this.fxml_button_save.disableProperty().bind(this.fxml_other_purchase_new_add_other_element_netController.requiredAndValidProperty().and(this.fxml_other_purchase_new_add_other_element_taxController.requiredAndValidProperty()).and(this.fxml_other_purchase_new_add_other_element_tax_typeController.requiredAndValidProperty()).not());
        this.fxml_other_purchase_new_add_other_element_tax_typeController.fxml_component_main_element.setCellFactory(new EOQ());
        this.fxml_other_purchase_new_add_other_element_tax_typeController.fxml_component_main_element.setButtonCell((ListCell) ((ComboBoxRequired) this.fxml_other_purchase_new_add_other_element_tax_typeController.fxml_component_main_element).getCellFactory().call(null));
        this.fxml_other_purchase_new_add_other_element_netController.fxml_component_validation_element.setText("");
    }

    public void setDialogStage(Stage var1) {
        this.RCL = var1;
    }

    public Stage getDialogStage() {
        return this.RCL;
    }

    public void setOtherType(InvoiceOtherSubtype var1) {
        this.RCM = var1;
    }

    @FXML
    public void fxml_handleButton_save(ActionEvent var1) throws FFO, FFK {
        this.RCK = true;
        this.RCL.close();
    }

    @FXML
    public void fxml_handleButton_cancel(ActionEvent var1) {
        this.RCL.close();
    }

    public boolean RMN() {
        return this.RCK;
    }
}
