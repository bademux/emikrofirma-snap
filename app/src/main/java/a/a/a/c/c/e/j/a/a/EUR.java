package a.a.a.c.c.e.j.a.a;

import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.c.e.j.a.EUT;
import a.a.a.c.f.a.h.JG;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import java.time.LocalDate;
import java.util.ResourceBundle;

public class EUR implements ChangeListener<LocalDate> {
    private final EUT GLH;
    private final ResourceBundle GLI;

    public EUR(EUT var1, ResourceBundle var2) {
        this.GLH = var1;
        this.GLI = var2;
    }

    public void changed(ObservableValue<? extends LocalDate> var1, LocalDate var2, LocalDate var3) {

        this.GLH.fxml_invoice_sale_invoicing_dateController.fxml_component_main_element.IEY().set(false);
        this.GLH.fxml_invoice_sale_invoicing_dateController.fxml_component_main_element.setValidExternal(true);
        this.GLH.HXQ();
        if (var3 != null && this.GLH.GLM.getFieldsEditable()) {
            if (var3.isAfter(LocalDate.now())) {
                this.GLH.fxml_invoice_sale_invoicing_dateController.fxml_component_main_element.IEY().set(true);
                this.GLH.fxml_invoice_sale_invoicing_dateController.fxml_component_warning_element.setText(this.GLI.getString("micro.process.invoice_sale_new.Warn.FutureDate"));
            } else {
                this.GLH.fxml_invoice_sale_invoicing_dateController.fxml_component_main_element.IEY().set(false);
            }

            boolean var4 = false;

            try {
                JG var5 = this.GLH.GLL.getSettlementStatus(var3);
                if (var5 == JG.SETTLED) {
                    var4 = true;
                }
            } catch (FFO | FFK var9) {
                org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var9);
            }

            if (var4) {
                this.GLH.fxml_invoice_sale_invoicing_dateController.fxml_component_main_element.setValidExternal(false);
                this.GLH.fxml_invoice_sale_invoicing_dateController.fxml_component_validation_element_external.setText(this.GLI.getString("micro.process.invoice_sale_new.Error.SettlementSetted"));
            }

            this.GLH.QGQ(null);
            org.slf4j.LoggerFactory.getLogger(getClass()).info("Invoicing date changed to " + var3);
        }

    }
}
