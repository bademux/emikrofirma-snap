package a.a.a.c.f.b;

import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.control.DateCell;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Tooltip;
import javafx.util.Callback;

import java.time.LocalDate;
import java.util.Iterator;

public class EZU implements Callback<DatePicker, DateCell> {
    private final ObservableList<EZT> GWN;

    public EZU(ObservableList<EZT> var1) {
        this.GWN = var1;
    }

    public DateCell call(DatePicker var1) {
        return new DateCell() {
            public void updateItem(LocalDate var1, boolean var2) {
                super.updateItem(var1, var2);
                if (!var2 && var1 != null) {
                    Iterator var3 = EZU.this.GWN.iterator();

                    while (var3.hasNext()) {
                        EZT var4 = (EZT) var3.next();
                        if (var1.isBefore(var4.getEndDate().plusDays(1L)) && var1.isAfter(var4.getStartDate().minusDays(1L))) {
                            this.setTooltip(new Tooltip(var4.getReasonText()));
                            this.setStyle("-fx-background-color: #ffc0cb;");
                            this.setDisable(var4.getDisable());
                        }
                    }
                } else {
                    this.setText(null);
                    this.setGraphic(null);
                }

            }
        };
    }
}
