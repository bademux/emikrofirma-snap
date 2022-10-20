package a.a.a.c.c.e.j.a.a;

import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.c.d.g.EPB;
import a.a.a.c.c.e.j.a.EUT;
import a.a.a.c.f.b.b.Period;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class EUK implements ChangeListener<Period> {
    private final EUT GKW;

    public EUK(EUT var1) {
        this.GKW = var1;
    }

    public void changed(ObservableValue<? extends Period> var1, Period var2, Period var3) {
        if (var3 != null) {
            this.GKW.GLW.set(true);
            if (this.GKW.GLM.getFieldsEditable()) {
                this.GKW.fxml_invoice_sale_ref_idController.fxml_component_main_element.IEW().set(true);
                boolean var4 = true;

                try {
                    var4 = this.GKW.GLL.HYB(var3, this.GKW.fxml_invoice_sale_ref_idController.fxml_component_main_element.getText());
                } catch (FFO | FFK var6) {
                    org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var6);
                }

                if (this.GKW.GLM != EPB.EDIT && this.GKW.GLM != EPB.EDIT_CORRECTION && !var4) {
                    this.GKW.fxml_invoice_sale_ref_idController.fxml_component_main_element.IEW().set(false);
                } else if ((this.GKW.GLM == EPB.EDIT || this.GKW.GLM == EPB.EDIT_CORRECTION) && !var4 && this.GKW.GMG != null && this.GKW.GMG.compareTo(this.GKW.fxml_invoice_sale_ref_idController.fxml_component_main_element.getText()) != 0) {
                    this.GKW.fxml_invoice_sale_ref_idController.fxml_component_main_element.IEW().set(false);
                }

                org.slf4j.LoggerFactory.getLogger(getClass()).info("Period changed to " + var3);
            }
        } else {
            this.GKW.GLW.set(false);
        }

    }
}
