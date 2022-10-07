package a.a.a.c.f.c.b;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.c.c.DatePickerRequired;
import java.time.LocalDate;

public class FAL<_T extends DatePickerRequired> extends FAM<_T> {
   public FAL(_T var1) {
      super(var1);
   }

   protected void IFV(LocalDate var1, LocalDate var2) {
      EXF.getInstance().ICO();

      try {
         if (var2 != null) {
            ((DatePickerRequired)this.GXS).IEU().set(true);
         } else {
            ((DatePickerRequired)this.GXS).IEU().set(!((DatePickerRequired)this.GXS).IFB());
         }

         super.IFV(var1, var2);
      } finally {
         EXF.getInstance().ICP();
      }

   }
}
