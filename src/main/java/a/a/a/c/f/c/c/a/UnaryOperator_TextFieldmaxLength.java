package a.a.a.c.f.c.c.a;

import a.a.a.c.e.a.k.a.EXF;
import java.util.function.UnaryOperator;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;

public class UnaryOperator_TextFieldmaxLength implements UnaryOperator<TextFormatter.Change> {
   private final TextField MWQ;
   private final int MWR;

   public UnaryOperator_TextFieldmaxLength(TextField var1, int var2) {
      this.MWQ = var1;
      this.MWR = var2;
   }

   public TextFormatter.Change apply(TextFormatter.Change var1) {
      EXF.getInstance().ICO();

      TextFormatter.Change var6;
      try {
         if (var1.isContentChange()) {
            String var2 = var1.getControlNewText();
            if (var2 != null && var2.length() > 0 && (this.MWQ.getText() != null && this.MWQ.getText().length() > this.MWR || var2.length() > this.MWR)) {
               var1.setText(var1.getControlText());
               var1.setRange(0, var1.getControlText().length());
               var1.setCaretPosition(var1.getControlCaretPosition());
               var1.setAnchor(var1.getControlAnchor());
            }
         }

         var6 = var1;
      } finally {
         EXF.getInstance().ICP();
      }

      return var6;
   }
}
