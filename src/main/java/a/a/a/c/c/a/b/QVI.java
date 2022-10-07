package a.a.a.c.c.a.b;

import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.b.EDF;
import a.a.a.c.e.a.d.EVZ;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.g.IY;
import a.a.a.c.f.a.h.JF;
import a.a.a.c.f.a.h.JG;
import a.a.a.c.f.a.h.JH;
import a.a.a.c.f.b.b.JN;
import a.a.a.c.f.b.c.a.KH;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public abstract class QVI extends ELV {
   private boolean RHE = false;

   protected QVI(String var1) {
      super(var1);
   }

   public SortedMap<String, SortedSet<KH>> getPossibleDates() throws FFK, FFO {
      IY var1 = new IY(JF.class, (JN)null, JH.VAT, (Enum)null);
      EVZ var2 = this.getModelManager().HJY(this.getParentDefinition(), var1);
      TreeMap var3 = new TreeMap();
      Iterator var6 = ((List)var2.getSecondValue()).iterator();

      while(var6.hasNext()) {
         EDF var7 = (EDF)var6.next();
         JN var8 = var7.getPeriod();
         if (!var8.equals(JN.AOE)) {
            String var4 = String.valueOf(var8.getYear().getValue());
            String var5 = String.valueOf(var8.getMonth().getValue());
            if (Integer.valueOf(var4) >= 0 && Integer.valueOf(var5) >= 0) {
               if (var3.get(var4) == null) {
                  var3.put(var4, new TreeSet());
               }

               ((SortedSet)var3.get(var4)).add(KH.getMonthByIntValue(Integer.valueOf(var5)));
            }
         } else {
            this.RHE = true;
         }
      }

      return var3;
   }

   public boolean RKH() {
      return this.RHE;
   }

   public JG getSettlementStatus(LocalDate var1) throws FFK, FFO {
      EXF.getInstance().ICO();

      JG var7;
      try {
         JN var2 = new JN(Date.from(var1.atStartOfDay(ZoneId.systemDefault()).toInstant()));
         IY var3 = new IY(JF.class, var2, JH.VAT, (Enum)null);
         EVZ var4 = this.getModelManager().HJY(this.getParentDefinition(), var3);
         if (((List)var4.getSecondValue()).size() > 1) {
            throw new FFO("More than one settlement per one period!");
         }

         Iterator var5 = ((List)var4.getSecondValue()).iterator();
         if (!var5.hasNext()) {
            return null;
         }

         EDF var6 = (EDF)var5.next();
         var7 = ((JF)var6.getModelBaseElementWithIdObject()).getSettlementStatus();
      } finally {
         EXF.getInstance().ICP();
      }

      return var7;
   }

   public boolean RKI(JN var1) throws FFK, FFO {
      EXF.getInstance().ICO();

      boolean var3;
      try {
         JG var2 = this.getSettlementStatus(var1);
         if (var2 == JG.SETTLED) {
            var3 = true;
            return var3;
         }

         var3 = false;
      } finally {
         EXF.getInstance().ICP();
      }

      return var3;
   }

   public JG getSettlementStatus(JN var1) throws FFK, FFO {
      EXF.getInstance().ICO();

      Iterator var4;
      try {
         IY var2 = new IY(JF.class, var1, JH.VAT, (Enum)null);
         EVZ var3 = this.getModelManager().HJY(this.getParentDefinition(), var2);
         if (((List)var3.getSecondValue()).size() > 1) {
            throw new FFO("More than one settlement per one period!");
         }

         var4 = ((List)var3.getSecondValue()).iterator();
         if (var4.hasNext()) {
            EDF var5 = (EDF)var4.next();
            JG var6 = ((JF)var5.getModelBaseElementWithIdObject()).getSettlementStatus();
            return var6;
         }

      } finally {
         EXF.getInstance().ICP();
      }

      return null;
   }
}
