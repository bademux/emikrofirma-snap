package a.a.a.c.c.d.d;

import a.a.a.c.f.b.c.JY;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.util.Callback;

public class EOJ<_T> implements Callback<TableColumn<_T, JY>, TableCell<_T, JY>> {
    public EOJ() {
    }

    public TableCell<_T, JY> call(TableColumn<_T, JY> var1) {
        TableCell var2 = new TableCell<_T, JY>() {
            protected void updateItem(JY var1, boolean var2) {

                super.updateItem(var1, var2);
                if (var1 != null && var1.getValue() != null) {
                    this.setText(var1.getValueAsString());
                } else {
                    this.setText("");
                }

            }
        };
        return var2;
    }
}
