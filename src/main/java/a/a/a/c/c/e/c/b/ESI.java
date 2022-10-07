package a.a.a.c.c.e.c.b;

import a.a.a.b.f.FFK;
import a.a.a.c.c.a.ELZ;
import a.a.a.c.c.a.a.ELU;
import a.a.a.c.c.a.b.ELV;
import a.a.a.c.c.c.ENH;
import a.a.a.c.c.d.EOS;
import a.a.a.c.c.e.c.a.ESG;
import a.a.a.c.c.e.c.c.ESJ;
import a.a.a.c.f.LN;
import a.a.a.c.g.b.FCW;
import java.util.ArrayList;
import java.util.List;

public class ESI extends ELZ {
   public static final EOS GCR;
   public static final String QNB = "invoicesSettlements_generateAndSend_JPK.fxml";
   public static final String GCT = "invoices_settlements_create_empty.fxml";

   public ESI() {
   }

   public String getName() {
      return GCR.getProcessName();
   }

   public String getTitle(ENH var1) throws FFK {
      switch (var1) {
         case MAIN:
            return FCW.getInstance().getMessageForKey("micro.process.invoices_settlements.menu.title");
         case LEFT_BAR:
            return FCW.getInstance().getMessageForKey("micro.process.invoices_settlements.left_bar.title");
         default:
            throw new FFK("Invalid anchor type [" + var1 + "]!");
      }
   }

   public String getFXML() {
      return GCR.getProcessFxmlFileName();
   }

   public Class<? extends ELV> getProcessImplementationClass() {
      return ESJ.class;
   }

   public Class<? extends ELU<?>> getProcessControllerWindowClass() {
      return ESG.class;
   }

   public List<LN> getObjectClasses() {
      ArrayList var1 = new ArrayList();
      var1.add(new LN(LN.LO.SETTLEMENT));
      var1.add(new LN(LN.LO.INVOICE));
      var1.add(new LN(LN.LO.INVOICERECORD));
      var1.add(new LN(LN.LO.DECLARATION));
      var1.add(new LN(LN.LO.CONFIGURATION_PROPERTIES));
      return var1;
   }

   static {
      GCR = EOS.INVOICES_SETTLEMENTS;
   }
}
