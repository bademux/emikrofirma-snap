package a.a.a.c.c.e.j.a.a;

import a.a.a.c.c.e.j.a.EUT;
import a.a.a.c.f.b.EZT;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ResourceBundle;

public class EUM implements ChangeListener<LocalDate> {
    private final EUT GKY;
    private final ResourceBundle GKZ;

    public EUM(EUT var1, ResourceBundle var2) {
        this.GKY = var1;
        this.GKZ = var2;
    }

    public void changed(ObservableValue<? extends LocalDate> var1, LocalDate var2, LocalDate var3) {

        this.GKY.fxml_invoice_sale_creation_dateController.fxml_component_main_element.IEY().set(false);
        this.GKY.fxml_invoice_sale_creation_dateController.fxml_component_main_element.setValidExternal(true);
        if (var3 != null && this.GKY.GLM.getFieldsEditable()) {
            if (var3.isAfter(LocalDate.now())) {
                this.GKY.fxml_invoice_sale_creation_dateController.fxml_component_main_element.IEY().set(true);
                this.GKY.fxml_invoice_sale_creation_dateController.fxml_component_warning_element.setText(this.GKZ.getString("micro.process.invoice_sale_new.Warn.FutureDate"));
            } else {
                this.GKY.fxml_invoice_sale_creation_dateController.fxml_component_main_element.IEY().set(false);
            }

            this.GKY.fxml_invoice_sale_paymentdateController.IFO(this.GKY.GMF);
            EZT var4 = new EZT(LocalDate.of(0, 1, 1), var3.minusDays(1L), null, true);
            this.GKY.fxml_invoice_sale_paymentdateController.IFM(var4);
            this.GKY.GMF = var4;
            this.GKY.HXP();
            if (var3.equals(this.GKY.GMH)) {
                this.GKY.fxml_invoice_sale_ref_idController.fxml_component_main_element.setText(this.GKY.GMG);
            } else {
                this.GKY.HXS();
            }

            if (!this.GKY.GLM.getCorrectFields()) {
                this.GKY.fxml_invoice_sale_transaction_dateController.fxml_component_main_element.setValue(var3);
                this.GKY.fxml_invoice_sale_invoicing_dateController.fxml_component_main_element.setValue(var3);
            }

            if (this.GKY.GLM.getCorrectFields() && var3.isBefore(this.GKY.GLP.getCreationDate().getValueDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate())) {
                this.GKY.fxml_invoice_sale_creation_dateController.fxml_component_main_element.setValidExternal(false);
                if (this.GKY.GLO == this.GKY.GLP) {
                    this.GKY.fxml_invoice_sale_creation_dateController.fxml_component_validation_element_external.setText(this.GKZ.getString("micro.process.invoice_sale_new.Error.ErrorCorrectionCrationDateBeforeParentCreationDateIfOnlyOneParent"));
                } else {
                    this.GKY.fxml_invoice_sale_creation_dateController.fxml_component_validation_element_external.setText(this.GKZ.getString("micro.process.invoice_sale_new.Error.ErrorCorrectionCrationDateBeforeParentCreationDate"));
                }
            }

            org.slf4j.LoggerFactory.getLogger(getClass()).info("Creation date changed to " + var3);
        }

    }
}
