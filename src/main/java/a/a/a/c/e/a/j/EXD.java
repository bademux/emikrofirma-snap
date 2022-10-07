package a.a.a.c.e.a.j;

import a.a.a.c.e.a.k.a.EXF;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public class EXD extends ResourceBundle.Control {
   public final Locale GSW = new Locale("pl", "PL");
   private static final List<Locale> GSX = new ArrayList<Locale>() {
      private static final long serialVersionUID = 1L;

      {
         this.add(new Locale("pl"));
         this.add(new Locale("pl", "PL"));
      }
   };

   public EXD() {
   }

   public ResourceBundle newBundle(String var1, Locale var2, String var3, ClassLoader var4, boolean var5) throws IllegalAccessException, InstantiationException, IOException {
      EXF.getInstance().ICO();

      ResourceBundle var7;
      try {
         EXE var6 = this.IBU(var1, var2, var3, var4, var5);
         if (var6 != null && var6.GSU != null) {
            EXC.getInstance().setCurrentLocale(var6.GSV);
         }

         var7 = var6.GSU;
      } finally {
         EXF.getInstance().ICP();
      }

      return var7;
   }

   private EXE IBU(String var1, Locale var2, String var3, ClassLoader var4, boolean var5) throws IllegalAccessException, InstantiationException, IOException {
      EXF.getInstance().ICO();

      EXE var20;
      try {
         if (var3.equals("java.class")) {
            EXE var21 = new EXE(super.newBundle(var1, var2, var3, var4, var5), var2);
            return var21;
         }

         if (!var3.equals("java.properties")) {
            throw new IllegalArgumentException("unknown format: " + var3);
         }

         String var6 = this.toBundleName(var1, var2);
         PropertyResourceBundle var7 = null;
         String var8 = this.toResourceName(var6, "properties");
         InputStream var9 = null;
         if (var5) {
            URL var10 = var4.getResource(var8);
            if (var10 != null) {
               URLConnection var11 = var10.openConnection();
               if (var11 != null) {
                  var11.setUseCaches(false);
                  var9 = var11.getInputStream();
               }
            }
         } else {
            var9 = var4.getResourceAsStream(var8);
         }

         if (var9 != null) {
            try {
               var7 = new PropertyResourceBundle(new InputStreamReader(var9, StandardCharsets.UTF_8));
            } finally {
               var9.close();
            }
         }

         var20 = new EXE(var7, var2);
      } finally {
         EXF.getInstance().ICP();
      }

      return var20;
   }

   public Locale getFallbackLocale(String var1, Locale var2) {
      EXF.getInstance().ICO();

      Locale var3;
      try {
         var3 = var2.equals(this.GSW) ? null : this.GSW;
      } finally {
         EXF.getInstance().ICP();
      }

      return var3;
   }

   public List<Locale> getCandidateLocales(String var1, Locale var2) {
      EXF.getInstance().ICO();

      List var3;
      try {
         var3 = GSX;
      } finally {
         EXF.getInstance().ICP();
      }

      return var3;
   }

   private class EXE {
      private ResourceBundle GSU;
      private Locale GSV;

      public EXE(ResourceBundle var2, Locale var3) {
         this.GSU = var2;
         this.GSV = var3;
      }

      public String toString() {
         return "RS [resourceBundle=" + this.GSU + ", locale=" + this.GSV + "]";
      }
   }
}
