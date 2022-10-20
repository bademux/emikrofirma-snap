package a.a.a.c.c.d.d;

import a.a.a.c.f.b.JM;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.Tooltip;
import javafx.util.Callback;

public class EOG<_S, _T extends JM> implements Callback<TableColumn<_S, _T>, TableCell<_S, _T>> {
    public EOG() {
    }

    public TableCell<_S, _T> call(TableColumn<_S, _T> var1) {
        return new TableCell<_S, _T>() {
            protected void updateItem(_T var1, boolean var2) {
                super.updateItem(var1, var2);
                if (var1 != null) {
                    this.setText(var1.getDescription());
                    this.setTooltip(new Tooltip(var1.getDescription()));
                }

            }
        };
    }
}
