package a.a.a.c.c.d.o;

import a.a.a.b.f.FFK;
import a.a.a.c.c.d.a.QUW;
import a.a.a.c.f.a.a.EYQ;
import a.a.a.c.f.a.a.EZD;
import a.a.a.c.f.a.a.EZO;
import a.a.a.c.f.b.b.JN;
import a.a.a.c.f.b.c.KA;
import a.a.a.c.f.b.c.KE;
import javafx.beans.property.BooleanProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import java.time.LocalDate;

public class QVF implements ChangeListener<LocalDate> {
    private final QUW RGG;
    private final BooleanProperty RGH;
    private final EYQ RGI;
    private final EZD RGJ;
    private final EZO RGK;

    public QVF(QUW var1, BooleanProperty var2, EYQ var3, EZD var4, EZO var5) {
        this.RGG = var1;
        this.RGH = var2;
        this.RGI = var3;
        this.RGJ = var4;
        this.RGK = var5;
    }

    public void changed(ObservableValue<? extends LocalDate> var1, LocalDate var2, LocalDate var3) {
        this.RGI.fxml_component_main_element.IEW().set(true);
        this.RGJ.fxml_component_main_element.IEY().set(false);
        if (var3 != null) {
            try {
                new JN(var3);
                JN var4 = new JN(this.RGJ.fxml_component_main_element.getValue());
                if (this.RGG.RJX(var4)) {
                    LocalDate var5 = LocalDate.now();
                    if (var3.compareTo(var5) > 0) {
                        this.RGJ.fxml_component_main_element.IEU().set(true);
                        this.RGJ.fxml_component_main_element.IEY().set(true);
                        this.RGJ.fxml_component_warning_element.setText(this.RGG.getResources().getString("micro.process.invoice_purchase_new.Warn.FutureDate"));
                    }
                } else {
                    this.RGJ.fxml_component_main_element.IEU().set(false);
                    this.RGJ.fxml_component_validation_element.setText(this.RGG.getResources().getString("micro.process.invoice_purchase_new.period.settled"));
                }

                if (this.RGH.not().get() && this.RGI.fxml_component_main_element.getText() != null && this.RGI.fxml_component_main_element.getText().length() > 0) {
                    KE var8 = new KE(this.RGI.fxml_component_main_element.getText());
                    if (this.RGK.fxml_component_main_element.IET()) {
                        KA var6 = new KA(this.RGK.fxml_component_main_element.getEditor().getText());
                        if (!this.RGG.RJW(var4, var8, var6)) {
                            this.RGI.fxml_component_main_element.IEW().set(false);
                        }
                    }
                }

                org.slf4j.LoggerFactory.getLogger(getClass()).info("Period changed to " + var3);
            } catch (FFK var7) {
            }
        }

    }
}
