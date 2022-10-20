package a.a.a.c.c.d.d;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.b.b.JN;
import a.a.a.c.g.b.FCW;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.util.Callback;

public class EOI<_T> implements Callback<TableColumn<_T, JN>, TableCell<_T, JN>> {
    public EOI() {
    }

    public TableCell<_T, JN> call(TableColumn<_T, JN> var1) {
        TableCell var2 = new TableCell<_T, JN>() {
            protected void updateItem(JN var1, boolean var2) {
                EXF.getInstance().ICO();
                super.updateItem(var1, var2);
                if (var1 != null) {
                    if (JN.AOE.equals(var1)) {
                        this.setText(FCW.getInstance().getMessageForKey("micro.process.jpk_list.sourceOutside"));
                    } else {
                        this.setText(FCW.getInstance().getMessageForKey("micro.process.jpk_list.sourceSettlement"));
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
