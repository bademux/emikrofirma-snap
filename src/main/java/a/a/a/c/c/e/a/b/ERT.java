package a.a.a.c.c.e.a.b;

import a.a.a.b.f.FFK;
import a.a.a.c.c.a.ELZ;
import a.a.a.c.c.a.a.ELU;
import a.a.a.c.c.a.b.ELV;
import a.a.a.c.c.c.ENH;
import a.a.a.c.c.d.EOS;
import a.a.a.c.c.e.a.a.ERN;
import a.a.a.c.c.e.a.c.ERU;
import a.a.a.c.f.LN;
import a.a.a.c.g.b.FCW;
import java.util.ArrayList;
import java.util.List;

public class ERT extends ELZ {
   public static final EOS GBH;

   public ERT() {
   }

   public String getName() {
      return GBH.getProcessName();
   }

   public String getTitle(ENH var1) throws FFK {
      switch (var1) {
         case MAIN:
            return FCW.getInstance().getMessageForKey("micro.config.button.main.title");
         case TOP_MENU:
            return FCW.getInstance().getMessageForKey("micro.config.button.top.title");
         case LEFT_BAR:
            return FCW.getInstance().getMessageForKey("micro.config.button.left.title");
         default:
            throw new FFK("Invalid anchor type [" + var1 + "]!");
      }
   }

   public String getFXML() {
      return GBH.getProcessFxmlFileName();
   }

   public Class<? extends ELV> getProcessImplementationClass() {
      return ERU.class;
   }

   public Class<? extends ELU<?>> getProcessControllerWindowClass() {
      return ERN.class;
   }

   public List<LN> getObjectClasses() {
      ArrayList var1 = new ArrayList();
      var1.add(new LN(LN.LO.CONFIGURATION_PROPERTIES));
      return var1;
   }

   static {
      GBH = EOS.CONFIG;
   }
}
