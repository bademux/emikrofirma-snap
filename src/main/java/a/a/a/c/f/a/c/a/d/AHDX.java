package a.a.a.c.f.a.c.a.d;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.c.a.AHDI;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public abstract class AHDX extends AHDI {
   @XmlAttribute(
      name = "operationType"
   )
   protected final AHEF AHWI;

   protected AHDX() {
      EXF.getInstance().ICO();

      try {
         this.AHWI = null;
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public AHDX(AHEF var1) {
      EXF.getInstance().ICO();

      try {
         this.AHWI = var1;
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public AHEF getOperationType() {
      return this.AHWI;
   }

   public String toString() {
      return "OperationAbstract [operationType=" + this.AHWI + "]";
   }
}
