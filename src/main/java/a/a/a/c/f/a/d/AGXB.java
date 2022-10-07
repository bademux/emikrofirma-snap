package a.a.a.c.f.a.d;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

@XmlAccessorType(XmlAccessType.FIELD)
public class AGXB {
   private String AHTC;
   private static final String AHTD = "  ";

   public AGXB() {
   }

   public AGXB(String var1) {
      this.AHTC = var1;
   }

   public AGXB(JSONObject var1) {
      if (var1 != null) {
         this.AHTC = var1.toString();
      } else {
         this.AHTC = "";
      }

   }

   public String getValue() {
      return this.AHTC;
   }

   public JSONObject getValueAsJSONObject() throws ParseException {
      return (JSONObject)(new JSONParser()).parse(this.AHTC);
   }

   public boolean AICI() {
      return this.AHTC == null || this.AHTC.length() == 0 || "{}".equals(this.AHTC);
   }

   public String toString() {
      return "JSONString [value=" + this.AHTC + "]";
   }

   public String AICJ() throws ParseException {
      return this.AICK(0, this.getValueAsJSONObject());
   }

   private String AICK(int var1, JSONObject var2) {
      StringBuilder var3 = new StringBuilder();
      var3.append("{").append(System.lineSeparator());
      Iterator var4 = var2.entrySet().iterator();
      boolean var5 = true;

      while(var4.hasNext()) {
         Object var6 = var4.next();
         Map.Entry var7 = (Map.Entry)var6;
         var3.append(this.AICL(var5, var1, var7));
         if (var5) {
            var5 = false;
         }
      }

      for(int var8 = 0; var8 < var1; ++var8) {
         var3.append("  ");
      }

      var3.append("}");
      return var3.toString();
   }

   private String AICL(boolean var1, int var2, Map.Entry var3) {
      StringBuilder var4 = new StringBuilder();

      for(int var5 = 0; var5 < var2; ++var5) {
         var4.append("  ");
      }

      if (var1) {
         var4.append("  ");
      } else {
         var4.append("  ").append(", ");
      }

      var4.append("\"").append(var3.getKey()).append("\"").append(" : ");
      if (var3.getValue() instanceof String) {
         var4.append("\"").append(var3.getValue()).append("\"");
      } else if (var3.getValue() instanceof HashMap) {
         var4.append(this.AICK(var2 + 1, (JSONObject)var3.getValue()));
      } else if (var3.getValue() instanceof ArrayList) {
         ArrayList var9 = (ArrayList)var3.getValue();
         var4.append("[").append(System.lineSeparator());
         boolean var6 = true;
         Iterator var7 = var9.iterator();

         while(var7.hasNext()) {
            Object var8 = var7.next();
            var4.append(this.AICM(var6, var2 + 2, var8));
            if (var6) {
               var6 = false;
            }
         }

         for(int var10 = 0; var10 < var2 + 1; ++var10) {
            var4.append("  ");
         }

         var4.append("]");
      } else {
         var4.append(var3.getValue());
      }

      var4.append(System.lineSeparator());
      return var4.toString();
   }

   private String AICM(boolean var1, int var2, Object var3) {
      StringBuilder var4 = new StringBuilder();

      for(int var5 = 0; var5 < var2; ++var5) {
         var4.append("  ");
      }

      if (var1) {
         var4.append("  ");
      } else {
         var4.append("  ").append(", ");
      }

      if (var3 instanceof String) {
         var4.append("\"").append(var3).append("\"");
      } else if (var3 instanceof HashMap) {
         var4.append(this.AICK(var2 + 1, (JSONObject)var3));
      } else if (var3 instanceof ArrayList) {
         ArrayList var9 = (ArrayList)var3;
         var4.append("[");
         boolean var6 = true;
         Iterator var7 = var9.iterator();

         while(var7.hasNext()) {
            Object var8 = var7.next();
            var4.append(this.AICM(var6, var2 + 1, var8));
            if (var6) {
               var6 = false;
            }
         }

         for(int var10 = 0; var10 < var2; ++var10) {
            var4.append("  ");
         }

         var4.append("]");
      } else {
         var4.append(var3);
      }

      var4.append(System.lineSeparator());
      return var4.toString();
   }
}
