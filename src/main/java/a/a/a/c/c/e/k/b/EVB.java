package a.a.a.c.c.e.k.b;

import a.a.a.b.f.FFK;
import a.a.a.c.c.a.ELZ;
import a.a.a.c.c.a.a.ELU;
import a.a.a.c.c.a.b.ELV;
import a.a.a.c.c.c.ENH;
import a.a.a.c.c.d.EOS;
import a.a.a.c.c.e.k.a.EUZ;
import a.a.a.c.c.e.k.c.EVC;
import a.a.a.c.f.LN;
import a.a.a.c.g.b.FCW;
import java.util.ArrayList;
import java.util.List;

public class EVB extends ELZ {
   public static final EOS GNN;
   public static final String GNO = "cash_register_new_item.fxml";

   public EVB() {
   }

   public String getName() {
      return GNN.getProcessName();
   }

   public String getTitle(ENH var1) throws FFK {
      switch (var1) {
         case MAIN:
            return FCW.getInstance().getMessageForKey("micro.process.cash_register_new.Title");
         default:
            throw new FFK("Invalid anchor type [" + var1 + "]!");
      }
   }

   public String getFXML() {
      return GNN.getProcessFxmlFileName();
   }

   public Class<? extends ELV> getProcessImplementationClass() {
      return EVC.class;
   }

   public Class<? extends ELU<?>> getProcessControllerWindowClass() {
      return EUZ.class;
   }

   public List<LN> getObjectClasses() {
      ArrayList var1 = new ArrayList();
      var1.add(new LN(LN.LO.RECEIPTRECORD));
      var1.add(new LN(LN.LO.SETTLEMENT));
      return var1;
   }

   static {
      GNN = EOS.CASH_REGISTER_NEW;
   }
}
