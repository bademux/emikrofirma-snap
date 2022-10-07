package a.a.a.c.f.d;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.b.QST;
import a.a.a.c.f.c.c.ComboBoxRequiredText;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class FCN<_Y> implements ChangeListener<String> {
   private FCL<?> HAY;

   public FCN(FCL<?> var1) {
      this.HAY = var1;
   }

   public void changed(ObservableValue<? extends String> var1, String var2, String var3) {
      EXF.getInstance().ICO();

      try {
         if (var3 == null) {
            return;
         }

         if (var3 != null && var3.length() > this.HAY.getMaxLength()) {
            ((ComboBoxRequiredText)this.HAY.fxml_component_main_element).getEditor().setText(var2);
            return;
         }

         if (this.HAY.isAllowed(var3)) {
            this.HAY.HAQ = var2;
            if (!this.HAY.HAS) {
               if (((ComboBoxRequiredText)this.HAY.fxml_component_main_element).getValue() == null) {
                  this.HAY.QVK.setTitle("");
                  ((ComboBoxRequiredText)this.HAY.fxml_component_main_element).getItems().clear();
                  ((ComboBoxRequiredText)this.HAY.fxml_component_main_element).setValue(this.HAY.QVK);
               }

               this.HAY.QVK.setTitle(var3);
               ((ComboBoxRequiredText)this.HAY.fxml_component_main_element).setValue(null);
               ((ComboBoxRequiredText)this.HAY.fxml_component_main_element).setValue(this.HAY.QVK);
               this.RHP();
               List var4 = null;
               if (var3 != null && var3.length() >= this.HAY.HAU) {
                  var4 = this.HAY.getByString(var3);
                  Iterator var5 = ((ComboBoxRequiredText)this.HAY.fxml_component_main_element).getItems().iterator();
                  ArrayList var6 = new ArrayList();

                  while(var5.hasNext()) {
                     QST var7 = (QST)var5.next();
                     if (!var4.contains(var7) && !var7.equals(this.HAY.QVK)) {
                        var6.add(var7);
                     }
                  }

                  Iterator var12 = var6.iterator();

                  QST var8;
                  while(var12.hasNext()) {
                     var8 = (QST)var12.next();
                     ((ComboBoxRequiredText)this.HAY.fxml_component_main_element).getItems().remove(var8);
                  }

                  var12 = var4.iterator();

                  while(var12.hasNext()) {
                     var8 = (QST)var12.next();
                     if (!((ComboBoxRequiredText)this.HAY.fxml_component_main_element).getItems().contains(var8)) {
                        ((ComboBoxRequiredText)this.HAY.fxml_component_main_element).getItems().add(var8);
                     }
                  }
               } else {
                  ((ComboBoxRequiredText)this.HAY.fxml_component_main_element).hide();
               }

               if (var4 != null && var4.size() > 0 && ((ComboBoxRequiredText)this.HAY.fxml_component_main_element).isFocused()) {
                  ((ComboBoxRequiredText)this.HAY.fxml_component_main_element).show();
               }
            }

            if (((ComboBoxRequiredText)this.HAY.fxml_component_main_element).getItems().size() == 0) {
               ((ComboBoxRequiredText)this.HAY.fxml_component_main_element).hide();
            }

            this.HAY.HAS = false;
            return;
         }

         ((ComboBoxRequiredText)this.HAY.fxml_component_main_element).getEditor().setText(var2);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void RHP() {
      EXF.getInstance().ICO();

      try {
         ((ComboBoxRequiredText)this.HAY.fxml_component_main_element).getItems().sort(new Comparator<QST>() {
            public int compare(QST var1, QST var2) {
               return 0;
            }
         });
      } finally {
         EXF.getInstance().ICP();
      }

   }
}
