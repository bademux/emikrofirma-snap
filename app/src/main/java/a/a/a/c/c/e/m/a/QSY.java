package a.a.a.c.c.e.m.a;

import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.c.b.EMB;
import a.a.a.c.c.d.d.EOQ;
import a.a.a.c.f.a.a.EZI;
import a.a.a.c.f.a.a.EZP;
import a.a.a.c.f.a.a.EZQ;
import a.a.a.c.f.b.c.a.KM;
import a.a.a.c.f.c.a.LP;
import a.a.a.c.f.c.a.QJZ;
import a.a.a.c.f.c.c.ComboBoxRequired;
import a.a.a.c.g.FCQ;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.stage.Stage;

import java.util.ResourceBundle;

public class QSY {
    private static final int QZC = 300;
    @FXML
    public EZI fxml_include_netValueNumberBox_boxController;
    @FXML
    public EZI fxml_include_taxValueNumberBox_boxController;
    @FXML
    public EZQ fxml_include_deductHalfLabeledCheckBox_boxController;
    @FXML
    public EZP<KM> fxml_include_taxReasonRequiredComboBox_boxController;
    @FXML
    private Button fxml_button_save;
    @FXML
    private Button fxml_button_cancel;
    private Stage QZD;
    Boolean QZE = false;

    public QSY() {
    }

    @FXML
    private void initialize() {

        this.fxml_include_taxReasonRequiredComboBox_boxController.fxml_component_main_element.setCellFactory(new EOQ());
        this.fxml_include_taxReasonRequiredComboBox_boxController.fxml_component_main_element.setButtonCell((ListCell) ((ComboBoxRequired) this.fxml_include_taxReasonRequiredComboBox_boxController.fxml_component_main_element).getCellFactory().call(null));
        this.fxml_include_taxReasonRequiredComboBox_boxController.fxml_component_main_element.getItems().addAll(KM.values());
        this.fxml_button_save.disableProperty().bind(this.fxml_include_netValueNumberBox_boxController.requiredAndValidProperty().and(this.fxml_include_taxReasonRequiredComboBox_boxController.requiredAndValidProperty()).not());

    }

    public void setupDefaults(ResourceBundle var1) {

        ((ComboBoxRequired) this.fxml_include_taxReasonRequiredComboBox_boxController.fxml_component_main_element).getSelectionModel().select(KM.acquisition_of_general_goods);
        String var2 = null;

        try {
            LP var3 = EMB.getInstance().HHU();
            var2 = (String) var3.getConfigurationPropertyOrDefault(FCQ.CalculationMethod).DEY().getValue();
        } catch (FFK var7) {
            var2 = (String) QJZ.getDefaultConfigurationProperty(FCQ.CalculationMethod).DEY().getValue();
        }

        this.fxml_include_netValueNumberBox_boxController.fxml_component_root_element.setLabel(var1.getString("micro.process.aggregate_purchase_addNewPosition.RegistryTable_UnitValue_NET"));
        this.fxml_include_taxValueNumberBox_boxController.fxml_component_root_element.setLabel(var1.getString("micro.process.aggregate_purchase_addNewPosition.RegistryTable_UnitValue_TAX"));

    }

    public void setDialogStage(Stage var1) {

        this.QZD = var1;

    }

    public Boolean getResult() {
        return this.QZE;
    }

    @FXML
    private void fxml_handleButton_save(ActionEvent var1) throws FFO, FFK {

        this.QZE = true;
        this.QZD.close();

    }

    @FXML
    private void fxml_handleButton_cancel(ActionEvent var1) {

        this.QZE = false;
        this.QZD.close();

    }
}
