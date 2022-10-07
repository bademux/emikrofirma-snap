package a.a.a.c.c.e.d.a;

import a.a.a.c.c.d.f.EOV;
import a.a.a.c.c.d.f.EOW;
import a.a.a.c.f.b.c.a.KL;
import a.a.a.c.f.c.c.ComboBoxRequired;

public class ESR extends EOV {
   private ESM GEK;

   public ESR(EOW var1, ESM var2) {
      super(var1, var2.fxml_include_itemNameRequiredTextBox_boxController);
      this.GEK = var2;
   }

   public KL HNU() {
      return (KL)((ComboBoxRequired)this.GEK.fxml_include_taxRateRequiredComboBox_boxController.fxml_component_main_element).getValue();
   }

   public void HNV(KL var1) {
      ((ComboBoxRequired)this.GEK.fxml_include_taxRateRequiredComboBox_boxController.fxml_component_main_element).setValue(var1);
   }
}
