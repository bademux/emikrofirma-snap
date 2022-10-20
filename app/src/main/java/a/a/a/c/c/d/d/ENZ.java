package a.a.a.c.c.d.d;

import a.a.a.c.f.b.b.Period;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.util.Callback;

import java.time.Month;
import java.time.format.TextStyle;

import static com.github.bademux.emk.utils.LocaleUtils.LOCALE;

public class ENZ<_T> implements Callback<TableColumn<_T, Period>, TableCell<_T, Period>> {
    public ENZ() {
    }

    public TableCell<_T, Period> call(TableColumn<_T, Period> var1) {
        TableCell var2 = new TableCell<_T, Period>() {
            protected void updateItem(Period var1, boolean var2) {

                super.updateItem(var1, var2);
                if (var1 != null) {
                    if (!Period.AOE.equals(var1)) {
                        String var3 = Month.of(var1.getMonth().getValue()).getDisplayName(TextStyle.FULL_STANDALONE, LOCALE);
                        String var4 = var1.getYear().getValue().toString();
                        this.setText(var3 + " " + var4);
                    } else {
                        this.setText("");
                    }
                } else {
                    this.setText("");
                }

            }
        };
        return var2;
    }
}
