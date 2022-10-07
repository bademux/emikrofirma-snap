package a.a.a.c.f.c.c;

import a.a.a.c.f.b.QST;
import a.a.a.c.f.c.b.QRV;
import javafx.collections.FXCollections;

public class ComboBoxValidated_ContractorName extends ComboBoxRequiredText<QST> {
   public ComboBoxValidated_ContractorName() {
      super(FXCollections.observableArrayList());
      this.IGA();
   }

   private void IGA() {
      this.IEU().set(false);
      this.valueProperty().removeListener(this.HAK);
      this.valueProperty().removeListener(this.QVR);
      this.valueProperty().addListener(new QRV(this, 1));
   }
}
