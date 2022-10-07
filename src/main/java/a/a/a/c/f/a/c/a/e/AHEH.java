package a.a.a.c.f.a.c.a.e;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.d.EVZ;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.c.a.AHCE;
import a.a.a.c.f.a.c.a.AHCI;
import a.a.a.c.f.a.c.a.AHCJ;
import a.a.a.c.f.a.c.a.c.AHDT;
import java.util.regex.Matcher;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class AHEH extends AHCE {
   @XmlElement(
      name = "conditionLeft"
   )
   protected final AHEI AHWQ;
   @XmlElement(
      name = "logicalOperator"
   )
   protected final AHEG AHWR;
   @XmlElement(
      name = "conditionRight"
   )
   protected final AHEI AHWS;

   private AHEH() {
      EXF.getInstance().ICO();

      try {
         this.AHWQ = null;
         this.AHWR = null;
         this.AHWS = null;
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public AHEH(AHCJ var1, String var2, AHEI var3, AHEG var4, AHEI var5) {
      super(var1, var2);
      EXF.getInstance().ICO();

      try {
         this.AHWQ = var3;
         this.AHWR = var4;
         this.AHWS = var5;
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public AHEI getConditionLeft() {
      return this.AHWQ;
   }

   public AHEG getLogicalOperator() {
      return this.AHWR;
   }

   public AHEI getConditionRight() {
      return this.AHWS;
   }

   public EVZ<AHCI, String> AICX(AHDT var1) {
      EXF.getInstance().ICO();

      EVZ var5;
      try {
         EXF.getInstance().ICK("field " + var1);
         EXF.getInstance().ICK("conditionLeft " + this.AHWQ);
         EXF.getInstance().ICK("logicalOperator " + this.AHWR);
         EXF.getInstance().ICK("conditionRight " + this.AHWS);
         EVZ var2 = null;
         EVZ var3 = null;
         switch (this.AHWR) {
            case AND:
            case OR:
               var2 = this.AHWQ.getActionOnField().AICX(var1);
               var3 = this.AHWS.getActionOnField().AICX(var1);
               break;
            case NOT:
               var2 = this.AHWQ.getActionOnField().AICX(var1);
               var3 = new EVZ(AHCI.SUCCESS, "");
               break;
            default:
               throw new FFI("Invalid logicalOperator [" + this.AHWR + "]!");
         }

         boolean var4 = false;
         switch (this.AHWR) {
            case AND:
               var4 = ((AHCI)var2.getFirstValue()).equals(AHCI.SUCCESS) & ((AHCI)var3.getFirstValue()).equals(AHCI.SUCCESS);
               break;
            case OR:
               var4 = ((AHCI)var2.getFirstValue()).equals(AHCI.SUCCESS) | ((AHCI)var3.getFirstValue()).equals(AHCI.SUCCESS);
               break;
            case NOT:
               var4 = !((AHCI)var2.getFirstValue()).equals(AHCI.SUCCESS);
               break;
            default:
               throw new FFI("Invalid logicalOperator [" + this.AHWR + "]!");
         }

         if (!var4) {
            var5 = null;
            AHCI var10;
            switch (this.AHTY) {
               case WARNING:
                  var10 = AHCI.WARNING;
                  break;
               case ERROR:
                  var10 = AHCI.ERROR;
                  break;
               default:
                  throw new FFI("Invalid actionType [" + this.AHTY + "]!");
            }

            EVZ var6 = new EVZ(var10, this.AIDT("", (String)var2.getSecondValue(), (String)var3.getSecondValue()));
            return var6;
         }

         var5 = new EVZ(AHCI.SUCCESS, null);
      } finally {
         EXF.getInstance().ICP();
      }

      return var5;
   }

   private String AIDT(String var1, String var2, String var3) {
      String var4 = super.AICW(var1).replaceAll("##LOGICAL_OPERATOR##", Matcher.quoteReplacement(this.AHWR.getDescription()));
      String var5 = var2 != null ? var2 : "OK";
      var4 = var4.replaceAll("##RULE_LEFT_RESULT##", Matcher.quoteReplacement(var5));
      String var6 = var3 != null ? var3 : "OK";
      var4 = var4.replaceAll("##RULE_RIGHT_RESULT##", Matcher.quoteReplacement(var6));
      return var4;
   }

   public String toString() {
      return "RuleOnField [actionType=" + this.AHTY + ", conditionLeft=" + this.AHWQ + ", logicalOperator=" + this.AHWR + ", conditionRight=" + this.AHWS + "]";
   }
}
