package a.a.a.c.f.c.c;

import a.a.a.c.f.c.b.FAH;

public class TextFieldValidated_Email extends TextFieldRequired {
   public TextFieldValidated_Email() {
      this("");
   }

   public TextFieldValidated_Email(String var1) {
      super(var1);
      this.IFW();
   }

   private void IFW() {
      this.IEU().set(false);
      this.textProperty().removeListener(this.GYR);
      this.textProperty().removeListener(this.GYY);
      this.textProperty().addListener(new FAH("^([a-zA-Z0-9_\\-]+){1}(\\.[a-zA-Z0-9_\\-]+)*@([a-zA-Z0-9_\\-]+){1}(\\.[a-zA-Z0-9_\\-]+)*(\\.[a-zA-Z0-9_\\-]{2,}){1}$", "[a-zA-Z0-9_\\-\\.@]+", this));
   }
}
