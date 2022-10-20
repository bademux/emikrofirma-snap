package a.a.a.c.c.d.d.b;

import a.a.a.c.f.b.c.Amount;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.util.Callback;

public class EOB<_T> implements Callback<TableColumn<_T, Amount>, TableCell<_T, Amount>> {
    public EOB() {
    }

    public TableCell<_T, Amount> call(TableColumn<_T, Amount> var1) {
        return new TableCell<_T, Amount>() {
            protected void updateItem(Amount var1, boolean var2) {
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
