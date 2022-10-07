package a.a.a.c.f.c.b;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.c.c.TextAreaRequired;

public class EZZ<_T extends TextAreaRequired> extends FAR<_T> {
   private volatile boolean GXC = false;

   public EZZ(_T var1) {
      super(var1);
   }

   protected void IFV(String var1, String var2) {
      EXF.getInstance().ICO();

      try {
         if (var2 != null && var2.length() > 0) {
            if (((TextAreaRequired)this.GXW).IFF() != null && ((TextAreaRequired)this.GXW).IFF().intValue() > 0 && var2.length() > ((TextAreaRequired)this.GXW).IFF().intValue()) {
               this.GXC = true;
               ((TextAreaRequired)this.GXW).textProperty().set(var1);
            } else if (this.GXC) {
               this.GXC = false;
            } else {
               ((TextAreaRequired)this.GXW).IEU().set(true);
               super.IFV(var1, var2);
            }
         } else if (this.GXC) {
            this.GXC = false;
         } else {
            ((TextAreaRequired)this.GXW).IEU().set(!((TextAreaRequired)this.GXW).IFB());
            super.IFV(var1, var2);
         }
      } finally {
         EXF.getInstance().ICP();
      }

   }
}
