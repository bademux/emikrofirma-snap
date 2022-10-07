package a.a.a.c.f.c.c.a;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.c.c.TextAreaRequired;
import a.a.a.c.g.a.FCR;
import a.a.a.c.g.b.FCW;
import java.util.function.UnaryOperator;
import javafx.scene.control.TextFormatter;

public class UnaryOperator_TextAreaRequired implements UnaryOperator<TextFormatter.Change> {
   private final TextAreaRequired QVZ;

   public UnaryOperator_TextAreaRequired(TextAreaRequired var1) {
      this.QVZ = var1;
   }

   public TextFormatter.Change apply(TextFormatter.Change var1) {
      EXF.getInstance().ICO();

      TextFormatter.Change var8;
      try {
         if (var1.isContentChange()) {
            String var2 = var1.getControlNewText();
            if (var2 != null && var2.length() > 0) {
               int var3 = this.QVZ.getMaxLength() > 0 ? this.QVZ.getMaxLength() : 2147483647;
               if (var2.length() > var3) {
                  FCR.IGE(FCW.getInstance().getMessageForKey("micro.dialog.info.title"), FCW.getInstance().getMessageForKey("micro.dialog.info.textfield.header"), FCW.getInstance().getMessageForKey("micro.dialog.info.textfield.content") + " " + var3, false);
               }

               if ((this.QVZ.getText() == null || this.QVZ.getText() != null && this.QVZ.getText().length() <= var3) && var2.length() <= var3) {
                  this.QVZ.setChanged(true);
                  String var4 = var2.trim();
                  if (var4.length() > 0) {
                     this.QVZ.setValid(true);
                  } else {
                     this.QVZ.setValid(false);
                  }
               } else {
                  var1.setText(var1.getControlText());
                  var1.setRange(0, var1.getControlText().length());
                  var1.setCaretPosition(var1.getControlCaretPosition());
                  var1.setAnchor(var1.getControlAnchor());
               }
            } else {
               this.QVZ.setChanged(true);
               this.QVZ.setValid(false);
            }
         }

         var8 = var1;
      } finally {
         EXF.getInstance().ICP();
      }

      return var8;
   }
}
