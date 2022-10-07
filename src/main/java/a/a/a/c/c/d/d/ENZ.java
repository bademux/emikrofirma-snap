package a.a.a.c.c.d.d;

import a.a.a.c.e.a.j.EXC;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.b.b.JN;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.util.Callback;

import java.time.Month;
import java.time.format.TextStyle;

public class ENZ<_T> implements Callback<TableColumn<_T, JN>, TableCell<_T, JN>> {
    public ENZ() {
    }

    public TableCell<_T, JN> call(TableColumn<_T, JN> var1) {
        TableCell var2 = new TableCell<_T, JN>() {
            protected void updateItem(JN var1, boolean var2) {
                EXF.getInstance().ICO();
                super.updateItem(var1, var2);
                if (var1 != null) {
                    if (!JN.AOE.equals(var1)) {
                        String var3 = Month.of(var1.getMonth().getValue()).getDisplayName(TextStyle.FULL_STANDALONE, EXC.getInstance().getCurrentLocale());
                        String var4 = var1.getYear().getValue().toString();
                        this.setText(var3 + " " + var4);
                    } else {
                        this.setText("");
                    }
                } else {
                    this.setText("");
                }

                EXF.getInstance().ICP();
            }
        };
        return var2;
    }
}
