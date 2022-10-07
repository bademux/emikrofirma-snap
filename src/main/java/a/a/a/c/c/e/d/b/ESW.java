package a.a.a.c.c.e.d.b;

import a.a.a.b.f.FFK;
import a.a.a.c.c.a.ELZ;
import a.a.a.c.c.a.a.ELU;
import a.a.a.c.c.a.b.ELV;
import a.a.a.c.c.c.ENH;
import a.a.a.c.c.d.EOS;
import a.a.a.c.c.e.d.a.EST;
import a.a.a.c.c.e.d.c.ESX;
import a.a.a.c.f.LN;
import a.a.a.c.g.b.FCW;
import java.util.ArrayList;
import java.util.List;

public class ESW extends ELZ {
   public static final EOS GFC;
   public static final String GFD = "invoicePurchaseNewLogic_addNewPosition.fxml";

   public ESW() {
   }

   public String getName() {
      return GFC.getProcessName();
   }

   public String getTitle(ENH var1) throws FFK {
      switch (var1) {
         case MAIN:
            return FCW.getInstance().getMessageForKey("micro.process.invoice_purchase_new.menu.title");
         default:
            throw new FFK("Invalid anchor type [" + var1 + "]!");
      }
   }

   public String getFXML() {
      return GFC.getProcessFxmlFileName();
   }

   public Class<? extends ELV> getProcessImplementationClass() {
      return ESX.class;
   }

   public Class<? extends ELU<?>> getProcessControllerWindowClass() {
      return EST.class;
   }

   public List<LN> getObjectClasses() {
      ArrayList var1 = new ArrayList();
      var1.add(new LN(LN.LO.CONFIGURATION_PROPERTIES));
      var1.add(new LN(LN.LO.INVOICE_PURCHASE));
      var1.add(new LN(LN.LO.SETTLEMENT));
      var1.add(new LN(LN.LO.DICTIONARY));
      var1.add(new LN(LN.LO.CONTRACTOR));
      return var1;
   }

   static {
      GFC = EOS.INVOICE_PURCHASE_NEW;
   }
}
