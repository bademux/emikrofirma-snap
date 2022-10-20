package a.a.a.c.c.e.b.a;

import a.a.a.c.c.b.a.BaseFxController;
import a.a.a.c.c.d.d.EOQ;
import a.a.a.c.c.d.m.QKL;
import a.a.a.c.c.d.m.QKN;
import a.a.a.c.c.d.m.QKO;
import a.a.a.c.f.a.a.*;
import a.a.a.c.f.b.c.a.KK;
import a.a.a.c.f.b.c.a.KN;
import a.a.a.c.f.c.b.LY;
import a.a.a.c.f.c.c.ComboBoxRequired;
import com.github.bademux.emk.app.FXApp;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.fxml.FXML;
import javafx.scene.control.ListCell;

public class ERV extends BaseFxController {
    public BooleanProperty GBK = new SimpleBooleanProperty(this, "changedPropertyHolder", false);
    public BooleanProperty GBL = new SimpleBooleanProperty(this, "requiredAndValidPropertyHolder", false);
    @FXML
    public EZF fxml_include_nip_boxController;
    @FXML
    public EZN fxml_include_regon_boxController;
    @FXML
    public EYQ fxml_include_companyName_boxController;
    @FXML
    public EYQ fxml_include_firstName_boxController;
    @FXML
    public EYQ fxml_include_surname_boxController;
    @FXML
    public EYY fxml_include_logoImg_boxController;
    @FXML
    public EYN<KN> fxml_include_address_boxController;
    @FXML
    public EYM fxml_include_accountNumber_boxController;
    @FXML
    public EZP<KK> fxml_include_taxOffice_boxController;

    public ERV(FXApp var1, String var2) {
        super(var1, var2);
    }

    public void initialize() {

        this.GBK.bind(this.fxml_include_nip_boxController.changedProperty().or(this.fxml_include_regon_boxController.changedProperty().or(this.fxml_include_companyName_boxController.changedProperty().or(this.fxml_include_firstName_boxController.changedProperty().or(this.fxml_include_surname_boxController.changedProperty().or(this.fxml_include_logoImg_boxController.changedProperty().or(this.fxml_include_address_boxController.changedProperty().or(this.fxml_include_accountNumber_boxController.changedProperty().or(this.fxml_include_taxOffice_boxController.changedProperty())))))))));
        this.GBL.bind(this.fxml_include_nip_boxController.requiredAndValidProperty().and(this.fxml_include_regon_boxController.requiredAndValidProperty().and(this.fxml_include_companyName_boxController.requiredAndValidProperty().and(this.fxml_include_firstName_boxController.requiredAndValidProperty().and(this.fxml_include_surname_boxController.requiredAndValidProperty().and(this.fxml_include_logoImg_boxController.requiredAndValidProperty().and(this.fxml_include_address_boxController.requiredAndValidProperty().and(this.fxml_include_accountNumber_boxController.requiredAndValidProperty().and(this.fxml_include_taxOffice_boxController.requiredAndValidProperty())))))))));
        this.fxml_include_nip_boxController.fxml_component_main_element.editableProperty().set(false);
        this.fxml_include_address_boxController.fxml_include_Voivodeship_boxController.fxml_component_main_element.setCellFactory(new EOQ());
        this.fxml_include_address_boxController.fxml_include_Voivodeship_boxController.fxml_component_main_element.setButtonCell((ListCell) ((ComboBoxRequired) this.fxml_include_address_boxController.fxml_include_Voivodeship_boxController.fxml_component_main_element).getCellFactory().call(null));
        ((ComboBoxRequired) this.fxml_include_address_boxController.fxml_include_Voivodeship_boxController.fxml_component_main_element).getItems().addAll(KN.values());
        this.fxml_include_taxOffice_boxController.fxml_component_main_element.setConverter(new QKL(this.fxml_include_taxOffice_boxController.fxml_component_main_element));
        ((ComboBoxRequired) this.fxml_include_taxOffice_boxController.fxml_component_main_element).getItems().addAll(KK.DEN());
        this.fxml_include_taxOffice_boxController.fxml_component_main_element.editableProperty().set(true);
        this.fxml_include_taxOffice_boxController.fxml_component_main_element.setOnKeyReleased(new QKN());
        this.fxml_include_taxOffice_boxController.fxml_component_main_element.showingProperty().addListener(new QKO(this.fxml_include_taxOffice_boxController.fxml_component_main_element));
        this.fxml_include_address_boxController.fxml_include_CountryCode_boxController.fxml_component_main_element.setEditable(false);
        this.fxml_include_accountNumber_boxController.QOD(this.resources.getString("micro.types.accountNumber.Tooltip"));
        this.fxml_include_address_boxController.fxml_include_telephone_boxController.QOE(this.resources.getString("micro.types.phone.Tooltip"));

    }

    public void HSO(LY var1) {

        if (var1 != null) {
            this.fxml_include_nip_boxController.fxml_component_main_element.textProperty().bindBidirectional(var1.DFF().DDG());
            this.fxml_include_regon_boxController.fxml_component_main_element.textProperty().bindBidirectional(var1.DFG().DDG());
            this.fxml_include_companyName_boxController.fxml_component_main_element.textProperty().bindBidirectional(var1.DFH().DDG());
            this.fxml_include_firstName_boxController.fxml_component_main_element.textProperty().bindBidirectional(var1.DFI().DDG());
            this.fxml_include_surname_boxController.fxml_component_main_element.textProperty().bindBidirectional(var1.DFJ().DDG());
            this.fxml_include_logoImg_boxController.fxml_component_main_element.imageProperty().bindBidirectional(var1.DFM().DDU());
            this.fxml_include_address_boxController.fxml_include_CountryCode_boxController.fxml_component_main_element.textProperty().bindBidirectional(var1.DFN().DCV().DDG());
            ((ComboBoxRequired) this.fxml_include_address_boxController.fxml_include_Voivodeship_boxController.fxml_component_main_element).valueProperty().bindBidirectional(var1.DFN().DCW().DEI());
            this.fxml_include_address_boxController.fxml_include_District_boxController.fxml_component_main_element.textProperty().bindBidirectional(var1.DFN().DCX().DDG());
            this.fxml_include_address_boxController.fxml_include_Community_boxController.fxml_component_main_element.textProperty().bindBidirectional(var1.DFN().DCY().DDG());
            this.fxml_include_address_boxController.fxml_include_City_boxController.fxml_component_main_element.textProperty().bindBidirectional(var1.DFN().DCZ().DDG());
            this.fxml_include_address_boxController.fxml_include_Street_boxController.fxml_component_main_element.textProperty().bindBidirectional(var1.DFN().DDA().DDG());
            this.fxml_include_address_boxController.fxml_include_HouseNumber_boxController.fxml_component_main_element.textProperty().bindBidirectional(var1.DFN().DDB().DDG());
            this.fxml_include_address_boxController.fxml_include_ApartmentNumber_boxController.fxml_component_main_element.textProperty().bindBidirectional(var1.DFN().DDC().DDG());
            this.fxml_include_address_boxController.fxml_include_PostalCode_boxController.fxml_component_main_element.textProperty().bindBidirectional(var1.DFN().DDD().DDG());
            this.fxml_include_address_boxController.fxml_include_PostOffice_boxController.fxml_component_main_element.textProperty().bindBidirectional(var1.DFN().DDE().DDG());
            this.fxml_include_address_boxController.fxml_include_telephone_boxController.fxml_component_main_element.textProperty().bindBidirectional(var1.DFK().DDG());
            this.fxml_include_address_boxController.fxml_include_email_boxController.fxml_component_main_element.textProperty().bindBidirectional(var1.DFL().DDG());
            this.fxml_include_accountNumber_boxController.fxml_component_main_element.textProperty().bindBidirectional(var1.DFO().DDG());
            ((ComboBoxRequired) this.fxml_include_taxOffice_boxController.fxml_component_main_element).valueProperty().bindBidirectional(var1.DFQ().DEI());
            ((ComboBoxRequired) this.fxml_include_address_boxController.fxml_include_Voivodeship_boxController.fxml_component_main_element).getSelectionModel().select(var1.DFN().DCW().getValue());
            ((ComboBoxRequired) this.fxml_include_taxOffice_boxController.fxml_component_main_element).getSelectionModel().select(var1.DFQ().getValue());
            this.HSQ();
        }

    }

    public void HSP(LY var1) {

        if (var1 != null) {
            this.fxml_include_nip_boxController.fxml_component_main_element.textProperty().unbindBidirectional(var1.DFF().DDG());
            this.fxml_include_regon_boxController.fxml_component_main_element.textProperty().unbindBidirectional(var1.DFG().DDG());
            this.fxml_include_companyName_boxController.fxml_component_main_element.textProperty().unbindBidirectional(var1.DFH().DDG());
            this.fxml_include_firstName_boxController.fxml_component_main_element.textProperty().unbindBidirectional(var1.DFI().DDG());
            this.fxml_include_surname_boxController.fxml_component_main_element.textProperty().unbindBidirectional(var1.DFJ().DDG());
            this.fxml_include_logoImg_boxController.fxml_component_main_element.imageProperty().unbindBidirectional(var1.DFM().DDU());
            this.fxml_include_address_boxController.fxml_include_CountryCode_boxController.fxml_component_main_element.textProperty().unbindBidirectional(var1.DFN().DCV().DDG());
            ((ComboBoxRequired) this.fxml_include_address_boxController.fxml_include_Voivodeship_boxController.fxml_component_main_element).valueProperty().unbindBidirectional(var1.DFN().DCW().DEI());
            ((ComboBoxRequired) this.fxml_include_address_boxController.fxml_include_Voivodeship_boxController.fxml_component_main_element).getSelectionModel().clearSelection();
            this.fxml_include_address_boxController.fxml_include_District_boxController.fxml_component_main_element.textProperty().unbindBidirectional(var1.DFN().DCX().DDG());
            this.fxml_include_address_boxController.fxml_include_Community_boxController.fxml_component_main_element.textProperty().unbindBidirectional(var1.DFN().DCY().DDG());
            this.fxml_include_address_boxController.fxml_include_City_boxController.fxml_component_main_element.textProperty().unbindBidirectional(var1.DFN().DCZ().DDG());
            this.fxml_include_address_boxController.fxml_include_Street_boxController.fxml_component_main_element.textProperty().unbindBidirectional(var1.DFN().DDA().DDG());
            this.fxml_include_address_boxController.fxml_include_HouseNumber_boxController.fxml_component_main_element.textProperty().unbindBidirectional(var1.DFN().DDB().DDG());
            this.fxml_include_address_boxController.fxml_include_ApartmentNumber_boxController.fxml_component_main_element.textProperty().unbindBidirectional(var1.DFN().DDC().DDG());
            this.fxml_include_address_boxController.fxml_include_PostalCode_boxController.fxml_component_main_element.textProperty().unbindBidirectional(var1.DFN().DDD().DDG());
            this.fxml_include_address_boxController.fxml_include_PostOffice_boxController.fxml_component_main_element.textProperty().unbindBidirectional(var1.DFN().DDE().DDG());
            this.fxml_include_address_boxController.fxml_include_telephone_boxController.fxml_component_main_element.textProperty().unbindBidirectional(var1.DFK().DDG());
            this.fxml_include_address_boxController.fxml_include_email_boxController.fxml_component_main_element.textProperty().unbindBidirectional(var1.DFL().DDG());
            this.fxml_include_accountNumber_boxController.fxml_component_main_element.textProperty().unbindBidirectional(var1.DFO().DDG());
            ((ComboBoxRequired) this.fxml_include_taxOffice_boxController.fxml_component_main_element).valueProperty().unbindBidirectional(var1.DFQ().DEI());
            ((ComboBoxRequired) this.fxml_include_taxOffice_boxController.fxml_component_main_element).getSelectionModel().clearSelection();
        }

    }

    private void HSQ() {
        this.fxml_include_nip_boxController.clearChangedProperty();
        this.fxml_include_regon_boxController.clearChangedProperty();
        this.fxml_include_companyName_boxController.clearChangedProperty();
        this.fxml_include_firstName_boxController.clearChangedProperty();
        this.fxml_include_surname_boxController.clearChangedProperty();
        this.fxml_include_logoImg_boxController.clearChangedProperty();
        this.fxml_include_address_boxController.clearChangedProperty();
        this.fxml_include_accountNumber_boxController.clearChangedProperty();
        this.fxml_include_taxOffice_boxController.clearChangedProperty();
    }

    public boolean HHB() {

        boolean var1;
        var1 = true;

        return var1;
    }

    public void HHC() {

    }
}
