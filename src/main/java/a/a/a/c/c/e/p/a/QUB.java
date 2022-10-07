package a.a.a.c.c.e.p.a;

import a.a.a.c.f.b.JM;

public enum QUB implements JM {
   CORRECT_ART89B_UST1("CORRECT_ART89B_UST1"),
   CORRECT_ART89B_UST4("CORRECT_ART89B_UST4"),
   CORRECT_FIXED_ASSETS("TAX_FIXED_ASSETS"),
   CORRECT_OTHER_ACQUISITIONS("CORRECT_OTHER_ACQUISITIONS");

   private final String RCQ;

   private QUB(String var3) {
      this.RCQ = var3;
   }

   public String getDescription() {
      return this.RCQ;
   }

   public int DAQ(JM var1) {
      return this.compareTo((QUB)var1);
   }

   public JM[] getEnumTypeValues() {
      return values();
   }
}
