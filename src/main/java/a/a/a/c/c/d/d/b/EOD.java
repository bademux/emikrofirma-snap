package a.a.a.c.c.d.d.b;

import java.math.BigDecimal;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.util.Callback;

public class EOD<_T> implements Callback<TableColumn<_T, BigDecimal>, TableCell<_T, BigDecimal>> {
   public EOD() {
   }

   public TableCell<_T, BigDecimal> call(TableColumn<_T, BigDecimal> var1) {
      return new TableCell<_T, BigDecimal>() {
         protected void updateItem(BigDecimal var1, boolean var2) {
            super.updateItem(var1, var2);
            if (!var2 && var1 != null) {
               this.setText(EOC.HNN(var1));
            } else {
               this.setText((String)null);
            }

         }
      };
   }
}
