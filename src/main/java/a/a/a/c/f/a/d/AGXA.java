package a.a.a.c.f.a.d;

import a.a.a.c.e.a.k.a.EXF;
import java.net.URL;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class AGXA {
   public static final AGXA AHSV = new AGXA("http://jpk.mf.gov.pl/wzor/2017/11/13/1113/", "JPK_VAT", "JPK_VAT (3)", "1-1", "3", (URL)null);
   public static final AGXA QLP = new AGXA("http://jpk.mf.gov.pl/wzor/2019/09/27/09271/", "JPK_FA", "JPK_FA (3)", "1-0", "3", (URL)null);
   private String AHSW;
   private String AHSX;
   private String AHSY;
   private String AHSZ;
   private String AHTA;
   private URL AHTB;

   public AGXA() {
   }

   public AGXA(String var1, String var2, String var3, String var4, String var5, URL var6) {
      EXF.getInstance().ICO();

      try {
         this.AHSW = var1;
         this.AHSX = var2;
         this.AHSY = var3;
         this.AHSZ = var4;
         this.AHTA = var5;
         this.AHTB = var6;
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public String getTns() {
      return this.AHSW;
   }

   public String getKodFormularza() {
      return this.AHSX;
   }

   public String getKodSystemowy() {
      return this.AHSY;
   }

   public String getWersjaSchemy() {
      return this.AHSZ;
   }

   public String getWariantFormularza() {
      return this.AHTA;
   }

   public URL getUrl() {
      return this.AHTB;
   }

   public int hashCode() {
      int var2 = 1;
      var2 = 31 * var2 + (this.AHSX == null ? 0 : this.AHSX.hashCode());
      var2 = 31 * var2 + (this.AHSY == null ? 0 : this.AHSY.hashCode());
      var2 = 31 * var2 + (this.AHSW == null ? 0 : this.AHSW.hashCode());
      var2 = 31 * var2 + (this.AHSZ == null ? 0 : this.AHSZ.hashCode());
      var2 = 31 * var2 + (this.AHTA == null ? 0 : this.AHTA.hashCode());
      return var2;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 == null) {
         return false;
      } else if (this.getClass() != var1.getClass()) {
         return false;
      } else {
         AGXA var2 = (AGXA)var1;
         if (this.AHSX == null) {
            if (var2.AHSX != null) {
               return false;
            }
         } else if (!this.AHSX.equals(var2.AHSX)) {
            return false;
         }

         if (this.AHSY == null) {
            if (var2.AHSY != null) {
               return false;
            }
         } else if (!this.AHSY.equals(var2.AHSY)) {
            return false;
         }

         if (this.AHSW == null) {
            if (var2.AHSW != null) {
               return false;
            }
         } else if (!this.AHSW.equals(var2.AHSW)) {
            return false;
         }

         if (this.AHSZ == null) {
            if (var2.AHSZ != null) {
               return false;
            }
         } else if (!this.AHSZ.equals(var2.AHSZ)) {
            return false;
         }

         if (this.AHTA == null) {
            if (var2.AHTA != null) {
               return false;
            }
         } else if (!this.AHTA.equals(var2.AHTA)) {
            return false;
         }

         return true;
      }
   }

   public String toString() {
      return "JPKSchemaType [tns=" + this.AHSW + ", kodFormularza=" + this.AHSX + ", kodSystemowy=" + this.AHSY + ", wersjaSchemy=" + this.AHSZ + ", wariantFormularza=" + this.AHTA + ", url=" + this.AHTB + "]";
   }

   public String AICG() {
      return "[tns=" + this.AHSW + ", kodFormularza=" + this.AHSX + ", kodSystemowy=" + this.AHSY + ", wersjaSchemy=" + this.AHSZ + ", wariantFormularza=" + this.AHTA + "]";
   }

   public String AICH() {
      return "[kodSystemowy=" + this.AHSY + ", wersjaSchemy=" + this.AHSZ + "]";
   }
}
