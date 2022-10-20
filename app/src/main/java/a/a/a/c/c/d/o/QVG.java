package a.a.a.c.c.d.o;

import a.a.a.b.f.FFK;
import a.a.a.c.c.d.a.QUW;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.a.EYQ;
import a.a.a.c.f.a.a.EZD;
import a.a.a.c.f.a.a.EZO;
import a.a.a.c.f.b.b.JN;
import a.a.a.c.f.b.c.KA;
import a.a.a.c.f.b.c.KE;
import a.a.a.c.f.c.c.ComboBoxValidated_NIP;
import a.a.a.c.f.c.c.DatePickerRequired;
import a.a.a.c.f.c.c.TextFieldValidated_Text;
import javafx.beans.property.BooleanProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import java.time.LocalDate;

public class QVG implements ChangeListener<String> {
    private final QUW RGL;
    private final BooleanProperty RGM;
    private final EYQ RGN;
    private final EZD RGO;
    private final EZO RGP;

    public QVG(QUW var1, BooleanProperty var2, EYQ var3, EZD var4, EZO var5) {
        this.RGL = var1;
        this.RGM = var2;
        this.RGN = var3;
        this.RGO = var4;
        this.RGP = var5;
    }

    public void changed(ObservableValue<? extends String> var1, String var2, String var3) {
        this.RGN.fxml_component_main_element.IEW().set(true);
        if (var3 != null && var3.length() > 0) {
            JN var4 = JN.AOE;
            if (this.RGO.fxml_component_main_element.getValue() != null) {
                try {
                    var4 = new JN(this.RGO.fxml_component_main_element.getValue());
                } catch (FFK var6) {
                }
            }

            if (this.RGM.not().get() && this.RGP.fxml_component_main_element.IET()) {
                KA var5 = new KA(this.RGP.fxml_component_main_element.getEditor().getText());
                if (!this.RGL.RJW(var4, new KE(var3), var5)) {
                    this.RGN.fxml_component_main_element.IEW().set(false);
                }
            }

            EXF.getInstance().ICE("RefId changed");
        }

    }
}
