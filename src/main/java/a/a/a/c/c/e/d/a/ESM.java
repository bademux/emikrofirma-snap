package a.a.a.c.c.e.d.a;

import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.c.d.d.EOQ;
import a.a.a.c.c.d.d.h.QKK;
import a.a.a.c.c.d.f.EOV;
import a.a.a.c.c.e.d.c.ESX;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.a.*;
import a.a.a.c.f.b.c.a.KL;
import a.a.a.c.f.b.c.a.KM;
import a.a.a.c.f.c.c.ComboBoxRequired;
import a.a.a.c.f.c.c.TextFieldValidated_Text;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.stage.Stage;

import java.util.ResourceBundle;

public class ESM {
    private static final int GDN = 300;
    @FXML
    public EYZ fxml_include_itemNameRequiredTextBox_boxController;
    @FXML
    public EZI fxml_include_netUnitValueNumberBox_boxController;
    @FXML
    public EZI fxml_include_quantityNumberBox_boxController;
    @FXML
    public EYQ fxml_include_measurementUnitRequiredTextBox_boxController;
    @FXML
    public EZP<KL> fxml_include_taxRateRequiredComboBox_boxController;
    @FXML
    public EZQ fxml_include_deductHalfLabeledCheckBox_boxController;
    @FXML
    public EZP<KM> fxml_include_taxReasonRequiredComboBox_boxController;
    @FXML
    private Button fxml_button_save;
    @FXML
    private Button fxml_button_cancel;
    private String RAL;
    private Stage GDO;
    Boolean GDP = false;
    private EOV GDQ;

    public ESM() {
    }

    @FXML
    private void initialize() {
        EXF.getInstance().ICO();

        try {
            this.fxml_include_taxRateRequiredComboBox_boxController.fxml_component_main_element.setCellFactory(new EOQ());
            this.fxml_include_taxRateRequiredComboBox_boxController.fxml_component_main_element.setButtonCell((ListCell) ((ComboBoxRequired) this.fxml_include_taxRateRequiredComboBox_boxController.fxml_component_main_element).getCellFactory().call(null));
            ((ComboBoxRequired) this.fxml_include_taxRateRequiredComboBox_boxController.fxml_component_main_element).getItems().addAll(KL.values());
            this.fxml_include_itemNameRequiredTextBox_boxController.setValueMaxLength(300);
            this.fxml_include_taxReasonRequiredComboBox_boxController.fxml_component_main_element.setCellFactory(new EOQ());
            this.fxml_include_taxReasonRequiredComboBox_boxController.fxml_component_main_element.setButtonCell((ListCell) ((ComboBoxRequired) this.fxml_include_taxReasonRequiredComboBox_boxController.fxml_component_main_element).getCellFactory().call(null));
            ((ComboBoxRequired) this.fxml_include_taxReasonRequiredComboBox_boxController.fxml_component_main_element).getItems().addAll(KM.values());
            this.fxml_button_save.disableProperty().bind(this.fxml_include_itemNameRequiredTextBox_boxController.requiredAndValidProperty().and(this.fxml_include_netUnitValueNumberBox_boxController.requiredAndValidProperty().and(this.fxml_include_quantityNumberBox_boxController.requiredAndValidProperty().and(this.fxml_include_measurementUnitRequiredTextBox_boxController.requiredAndValidProperty().and(this.fxml_include_taxRateRequiredComboBox_boxController.requiredAndValidProperty().and(this.fxml_include_taxReasonRequiredComboBox_boxController.requiredAndValidProperty()))))).not());
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public void setupDefaults(ResourceBundle var1) {
        EXF.getInstance().ICO();

        try {
            ((ComboBoxRequired) this.fxml_include_taxRateRequiredComboBox_boxController.fxml_component_main_element).getSelectionModel().select(KL.RATE_23);
            ((ComboBoxRequired) this.fxml_include_taxReasonRequiredComboBox_boxController.fxml_component_main_element).getSelectionModel().select(KM.acquisition_of_general_goods);
            this.fxml_include_measurementUnitRequiredTextBox_boxController.fxml_component_main_element.setText(var1.getString("micro.process.invoice_purchase_addNewPosition.Quantity.DefaultUnit"));
            String var2 = this.RAL;
            this.fxml_include_netUnitValueNumberBox_boxController.fxml_component_root_element.setLabel(var1.getString("micro.process.invoice_purchase_addNewPosition.RegistryTable_UnitValue_" + var2));
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public void setDialogStage(Stage var1) {
        EXF.getInstance().ICO();

        try {
            this.GDO = var1;
            this.fxml_include_itemNameRequiredTextBox_boxController.setDialogStage(this.GDO);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public void setCalculationMethod(String var1) {
        this.RAL = var1;
    }

    public Boolean getResult() {
        return this.GDP;
    }

    @FXML
    private void fxml_handleButton_save(ActionEvent var1) throws FFO, FFK {
        EXF.getInstance().ICO();

        try {
            this.GDP = true;
            this.GDQ.HNS((String) ((ComboBoxRequired) this.fxml_include_itemNameRequiredTextBox_boxController.fxml_component_main_element).getValue());
            this.GDO.close();
        } finally {
            EXF.getInstance().ICP();
        }

    }

    @FXML
    private void fxml_handleButton_cancel(ActionEvent var1) {
        EXF.getInstance().ICO();

        try {
            this.GDP = false;
            this.GDO.close();
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public void setProductAutocomplete(ESX var1) {
        this.GDQ = new ESR(new ESS(var1), this);
        this.fxml_include_itemNameRequiredTextBox_boxController.fxml_component_main_element.setOnKeyReleased(new QKK(this.GDQ));
    }
}
