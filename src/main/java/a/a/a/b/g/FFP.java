package a.a.a.b.g;

import a.a.a.c.e.a.k.a.EXF;
import java.util.ArrayList;
import java.util.List;

public class FFP {
   private final Character HGM;
   private final Character HGN;

   public FFP(Character var1, Character var2) throws FFQ {
      EXF.getInstance().ICO();

      try {
         this.HGM = var1;
         this.HGN = var2;
         if (this.HGM == null || this.HGN == null) {
            throw new FFQ("quoteStringQualifier or quotedDelimiter null or empty!");
         }
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public List<String> ILL(String var1) throws FFQ {
      boolean var2 = false;
      boolean var3 = false;
      boolean var4 = false;
      ArrayList var5 = new ArrayList();
      String var6 = "";

      for(int var7 = 0; var7 < var1.length(); ++var7) {
         char var8 = var1.charAt(var7);
         if (var3) {
            var6 = var6 + var8;
            var4 = true;
            var3 = false;
         } else if (!var2 && this.HGN == var8) {
            var5.add(var6);
            var6 = "";
            var4 = false;
         } else if (!var2 && this.HGM == var8) {
            if (var4 && var1.length() > var7 + 1 && this.HGM != var1.charAt(var7 + 1)) {
               throw new FFQ("misplaced quotation mark (single quotation inside of the text [closed])");
            }

            var2 = true;
         } else if (var2 && this.HGM == var8) {
            if (var1.length() > var7 + 1 && this.HGM == var1.charAt(var7 + 1)) {
               var3 = true;
            } else if (var1.length() > var7 + 1 && this.HGN == var1.charAt(var7 + 1)) {
               var2 = false;
            } else {
               if (var1.length() != var7 + 1) {
                  throw new FFQ("misplaced quotation mark (single quotation inside of the text [opened])");
               }

               var2 = false;
            }
         } else {
            var6 = var6 + var8;
            var4 = true;
         }
      }

      if (!var2) {
         var5.add(var6);
         return var5;
      } else {
         throw new FFQ("quote still opened at the end of the line");
      }
   }

   public static class FFQ extends Exception {
      private static final long serialVersionUID = 4958096540597879098L;

      public FFQ() {
         super("default");
      }

      public FFQ(String var1, Throwable var2) {
         super(var1, var2);
      }

      public FFQ(String var1) {
         super(var1);
      }
   }
}
