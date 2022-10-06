package a.a.a.c.e.a.b;

import a.a.a.c.e.a.k.a.EXF;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.JarInputStream;
import java.util.jar.Manifest;

public class EVU {
   private static final String GPR = "Implementation-Title";
   private static final String GPS = "Implementation-Version";

   public EVU() {
   }

   public static String[] getImplementationVersion(Class<?> var0) {
      EXF.getInstance().ICO();

      String[] var1;
      try {
         var1 = getManifestVersionAttribute(var0, "Implementation-Version");
      } finally {
         EXF.getInstance().ICP();
      }

      return var1;
   }

   public static String getImplementationTitle(Class<?> var0) {
      EXF.getInstance().ICO();

      String var1;
      try {
         var1 = getManifestAttribute(var0, "Implementation-Title");
      } finally {
         EXF.getInstance().ICP();
      }

      return var1;
   }

   public static String[] getImplementationVersionForJar(JarFile var0) {
      EXF.getInstance().ICO();

      String[] var1;
      try {
         var1 = getManifestVersionAttribute(var0, "Implementation-Version");
      } finally {
         EXF.getInstance().ICP();
      }

      return var1;
   }

   public static String getImplementationTitleForJar(JarFile var0) {
      EXF.getInstance().ICO();

      String var1;
      try {
         var1 = getManifestAttribute(var0, "Implementation-Title");
      } finally {
         EXF.getInstance().ICP();
      }

      return var1;
   }

   public static String[] getImplementationVersionForJarInputStream(JarInputStream var0) {
      EXF.getInstance().ICO();

      String[] var1;
      try {
         var1 = getManifestVersionAttribute(var0, "Implementation-Version");
      } finally {
         EXF.getInstance().ICP();
      }

      return var1;
   }

   public static String getImplementationTitleForJarInputStream(JarInputStream var0) {
      EXF.getInstance().ICO();

      String var1;
      try {
         var1 = getManifestAttribute(var0, "Implementation-Title");
      } finally {
         EXF.getInstance().ICP();
      }

      return var1;
   }

   public static String getImplementationVersionStringForJarInputStream(JarInputStream var0) {
      EXF.getInstance().ICO();

      String var1;
      try {
         var1 = getManifestAttribute(var0, "Implementation-Version");
      } finally {
         EXF.getInstance().ICP();
      }

      return var1;
   }

   private static String[] getManifestVersionAttribute(Class<?> var0, String var1) {
      EXF.getInstance().ICO();

      String[] var2;
      try {
         var2 = HZY(getManifestAttribute(var0, var1));
      } finally {
         EXF.getInstance().ICP();
      }

      return var2;
   }

   private static String[] getManifestVersionAttribute(JarFile var0, String var1) {
      EXF.getInstance().ICO();

      String[] var2;
      try {
         var2 = HZY(getManifestAttribute(var0, var1).trim());
      } finally {
         EXF.getInstance().ICP();
      }

      return var2;
   }

   private static String[] getManifestVersionAttribute(JarInputStream var0, String var1) {
      EXF.getInstance().ICO();

      String[] var2;
      try {
         var2 = HZY(getManifestAttribute(var0, var1));
      } finally {
         EXF.getInstance().ICP();
      }

      return var2;
   }

   private static String[] HZY(String var0) {
      EXF.getInstance().ICO();

      String[] var1;
      try {
         if (var0 == null) {
            var1 = null;
            return var1;
         }

         var1 = var0.split("\\.");
      } finally {
         EXF.getInstance().ICP();
      }

      return var1;
   }

   private static String getManifestAttribute(Class<?> var0, String var1) {
      EXF.getInstance().ICO();

      String var3;
      try {
         JarFile var2 = new JarFile(var0.getProtectionDomain().getCodeSource().getLocation().toURI().getPath());
         var3 = getManifestAttribute(var2, var1);
         return var3;
      } catch (Exception var7) {
         EXF.getInstance().IBZ("Manifest read failed", var7);
         var3 = null;
      } finally {
         EXF.getInstance().ICP();
      }

      return var3;
   }

   private static String getManifestAttribute(JarFile var0, String var1) {
      EXF.getInstance().ICO();

      String var4;
      try {
         String var3;
         try {
            Manifest var2 = var0.getManifest();
            var0.close();
            var3 = getManifestAttribute(var2, var1);
            if (var3 == null) {
               var4 = null;
               return var4;
            }

            var4 = var3.trim();
         } catch (Exception var8) {
            EXF.getInstance().IBZ("Manifest read failed", var8);
            var3 = null;
            return var3;
         }
      } finally {
         EXF.getInstance().ICP();
      }

      return var4;
   }

   private static String getManifestAttribute(JarInputStream var0, String var1) {
      EXF.getInstance().ICO();

      String var3;
      try {
         Manifest var2 = var0.getManifest();
         var0.close();
         var3 = getManifestAttribute(var2, var1);
         String var4;
         if (var3 != null) {
            var4 = var3.trim();
            return var4;
         }

         var4 = null;
         return var4;
      } catch (Exception var8) {
         EXF.getInstance().IBZ("Manifest read failed", var8);
         var3 = null;
      } finally {
         EXF.getInstance().ICP();
      }

      return var3;
   }

   private static String getManifestAttribute(Manifest var0, String var1) {
      EXF.getInstance().ICO();

      Attributes var2;
      try {
         String var3;
         try {
            if (var0 != null) {
               var2 = var0.getMainAttributes();
               var3 = var2.getValue(var1);
               return var3;
            }

            var2 = null;
         } catch (Exception var7) {
            EXF.getInstance().IBZ("Manifest read failed", var7);
            var3 = null;
            return var3;
         }
      } finally {
         EXF.getInstance().ICP();
      }

      return var2;
   }
}
