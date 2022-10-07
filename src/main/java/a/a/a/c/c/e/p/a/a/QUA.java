package a.a.a.c.c.e.p.a.a;

import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.c.e.p.a.QTW;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.h.JG;
import a.a.a.c.f.b.b.JN;
import a.a.a.c.f.c.c.DatePickerRequired;
import a.a.a.c.g.b.FCW;
import java.time.LocalDate;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class QUA implements ChangeListener<LocalDate> {
   private QTW RCP;

   public QUA(QTW var1) {
      this.RCP = var1;
   }

   public void changed(ObservableValue<? extends LocalDate> var1, LocalDate var2, LocalDate var3) {
      EXF.getInstance().ICO();

      try {
         if (var3 != null) {
            this.RCP.RBX.set(new JN(var3));
            ((DatePickerRequired)this.RCP.fxml_include_invoicingDate_boxController.fxml_component_main_element).IEY().set(false);
            ((DatePickerRequired)this.RCP.fxml_include_invoicingDate_boxController.fxml_component_main_element).setValidExternal(true);
            if (this.RCP.RBY.get()) {
               if (var3.isAfter(LocalDate.now())) {
                  ((DatePickerRequired)this.RCP.fxml_include_invoicingDate_boxController.fxml_component_main_element).IEY().set(true);
                  this.RCP.fxml_include_invoicingDate_boxController.fxml_component_warning_element.setText(FCW.getInstance().getMessageForKey("micro.process.other_purchase_new.Warn.FutureDate"));
               } else {
                  ((DatePickerRequired)this.RCP.fxml_include_invoicingDate_boxController.fxml_component_main_element).IEY().set(false);
               }

               boolean var4 = false;

               try {
                  JG var5 = this.RCP.RBV.getSettlementStatus(var3);
                  if (var5 == JG.SETTLED) {
                     var4 = true;
                  }
               } catch (FFO | FFK var10) {
                  EXF.getInstance().ICA((Throwable)var10);
               }

               if (var4) {
                  ((DatePickerRequired)this.RCP.fxml_include_invoicingDate_boxController.fxml_component_main_element).setValidExternal(false);
                  this.RCP.fxml_include_invoicingDate_boxController.fxml_component_validation_element_external.setText(FCW.getInstance().getMessageForKey("micro.process.other_purchase_new.Error.SettlementSetted"));
               }

               EXF.getInstance().ICE("Invoicing date changed to " + var3.toString());
            }
         }
      } catch (FFK var11) {
         throw new FFI(var11);
      } finally {
         EXF.getInstance().ICP();
      }

   }
}
