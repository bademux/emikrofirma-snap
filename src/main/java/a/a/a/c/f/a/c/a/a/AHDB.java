package a.a.a.c.f.a.c.a.a;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.c.a.AHCF;
import a.a.a.c.f.a.c.a.AHCJ;
import java.util.regex.Matcher;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public abstract class AHDB extends AHCF {
   @XmlAttribute(
      name = "conditionType"
   )
   protected final AHDG AHVE;

   protected AHDB() {
      EXF.getInstance().ICO();

      try {
         this.AHVE = null;
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public AHDB(AHCJ var1, String var2, AHDG var3) {
      super(var1, var2);
      EXF.getInstance().ICO();

      try {
         this.AHVE = var3;
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public String toString() {
      return "ConditionOnFieldsAbstract [actionType=" + this.AHTY + ", conditionType=" + this.AHVE + "]";
   }

   protected String AICW(String var1) {
      return super.AICW(var1).replaceAll("##CONDITION_TYPE##", Matcher.quoteReplacement(this.AHVE.getDescription()));
   }
}
