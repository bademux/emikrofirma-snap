package a.a.a.c.d.f;

import a.a.a.c.e.a.d.EVZ;
import a.a.a.c.f.a.e.HN;
import a.a.a.c.f.a.e.HV;
import a.a.a.c.f.b.c.a.KL;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;

public class ERE extends ERC {
   public ERE(HN<?> var1) {
      super(true);
      HN var2 = var1.getParentInvoiceOnlyActive();
      HashMap var3 = new HashMap();
      Iterator var4 = var2.getSumOfAmountsDividedByTaxRate().iterator();

      while(var4.hasNext()) {
         EVZ var5 = (EVZ)var4.next();
         var3.put(var5.getFirstValue(), var5.getSecondValue());
      }

      HashMap var16 = new HashMap();
      Iterator var17 = var2.getAmountOfTaxDividedByTaxRate().iterator();

      while(var17.hasNext()) {
         EVZ var6 = (EVZ)var17.next();
         var16.put(var6.getFirstValue(), var6.getSecondValue());
      }

      HashMap var18 = new HashMap();
      Iterator var19 = var1.getSumOfAmountsDividedByTaxRate().iterator();

      while(var19.hasNext()) {
         EVZ var7 = (EVZ)var19.next();
         var18.put(var7.getFirstValue(), var7.getSecondValue());
      }

      HashMap var20 = new HashMap();
      Iterator var21 = var1.getAmountOfTaxDividedByTaxRate().iterator();

      while(var21.hasNext()) {
         EVZ var8 = (EVZ)var21.next();
         var20.put(var8.getFirstValue(), var8.getSecondValue());
      }

      HV var22 = (HV)var1;
      HashMap var23 = new HashMap();
      KL[] var9 = KL.values();
      int var10 = var9.length;

      int var11;
      BigDecimal var14;
      for(var11 = 0; var11 < var10; ++var11) {
         KL var12 = var9[var11];
         BigDecimal var13 = (BigDecimal)var3.get(var12);
         if (var13 == null) {
            var13 = BigDecimal.ZERO;
         }

         var14 = (BigDecimal)var18.get(var12);
         if (var14 == null) {
            var14 = BigDecimal.ZERO;
         }

         var23.put(var12, var14.subtract(var13));
      }

      this.getForAll().setGrossPrice((BigDecimal)var22.DBZ().getValue());
      this.getForAll().setNetPrice((BigDecimal)var22.DCA().getValue());
      this.getForAll().setVatPrice((BigDecimal)var22.DCB().getValue());
      this.getForAll().setVat23Amount((BigDecimal)var23.get(KL.RATE_23));
      this.getForAll().setVat8Amount((BigDecimal)var23.get(KL.RATE_8));
      this.getForAll().setVat5Amount((BigDecimal)var23.get(KL.RATE_5));
      this.getForAll().setVat4Amount((BigDecimal)var23.get(KL.RATE_4));
      this.getForAll().setVat0Amount((BigDecimal)var23.get(KL.RATE_0));
      this.getForAll().setVatZwAmount((BigDecimal)var23.get(KL.ZW));
      this.getForAll().setVatNpAmount((BigDecimal)var23.get(KL.NP));
      this.getForAll().setVatOo23Amount((BigDecimal)var23.get(KL.OO_23));
      this.getForAll().setVatOo8Amount((BigDecimal)var23.get(KL.OO_8));
      HashMap var24 = new HashMap();
      KL[] var25 = KL.values();
      var11 = var25.length;

      for(int var26 = 0; var26 < var11; ++var26) {
         KL var27 = var25[var26];
         var14 = (BigDecimal)var16.get(var27);
         if (var14 == null) {
            var14 = BigDecimal.ZERO;
         }

         BigDecimal var15 = (BigDecimal)var20.get(var27);
         if (var15 == null) {
            var15 = BigDecimal.ZERO;
         }

         var24.put(var27, var15.subtract(var14));
      }

      this.getForAll().setVat23Tax((BigDecimal)var24.get(KL.RATE_23));
      this.getForAll().setVat8Tax((BigDecimal)var24.get(KL.RATE_8));
      this.getForAll().setVat5Tax((BigDecimal)var24.get(KL.RATE_5));
      this.getForAll().setVat4Tax((BigDecimal)var24.get(KL.RATE_4));
      this.getForAll().setVat0Tax((BigDecimal)var24.get(KL.RATE_0));
      this.getForAll().setVatZwTax((BigDecimal)var24.get(KL.ZW));
      this.getForAll().setVatNpTax((BigDecimal)var24.get(KL.NP));
      this.getForAll().setVatOo23Tax((BigDecimal)var24.get(KL.OO_23));
      this.getForAll().setVatOo8Tax((BigDecimal)var24.get(KL.OO_8));
   }
}
