package a.a.a.c.c.d.d;

import a.a.a.c.e.a.k.a.EXF;
import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.util.Callback;

public class QUZ<_T> implements Callback<TableColumn<_T, Date>, TableCell<_T, Date>> {
   public QUZ() {
   }

   public TableCell<_T, Date> call(TableColumn<_T, Date> var1) {
      TableCell var2 = new TableCell<_T, Date>() {
         protected void updateItem(Date var1, boolean var2) {
            EXF.getInstance().ICO();

            try {
               super.updateItem(var1, var2);
               if (var1 != null) {
                  SimpleDateFormat var3 = new SimpleDateFormat("yyyy-MM-dd");
                  String var4 = var3.format(var1);
                  this.setText(var4);
               } else {
                  this.setText("");
               }
            } finally {
               EXF.getInstance().ICP();
            }

         }
      };
      return var2;
   }
}
