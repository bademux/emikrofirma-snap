package a.a.a.c.c.d.d;

import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.util.Callback;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ENT<_T> implements Callback<TableColumn<_T, Date>, TableCell<_T, Date>> {
    public ENT() {
    }

    public TableCell<_T, Date> call(TableColumn<_T, Date> var1) {
        TableCell var2 = new TableCell<_T, Date>() {
            protected void updateItem(Date var1, boolean var2) {

                super.updateItem(var1, var2);
                if (var1 != null) {
                    SimpleDateFormat var3 = new SimpleDateFormat("yyyy-MM-dd' 'HH:mm:ss");
                    String var4 = var3.format(var1);
                    this.setText(var4);
                } else {
                    this.setText("");
                }

            }
        };
        return var2;
    }
}
