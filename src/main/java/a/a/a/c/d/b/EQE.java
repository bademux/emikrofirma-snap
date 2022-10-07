package a.a.a.c.d.b;

import a.a.a.b.c.FEL;
import a.a.a.b.c.FEM;

public abstract class EQE {
   public EQE() {
   }

   protected abstract void HPZ();

   public void HQA() {
      FEL.IKS(new FEM<Void>() {
         public Void IKT() {
            EQE.this.HPZ();
            return null;
         }
      });
   }
}
