package a.a.a.c.f.a;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.b.b.JN;
import javax.xml.bind.annotation.XmlTransient;

@XmlTransient
public abstract class IK extends IL {
   protected JN AMH;
   private transient JN BQT;

   public IK() {
      this(DAE());
      EXF.getInstance().ICQ();
   }

   public IK(String var1) {
      super(var1);
      EXF.getInstance().ICQ();
   }

   public IK(String var1, JN var2) {
      super(var1);
      EXF.getInstance().ICO();

      try {
         this.AMH = var2;
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public JN getPeriod() {
      return this.AMH;
   }

   public JN DAF() {
      if (this.AMH == null) {
         this.AMH = new JN();
      }

      return this.AMH;
   }

   public void setPeriod(JN var1) {
      this.AMH = var1;
   }

   public JN getPreviousPeriod() {
      return this.BQT;
   }

   public void setPreviousPeriod(JN var1) {
      this.BQT = var1;
   }

   public int hashCode() {
      int var2 = 1;
      var2 = 31 * var2 + (this.AMH == null ? 0 : this.AMH.hashCode());
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
         IK var2 = (IK)var1;
         if (this.AMH == null) {
            if (var2.AMH != null) {
               return false;
            }
         } else if (!this.AMH.equals(var2.AMH)) {
            return false;
         }

         return true;
      }
   }

   public String toString() {
      return "ModelBusinessPeriodElement [period=" + this.AMH + ", toString()=" + super.toString() + "]";
   }
}
