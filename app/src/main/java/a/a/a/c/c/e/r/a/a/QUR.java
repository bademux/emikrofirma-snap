package a.a.a.c.c.e.r.a.a;

import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.c.e.r.a.QUN;
import a.a.a.c.f.a.h.SettlementStatus;
import a.a.a.c.f.b.b.Period;
import a.a.a.c.g.b.FCW;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import java.time.LocalDate;

public class QUR implements ChangeListener<LocalDate> {
    private final QUN REQ;

    public QUR(QUN var1) {
        this.REQ = var1;
    }

    public void changed(ObservableValue<? extends LocalDate> var1, LocalDate var2, LocalDate var3) {

        try {
            if (var3 != null) {
                this.REQ.RDZ.set(new Period(var3));
                this.REQ.fxml_other_sale_invoicing_dateController.fxml_component_main_element.IEY().set(false);
                this.REQ.fxml_other_sale_invoicing_dateController.fxml_component_main_element.setValidExternal(true);
                if (this.REQ.REA.get()) {
                    if (var3.isAfter(LocalDate.now())) {
                        this.REQ.fxml_other_sale_invoicing_dateController.fxml_component_main_element.IEY().set(true);
                        this.REQ.fxml_other_sale_invoicing_dateController.fxml_component_warning_element.setText(FCW.getInstance().getMessageForKey("micro.process.other_sale_new.Warn.FutureDate"));
                    } else {
                        this.REQ.fxml_other_sale_invoicing_dateController.fxml_component_main_element.IEY().set(false);
                    }

                    boolean var4 = false;

                    try {
                        SettlementStatus var5 = this.REQ.RDU.getSettlementStatus(var3);
                        if (var5 == SettlementStatus.SETTLED) {
                            var4 = true;
                        }
                    } catch (FFO | FFK var10) {
                        org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var10);
                    }

                    if (var4) {
                        this.REQ.fxml_other_sale_invoicing_dateController.fxml_component_main_element.setValidExternal(false);
                        this.REQ.fxml_other_sale_invoicing_dateController.fxml_component_validation_element_external.setText(FCW.getInstance().getMessageForKey("micro.process.other_sale_new.Error.SettlementSetted"));
                    }

                    org.slf4j.LoggerFactory.getLogger(getClass()).info("Invoicing date changed to " + var3);
                }
            }
        } catch (FFK var11) {
            throw new FFI(var11);
        }

    }
}
