package a.a.a.c.f.a.c.a;

import a.a.a.c.g.b.FCW;

public enum AHCJ {
   WARNING(false, FCW.getInstance().getMessageForKey("micro.rules.actiontype.warning")),
   ERROR(true, FCW.getInstance().getMessageForKey("micro.rules.actiontype.error"));

   private final boolean AHUD;
   private final String AHUE;

   private AHCJ(boolean var3, String var4) {
      this.AHUD = var3;
      this.AHUE = var4;
   }

   public boolean AIDA() {
      return this.AHUD;
   }

   public String getDescription() {
      return this.AHUE;
   }
}
