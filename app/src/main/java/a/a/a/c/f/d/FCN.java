package a.a.a.c.f.d;

import a.a.a.c.f.b.ObjectWithTitle;
import a.a.a.c.f.c.c.ComboBoxRequiredText;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class FCN<_Y> implements ChangeListener<String> {
    private final FCL<?> HAY;

    public FCN(FCL<?> var1) {
        this.HAY = var1;
    }

    public void changed(ObservableValue<? extends String> var1, String var2, String var3) {

        if (var3 == null) {
            return;
        }

        if (var3 != null && var3.length() > this.HAY.getMaxLength()) {
            this.HAY.fxml_component_main_element.getEditor().setText(var2);
            return;
        }

        if (this.HAY.isAllowed(var3)) {
            this.HAY.HAQ = var2;
            if (!this.HAY.HAS) {
                if (((ComboBoxRequiredText) this.HAY.fxml_component_main_element).getValue() == null) {
                    this.HAY.QVK.setTitle("");
                    ((ComboBoxRequiredText) this.HAY.fxml_component_main_element).getItems().clear();
                    this.HAY.fxml_component_main_element.setValue(this.HAY.QVK);
                }

                this.HAY.QVK.setTitle(var3);
                this.HAY.fxml_component_main_element.setValue(null);
                this.HAY.fxml_component_main_element.setValue(this.HAY.QVK);
                this.RHP();
                List var4 = null;
                if (var3 != null && var3.length() >= this.HAY.HAU) {
                    var4 = this.HAY.getByString(var3);
                    Iterator var5 = ((ComboBoxRequiredText) this.HAY.fxml_component_main_element).getItems().iterator();
                    ArrayList var6 = new ArrayList();

                    while (var5.hasNext()) {
                        ObjectWithTitle var7 = (ObjectWithTitle) var5.next();
                        if (!var4.contains(var7) && !var7.equals(this.HAY.QVK)) {
                            var6.add(var7);
                        }
                    }

                    Iterator var12 = var6.iterator();

                    ObjectWithTitle var8;
                    while (var12.hasNext()) {
                        var8 = (ObjectWithTitle) var12.next();
                        ((ComboBoxRequiredText) this.HAY.fxml_component_main_element).getItems().remove(var8);
                    }

                    var12 = var4.iterator();

                    while (var12.hasNext()) {
                        var8 = (ObjectWithTitle) var12.next();
                        if (!((ComboBoxRequiredText) this.HAY.fxml_component_main_element).getItems().contains(var8)) {
                            ((ComboBoxRequiredText) this.HAY.fxml_component_main_element).getItems().add(var8);
                        }
                    }
                } else {
                    this.HAY.fxml_component_main_element.hide();
                }

                if (var4 != null && var4.size() > 0 && this.HAY.fxml_component_main_element.isFocused()) {
                    this.HAY.fxml_component_main_element.show();
                }
            }

            if (((ComboBoxRequiredText) this.HAY.fxml_component_main_element).getItems().size() == 0) {
                this.HAY.fxml_component_main_element.hide();
            }

            this.HAY.HAS = false;
            return;
        }

        this.HAY.fxml_component_main_element.getEditor().setText(var2);

    }

    private void RHP() {

        ((ComboBoxRequiredText) this.HAY.fxml_component_main_element).getItems().sort(new Comparator<ObjectWithTitle>() {
            public int compare(ObjectWithTitle var1, ObjectWithTitle var2) {
                return 0;
            }
        });

    }
}
