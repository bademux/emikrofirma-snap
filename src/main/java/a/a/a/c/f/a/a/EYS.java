package a.a.a.c.f.a.a;

import a.a.a.c.f.a.c.QJW;
import a.a.a.c.f.b.QST;
import a.a.a.c.f.c.c.ComboBoxValidated_ContractorName;
import a.a.a.c.f.d.FCL;
import java.util.ArrayList;
import java.util.List;

public class EYS extends FCL<ComboBoxValidated_ContractorName> {
   private EYR GVV;
   private EYL GVW;

   public EYS() {
      this((String)null);
   }

   public EYS(String var1) {
      super(var1, (Integer)null, 3);
   }

   public void setContractorSetter(EYR var1) {
      this.GVV = var1;
   }

   public void setContractorGetter(EYL var1) {
      this.GVW = var1;
   }

   protected void set(QST var1) {
      if (this.GVV != null) {
         this.GVV.setContractorFromAutocomplete((QJW)var1);
      }

   }

   protected List<QJW> getByString(String var1) {
      return (List)(this.GVW != null ? this.GVW.getContractorsByText(var1) : new ArrayList());
   }

   public boolean isAllowed(String var1) {
      return true;
   }

   protected int getTitleType() {
      return 1;
   }
}
