package a.a.a.c.f.c.c;

import a.a.a.c.f.c.b.FAH;

public class TextFieldValidated_RefIdPattern extends TextFieldRequired {
   public TextFieldValidated_RefIdPattern() {
      this("");
   }

   public TextFieldValidated_RefIdPattern(String var1) {
      super(var1);
      this.IFW();
   }

   private void IFW() {
      this.IEU().set(false);
      this.textProperty().removeListener(this.GYR);
      this.textProperty().removeListener(this.GYY);
      this.textProperty().addListener(new FAH("^([^#%]*?(#%[^#%]+?%#)?[^#%]*?)+$", "[\\S\\s]+", this));
   }
}
