package a.a.a.c.e.a.d;

public class EWC<_FIRST, _SECOND, _THIRD> extends EVZ<_FIRST, _SECOND> {
   protected _THIRD GQF;

   public EWC() {
      this(null, null, null);
   }

   public EWC(_FIRST var1, _SECOND var2, _THIRD var3) {
      super(var1, var2);
      this.GQF = var3;
   }

   public _THIRD getThirdValue() {
      return this.GQF;
   }

   public void setThirdValue(_THIRD var1) {
      this.GQF = var1;
   }

   public String toString() {
      return "ValueContainer3 [firstValue=" + this.GQG + ", secondValue=" + this.GQC + ", thirdValue=" + this.GQF + "]";
   }

   public int hashCode() {
      int var2 = super.hashCode();
      var2 = 31 * var2 + (this.GQF == null ? 0 : this.GQF.hashCode());
      return var2;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!super.equals(var1)) {
         return false;
      } else if (this.getClass() != var1.getClass()) {
         return false;
      } else {
         EWC var2 = (EWC)var1;
         if (this.GQF == null) {
            if (var2.GQF != null) {
               return false;
            }
         } else if (!this.GQF.equals(var2.GQF)) {
            return false;
         }

         return true;
      }
   }
}
