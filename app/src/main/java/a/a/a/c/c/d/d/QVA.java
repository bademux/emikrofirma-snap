package a.a.a.c.c.d.d;

import javafx.scene.control.TreeTableCell;
import javafx.scene.control.TreeTableColumn;
import javafx.util.Callback;

import java.text.SimpleDateFormat;
import java.util.Date;

public class QVA<_T> implements Callback<TreeTableColumn<_T, Date>, TreeTableCell<_T, Date>> {
    public QVA() {
    }

    public TreeTableCell<_T, Date> call(TreeTableColumn<_T, Date> var1) {
        return new TreeTableCell<_T, Date>() {
            protected void updateItem(Date var1, boolean var2) {

                super.updateItem(var1, var2);
                if (var1 != null) {
                    SimpleDateFormat var3 = new SimpleDateFormat("yyyy-MM-dd");
                    String var4 = var3.format(var1);
                    this.setText(var4);
                } else {
                    this.setText("");
                }

            }
        };
    }
}
