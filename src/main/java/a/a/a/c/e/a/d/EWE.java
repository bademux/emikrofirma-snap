package a.a.a.c.e.a.d;

public class EWE<_FIRST, _SECOND, _THIRD, _FOURTH, _FIFTH, _SIXTH> extends EWB<_FIRST, _SECOND, _THIRD, _FOURTH, _FIFTH> {
   protected _SIXTH GQH;

   public EWE() {
      this(null, null, null, null, null, null);
   }

   public EWE(_FIRST var1, _SECOND var2, _THIRD var3, _FOURTH var4, _FIFTH var5, _SIXTH var6) {
      super(var1, var2, var3, var4, var5);
      this.GQH = var6;
   }

   public _SIXTH getSixthValue() {
      return this.GQH;
   }

   public void setSixthValue(_SIXTH var1) {
      this.GQH = var1;
   }

   public String toString() {
      return "ValueContainer4 [firstValue=" + this.GQG + ", secondValue=" + this.GQC + ", thirdValue=" + this.GQF + ", fourthValue=" + this.GQD + ", fifthValue=" + this.GQE + ", sixthValue=" + this.GQH + "]";
   }

   public int hashCode() {
      int var2 = super.hashCode();
      var2 = 31 * var2 + (this.GQH == null ? 0 : this.GQH.hashCode());
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
         EWE var2 = (EWE)var1;
         if (this.GQH == null) {
            if (var2.GQH != null) {
               return false;
            }
         } else if (!this.GQH.equals(var2.GQH)) {
            return false;
         }

         return true;
      }
   }
}
