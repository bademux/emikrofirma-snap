package a.a.a.c.c.e.a.a.c;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.g.b.FCW;
import java.util.regex.Pattern;

public enum ERP {
   text(FCW.getInstance().getMessageForKey("micro.config.controll.element.type.text")),
   year(FCW.getInstance().getMessageForKey("micro.config.controll.element.type.year")),
   month(FCW.getInstance().getMessageForKey("micro.config.controll.element.type.month")),
   day(FCW.getInstance().getMessageForKey("micro.config.controll.element.type.day")),
   sequence1(FCW.getInstance().getMessageForKey("micro.config.controll.element.type.sequence.month.1"), (String)null, FCW.getInstance().getMessageForKey("micro.config.controll.element.type.sequence.month.1.list")),
   sequence2(FCW.getInstance().getMessageForKey("micro.config.controll.element.type.sequence.month.2"), (String)null, FCW.getInstance().getMessageForKey("micro.config.controll.element.type.sequence.month.2.list")),
   sequence3(FCW.getInstance().getMessageForKey("micro.config.controll.element.type.sequence.month.3"), (String)null, FCW.getInstance().getMessageForKey("micro.config.controll.element.type.sequence.month.3.list")),
   ysequence1(FCW.getInstance().getMessageForKey("micro.config.controll.element.type.sequence.year.1"), (String)null, FCW.getInstance().getMessageForKey("micro.config.controll.element.type.sequence.year.1.list")),
   ysequence2(FCW.getInstance().getMessageForKey("micro.config.controll.element.type.sequence.year.2"), (String)null, FCW.getInstance().getMessageForKey("micro.config.controll.element.type.sequence.year.2.list")),
   hsequence1(FCW.getInstance().getMessageForKey("micro.config.controll.element.type.sequence.halfyear.1"), (String)null, FCW.getInstance().getMessageForKey("micro.config.controll.element.type.sequence.halfyear.1.list")),
   hsequence2(FCW.getInstance().getMessageForKey("micro.config.controll.element.type.sequence.halfyear.2"), (String)null, FCW.getInstance().getMessageForKey("micro.config.controll.element.type.sequence.halfyear.2.list")),
   qsequence1(FCW.getInstance().getMessageForKey("micro.config.controll.element.type.sequence.quarter.1"), (String)null, FCW.getInstance().getMessageForKey("micro.config.controll.element.type.sequence.quarter.1.list")),
   qsequence2(FCW.getInstance().getMessageForKey("micro.config.controll.element.type.sequence.quarter.2"), (String)null, FCW.getInstance().getMessageForKey("micro.config.controll.element.type.sequence.quarter.2.list")),
   separator_slash((String)null, "/"),
   separator_backslash((String)null, "\\"),
   separator_underscore((String)null, "_"),
   separator_minus((String)null, "-"),
   const_F((String)null, "F"),
   const_FVAT((String)null, "FVAT"),
   const_F_VAT((String)null, "F_VAT"),
   const_FV((String)null, "FV"),
   const_FA((String)null, "FA"),
   const_FK((String)null, "FK"),
   const_KOR((String)null, "KOR");

   public static String GAO = "[" + Pattern.quote(separator_slash.getLiteral()) + Pattern.quote(separator_backslash.getLiteral()) + Pattern.quote(separator_underscore.getLiteral()) + Pattern.quote(separator_minus.getLiteral()) + "]{1}";
   private final String GAP;
   private final String GAQ;
   private final String QZR;

   private ERP(String var3) {
      this(var3, (String)null);
   }

   private ERP(String var3, String var4) {
      this(var3, var4, (String)null);
   }

   private ERP(String var3, String var4, String var5) {
      EXF.getInstance().ICO();

      try {
         this.GAP = var3;
         this.GAQ = var4;
         this.QZR = var5;
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public String getDescription() {
      return this.GAP;
   }

   public String getLiteral() {
      return this.GAQ;
   }

   public String getListDescription() {
      return this.QZR;
   }

   public static ERP HSD(String var0) {
      if (var0 != null) {
         ERP[] var1 = values();
         int var2 = var1.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            ERP var4 = var1[var3];
            if (var0.equals(var4.getLiteral())) {
               return var4;
            }
         }
      }

      return null;
   }

   public static ERP RKJ(String var0) {
      if (var0 != null) {
         ERP[] var1 = values();
         int var2 = var1.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            ERP var4 = var1[var3];
            if (var0.equals(var4.name())) {
               return var4;
            }
         }
      }

      return null;
   }
}
