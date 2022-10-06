package a.a.a.c.e.a.d;

public class MME<_FIRST, _SECOND, _THIRD, _FOURTH, _FIFTH, _SIXTH, _SEVENTH> extends EWE<_FIRST, _SECOND, _THIRD, _FOURTH, _FIFTH, _SIXTH> {
   protected _SEVENTH MWP;

   public MME() {
      this((Object)null, (Object)null, (Object)null, (Object)null, (Object)null, (Object)null, (Object)null);
   }

   public MME(_FIRST var1, _SECOND var2, _THIRD var3, _FOURTH var4, _FIFTH var5, _SIXTH var6, _SEVENTH var7) {
      super(var1, var2, var3, var4, var5, var6);
      this.MWP = var7;
   }

   public _SEVENTH getSeventhValue() {
      return this.MWP;
   }

   public void setSeventhValue(_SEVENTH var1) {
      this.MWP = var1;
   }

   public String toString() {
      return "ValueContainer4 [firstValue=" + this.GQG + ", secondValue=" + this.GQC + ", thirdValue=" + this.GQF + ", fourthValue=" + this.GQD + ", fifthValue=" + this.GQE + ", sixthValue=" + this.GQH + ", seventhValue=" + this.MWP + "]";
   }

   public int hashCode() {
      int var2 = super.hashCode();
      var2 = 31 * var2 + (this.MWP == null ? 0 : this.MWP.hashCode());
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
         MME var2 = (MME)var1;
         if (this.MWP == null) {
            if (var2.MWP != null) {
               return false;
            }
         } else if (!this.MWP.equals(var2.MWP)) {
            return false;
         }

         return true;
      }
   }
}
