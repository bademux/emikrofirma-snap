package a.a.a.c.e.a.d;

public class EWB<_FIRST, _SECOND, _THIRD, _FOURTH, _FIFTH> extends EWA<_FIRST, _SECOND, _THIRD, _FOURTH> {
   protected _FIFTH GQE;

   public EWB() {
      this(null, null, null, null, null);
   }

   public EWB(_FIRST var1, _SECOND var2, _THIRD var3, _FOURTH var4, _FIFTH var5) {
      super(var1, var2, var3, var4);
      this.GQE = var5;
   }

   public _FIFTH getFifthValue() {
      return this.GQE;
   }

   public void setFifthValue(_FIFTH var1) {
      this.GQE = var1;
   }

   public String toString() {
      return "ValueContainer4 [firstValue=" + this.GQG + ", secondValue=" + this.GQC + ", thirdValue=" + this.GQF + ", fourthValue=" + this.GQD + ", fifthValue=" + this.GQE + "]";
   }

   public int hashCode() {
      int var2 = super.hashCode();
      var2 = 31 * var2 + (this.GQE == null ? 0 : this.GQE.hashCode());
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
         EWB var2 = (EWB)var1;
         if (this.GQE == null) {
            if (var2.GQE != null) {
               return false;
            }
         } else if (!this.GQE.equals(var2.GQE)) {
            return false;
         }

         return true;
      }
   }
}
