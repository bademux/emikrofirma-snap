package a.a.a.c.f.c.c;

import a.a.a.c.f.c.b.FAI;

public class TextFieldValidated_NIP extends TextFieldRequired {
   public TextFieldValidated_NIP() {
      this("");
   }

   public TextFieldValidated_NIP(String var1) {
      super(var1);
      this.IFW();
   }

   private void IFW() {
      this.IEU().set(false);
      this.textProperty().removeListener(this.GYR);
      this.textProperty().removeListener(this.GYY);
      this.textProperty().addListener(new FAI(this));
   }
}
