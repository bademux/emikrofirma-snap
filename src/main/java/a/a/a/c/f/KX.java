package a.a.a.c.f;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.k.a.EXF;
import javax.xml.bind.annotation.XmlTransient;

@XmlTransient
public abstract class KX<_T> extends KU implements Comparable<KX<_T>> {
   private boolean APF;
   private _T APG;

   public KX(boolean var1, _T var2) {
      EXF.getInstance().ICO();

      try {
         this.APF = var1;
         this.APG = var2;
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public KX() {
      this(false, null);
      EXF.getInstance().ICQ();
   }

   public KX(_T var1) {
      this(false, var1);
      EXF.getInstance().ICQ();
   }

   public boolean DDF() {
      return this.APF;
   }

   public _T getValue() {
      return this.APG;
   }

   public void setValue(_T var1) {
      if (this.APF) {
         throw new FFI("Type is read only!");
      } else {
         this.APG = var1;
      }
   }

   public abstract String getValueAsString();

   public abstract void setValueFromString(String var1);

   public int hashCode() {
      int var2 = 1;
      var2 = 31 * var2 + (this.APG == null ? 0 : this.APG.hashCode());
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
         KX var2 = (KX)var1;
         if (this.APG == null) {
            if (var2.APG != null) {
               return false;
            }
         } else if (!this.APG.equals(var2.APG)) {
            return false;
         }

         return true;
      }
   }

   public String toString() {
      return "ModelBaseTypeElement [readOnly=" + this.APF + ", value=" + this.APG + "]";
   }
}
