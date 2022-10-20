package a.a.a.c.c.e.j.a.a;

import a.a.a.c.c.e.j.a.EUT;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import java.util.ResourceBundle;

public class EUP implements ChangeListener<Boolean> {
    private final EUT GLE;
    private final ResourceBundle GLF;

    public EUP(EUT var1, ResourceBundle var2) {
        this.GLE = var1;
        this.GLF = var2;
    }

    public void changed(ObservableValue<? extends Boolean> var1, Boolean var2, Boolean var3) {

        if (var3 != null) {
            if (var3) {
                this.GLE.fxml_invoice_sale_invoice_elements_table_error_label.setText(this.GLF.getString("micro.process.invoice_sale_new.Error.ErrorLabelStartText"));
            } else {
                this.GLE.fxml_invoice_sale_invoice_elements_table_error_label.setText(this.GLF.getString("micro.process.invoice_sale_new.Error.ErrorTableInvoiceElementsCorrection"));
            }

            org.slf4j.LoggerFactory.getLogger(getClass()).info("Invoice correction elements changed");
        }

    }
}
