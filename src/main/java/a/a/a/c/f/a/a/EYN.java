package a.a.a.c.f.a.a;

import a.a.a.c.f.a.EXX;
import a.a.a.c.f.c.a.AddressBox;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class EYN<_A> extends EXX {
    @FXML
    public AddressBox fxml_field_box_address;
    @FXML
    public Label fxml_address_box_label;
    @FXML
    public EYQ fxml_include_CountryCode_boxController;
    @FXML
    public EZP<_A> fxml_include_Voivodeship_boxController;
    @FXML
    public EYQ fxml_include_District_boxController;
    @FXML
    public EYQ fxml_include_Community_boxController;
    @FXML
    public EYQ fxml_include_City_boxController;
    @FXML
    public EYQ fxml_include_Street_boxController;
    @FXML
    public EYQ fxml_include_HouseNumber_boxController;
    @FXML
    public EYQ fxml_include_ApartmentNumber_boxController;
    @FXML
    public EYU fxml_include_PostalCode_boxController;
    @FXML
    public EYQ fxml_include_PostOffice_boxController;
    @FXML
    public EZH fxml_include_telephone_boxController;
    @FXML
    public EZC fxml_include_email_boxController;

    public EYN() {
        this(null);
    }

    public EYN(String var1) {
        super(var1);
    }

    public void initialize() {
        this.fxml_address_box_label.textProperty().bind(this.fxml_field_box_address.labelProperty());
        this.GVR.bind(this.fxml_include_CountryCode_boxController.validProperty().and(this.fxml_include_Voivodeship_boxController.validProperty().and(this.fxml_include_District_boxController.validProperty().and(this.fxml_include_Community_boxController.validProperty().and(this.fxml_include_City_boxController.validProperty().and(this.fxml_include_Street_boxController.validProperty().and(this.fxml_include_HouseNumber_boxController.validProperty().and(this.fxml_include_ApartmentNumber_boxController.validProperty().and(this.fxml_include_PostalCode_boxController.validProperty().and(this.fxml_include_PostOffice_boxController.validProperty().and(this.fxml_include_telephone_boxController.validProperty().and(this.fxml_include_email_boxController.validProperty()))))))))))));
        this.GVH.bind(this.fxml_include_CountryCode_boxController.changedProperty().or(this.fxml_include_Voivodeship_boxController.changedProperty().or(this.fxml_include_District_boxController.changedProperty().or(this.fxml_include_Community_boxController.changedProperty().or(this.fxml_include_City_boxController.changedProperty().or(this.fxml_include_Street_boxController.changedProperty().or(this.fxml_include_HouseNumber_boxController.changedProperty().or(this.fxml_include_ApartmentNumber_boxController.changedProperty().or(this.fxml_include_PostalCode_boxController.changedProperty().or(this.fxml_include_PostOffice_boxController.changedProperty().or(this.fxml_include_telephone_boxController.changedProperty().or(this.fxml_include_email_boxController.changedProperty()))))))))))));
        this.GVM.bind(this.fxml_include_CountryCode_boxController.requiredProperty().or(this.fxml_include_Voivodeship_boxController.requiredProperty().or(this.fxml_include_District_boxController.requiredProperty().or(this.fxml_include_Community_boxController.requiredProperty().or(this.fxml_include_City_boxController.requiredProperty().or(this.fxml_include_Street_boxController.requiredProperty().or(this.fxml_include_HouseNumber_boxController.requiredProperty().or(this.fxml_include_ApartmentNumber_boxController.requiredProperty().or(this.fxml_include_PostalCode_boxController.requiredProperty().or(this.fxml_include_PostOffice_boxController.requiredProperty().or(this.fxml_include_telephone_boxController.requiredProperty().or(this.fxml_include_email_boxController.requiredProperty()))))))))))));
        this.GVN.bind(this.fxml_include_CountryCode_boxController.requiredAndValidProperty().and(this.fxml_include_Voivodeship_boxController.requiredAndValidProperty().and(this.fxml_include_District_boxController.requiredAndValidProperty().and(this.fxml_include_Community_boxController.requiredAndValidProperty().and(this.fxml_include_City_boxController.requiredAndValidProperty().and(this.fxml_include_Street_boxController.requiredAndValidProperty().and(this.fxml_include_HouseNumber_boxController.requiredAndValidProperty().and(this.fxml_include_ApartmentNumber_boxController.requiredAndValidProperty().and(this.fxml_include_PostalCode_boxController.requiredAndValidProperty().and(this.fxml_include_PostOffice_boxController.requiredAndValidProperty().and(this.fxml_include_telephone_boxController.requiredAndValidProperty().and(this.fxml_include_email_boxController.requiredAndValidProperty()))))))))))));
    }

    public void clearChangedProperty() {
        this.fxml_include_CountryCode_boxController.clearChangedProperty();
        this.fxml_include_Voivodeship_boxController.clearChangedProperty();
        this.fxml_include_District_boxController.clearChangedProperty();
        this.fxml_include_Community_boxController.clearChangedProperty();
        this.fxml_include_City_boxController.clearChangedProperty();
        this.fxml_include_Street_boxController.clearChangedProperty();
        this.fxml_include_HouseNumber_boxController.clearChangedProperty();
        this.fxml_include_ApartmentNumber_boxController.clearChangedProperty();
        this.fxml_include_PostalCode_boxController.clearChangedProperty();
        this.fxml_include_PostOffice_boxController.clearChangedProperty();
        this.fxml_include_telephone_boxController.clearChangedProperty();
        this.fxml_include_email_boxController.clearChangedProperty();
    }
}
