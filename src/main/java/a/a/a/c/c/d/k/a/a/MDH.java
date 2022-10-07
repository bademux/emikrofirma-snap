package a.a.a.c.c.d.k.a.a;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.a.EZD;
import a.a.a.c.f.a.a.EZJ;
import a.a.a.c.f.c.c.DatePickerRequired;
import a.a.a.c.f.c.c.TextFieldValidated_PESEL;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import java.time.DateTimeException;
import java.time.LocalDate;

public class MDH implements ChangeListener<Boolean> {
    private final EZJ MWG;
    private final EZD MWH;

    public MDH(EZJ var1, EZD var2) {
        this.MWG = var1;
        this.MWH = var2;
    }

    public void changed(ObservableValue<? extends Boolean> var1, Boolean var2, Boolean var3) {
        if (var3 != null && !var3 && this.MWG.isValid()) {
            LocalDate var4 = MWY(this.MWG.fxml_component_main_element.getText());
            if (var4 != null) {
                this.MWH.fxml_component_main_element.setValue(var4);
            }
        }

    }

    public static LocalDate MWY(String var0) {
        EXF.getInstance().ICO();

        String var2;
        try {
            String var1;
            if (var0 != null && var0.length() == 11) {
                var1 = var0.substring(0, 2);
                var2 = var0.substring(2, 4);
                String var3 = var0.substring(4, 6);
                int var4 = Integer.parseInt(var1);
                int var5 = Integer.parseInt(var2);
                int var6 = Integer.parseInt(var3);
                Integer var7 = null;
                Integer var8 = null;
                if (var5 < 13) {
                    var8 = var5;
                    var7 = 1900 + var4;
                } else if (var5 > 20 && var5 < 33) {
                    var8 = var5 - 20;
                    var7 = 2000 + var4;
                } else if (var5 > 80 && var5 < 93) {
                    var8 = var5 - 80;
                    var7 = 1800 + var4;
                } else if (var5 > 40 && var5 < 53) {
                    var8 = var5 - 40;
                    var7 = 2100 + var4;
                } else if (var5 > 60 && var5 < 73) {
                    var8 = var5 - 60;
                    var7 = 2200 + var4;
                }

                LocalDate var9;
                if (var7 != null && var8 != null) {
                    var9 = LocalDate.of(var7, var8, var6);
                    return var9;
                }

                return null;
            }

            return null;
        } catch (DateTimeException | NumberFormatException var13) {
            EXF.getInstance().ICA(var13);
            return null;
        } finally {
            EXF.getInstance().ICP();
        }
    }
}
