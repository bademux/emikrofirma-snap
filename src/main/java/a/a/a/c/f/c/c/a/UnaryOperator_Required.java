package a.a.a.c.f.c.c.a;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.c.c.TextFieldRequired;
import a.a.a.c.g.a.FCR;
import a.a.a.c.g.b.FCW;
import java.util.function.UnaryOperator;
import javafx.scene.control.TextFormatter;

public class UnaryOperator_Required implements UnaryOperator<TextFormatter.Change> {
   private final TextFieldRequired HAC;

   public UnaryOperator_Required(TextFieldRequired var1) {
      this.HAC = var1;
   }

   public TextFormatter.Change apply(TextFormatter.Change var1) {
      EXF.getInstance().ICO();

      TextFormatter.Change var8;
      try {
         if (var1.isContentChange()) {
            String var2 = var1.getControlNewText();
            if (var2 != null && var2.length() > 0) {
               int var3 = this.HAC.getMaxLength() > 0 ? this.HAC.getMaxLength() : 2147483647;
               if (var2.length() > var3) {
                  FCR.IGE(FCW.getInstance().getMessageForKey("micro.dialog.info.title"), FCW.getInstance().getMessageForKey("micro.dialog.info.textfield.header"), FCW.getInstance().getMessageForKey("micro.dialog.info.textfield.content") + " " + var3, false);
               }

               if ((this.HAC.getText() == null || this.HAC.getText() != null && this.HAC.getText().length() <= var3) && var2.length() <= var3) {
                  this.HAC.setChanged(true);
                  String var4 = var2.trim();
                  if (var4.length() > 0) {
                     this.HAC.setValid(true);
                  } else {
                     this.HAC.setValid(false);
                  }
               } else {
                  var1.setText(var1.getControlText());
                  var1.setRange(0, var1.getControlText().length());
                  var1.setCaretPosition(var1.getControlCaretPosition());
                  var1.setAnchor(var1.getControlAnchor());
               }
            } else {
               this.HAC.setChanged(true);
               this.HAC.setValid(false);
            }
         }

         var8 = var1;
      } finally {
         EXF.getInstance().ICP();
      }

      return var8;
   }
}
