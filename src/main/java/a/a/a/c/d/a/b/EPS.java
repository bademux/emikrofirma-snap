package a.a.a.c.d.a.b;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.b.AHCB;
import a.a.a.c.f.a.c.a.c.AHDS;
import a.a.a.c.f.a.c.a.c.AHDT;
import java.util.Map;

public class EPS implements AHCB<Map<AHDS, AHDT>> {
   private final AHDS FTX;
   private final AHDS FTY;
   private final AHDS FTZ;
   private final AHDS FUA;
   private final AHDS FUB;
   private final AHDS FUC;
   private final AHDS FUD;
   private final AHDS FUE;

   public EPS(String var1, String var2, String var3, String var4, String var5, String var6, String var7, String var8) {
      EXF.getInstance().ICO();

      try {
         this.FTX = AHDS.valueOf(var1);
         this.FTY = AHDS.valueOf(var2);
         this.FTZ = AHDS.valueOf(var3);
         this.FUA = AHDS.valueOf(var4);
         this.FUB = AHDS.valueOf(var5);
         this.FUC = AHDS.valueOf(var6);
         this.FUD = AHDS.valueOf(var7);
         this.FUE = AHDS.valueOf(var8);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public boolean AIBY(Map<AHDS, AHDT> var1) {
      EXF.getInstance().ICO();
      EXF.getInstance().ICK("fields " + var1);
      EXF.getInstance().ICK("postalFieldName_KodKraju " + this.FTX);
      EXF.getInstance().ICK("postalFieldName_Wojewodztwo " + this.FTY);
      EXF.getInstance().ICK("postalFieldName_Powiat " + this.FTZ);
      EXF.getInstance().ICK("postalFieldName_Gmina " + this.FUA);
      EXF.getInstance().ICK("postalFieldName_Ulica " + this.FUB);
      EXF.getInstance().ICK("postalFieldName_Miejscowosc " + this.FUC);
      EXF.getInstance().ICK("postalFieldName_KodPocztowy " + this.FUD);
      EXF.getInstance().ICK("postalFieldName_Poczta " + this.FUE);

      boolean var10;
      try {
         AHDT var2 = (AHDT)var1.get(this.FTX);
         AHDT var3 = (AHDT)var1.get(this.FTY);
         AHDT var4 = (AHDT)var1.get(this.FTZ);
         AHDT var5 = (AHDT)var1.get(this.FUA);
         AHDT var6 = (AHDT)var1.get(this.FUB);
         AHDT var7 = (AHDT)var1.get(this.FUC);
         AHDT var8 = (AHDT)var1.get(this.FUD);
         AHDT var9 = (AHDT)var1.get(this.FUE);
         EXF.getInstance().ICK("postalField_KodKraju " + var2);
         EXF.getInstance().ICK("postalField_Wojewodztwo " + var3);
         EXF.getInstance().ICK("postalField_Powiat " + var4);
         EXF.getInstance().ICK("postalField_Gmina " + var5);
         EXF.getInstance().ICK("postalField_Ulica " + var6);
         EXF.getInstance().ICK("postalField_Miejscowosc " + var7);
         EXF.getInstance().ICK("postalField_KodPocztowy " + var8);
         EXF.getInstance().ICK("postalField_Poczta " + var9);
         var10 = false;
      } finally {
         EXF.getInstance().ICP();
      }

      return var10;
   }

   public String getContextString(Map<AHDS, AHDT> var1) {
      EXF.getInstance().ICO();
      EXF.getInstance().ICK("fields " + var1);
      EXF.getInstance().ICK("postalFieldName_KodKraju " + this.FTX);
      EXF.getInstance().ICK("postalFieldName_Wojewodztwo " + this.FTY);
      EXF.getInstance().ICK("postalFieldName_Powiat " + this.FTZ);
      EXF.getInstance().ICK("postalFieldName_Gmina " + this.FUA);
      EXF.getInstance().ICK("postalFieldName_Ulica " + this.FUB);
      EXF.getInstance().ICK("postalFieldName_Miejscowosc " + this.FUC);
      EXF.getInstance().ICK("postalFieldName_KodPocztowy " + this.FUD);
      EXF.getInstance().ICK("postalFieldName_Poczta " + this.FUE);

      String var11;
      try {
         AHDT var2 = (AHDT)var1.get(this.FTX);
         AHDT var3 = (AHDT)var1.get(this.FTY);
         AHDT var4 = (AHDT)var1.get(this.FTZ);
         AHDT var5 = (AHDT)var1.get(this.FUA);
         AHDT var6 = (AHDT)var1.get(this.FUB);
         AHDT var7 = (AHDT)var1.get(this.FUC);
         AHDT var8 = (AHDT)var1.get(this.FUD);
         AHDT var9 = (AHDT)var1.get(this.FUE);
         EXF.getInstance().ICK("postalField_KodKraju " + var2);
         EXF.getInstance().ICK("postalField_Wojewodztwo " + var3);
         EXF.getInstance().ICK("postalField_Powiat " + var4);
         EXF.getInstance().ICK("postalField_Gmina " + var5);
         EXF.getInstance().ICK("postalField_Ulica " + var6);
         EXF.getInstance().ICK("postalField_Miejscowosc " + var7);
         EXF.getInstance().ICK("postalField_KodPocztowy " + var8);
         EXF.getInstance().ICK("postalField_Poczta " + var9);
         StringBuilder var10 = new StringBuilder();
         var10.append(this.FTX).append(" (").append(var2.getValue()).append("), ");
         var10.append(this.FTY).append(" (").append(var3.getValue()).append("), ");
         var10.append(this.FTZ).append(" (").append(var4.getValue()).append("), ");
         var10.append(this.FUA).append(" (").append(var5.getValue()).append("), ");
         var10.append(this.FUB).append(" (").append(var6.getValue()).append("), ");
         var10.append(this.FUC).append(" (").append(var7.getValue()).append("), ");
         var10.append(this.FUD).append(" (").append(var8.getValue()).append("), ");
         var10.append(this.FUE).append(" (").append(var9.getValue()).append(") ");
         var11 = var10.toString();
      } finally {
         EXF.getInstance().ICP();
      }

      return var11;
   }
}
