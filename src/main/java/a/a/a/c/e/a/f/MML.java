package a.a.a.c.e.a.f;

import a.a.a.c.e.a.g.EWX;
import a.a.a.c.e.a.k.a.EXF;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class MML implements EWG<JSONObject> {
   public MML() {
   }

   public JSONObject IAP(InputStream var1, EWX var2, Long var3) throws IOException {
      EXF.getInstance().ICO();

      ByteArrayOutputStream var4;
      try {
         if (var1 != null) {
            var4 = new ByteArrayOutputStream();
            boolean var19 = false;
            int var7 = 1048576;
            byte[] var8 = new byte[var7];

            int var6;
            while((var6 = var1.read(var8)) != -1) {
               var4.write(var8, 0, var6);
               var4.flush();
               if (var6 > 1) {
                  if (var8[var6 - 2] == 13 && var8[var6 - 1] == 10) {
                     if (var19) {
                        break;
                     }

                     var19 = true;
                  } else {
                     var19 = false;
                  }
               }
            }

            var4.flush();
            var1.close();
            byte[] var9 = var4.toByteArray();
            if (var19 && var9.length >= 11) {
               var9 = Arrays.copyOfRange(var9, 4, var9.length - 7);
            }

            try {
               JSONObject var10 = (JSONObject)(new JSONParser()).parse(new String(var9, StandardCharsets.UTF_8));
               return var10;
            } catch (ParseException var16) {
               EXF.getInstance().ICA((Object)("resultString " + new String(var9, StandardCharsets.UTF_8)));
               EXF.getInstance().ICA((Throwable)var16);
               Object var11 = null;
               return (JSONObject)var11;
            }
         }

         var4 = null;
      } catch (Exception var17) {
         EXF.getInstance().ICA((Throwable)var17);
         Object var5 = null;
         return (JSONObject)var5;
      } finally {
         EXF.getInstance().ICP();
      }

      return var4;
   }

   public JSONObject IAO(InputStream var1) throws IOException {
      return this.IAP(var1, (EWX)null, (Long)null);
   }
}
