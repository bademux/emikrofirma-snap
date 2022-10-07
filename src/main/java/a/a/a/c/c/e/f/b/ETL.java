package a.a.a.c.c.e.f.b;

import a.a.a.b.f.FFK;
import a.a.a.c.c.a.ELZ;
import a.a.a.c.c.a.a.ELU;
import a.a.a.c.c.a.b.ELV;
import a.a.a.c.c.c.ENH;
import a.a.a.c.c.d.EOS;
import a.a.a.c.c.e.f.a.ETJ;
import a.a.a.c.c.e.f.c.ETM;
import a.a.a.c.f.LN;
import a.a.a.c.g.b.FCW;
import java.util.ArrayList;
import java.util.List;

public class ETL extends ELZ {
   public static final EOS GHN;

   public ETL() {
   }

   public String getName() {
      return GHN.getProcessName();
   }

   public String getTitle(ENH var1) throws FFK {
      switch (var1) {
         case MAIN:
            return FCW.getInstance().getMessageForKey("micro.process.invoices_records.menu.title");
         case LEFT_BAR:
            return FCW.getInstance().getMessageForKey("micro.process.invoices_records.left_bar.title");
         default:
            throw new FFK("Invalid anchor type [" + var1 + "]!");
      }
   }

   public String getFXML() {
      return GHN.getProcessFxmlFileName();
   }

   public Class<? extends ELV> getProcessImplementationClass() {
      return ETM.class;
   }

   public Class<? extends ELU<?>> getProcessControllerWindowClass() {
      return ETJ.class;
   }

   public List<LN> getObjectClasses() {
      ArrayList var1 = new ArrayList();
      var1.add(new LN(LN.LO.CONFIGURATION_PROPERTIES));
      var1.add(new LN(LN.LO.INVOICERECORD));
      var1.add(new LN(LN.LO.USER_DATA));
      return var1;
   }

   static {
      GHN = EOS.INVOICES_RECORDS;
   }
}
