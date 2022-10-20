package a.a.a.c.c.d.d;

import a.a.a.c.f.b.b.Period;
import a.a.a.c.g.b.FCW;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.util.Callback;

public class EOI<_T> implements Callback<TableColumn<_T, Period>, TableCell<_T, Period>> {
    public EOI() {
    }

    public TableCell<_T, Period> call(TableColumn<_T, Period> var1) {
        TableCell var2 = new TableCell<_T, Period>() {
            protected void updateItem(Period var1, boolean var2) {

                super.updateItem(var1, var2);
                if (var1 != null) {
                    if (Period.AOE.equals(var1)) {
                        this.setText(FCW.getInstance().getMessageForKey("micro.process.jpk_list.sourceOutside"));
                    } else {
                        this.setText(FCW.getInstance().getMessageForKey("micro.process.jpk_list.sourceSettlement"));
                    }
                } else {
                    this.setText("");
                }

            }
        };
        return var2;
    }
}
