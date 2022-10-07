package a.a.a.c.c.e.b.b;

import a.a.a.b.f.FFK;
import a.a.a.c.c.a.ELZ;
import a.a.a.c.c.a.a.ELU;
import a.a.a.c.c.a.b.ELV;
import a.a.a.c.c.c.ENH;
import a.a.a.c.c.d.EOS;
import a.a.a.c.c.e.b.a.ERY;
import a.a.a.c.c.e.b.c.ESC;
import a.a.a.c.f.LN;
import a.a.a.c.g.b.FCW;
import java.util.ArrayList;
import java.util.List;

public class ESB extends ELZ {
   public static final EOS GBR;

   public ESB() {
   }

   public String getName() {
      return GBR.getProcessName();
   }

   public String getTitle(ENH var1) throws FFK {
      switch (var1) {
         case MAIN:
            return FCW.getInstance().getMessageForKey("micro.user.button.main.title");
         case TOP_MENU:
            return FCW.getInstance().getMessageForKey("micro.user.button.top.title");
         case LEFT_BAR:
            return FCW.getInstance().getMessageForKey("micro.user.button.left.title");
         default:
            throw new FFK("Invalid anchor type [" + var1 + "]!");
      }
   }

   public String getFXML() {
      return GBR.getProcessFxmlFileName();
   }

   public Class<? extends ELV> getProcessImplementationClass() {
      return ESC.class;
   }

   public Class<? extends ELU<?>> getProcessControllerWindowClass() {
      return ERY.class;
   }

   public List<LN> getObjectClasses() {
      ArrayList var1 = new ArrayList();
      var1.add(new LN(LN.LO.USER_DATA));
      return var1;
   }

   static {
      GBR = EOS.USER;
   }
}
