package a.a.a.c.e.a.f;

import a.a.a.c.e.a.g.EWX;
import a.a.a.c.e.a.k.a.EXF;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class EWI implements EWG<JSONObject> {
   public EWI() {
   }

   public JSONObject IAP(InputStream var1, EWX var2, Long var3) throws IOException {
      if (var1 == null) {
         return null;
      } else {
         ByteArrayOutputStream var4 = new ByteArrayOutputStream();
         int var6 = 1048576;
         byte[] var7 = new byte[var6];

         int var5;
         while((var5 = var1.read(var7)) != -1) {
            var4.write(var7, 0, var5);
            var4.flush();
         }

         var4.flush();
         var1.close();
         byte[] var8 = var4.toByteArray();

         try {
            return (JSONObject)(new JSONParser()).parse(new String(var8, StandardCharsets.UTF_8));
         } catch (ParseException var10) {
            EXF.getInstance().ICA((Object)("resultString " + new String(var8, StandardCharsets.UTF_8)));
            EXF.getInstance().ICA((Throwable)var10);
            return null;
         }
      }
   }

   public JSONObject IAO(InputStream var1) throws IOException {
      return this.IAP(var1, (EWX)null, (Long)null);
   }
}
