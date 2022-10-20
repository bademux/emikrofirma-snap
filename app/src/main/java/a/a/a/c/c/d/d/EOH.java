package a.a.a.c.c.d.d;

import a.a.a.c.f.b.b.Period;
import javafx.scene.control.TreeTableCell;
import javafx.scene.control.TreeTableColumn;
import javafx.util.Callback;

import java.time.Month;
import java.time.format.TextStyle;

import static com.github.bademux.emk.utils.LocaleUtils.LOCALE;

public class EOH<_T> implements Callback<TreeTableColumn<_T, Period>, TreeTableCell<_T, Period>> {
    public EOH() {
    }

    public TreeTableCell<_T, Period> call(TreeTableColumn<_T, Period> var1) {
        TreeTableCell var2 = new TreeTableCell<_T, Period>() {
            protected void updateItem(Period var1, boolean var2) {

                super.updateItem(var1, var2);
                if (var1 != null && var1.getMonth().getValue() > 0 && var1.getMonth().getValue() < 13) {
                    String var3 = Month.of(var1.getMonth().getValue()).getDisplayName(TextStyle.FULL_STANDALONE, LOCALE);
                    String var4 = var1.getYear().getValue().toString();
                    this.setText(var3 + " " + var4);
                } else {
                    this.setText("");
                }

            }
        };
        return var2;
    }
}
