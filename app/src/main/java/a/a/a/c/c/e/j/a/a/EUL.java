package a.a.a.c.c.e.j.a.a;

import a.a.a.c.c.e.j.a.EUT;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class EUL implements ChangeListener<Boolean> {
    private final EUT GKX;

    public EUL(EUT var1) {
        this.GKX = var1;
    }

    public void changed(ObservableValue<? extends Boolean> var1, Boolean var2, Boolean var3) {

        if (var3 != null) {
            if (var3) {
                this.GKX.fxml_invoice_sale_paymentdatedaysController.fxml_component_main_element.setText("");
                this.GKX.fxml_invoice_sale_paymentdatedaysController.fxml_component_root_element.setRequired(false);
                this.GKX.fxml_invoice_sale_paymentdateController.fxml_component_main_element.setValue(null);
                this.GKX.fxml_invoice_sale_paymentdateController.fxml_component_root_element.setRequired(false);
            } else {
                this.GKX.fxml_invoice_sale_paymentdatedaysController.fxml_component_root_element.setRequired(true);
                this.GKX.fxml_invoice_sale_paymentdatedaysController.fxml_component_main_element.setText("7");
                this.GKX.fxml_invoice_sale_paymentdateController.fxml_component_root_element.setRequired(true);
            }

            org.slf4j.LoggerFactory.getLogger(getClass()).info("Payed checkbox changed to " + var3);
        }

    }
}
