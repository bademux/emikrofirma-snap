package a.a.a.c.d.e.b;

import a.a.a.c.d.e.EQY;
import a.a.a.c.d.e.QRX;
import a.a.a.c.f.a.e.HO;
import a.a.a.c.f.b.c.a.KL;
import a.a.a.c.f.b.c.a.QSV;
import java.math.BigDecimal;

public class QSD implements QRX<HO> {
   protected final boolean QWH;

   public QSD(boolean var1) {
      this.QWH = var1;
   }

   public HO RIB(HO var1, HO var2) {
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      if (var1 != null) {
         if (var2.DBG().compareTo(var1.DBG()) == 0 && var2.DBI().compareTo(var1.DBI()) == 0 && var2.DBN().compareTo(var1.DBN()) == 0) {
            if (var2.DBK().compareTo(var1.DBK()) != 0) {
               var4 = true;
               var5 = true;
            } else if (var2.DBL().compareTo(var1.DBL()) != 0) {
               var5 = true;
            }
         } else {
            var3 = true;
            var4 = true;
            var5 = true;
         }
      } else {
         var3 = true;
         var4 = true;
         var5 = true;
      }

      BigDecimal var6;
      if (var3) {
         var6 = EQY.HRH((BigDecimal)var2.DBI().getValue(), (BigDecimal)var2.DBG().getValue());
         var2.DBK().setValue(var6);
      }

      if (var4) {
         var6 = BigDecimal.ZERO;
         if (!((KL)var2.DBN().getValue()).DEQ() || !this.QWH) {
            var6 = ((KL)var2.DBN().getValue()).getRate().divide(new BigDecimal(100)).setScale(EQY.FYD);
         }

         var6 = EQY.HRH((BigDecimal)var2.DBK().getValue(), var6);
         var2.DBL().setValue(var6);
      }

      if (var5) {
         var6 = BigDecimal.ZERO;
         BigDecimal var7 = (BigDecimal)var2.DBK().getValue();
         if (!((KL)var2.DBN().getValue()).DEQ() || !this.QWH) {
            var6 = (BigDecimal)var2.DBL().getValue();
         }

         var6 = EQY.HRI(var7, var6);
         var2.DBM().setValue(var6);
      }

      var2.RIG().setValue(QSV.NET);
      var2.RIF().setValue(EQY.getBrutValue((BigDecimal)var2.DBI().getValue(), (KL)var2.DBN().getValue()));
      return var2;
   }
}
