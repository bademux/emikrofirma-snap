package a.a.a.c.d.f;

import a.a.a.c.e.a.d.EVZ;
import a.a.a.c.f.a.e.HN;
import a.a.a.c.f.a.e.HU;
import a.a.a.c.f.a.n.QSG;
import a.a.a.c.f.a.n.QSN;
import a.a.a.c.f.b.c.a.KL;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;

public class ERA extends ERC {
   public ERA(HN<?> var1) {
      super(true);
      HU var2 = (HU)var1;
      HashMap var3 = new HashMap();
      Iterator var4 = var2.getSumOfAmountsDividedByTaxRate().iterator();

      while(var4.hasNext()) {
         EVZ var5 = (EVZ)var4.next();
         var3.put(var5.getFirstValue(), var5.getSecondValue());
      }

      this.getForAll().setGrossPrice((BigDecimal)var2.DAV().getValue());
      this.getForAll().setNetPrice((BigDecimal)var2.DAW().getValue());
      this.getForAll().setVatPrice((BigDecimal)var2.DAX().getValue());
      this.getForAll().setVat23Amount((BigDecimal)var3.get(KL.RATE_23));
      this.getForAll().setVat8Amount((BigDecimal)var3.get(KL.RATE_8));
      this.getForAll().setVat5Amount((BigDecimal)var3.get(KL.RATE_5));
      this.getForAll().setVat4Amount((BigDecimal)var3.get(KL.RATE_4));
      this.getForAll().setVat0Amount((BigDecimal)var3.get(KL.RATE_0));
      this.getForAll().setVatZwAmount((BigDecimal)var3.get(KL.ZW));
      this.getForAll().setVatNpAmount((BigDecimal)var3.get(KL.NP));
      this.getForAll().setVatOo23Amount((BigDecimal)var3.get(KL.OO_23));
      this.getForAll().setVatOo8Amount((BigDecimal)var3.get(KL.OO_8));
      HashMap var8 = new HashMap();
      Iterator var7 = var2.getAmountOfTaxDividedByTaxRate().iterator();

      while(var7.hasNext()) {
         EVZ var6 = (EVZ)var7.next();
         var8.put(var6.getFirstValue(), var6.getSecondValue());
      }

      this.getForAll().setVat23Tax((BigDecimal)var8.get(KL.RATE_23));
      this.getForAll().setVat8Tax((BigDecimal)var8.get(KL.RATE_8));
      this.getForAll().setVat5Tax((BigDecimal)var8.get(KL.RATE_5));
      this.getForAll().setVat4Tax((BigDecimal)var8.get(KL.RATE_4));
      this.getForAll().setVat0Tax((BigDecimal)var8.get(KL.RATE_0));
      this.getForAll().setVatZwTax((BigDecimal)var8.get(KL.ZW));
      this.getForAll().setVatNpTax((BigDecimal)var8.get(KL.NP));
      this.getForAll().setVatOo23Tax((BigDecimal)var8.get(KL.OO_23));
      this.getForAll().setVatOo8Tax((BigDecimal)var8.get(KL.OO_8));
   }

   public ERA(QSG<?> var1) {
      super(true);
      QSN var2 = (QSN)var1;
      HashMap var3 = new HashMap();
      Iterator var4 = var2.getSumOfAmountsDividedByTaxRate().iterator();

      while(var4.hasNext()) {
         EVZ var5 = (EVZ)var4.next();
         var3.put(var5.getFirstValue(), var5.getSecondValue());
      }

      this.getForAll().setGrossPrice((BigDecimal)var2.RIT().getValue());
      this.getForAll().setNetPrice((BigDecimal)var2.RIU().getValue());
      this.getForAll().setVatPrice((BigDecimal)var2.RIV().getValue());
      this.getForAll().setVat23Amount((BigDecimal)var3.get(KL.RATE_23));
      this.getForAll().setVat8Amount((BigDecimal)var3.get(KL.RATE_8));
      this.getForAll().setVat5Amount((BigDecimal)var3.get(KL.RATE_5));
      this.getForAll().setVat4Amount((BigDecimal)var3.get(KL.RATE_4));
      this.getForAll().setVat0Amount((BigDecimal)var3.get(KL.RATE_0));
      this.getForAll().setVatZwAmount((BigDecimal)var3.get(KL.ZW));
      this.getForAll().setVatNpAmount((BigDecimal)var3.get(KL.NP));
      this.getForAll().setVatOo23Amount((BigDecimal)var3.get(KL.OO_23));
      this.getForAll().setVatOo8Amount((BigDecimal)var3.get(KL.OO_8));
      HashMap var8 = new HashMap();
      Iterator var7 = var2.getAmountOfTaxDividedByTaxRate().iterator();

      while(var7.hasNext()) {
         EVZ var6 = (EVZ)var7.next();
         var8.put(var6.getFirstValue(), var6.getSecondValue());
      }

      this.getForAll().setVat23Tax((BigDecimal)var8.get(KL.RATE_23));
      this.getForAll().setVat8Tax((BigDecimal)var8.get(KL.RATE_8));
      this.getForAll().setVat5Tax((BigDecimal)var8.get(KL.RATE_5));
      this.getForAll().setVat4Tax((BigDecimal)var8.get(KL.RATE_4));
      this.getForAll().setVat0Tax((BigDecimal)var8.get(KL.RATE_0));
      this.getForAll().setVatZwTax((BigDecimal)var8.get(KL.ZW));
      this.getForAll().setVatNpTax((BigDecimal)var8.get(KL.NP));
      this.getForAll().setVatOo23Tax((BigDecimal)var8.get(KL.OO_23));
      this.getForAll().setVatOo8Tax((BigDecimal)var8.get(KL.OO_8));
   }
}
