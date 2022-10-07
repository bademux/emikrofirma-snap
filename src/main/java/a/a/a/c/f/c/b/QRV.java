package a.a.a.c.f.c.b;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.b.QST;
import a.a.a.c.f.c.c.ComboBoxRequiredText;

public class QRV<_A extends QST, _B extends ComboBoxRequiredText<_A>> extends FAE<_A, _B> {
   private int QVQ;

   public QRV(_B var1) {
      super(var1);
   }

   public QRV(_B var1, int var2) {
      super(var1);
      this.QVQ = var2;
   }

   protected void IFV(_A var1, _A var2) {
      EXF.getInstance().ICO();

      try {
         if (var2 != null) {
            if (var2.getTitle(this.QVQ).length() == 0) {
               ((ComboBoxRequiredText)this.GXH).IEU().set(!((ComboBoxRequiredText)this.GXH).IFB());
            } else {
               ((ComboBoxRequiredText)this.GXH).IEU().set(true);
            }
         } else {
            ((ComboBoxRequiredText)this.GXH).IEU().set(!((ComboBoxRequiredText)this.GXH).IFB());
         }

         super.IFV(var1, var2);
      } finally {
         EXF.getInstance().ICP();
      }

   }
}
