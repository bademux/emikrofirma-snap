package a.a.a.c.f.c.c;

import a.a.a.c.f.c.b.FAC;

public class PasswordFieldRequired_8 extends PasswordFieldRequired {
   public static final int GYG = 8;
   public final String GYH = " !\"#\\$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~";

   public PasswordFieldRequired_8() {
      this.IFY();
   }

   private void IFY() {
      this.validProperty().set(false);
      this.textProperty().removeListener(this.GYW);
      this.textProperty().removeListener(this.GYD);
      this.textProperty().addListener(new FAC(this, 8));
   }
}
