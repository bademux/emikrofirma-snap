package a.a.a.c.c.d.d;

import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.c.f.b.c.JX;
import javafx.scene.control.TreeTableCell;
import javafx.scene.control.TreeTableColumn;
import javafx.util.Callback;

public class EOF<_T> implements Callback<TreeTableColumn<_T, JX>, TreeTableCell<_T, JX>> {
    public EOF() {
    }

    public TreeTableCell<_T, JX> call(TreeTableColumn<_T, JX> var1) {
        return new TreeTableCell<_T, JX>() {
            protected void updateItem(JX var1, boolean var2) {

                super.updateItem(var1, var2);
                if (var1 != null && var1.getValue() != null) {
                    try {
                        this.setText(var1.DDZ());
                    } catch (FFK var7) {
                        org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var7);
                        throw new FFI(var7);
                    }
                } else {
                    this.setText("");
                }

            }
        };
    }
}
