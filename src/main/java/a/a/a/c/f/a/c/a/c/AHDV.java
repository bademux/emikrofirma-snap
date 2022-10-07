package a.a.a.c.f.a.c.a.c;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.d.EVZ;
import a.a.a.c.e.a.d.EWD;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.c.a.AHCE;
import a.a.a.c.f.a.c.a.AHCI;
import a.a.a.c.f.a.c.a.a.AHCM;
import a.a.a.c.f.a.c.a.a.AHCN;
import a.a.a.c.f.a.c.a.a.AHCO;
import a.a.a.c.f.a.c.a.a.AHCP;
import a.a.a.c.f.a.c.a.a.AHCQ;
import a.a.a.c.f.a.c.a.a.AHCR;
import a.a.a.c.f.a.c.a.a.AHCV;
import a.a.a.c.f.a.c.a.a.AHCW;
import a.a.a.c.f.a.c.a.a.AHCX;
import a.a.a.c.f.a.c.a.a.AHCY;
import a.a.a.c.f.a.c.a.a.AHCZ;
import a.a.a.c.f.a.c.a.a.AHDA;
import a.a.a.c.f.a.c.a.a.AHDE;
import a.a.a.c.f.a.c.a.a.AHDF;
import a.a.a.c.f.a.c.a.d.AHDY;
import a.a.a.c.f.a.c.a.d.AHEA;
import a.a.a.c.f.a.c.a.d.AHEB;
import a.a.a.c.f.a.c.a.d.AHEC;
import a.a.a.c.f.a.c.a.d.AHED;
import a.a.a.c.f.a.c.a.e.AHEH;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;

@XmlAccessorType(XmlAccessType.FIELD)
public class AHDV extends AHDT {
   private transient AHCI AHWE;
   @XmlElements({@XmlElement(
   name = "operationOnFieldAndVariableDate",
   type = AHEB.class
), @XmlElement(
   name = "operationOnFieldAndVariableDateTime",
   type = AHEC.class
), @XmlElement(
   name = "OperationOnFieldAndVariableBigDecimal",
   type = AHEA.class
), @XmlElement(
   name = "operationOnFieldAndVariableInteger",
   type = AHED.class
)})
   protected final List<AHDY> AHWF;
   @XmlElements({@XmlElement(
   name = "conditionOnFieldIsSet",
   type = AHDF.class
), @XmlElement(
   name = "conditionOnFieldIsNotSet",
   type = AHDE.class
), @XmlElement(
   name = "conditionOnFieldAndConstantDate",
   type = AHCN.class
), @XmlElement(
   name = "conditionOnFieldAndConstantDateTime",
   type = AHCO.class
), @XmlElement(
   name = "conditionOnFieldAndConstantBigDecimal",
   type = AHCM.class
), @XmlElement(
   name = "conditionOnFieldAndConstantRegEx",
   type = AHCP.class
), @XmlElement(
   name = "conditionOnFieldAndConstantString",
   type = AHCQ.class
), @XmlElement(
   name = "conditionOnFieldAndCustomAction",
   type = AHCR.class
), @XmlElement(
   name = "conditionOnFieldAndVariableDate",
   type = AHCY.class
), @XmlElement(
   name = "conditionOnFieldAndVariableDateTime",
   type = AHCZ.class
), @XmlElement(
   name = "ConditionOnFieldAndVariableBigDecimal",
   type = AHCX.class
), @XmlElement(
   name = "conditionOnFieldAndVariableInteger",
   type = AHDA.class
), @XmlElement(
   name = "conditionOnFieldAndVariableOffsetDateLong",
   type = AHCW.class
), @XmlElement(
   name = "conditionOnFieldAndVariableOffsetDateTimeLong",
   type = AHCV.class
), @XmlElement(
   name = "ruleOnField",
   type = AHEH.class
)})
   protected final List<AHCE> AHWG;

   private AHDV() {
      EXF.getInstance().ICO();

      try {
         this.AHWE = AHCI.SUCCESS;
         this.AHWF = new ArrayList();
         this.AHWG = new ArrayList();
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public AHDV(AHDS var1) {
      this(var1, new ArrayList(), new ArrayList());
      EXF.getInstance().ICO();
      EXF.getInstance().ICP();
   }

   public AHDV(AHDS var1, List<AHDY> var2, List<AHCE> var3) {
      super(var1);
      EXF.getInstance().ICO();

      try {
         this.AHWE = AHCI.SUCCESS;
         this.AHWF = var2;
         this.AHWG = var3;
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public AHCI getGeneralResult() {
      return this.AHWE;
   }

   public List<AHDY> getOperations() {
      return this.AHWF;
   }

   public List<AHCE> getRules() {
      return this.AHWG;
   }

   public void AIDN() {
      EXF.getInstance().ICO();

      try {
         Iterator var1 = this.AHWF.iterator();

         while(var1.hasNext()) {
            AHDY var2 = (AHDY)var1.next();
            EXF.getInstance().ICK("operation " + var2);
            var2.AIDR(this);
         }
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public void AIDO(OutputStream var1, EWD<Integer> var2, String var3) {
      EXF.getInstance().ICO();

      try {
         Iterator var4 = this.AHWG.iterator();

         while(var4.hasNext()) {
            AHCE var5 = (AHCE)var4.next();
            EXF.getInstance().ICK("rule " + var5);
            EVZ var6 = var5.AICX(this);
            switch ((AHCI)var6.getFirstValue()) {
               case SUCCESS:
                  break;
               case WARNING:
               case ERROR:
                  this.AHWE = this.AIDP(this.AHWE, (AHCI)var6.getFirstValue());
                  var2.setFirstValue((Integer)var2.getFirstValue() + 1);
                  String var7 = this.getFieldType() + var3 + var3 + var6.getFirstValue() + var3 + ((AHCI)var6.getFirstValue()).getDescription() + var3 + (String)var6.getSecondValue() + System.lineSeparator();
                  EXF.getInstance().ICE(var7);
                  var1.write(var7.getBytes(StandardCharsets.UTF_8));
                  var1.flush();
                  break;
               default:
                  throw new FFI("Invalid actionResult [" + this.AHWE + "]!");
            }
         }
      } catch (IOException var11) {
         EXF.getInstance().ICA((Throwable)var11);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private AHCI AIDP(AHCI var1, AHCI var2) {
      boolean var3 = true;
      int var4;
      if (var1.getLevel() >= var2.getLevel()) {
         var4 = var1.getLevel();
      } else {
         var4 = var2.getLevel();
      }

      return AHCI.getByLevel(var4);
   }

   public String toString() {
      return "SelectedField [set=" + this.AHVV + ", fieldType=" + this.AHVW + ", value=" + this.AHVX + ", operations=" + this.AHWF + ", rules=" + this.AHWG + "]";
   }
}
