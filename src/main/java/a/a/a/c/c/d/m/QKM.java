package a.a.a.c.c.d.m;

import a.a.a.c.f.b.c.a.KK;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class QKM {
   public QKM() {
   }

   public static void setupComboBoxValues(ComboBox<KK> var0, TextField var1, boolean var2) {
      if (var0 != null) {
         QPM(var0, true);
         KK[] var3 = null;
         if (var1 != null) {
            String var4 = var1.getText();
            var3 = KK.DEO(var4);
            var0.getItems().setAll(var3);
            var1.setText(var4);
         } else {
            var3 = KK.DEN();
            var0.getItems().setAll(var3);
         }

         if (var2) {
            QPL(var0, true);
         }
      }

   }

   public static void QPL(ComboBox<KK> var0, boolean var1) {
      if (var0 != null && var0.getItems().size() > 0) {
         if (var1) {
            var0.show();
         } else if (!var0.isShowing()) {
            var0.show();
         }
      }

   }

   public static void QPM(ComboBox<KK> var0, boolean var1) {
      if (var0 != null) {
         if (var1) {
            var0.hide();
         } else if (var0.isShowing()) {
            var0.hide();
         }
      }

   }

   public static void resetTextFieldCaret(TextField var0, int var1) {
      if (var0 != null) {
         if (var1 < 0) {
            var0.positionCaret(var0.getText().length());
         } else {
            var0.positionCaret(var1);
         }
      }

   }

   public static int getTextFieldCaret(TextField var0) {
      return var0 != null ? var0.getCaretPosition() : -1;
   }
}
