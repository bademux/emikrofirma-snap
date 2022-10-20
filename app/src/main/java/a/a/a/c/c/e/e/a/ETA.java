package a.a.a.c.c.e.e.a;

import a.a.a.b.c.FEN;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.c.a.a.ELU;
import a.a.a.c.c.b.EMC;
import a.a.a.c.c.b.a.b.a.EMP;
import a.a.a.c.c.b.a.b.a.EMR;
import a.a.a.c.c.b.b.EMT;
import a.a.a.c.c.e.e.c.ETE;
import a.a.a.c.f.a.c.HI;
import a.a.a.c.f.b.c.a.KN;
import a.a.a.c.f.c.c.ComboBoxRequired;
import a.a.a.c.g.a.FCR;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Collections;

public class ETA extends ELU<ETE> {
    @FXML
    private ScrollPane fxml_include_container;
    @FXML
    private ESZ fxml_include_ContactsListLogicController;
    @FXML
    private EMP fxml_include_left_barController;
    @FXML
    private EMR fxml_include_top_menuController;
    @FXML
    public Button fxml_generalbuttonEdit;
    @FXML
    public Button fxml_generalbuttonRemove;
    private ETE GFM;

    public ETA(EMC var1, EMT var2, String var3, String var4) {
        super(var1, var2, var3, var4);
    }

    public void HHE() throws FFK {

        super.HHE();
        this.fxml_include_top_menuController.fxml_top_menu.labelProperty().set(this.resources.getString("micro.process.contacts_list.menu.title"));
        this.fxml_generalbuttonEdit.disableProperty().bind(this.fxml_include_ContactsListLogicController.fxml_contractorsTable.getSelectionModel().selectedItemProperty().isNull());
        this.fxml_generalbuttonRemove.disableProperty().bind(this.fxml_include_ContactsListLogicController.fxml_contractorsTable.getSelectionModel().selectedItemProperty().isNull());
        this.fxml_include_ContactsListLogicController.setProcessController_ContactsList(this);

    }

    public boolean HHB() {
        this.fxml_include_ContactsListLogicController.HHB();
        this.fxml_include_left_barController.HHB();
        this.fxml_include_top_menuController.HHB();
        return true;
    }

    public void HHC() {

        this.fxml_include_container.setVvalue(0.0);
        this.fxml_include_ContactsListLogicController.HHC();
        this.fxml_include_left_barController.HHC();
        this.fxml_include_top_menuController.HHC();
        this.fxml_parent.requestFocus();

    }

    public void initialize() {

    }

    @FXML
    protected void fxml_handleButton_generalButtonEdit(ActionEvent var1) {

        try {
            org.slf4j.LoggerFactory.getLogger(getClass()).info("Button [edit] clicked");
            FXMLLoader var2 = new FXMLLoader();
            var2.setLocation(ESZ.class.getResource("/fxml/new_contact.fxml"));
            var2.setResources(this.resources);
            AnchorPane var3 = var2.load();
            Stage var4 = new Stage();
            var4.setTitle(this.resources.getString("micro.process.contacts_new.NewContact"));
            var4.initModality(Modality.WINDOW_MODAL);
            var4.initOwner(this.FGW);
            Scene var5 = new Scene(var3);
            var4.setScene(var5);
            var4.setResizable(false);
            var4.getIcons().add(new Image("/img/app/e_logo.png"));
            ETB var6 = var2.getController();
            var6.setDialogStage(var4);
            HI var7 = this.fxml_include_ContactsListLogicController.fxml_contractorsTable.getSelectionModel().getSelectedItem();
            var6.setContractor(var7);
            var6.setImplementation(this.getImplementation());
            var6.setProcessController_ContactsList(this);
            var6.HUJ();
            var4.showAndWait();
            var6.HUK();
            if (var6.HUO()) {
                var7.setPrivtePerson(var6.fxml_contractor_private_person.isSelected());
                var7.DAI().setValue(var6.fxml_include_ContractorName_boxController.fxml_component_main_element.getText());
                var7.DAJ().setValue(var6.fxml_include_nip_boxController.fxml_component_main_element.getText());
                var7.DAK().setValue(var6.fxml_include_regon_boxController.fxml_component_main_element.getText());
                var7.DAL().setValue(var6.fxml_include_AccountNumber_boxController.fxml_component_main_element.getText());
                var7.DAM().DDA().setValue(var6.fxml_include_address_boxController.fxml_include_Street_boxController.fxml_component_main_element.getText());
                var7.DAM().DDB().setValue(var6.fxml_include_address_boxController.fxml_include_HouseNumber_boxController.fxml_component_main_element.getText());
                var7.DAM().DDC().setValue(var6.fxml_include_address_boxController.fxml_include_ApartmentNumber_boxController.fxml_component_main_element.getText());
                var7.DAM().DDD().setValue(var6.fxml_include_address_boxController.fxml_include_PostalCode_boxController.fxml_component_main_element.getText());
                var7.DAM().DCZ().setValue(var6.fxml_include_address_boxController.fxml_include_City_boxController.fxml_component_main_element.getText());
                var7.DAM().DDE().setValue(var6.fxml_include_address_boxController.fxml_include_PostOffice_boxController.fxml_component_main_element.getText());
                var7.DAM().DCX().setValue(var6.fxml_include_address_boxController.fxml_include_District_boxController.fxml_component_main_element.getText());
                var7.DAM().DCY().setValue(var6.fxml_include_address_boxController.fxml_include_Community_boxController.fxml_component_main_element.getText());
                var7.DAM().DCV().setValue(var6.fxml_include_address_boxController.fxml_include_CountryCode_boxController.fxml_component_main_element.getText());
                var7.DAM().DCW().setValue((KN) ((ComboBoxRequired) var6.fxml_include_address_boxController.fxml_include_Voivodeship_boxController.fxml_component_main_element).getValue());
                var7.DAN().setValue(var6.fxml_include_address_boxController.fxml_include_telephone_boxController.fxml_component_main_element.getText());
                var7.DAO().setValue(var6.fxml_include_address_boxController.fxml_include_email_boxController.fxml_component_main_element.getText());
                var7.DAP().setValue(var6.fxml_include_remarks_boxController.fxml_component_main_element.getText());
                this.GFM = this.HHG();
                this.GFM.setContractor(var7);
                this.GFM.setMode(ETC.EDIT);
                this.GFM.HHL();
                this.fxml_include_ContactsListLogicController.fxml_contractorsTable.getItems().clear();
                Collections.sort(this.fxml_include_ContactsListLogicController.GFJ);
                this.fxml_include_ContactsListLogicController.fxml_contractorsTable.setItems(FXCollections.observableArrayList(this.fxml_include_ContactsListLogicController.GFJ));
                this.fxml_include_ContactsListLogicController.fxml_contractorsTable.selectionModelProperty().getValue().select(var7);
            }

            this.fxml_parent.requestFocus();
        } catch (IOException var13) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var13);
        } catch (FFK var14) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var14);
        } catch (FFO var15) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var15);
        }

    }

    @FXML
    protected void fxml_handleButton_generalButtonRemove(ActionEvent var1) throws Exception {

        org.slf4j.LoggerFactory.getLogger(getClass()).info("Button [remove] clicked");
        int var2 = this.fxml_include_ContactsListLogicController.fxml_contractorsTable.getSelectionModel().getSelectedIndex();
        boolean var3 = true;
        if (var2 >= 0) {
            FEN var4 = FCR.getConfirmDataDialog(this.resources.getString("micro.dialog.remove.confirm.title"), null, this.resources.getString("micro.dialog.remove.confirm.button.remove"), this.resources.getString("micro.dialog.remove.confirm.button.cancel"), 500.0, 100.0, this.resources.getString("micro.dialog.remove.confirm.message"));
            switch (var4) {
                case Confirm:
                    var3 = true;
                    this.GFM = this.HHG();
                    this.GFM.setContractor(this.fxml_include_ContactsListLogicController.fxml_contractorsTable.getSelectionModel().getSelectedItem());
                    this.GFM.HUQ();
                    this.fxml_include_ContactsListLogicController.GFJ.remove(var2);
                    this.fxml_include_ContactsListLogicController.HUG(this.fxml_include_ContactsListLogicController.fxml_contractorsTable.getSelectionModel().getSelectedItem());
                    this.fxml_include_ContactsListLogicController.HUH();
                    this.fxml_include_ContactsListLogicController.fxml_contractorsTable.getSelectionModel().clearSelection();
                    this.fxml_include_ContactsListLogicController.fxml_contractorsTable.getItems().clear();
                    this.fxml_include_ContactsListLogicController.fxml_contractorsTable.setItems(FXCollections.observableArrayList(this.fxml_include_ContactsListLogicController.GFJ));
                    org.slf4j.LoggerFactory.getLogger(getClass()).info("Contractor removed");
                    break;
                case Reject:
                    var3 = false;
                    break;
                case CancelExit:
                default:
                    var3 = false;
            }
        }

        this.fxml_parent.requestFocus();

    }

    private void HUI() {
        this.fxml_include_ContactsListLogicController.HUH();
    }

    public ETE getImplementation() throws FFK, FFO {
        return this.getProcess();
    }
}
