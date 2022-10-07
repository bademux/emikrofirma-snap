package a.a.a.c.c.d.d;

import a.a.a.c.f.b.JM;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

public class EOQ<_X extends JM> implements Callback<ListView<_X>, ListCell<_X>> {
    public EOQ() {
    }

    public ListCell<_X> call(ListView<_X> var1) {
        return new ListCell<_X>() {
            protected void updateItem(_X var1, boolean var2) {
                if (var1 != null) {
                    super.updateItem(var1, var2);
                    this.setText(var1.getDescription());
                }

            }
        };
    }
}
