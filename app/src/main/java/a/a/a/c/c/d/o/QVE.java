package a.a.a.c.c.d.o;

import a.a.a.b.f.FFK;
import a.a.a.c.c.d.a.QUW;
import a.a.a.c.f.a.a.EYQ;
import a.a.a.c.f.a.a.EZD;
import a.a.a.c.f.a.a.EZO;
import a.a.a.c.f.b.b.Period;
import a.a.a.c.f.b.c.KA;
import a.a.a.c.f.b.c.RefId;
import a.a.a.c.g.b.FCW;
import javafx.beans.property.BooleanProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class QVE implements ChangeListener<Boolean> {
    private final QUW RGB;
    private final BooleanProperty RGC;
    private final EYQ RGD;
    private final EZD RGE;
    private final EZO RGF;

    public QVE(QUW var1, BooleanProperty var2, EYQ var3, EZD var4, EZO var5) {
        this.RGB = var1;
        this.RGC = var2;
        this.RGD = var3;
        this.RGE = var4;
        this.RGF = var5;
    }

    public void changed(ObservableValue<? extends Boolean> var1, Boolean var2, Boolean var3) {
        this.RGD.fxml_component_main_element.IEW().set(true);
        if (var3 != null && var3) {
            KA var4 = new KA(this.RGF.fxml_component_main_element.getValue().getTitle(2));
            Period var5 = Period.AOE;
            if (this.RGE.fxml_component_main_element.getValue() != null) {
                try {
                    var5 = new Period(this.RGE.fxml_component_main_element.getValue());
                } catch (FFK var8) {
                }
            }

            String var6 = FCW.getInstance().getMessageForKey("micro.process.general.nip.null");
            if (var6.equalsIgnoreCase(this.RGF.fxml_component_main_element.getValue().getTitle(2))) {
                this.RGF.fxml_component_main_element.IEW().set(false);
            }

            if (this.RGC.not().get() && this.RGD.fxml_component_main_element.getText() != null && this.RGD.fxml_component_main_element.getText().length() > 0) {
                RefId var7 = new RefId(this.RGD.fxml_component_main_element.getText());
                if (this.RGF.fxml_component_main_element.getValue() != null && !this.RGB.RJW(var5, var7, var4)) {
                    this.RGD.fxml_component_main_element.IEW().set(false);
                }
            }
        }

    }
}
