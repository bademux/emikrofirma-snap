package a.a.a.c.c.e.j.a.a;

import a.a.a.c.c.e.j.a.EUT;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.c.c.DatePickerRequired;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import java.time.LocalDate;
import java.util.ResourceBundle;

public class EUJ implements ChangeListener<LocalDate> {
    private final EUT GKU;
    private final ResourceBundle GKV;

    public EUJ(EUT var1, ResourceBundle var2) {
        this.GKU = var1;
        this.GKV = var2;
    }

    public void changed(ObservableValue<? extends LocalDate> var1, LocalDate var2, LocalDate var3) {
        EXF.getInstance().ICO();

        try {
            this.GKU.fxml_invoice_sale_transaction_dateController.fxml_component_main_element.IEY().set(false);
            if (var3 != null && this.GKU.GLM.getFieldsEditable() && !this.GKU.GLM.getCorrectFields()) {
                if (var3.isAfter(LocalDate.now())) {
                    this.GKU.fxml_invoice_sale_transaction_dateController.fxml_component_main_element.IEY().set(true);
                    this.GKU.fxml_invoice_sale_transaction_dateController.fxml_component_warning_element.setText(this.GKV.getString("micro.process.invoice_sale_new.Warn.FutureDate"));
                }

                EXF.getInstance().ICE("Transaction date changed to " + var3);
            }
        } finally {
            EXF.getInstance().ICP();
        }

    }
}
