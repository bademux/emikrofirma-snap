package a.a.b.a.a.a.a;

import a.a.a.c.c.e.e.a.ETB;
import a.a.a.c.f.a.a.EYN;
import a.a.a.c.f.a.a.EYQ;
import a.a.a.c.f.a.a.EZF;
import a.a.a.c.f.b.c.a.KN;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class QTE implements ChangeListener<String> {
   private final ETB RAB;
   private final Label RAC;
   private final CheckBox RAD;
   private final EYQ RAE;
   private final EZF RAF;
   private final EYN<KN> RAG;

   public QTE(ETB var1, Label var2, CheckBox var3, EYQ var4, EZF var5, EYN<KN> var6) {
      this.RAB = var1;
      this.RAC = var2;
      this.RAD = var3;
      this.RAE = var4;
      this.RAF = var5;
      this.RAG = var6;
   }

   public void changed(ObservableValue<? extends String> var1, String var2, String var3) {
      this.RAC.setVisible(false);
      if (var3 != null && var3.length() > 0 && this.RAD.isSelected() && this.RAE.isRequiredAndValid() && this.RAF.isRequiredAndValid() && this.RAG.fxml_include_Street_boxController.isRequiredAndValid() && this.RAG.fxml_include_HouseNumber_boxController.isRequiredAndValid() && this.RAG.fxml_include_ApartmentNumber_boxController.isRequiredAndValid() && this.RAG.fxml_include_PostalCode_boxController.isRequiredAndValid() && this.RAG.fxml_include_City_boxController.isRequiredAndValid() && !this.RAB.RKM(this.RAB.getContractor())) {
         this.RAC.setVisible(true);
      }

   }
}
