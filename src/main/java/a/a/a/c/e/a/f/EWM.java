package a.a.a.c.e.a.f;

import a.a.a.c.e.a.k.a.EXF;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class EWM {
   protected static final int GQW = 200;
   protected static final int GQX = 1048576;
   protected static final String GQY = "\r\n";
   protected static final String GQZ = "HTTP/1.1";

   public EWM() {
   }

   protected static byte[] IAQ(InputStream var0) throws IOException {
      EXF.getInstance().ICO();

      byte[] var4;
      try {
         ByteArrayOutputStream var1 = new ByteArrayOutputStream();
         int var3 = 0;

         int var2;
         while((var2 = var0.read()) != -1) {
            var1.write(var2);
            switch (var2) {
               case 10:
                  if (var3 != 1 && var3 != 3) {
                     var3 = 0;
                     break;
                  }

                  ++var3;
                  break;
               case 13:
                  if (var3 != 0 && var3 != 2) {
                     var3 = 0;
                     break;
                  }

                  ++var3;
                  break;
               default:
                  var3 = 0;
            }

            if (var3 == 4) {
               break;
            }
         }

         var4 = var1.toByteArray();
      } finally {
         EXF.getInstance().ICP();
      }

      return var4;
   }

   protected static byte[] IAR(InputStream var0) throws IOException {
      EXF.getInstance().ICO();

      try {
         ByteArrayOutputStream var1 = new ByteArrayOutputStream();
         int var3 = 1048576;
         byte[] var4 = new byte[var3];

         while(true) {
            int var2;
            if ((var2 = var0.read(var4)) != -1) {
               var1.write(var4, 0, var2);
               if (var2 >= var3 && (var0.available() != 0 || var2 != var3)) {
                  continue;
               }
            }

            byte[] var5 = var1.toByteArray();
            return var5;
         }
      } finally {
         EXF.getInstance().ICP();
      }
   }

   protected static List<String> IAS(byte[] var0) throws IOException {
      EXF.getInstance().ICO();

      try {
         BufferedReader var1 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(var0), StandardCharsets.UTF_8));
         String var2 = null;
         ArrayList var3 = new ArrayList();

         while(true) {
            if ((var2 = var1.readLine()) != null) {
               var3.add(var2);
               if (var1.ready()) {
                  continue;
               }
            }

            ArrayList var4 = var3;
            return var4;
         }
      } finally {
         EXF.getInstance().ICP();
      }
   }

   protected static String IAT(Object[] var0, String var1) {
      EXF.getInstance().ICO();

      String var2;
      try {
         var2 = IAU(Arrays.asList(var0), var1);
      } finally {
         EXF.getInstance().ICP();
      }

      return var2;
   }

   protected static String IAU(List<Object> var0, String var1) {
      EXF.getInstance().ICO();

      String var9;
      try {
         StringBuilder var2 = new StringBuilder();
         boolean var3 = true;

         Object var5;
         for(Iterator var4 = var0.iterator(); var4.hasNext(); var2.append(String.valueOf(var5))) {
            var5 = var4.next();
            if (var3) {
               var3 = false;
            } else {
               var2.append(var1);
            }
         }

         var9 = var2.toString();
      } finally {
         EXF.getInstance().ICP();
      }

      return var9;
   }

   protected static Map<String, List<String>> IAV(byte[] var0) throws IOException {
      EXF.getInstance().ICO();

      try {
         List var1 = IAS(var0);
         LinkedHashMap var2 = new LinkedHashMap();

         for(int var3 = 0; var3 < var1.size(); ++var3) {
            String var4 = (String)var1.get(var3);
            if (var3 == 0) {
               var2.put((Object)null, Collections.singletonList(var4));
            } else if (var4 != null && var4.trim().length() > 0) {
               String[] var5 = var4.split(":");
               String var6 = var5[0].trim();
               ArrayList var7 = new ArrayList();
               if (var5.length > 1 && var5[1] != null) {
                  String[] var8 = var5[1].split(",");
                  String[] var9 = var8;
                  int var10 = var8.length;

                  for(int var11 = 0; var11 < var10; ++var11) {
                     String var12 = var9[var11];
                     String var13 = var12.trim();
                     var7.add(var13);
                  }
               }

               var2.put(var6, var7);
            }
         }

         LinkedHashMap var17 = var2;
         return var17;
      } finally {
         EXF.getInstance().ICP();
      }
   }
}
