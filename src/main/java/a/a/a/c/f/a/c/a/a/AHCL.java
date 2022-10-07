package a.a.a.c.f.a.c.a.a;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.c.a.AHCJ;
import a.a.a.c.f.a.c.a.c.AHDT;
import java.util.regex.Matcher;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public abstract class AHCL<_T> extends AHCK {
   @XmlElement(
      name = "value"
   )
   protected final _T AHUG;

   protected AHCL() {
      EXF.getInstance().ICO();

      try {
         this.AHUG = null;
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public AHCL(AHCJ var1, String var2, AHDG var3, _T var4) {
      super(var1, var2, var3);
      EXF.getInstance().ICO();

      try {
         this.AHUG = var4;
         if (this.AHUG == null) {
            throw new FFI("Value cannot be null!");
         }
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public _T getValue() {
      return this.AHUG;
   }

   public String toString() {
      return "ConditionOnFieldAndConstantAbstract [actionType=" + this.AHTY + ", conditionType=" + this.AHUF + ", value=" + this.AHUG + "]";
   }

   protected String AIDB(String var1, AHDT var2) {
      return super.AIDB(var1, var2).replaceAll("##CONTEXT_VALUE##", Matcher.quoteReplacement(String.valueOf(this.AHUG)));
   }
}
