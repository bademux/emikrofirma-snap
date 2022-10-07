package a.a.a.c.c.c;

import a.a.a.b.f.FFI;
import a.a.a.c.c.a.ELZ;
import a.a.a.c.e.a.d.EVZ;
import a.a.a.c.e.a.d.EWD;
import a.a.a.c.e.a.k.a.EXF;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ENG {
   private static volatile ENG FMN;
   private final String FMO = "/config/processes.properties";
   private final Properties FMP;
   private final char FMQ = '[';
   private final char FMR = ']';
   private final String FMS = "micro.process";
   private final String RGV = "micro.global";
   private final String FMT = ".anchor";
   private final String RGW = ".definition";
   public static final String FMU = "anchors";
   public static final String FMV = "view.row";
   public static final String FMW = "view.col";
   public static final String FMX = "class.style";
   public static final String FMY = "position";
   public static final String RGX = "display.type";
   public static final String RGY = "context.position";
   public static final String FMZ = "definition";
   public static final String FNA = "lock.config";
   public static final String RGZ = "title";
   public static final String RHA = "class.style";
   public static final String RHB = "display.type";
   public static final String RHC = "lock.config";
   private Map<String, Map<String, Object>> FNB;
   private Map<ENH, Map<EWD<?>, Map<String, Object>>> RHD;

   public static ENG getInstance() {
      if (FMN == null) {
         Class var0 = ENG.class;
         synchronized(ENG.class) {
            if (FMN == null) {
               FMN = new ENG();
            }
         }
      }

      return FMN;
   }

   public ENG() {
      EXF.getInstance().ICO();
      InputStream var1 = null;

      try {
         var1 = ENG.class.getResourceAsStream("/config/processes.properties");
         this.FMP = new Properties();
         this.FMP.load(var1);
         this.HNH();
      } catch (IOException var10) {
         EXF.getInstance().ICA((Throwable)var10);
         throw new FFI(var10);
      } finally {
         if (var1 != null) {
            try {
               var1.close();
            } catch (IOException var9) {
               EXF.getInstance().ICA((Throwable)var9);
            }
         }

         EXF.getInstance().ICP();
      }

   }

   public void HNH() {
      EXF.getInstance().ICO();

      try {
         this.FNB = new LinkedHashMap();
         this.RHD = new LinkedHashMap();
         Iterator var1 = this.FMP.keySet().iterator();

         String var4;
         String var6;
         Integer var7;
         EWD var8;
         String var28;
         while(var1.hasNext()) {
            Object var2 = var1.next();
            String var3 = String.valueOf(var2);
            if (var3.startsWith("micro.process[")) {
               var4 = var3.replaceFirst("micro.process\\[", "");
               var4 = var4.substring(0, var4.indexOf(93));
               if (!this.FNB.containsKey(var4)) {
                  this.FNB.put(var4, new HashMap());
               }
            } else if (var3.startsWith("micro.global.anchor[")) {
               var4 = var3.replaceFirst("micro.global.anchor\\[", "");
               var4 = var4.substring(0, var4.indexOf(93));
               ENH var5 = ENH.valueOf(var4);
               if (!this.RHD.containsKey(var5)) {
                  this.RHD.put(var5, new HashMap());
               }

               switch (var5) {
                  case MAIN:
                     var6 = var3.replaceFirst("micro.global.anchor\\[" + var4 + "\\" + ']' + ".definition" + "\\" + '[', "");
                     var6 = var6.substring(0, var6.indexOf(93));
                     var7 = Integer.parseInt(var6);
                     var28 = var3.replaceFirst("micro.global.anchor\\[" + var4 + "\\" + ']' + ".definition" + "\\" + '[' + var6 + "\\" + ']' + "\\" + '[', "");
                     var28 = var28.substring(0, var28.indexOf(93));
                     Integer var9 = Integer.parseInt(var28);
                     EVZ var10 = new EVZ(var7, var9);
                     if (!((Map)this.RHD.get(var5)).containsKey(var10)) {
                        ((Map)this.RHD.get(var5)).put(var10, new HashMap());
                     }
                     break;
                  case LEFT_BAR:
                     var6 = var3.replaceFirst("micro.global.anchor\\[" + var4 + "\\" + ']' + ".definition" + "\\" + '[', "");
                     var6 = var6.substring(0, var6.indexOf(93));
                     var7 = Integer.parseInt(var6);
                     var8 = new EWD(var7);
                     if (!((Map)this.RHD.get(var5)).containsKey(var8)) {
                        ((Map)this.RHD.get(var5)).put(var8, new HashMap());
                     }
                     break;
                  default:
                     throw new FFI("Not a valid type [" + var5 + "]!");
               }
            }
         }

         var1 = this.FNB.keySet().iterator();

         String var19;
         Map var21;
         Map var22;
         String var23;
         String var25;
         while(var1.hasNext()) {
            var19 = (String)var1.next();
            var21 = (Map)this.FNB.get(var19);
            var21.put("anchors", new HashMap());
            var22 = (Map)var21.get("anchors");
            var23 = "micro.process[" + var19 + ']';
            var6 = "micro.process\\[" + var19 + "\\" + ']';
            var25 = var23 + ".anchor";
            var28 = var6 + ".anchor";
            Iterator var31 = this.FMP.keySet().iterator();

            while(var31.hasNext()) {
               Object var35 = var31.next();
               String var11 = String.valueOf(var35);
               if (var11.startsWith(var25 + '[')) {
                  String var12 = var11.replaceFirst(var28 + "\\" + '[', "");
                  var12 = var12.substring(0, var12.indexOf(93));
                  ENH var13 = ENH.valueOf(var12);
                  if (!var22.containsKey(var13)) {
                     var22.put(var13, new HashMap());
                  }
               }
            }
         }

         Map var32;
         String var34;
         Boolean var37;
         for(var1 = this.FNB.keySet().iterator(); var1.hasNext(); var21.put("lock.config", var37)) {
            var19 = (String)var1.next();
            var21 = (Map)this.FNB.get(var19);
            var22 = (Map)var21.get("anchors");
            var23 = "micro.process[" + var19 + ']';
            Iterator var26 = var22.keySet().iterator();

            while(var26.hasNext()) {
               ENH var27 = (ENH)var26.next();
               var32 = (Map)var22.get(var27);
               var34 = var23 + ".anchor" + '[' + var27.name() + ']';
               switch (var27) {
                  case MAIN:
                     var32.put("view.row", this.FMP.getProperty(var34 + "." + "view.row"));
                     var32.put("view.col", this.FMP.getProperty(var34 + "." + "view.col"));
                     var32.put("class.style", this.FMP.getProperty(var34 + "." + "class.style"));
                     var32.put("display.type", this.FMP.getProperty(var34 + "." + "display.type"));
                     var32.put("context.position", this.FMP.getProperty(var34 + "." + "context.position", "-1"));
                     break;
                  case LEFT_BAR:
                     var32.put("position", this.FMP.getProperty(var34 + "." + "position"));
                     var32.put("class.style", this.FMP.getProperty(var34 + "." + "class.style"));
                     var32.put("display.type", this.FMP.getProperty(var34 + "." + "display.type"));
                     var32.put("context.position", this.FMP.getProperty(var34 + "." + "context.position", "-1"));
                     break;
                  case TOP_MENU:
                     var32.put("position", this.FMP.getProperty(var34 + "." + "position"));
                     var32.put("class.style", this.FMP.getProperty(var34 + "." + "class.style"));
                     break;
                  default:
                     throw new FFI("Not a valid type [" + var27 + "]!");
               }
            }

            var6 = this.FMP.getProperty(var23 + "." + "definition");
            Class var29 = Class.forName(var6);
            ELZ var33 = (ELZ)var29.newInstance();
            var21.put("definition", var33);
            var34 = this.FMP.getProperty(var23 + "." + "lock.config");
            var37 = false;
            if (var34 != null && var34.length() > 0) {
               var37 = Boolean.parseBoolean(var34);
            }
         }

         var1 = this.RHD.keySet().iterator();

         while(var1.hasNext()) {
            ENH var20 = (ENH)var1.next();
            var21 = (Map)this.RHD.get(var20);
            var4 = "micro.global.anchor[" + var20 + ']';

            for(Iterator var24 = var21.entrySet().iterator(); var24.hasNext(); var32.put("lock.config", var37)) {
               Map.Entry var30 = (Map.Entry)var24.next();
               var7 = null;
               switch (var20) {
                  case MAIN:
                     EVZ var36 = (EVZ)var30.getKey();
                     var25 = var4 + ".definition" + '[' + var36.getFirstValue() + ']' + '[' + var36.getSecondValue() + ']';
                     break;
                  case LEFT_BAR:
                     var8 = (EWD)var30.getKey();
                     var25 = var4 + ".definition" + '[' + var8.getFirstValue() + ']';
                     break;
                  default:
                     throw new FFI("Not a valid type [" + var20 + "]!");
               }

               var32 = (Map)var30.getValue();
               var32.put("title", this.FMP.getProperty(var25 + "." + "title"));
               var32.put("class.style", this.FMP.getProperty(var25 + "." + "class.style"));
               var32.put("display.type", this.FMP.getProperty(var25 + "." + "display.type"));
               var34 = this.FMP.getProperty(var25 + "." + "lock.config");
               var37 = false;
               if (var34 != null && var34.length() > 0) {
                  var37 = Boolean.parseBoolean(var34);
               }
            }
         }
      } catch (InstantiationException | IllegalAccessException | ClassNotFoundException var17) {
         EXF.getInstance().ICA((Throwable)var17);
         throw new FFI(var17);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public Set<String> HNI() {
      EXF.getInstance().ICO();

      LinkedHashSet var1;
      try {
         var1 = new LinkedHashSet(this.FNB.keySet());
      } finally {
         EXF.getInstance().ICP();
      }

      return var1;
   }

   public Map<String, Object> getProcessDefinition(String var1) {
      EXF.getInstance().ICO();

      HashMap var2;
      try {
         var2 = new HashMap((Map)this.FNB.get(var1));
      } finally {
         EXF.getInstance().ICP();
      }

      return var2;
   }

   public Map<EWD<?>, Map<String, Object>> getGlobalAnchorDefinition(ENH var1) {
      EXF.getInstance().ICO();

      HashMap var2;
      try {
         var2 = new HashMap((Map)this.RHD.get(var1));
      } finally {
         EXF.getInstance().ICP();
      }

      return var2;
   }
}
