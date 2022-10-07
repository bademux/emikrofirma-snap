package a.a.a.c.f.a.c.a.e;

import a.a.a.c.g.b.FCW;

public enum AHEG {
   AND(FCW.getInstance().getMessageForKey("micro.rules.operator.and")),
   OR(FCW.getInstance().getMessageForKey("micro.rules.operator.or")),
   NOT(FCW.getInstance().getMessageForKey("micro.rules.operator.not")),
   XOR(FCW.getInstance().getMessageForKey("micro.rules.operator.xor")),
   NXOR(FCW.getInstance().getMessageForKey("micro.rules.operator.nxor")),
   IMPLY(FCW.getInstance().getMessageForKey("micro.rules.operator.imply"));

   private final String AHWP;

   private AHEG(String var3) {
      this.AHWP = var3;
   }

   public String getDescription() {
      return this.AHWP;
   }
}
