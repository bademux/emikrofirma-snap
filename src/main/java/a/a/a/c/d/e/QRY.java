package a.a.a.c.d.e;

import a.a.a.c.d.e.b.QSA;
import a.a.a.c.d.e.b.QSB;
import a.a.a.c.d.e.b.QSD;
import a.a.a.c.d.e.b.QSE;
import a.a.a.c.f.b.c.a.QSV;

public class QRY {
   public QRY() {
   }

   public static QRX getInvoiceCalculationMethod(QSV var0, boolean var1) {
      if (var0 == QSV.NET) {
         return new QSD(var1);
      } else {
         return var0 == QSV.GROSS ? new QSA(var1) : null;
      }
   }

   public static QRX getReceiptCalculationMethod(QSV var0) {
      if (var0 == QSV.NET) {
         return new QSE();
      } else {
         return var0 == QSV.GROSS ? new QSB() : null;
      }
   }
}
