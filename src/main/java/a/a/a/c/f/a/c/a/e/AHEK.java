package a.a.a.c.f.a.c.a.e;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.c.a.AHCE;
import a.a.a.c.f.a.c.a.AHDI;
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
import a.a.a.c.f.a.c.a.c.AHDS;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;

@XmlAccessorType(XmlAccessType.FIELD)
public class AHEK extends AHDI {
   @XmlAttribute
   protected final AHDS AHWX;
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
   name = "ConditionOnFieldAndConstantBigDecimal",
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
   protected final AHCE AHWY;

   private AHEK() {
      EXF.getInstance().ICO();

      try {
         this.AHWX = null;
         this.AHWY = null;
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public AHEK(AHDS var1, AHCE var2) {
      EXF.getInstance().ICO();

      try {
         this.AHWX = var1;
         this.AHWY = var2;
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public AHDS getDeclaredFieldType() {
      return this.AHWX;
   }

   public AHCE getActionOnField() {
      return this.AHWY;
   }

   public String toString() {
      return "RuleOnFieldsContainer [declaredFieldType=" + this.AHWX + ", actionOnField=" + this.AHWY + "]";
   }
}
