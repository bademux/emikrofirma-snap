package a.a.a.c.e.a.b;

import a.a.a.c.e.a.b.a.EVR;
import a.a.a.c.e.a.e.EWF;
import a.a.a.c.e.a.k.a.EXF;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;

public class EVP {
   public EVP() {
   }

   public static void HZS(Certificate var0, File var1) throws EVR {
      EXF.getInstance().ICO();

      try {
         byte[] var2 = EWF.IAE(var1);
         HZS(var0, var2);
      } catch (Exception var6) {
         EXF.getInstance().ICA((Throwable)var6);
         throw new EVR(var6);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public static void HZS(Certificate var0, byte[] var1) throws EVR {
      EXF.getInstance().ICO();

      try {
         Vector var2 = new Vector();
         byte[] var3 = new byte[8192];
         JarInputStream var4 = new JarInputStream(new ByteArrayInputStream(var1));

         while(true) {
            JarEntry var5;
            do {
               if ((var5 = var4.getNextJarEntry()) == null) {
                  var4.close();
                  Enumeration var17 = var2.elements();

                  while(true) {
                     while(var17.hasMoreElements()) {
                        JarEntry var18 = (JarEntry)var17.nextElement();
                        if (var18.getCertificates() != null && var18.getCertificates().length != 0) {
                           ArrayList var19 = new ArrayList();
                           ArrayList var6 = null;
                           X509Certificate var7 = null;
                           X509Certificate var8 = null;

                           for(int var9 = 0; var9 < var18.getCertificates().length; ++var9) {
                              var7 = (X509Certificate)var18.getCertificates()[var9];
                              if (var8 == null || !var8.getIssuerDN().equals(var7.getSubjectDN())) {
                                 var6 = new ArrayList();
                                 var19.add(var6);
                              }

                              var8 = var7;
                              var6.add(var7);
                           }

                           boolean var20 = false;
                           Iterator var10 = var19.iterator();

                           while(var10.hasNext()) {
                              List var11 = (List)var10.next();
                              if (var11.size() > 0 && ((X509Certificate)var11.get(0)).equals(var0)) {
                                 var20 = true;
                                 break;
                              }
                           }

                           if (!var20) {
                              throw new EVR("Not signed with expected certificate!");
                           }
                        } else if (!var18.getName().startsWith("META-INF")) {
                           throw new EVR("Missing signature");
                        }
                     }

                     return;
                  }
               }
            } while(var5.isDirectory());

            var2.add(var5);

            while(true) {
               if (var4.read(var3, 0, var3.length) != -1) {
                  continue;
               }
            }
         }
      } catch (Exception var15) {
         EXF.getInstance().ICA((Throwable)var15);
         throw new EVR(var15);
      } finally {
         EXF.getInstance().ICP();
      }
   }
}
