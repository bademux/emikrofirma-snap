package a.a.a.c.c.d.e;

import a.a.a.c.f.ModelBaseTypeElement;
import a.a.a.c.f.a.c.Contractor;
import a.a.a.c.g.b.FCW;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.util.Callback;

public class EOU<_T extends Contractor, _S> implements Callback<TableColumn<_T, _S>, TableCell<_T, _S>> {
    public EOU() {
    }

    public TableCell<_T, _S> call(TableColumn<_T, _S> var1) {
        TableCell var2 = new TableCell<_T, _S>() {
            protected void updateItem(_S var1, boolean var2) {
                super.updateItem(var1, var2);
                if (var1 != null) {
                    if (((ModelBaseTypeElement) var1).getValue() != null) {
                        this.setText((String) ((ModelBaseTypeElement) var1).getValue());
                    } else {
                        FCW.getInstance().getMessageForKey("micro.process.general.nip.null");
                    }
                } else {
                    this.setText("");
                }

            }
        };
        return var2;
    }
}
