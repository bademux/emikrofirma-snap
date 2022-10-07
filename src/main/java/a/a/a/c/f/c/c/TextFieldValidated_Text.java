package a.a.a.c.f.c.c;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.c.c.a.UnaryOperator_Required;
import a.a.a.c.f.c.c.b.StringConverter_String;
import javafx.scene.control.TextFormatter;

public class TextFieldValidated_Text extends TextFieldRequired {
   public TextFieldValidated_Text() {
      this("");
   }

   public TextFieldValidated_Text(String var1) {
      super(var1);
      this.IFW();
   }

   private void IFW() {
      EXF.getInstance().ICO();

      try {
         this.setTextFormatter(new TextFormatter(new StringConverter_String(this.RHS()), "", new UnaryOperator_Required(this)));
         this.IEU().set(false);
         this.textProperty().removeListener(this.GYR);
         this.textProperty().removeListener(this.GYY);
      } finally {
         EXF.getInstance().ICP();
      }

   }
}
