package a.a.a.c.c.e.j.a.a;

import a.a.a.c.c.e.j.a.EUT;
import a.a.a.c.g.b.FCW;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import java.util.regex.Pattern;

public class ROY implements ChangeListener<Boolean> {
    private final EUT RPA;
    private final String RPB;

    public ROY(EUT var1) {
        this.RPA = var1;
        this.RPB = FCW.getInstance().getMessageForKey("micro.process.invoice_sale_new.MppRemarks");
    }

    public void changed(ObservableValue<? extends Boolean> var1, Boolean var2, Boolean var3) {
        if (var3 != null) {
            boolean var4 = this.RPA.fxml_invoice_sale_remarksController.fxml_component_main_element.getText() != null && this.RPA.fxml_invoice_sale_remarksController.fxml_component_main_element.getText().contains(this.RPB);

            if (var3 && !var4) {
                String var5 = "";
                if (this.RPA.fxml_invoice_sale_remarksController.fxml_component_main_element.getText() != null) {
                    var5 = this.RPA.fxml_invoice_sale_remarksController.fxml_component_main_element.getText();
                }

                this.RPA.fxml_invoice_sale_remarksController.fxml_component_main_element.setText(this.RPB + var5);
            } else if (!var3 && var4 && this.RPA.fxml_invoice_sale_remarksController.fxml_component_main_element.getText() != null) {
                this.RPA.fxml_invoice_sale_remarksController.fxml_component_main_element.setText(this.RPA.fxml_invoice_sale_remarksController.fxml_component_main_element.getText().replaceAll(Pattern.quote(this.RPB), ""));
            }

            org.slf4j.LoggerFactory.getLogger(getClass()).info("Mpp checkbox set to " + var3);
        }

    }
}
