package a.a.a.c.c.e.l.a;

import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.c.e.l.c.EVJ;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.a.EZD;
import a.a.a.c.f.a.e.HV;
import a.a.a.c.f.b.b.JN;
import a.a.a.c.f.c.c.DatePickerRequired;
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
    private HV GPB;
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
        EXF.getInstance().ICO();

        try {
            this.fxml_button_save.disableProperty().bind(this.fxml_invoicing_date_dateController.requiredAndValidProperty().not());
            this.fxml_invoicing_date_dateController.fxml_component_main_element.valueProperty().addListener(new ChangeListener<LocalDate>() {
                public void changed(ObservableValue<? extends LocalDate> var1, LocalDate var2, LocalDate var3) {
                    EXF.getInstance().ICO();

                    try {
                        if (var3 != null) {
                            EVH.this.fxml_invoicing_date_dateController.fxml_component_main_element.IEU().set(true);
                            boolean var4 = false;

                            try {
                                var4 = EVH.this.GPD.HZA(var3);
                            } catch (FFO | FFK var12) {
                                EXF.getInstance().ICA(var12);
                            }

                            if (var4) {
                                EVH.this.fxml_invoicing_date_dateController.fxml_component_validation_element.setText(EVH.this.GPA.getString("micro.process.invoice_sale_list.InvoicingDateDialog.InvoiceDateSettled"));
                                EVH.this.fxml_invoicing_date_dateController.fxml_component_main_element.IEU().set(false);
                                return;
                            }

                            boolean var5 = true;

                            try {
                                var5 = EVH.this.implemantation.RKZ(new JN(var3), EVH.this.GPB.DAS().getValue());
                            } catch (FFO | FFK var11) {
                                EXF.getInstance().ICA(var11);
                            }

                            if (!var5) {
                                EVH.this.fxml_invoicing_date_dateController.fxml_component_validation_element.setText(EVH.this.GPA.getString("micro.process.invoice_sale_list.InvoicingDateDialog.RefIdDuplicated"));
                                EVH.this.fxml_invoicing_date_dateController.fxml_component_main_element.IEU().set(false);
                            }
                        }
                    } finally {
                        EXF.getInstance().ICP();
                    }

                }
            });
        } finally {
            EXF.getInstance().ICP();
        }

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

    public void setInvoiceSellCorrection(HV var1) {
        this.GPB = var1;
    }

    public boolean HZD() {
        return this.GPC;
    }

    @FXML
    protected void fxml_handleButton_save(ActionEvent var1) {
        EXF.getInstance().ICO();

        try {
            EXF.getInstance().ICE("Button [save] clicked");
            this.GPC = true;
            this.GOZ.close();
        } finally {
            EXF.getInstance().ICP();
        }

    }

    @FXML
    protected void fxml_handleButton_cancel(ActionEvent var1) {
        EXF.getInstance().ICO();

        try {
            EXF.getInstance().ICE("Button [cancel] clicked");
            this.GPC = false;
            this.GOZ.close();
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public void setImplematation(EVJ var1) {
        this.implemantation = var1;
    }
}
