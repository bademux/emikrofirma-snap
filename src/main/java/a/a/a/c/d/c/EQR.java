package a.a.a.c.d.c;

import a.a.a.c.d.c.a.EQT;
import a.a.a.c.d.c.a.EQU;
import a.a.a.c.d.c.a.EQV;
import a.a.a.c.d.c.a.EQW;

public enum EQR {
   NIP(new EQW()),
   PESEL(new EQV()),
   REGON(new EQT()),
   AccountNumber(new EQU());

   private final EQS<?> FXI;

   private EQR(EQS var3) {
      this.FXI = var3;
   }

   public EQS<?> getValidator() {
      return this.FXI;
   }
}
