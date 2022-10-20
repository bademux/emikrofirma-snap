package a.a.a.c.c.e.l.a;

import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.c.e.l.c.EVJ;
import a.a.a.c.f.a.a.EZD;
import a.a.a.c.f.a.e.InvoiceSellCorrection;
import a.a.a.c.f.b.b.Period;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.util.ResourceBundle;

public class EVH {
    private Stage GOZ;
    private ResourceBundle GPA;
    private InvoiceSellCorrection GPB;
    private boolean GPC;
    @FXML
    public EZD fxml_invoicing_date_dateController;
    @FXML
    private Button fxml_button_cancel;
    @FXML
    private Button fxml_button_save;
    private EVD GPD;
    @FXML
    private EVJ implemantation;

    public EVH() {
    }

    @FXML
    private void initialize() {

        this.fxml_button_save.disableProperty().bind(this.fxml_invoicing_date_dateController.requiredAndValidProperty().not());
        this.fxml_invoicing_date_dateController.fxml_component_main_element.valueProperty().addListener(new ChangeListener<LocalDate>() {
            public void changed(ObservableValue<? extends LocalDate> var1, LocalDate var2, LocalDate var3) {

                if (var3 != null) {
                    EVH.this.fxml_invoicing_date_dateController.fxml_component_main_element.IEU().set(true);
                    boolean var4 = false;

                    try {
                        var4 = EVH.this.GPD.HZA(var3);
                    } catch (FFO | FFK var12) {
                        org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var12);
                    }

                    if (var4) {
                        EVH.this.fxml_invoicing_date_dateController.fxml_component_validation_element.setText(EVH.this.GPA.getString("micro.process.invoice_sale_list.InvoicingDateDialog.InvoiceDateSettled"));
                        EVH.this.fxml_invoicing_date_dateController.fxml_component_main_element.IEU().set(false);
                        return;
                    }

                    boolean var5 = true;

                    try {
                        var5 = EVH.this.implemantation.RKZ(new Period(var3), EVH.this.GPB.DAS().getValue());
                    } catch (FFO | FFK var11) {
                        org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var11);
                    }

                    if (!var5) {
                        EVH.this.fxml_invoicing_date_dateController.fxml_component_validation_element.setText(EVH.this.GPA.getString("micro.process.invoice_sale_list.InvoicingDateDialog.RefIdDuplicated"));
                        EVH.this.fxml_invoicing_date_dateController.fxml_component_main_element.IEU().set(false);
                    }
                }

            }
        });

    }

    public void HZC() {
        this.fxml_invoicing_date_dateController.IFN(this.implemantation.getRangesWhereSettled(this.GPA.getString("micro.process.invoice_sale_list.InvoicingDateDialog.InvoiceDateSettled")));
    }

    public void setParentController(EVD var1) {
        this.GPD = var1;
    }

    public void setDialogStage(Stage var1) {
        this.GOZ = var1;
    }

    public void setResources(ResourceBundle var1) {
        this.GPA = var1;
    }

    public void setInvoiceSellCorrection(InvoiceSellCorrection var1) {
        this.GPB = var1;
    }

    public boolean HZD() {
        return this.GPC;
    }

    @FXML
    protected void fxml_handleButton_save(ActionEvent var1) {

        org.slf4j.LoggerFactory.getLogger(getClass()).info("Button [save] clicked");
        this.GPC = true;
        this.GOZ.close();

    }

    @FXML
    protected void fxml_handleButton_cancel(ActionEvent var1) {

        org.slf4j.LoggerFactory.getLogger(getClass()).info("Button [cancel] clicked");
        this.GPC = false;
        this.GOZ.close();

    }

    public void setImplematation(EVJ var1) {
        this.implemantation = var1;
    }
}
