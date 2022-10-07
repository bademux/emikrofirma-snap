package a.a.a.c.f.b.c.a;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.b.JM;
import a.a.a.c.g.b.FCW;

public enum KN implements JM {
   WOJ_02(FCW.getInstance().getMessageForKey("micro.model.type.voivodeship.woj_02")),
   WOJ_04(FCW.getInstance().getMessageForKey("micro.model.type.voivodeship.woj_04")),
   WOJ_06(FCW.getInstance().getMessageForKey("micro.model.type.voivodeship.woj_06")),
   WOJ_08(FCW.getInstance().getMessageForKey("micro.model.type.voivodeship.woj_08")),
   WOJ_10(FCW.getInstance().getMessageForKey("micro.model.type.voivodeship.woj_10")),
   WOJ_12(FCW.getInstance().getMessageForKey("micro.model.type.voivodeship.woj_12")),
   WOJ_14(FCW.getInstance().getMessageForKey("micro.model.type.voivodeship.woj_14")),
   WOJ_16(FCW.getInstance().getMessageForKey("micro.model.type.voivodeship.woj_16")),
   WOJ_18(FCW.getInstance().getMessageForKey("micro.model.type.voivodeship.woj_18")),
   WOJ_20(FCW.getInstance().getMessageForKey("micro.model.type.voivodeship.woj_20")),
   WOJ_22(FCW.getInstance().getMessageForKey("micro.model.type.voivodeship.woj_22")),
   WOJ_24(FCW.getInstance().getMessageForKey("micro.model.type.voivodeship.woj_24")),
   WOJ_26(FCW.getInstance().getMessageForKey("micro.model.type.voivodeship.woj_26")),
   WOJ_28(FCW.getInstance().getMessageForKey("micro.model.type.voivodeship.woj_28")),
   WOJ_30(FCW.getInstance().getMessageForKey("micro.model.type.voivodeship.woj_30")),
   WOJ_32(FCW.getInstance().getMessageForKey("micro.model.type.voivodeship.woj_32"));

   private final String APA;

   private KN(String var3) {
      EXF.getInstance().ICO();

      try {
         this.APA = var3;
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public String getDescription() {
      return this.APA;
   }

   public int DAQ(JM var1) {
      return this.compareTo((KN)var1);
   }

   public JM[] getEnumTypeValues() {
      return values();
   }
}
