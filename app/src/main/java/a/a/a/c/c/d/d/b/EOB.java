package a.a.a.c.c.d.d.b;

import a.a.a.c.f.b.c.JR;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.util.Callback;

public class EOB<_T> implements Callback<TableColumn<_T, JR>, TableCell<_T, JR>> {
    public EOB() {
    }

    public TableCell<_T, JR> call(TableColumn<_T, JR> var1) {
        return new TableCell<_T, JR>() {
            protected void updateItem(JR var1, boolean var2) {
                super.updateItem(var1, var2);
                if (!var2 && var1 != null) {
                    this.setText(EOC.HNN(var1.getValue()));
                } else {
                    this.setText(null);
                }

            }
        };
    }
}
