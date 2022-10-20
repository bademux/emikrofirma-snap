package a.a.a.c.c.e.j.a;

import a.a.a.c.c.d.f.EOV;
import a.a.a.c.c.d.f.EOW;
import a.a.a.c.f.b.c.a.TaxRate;
import a.a.a.c.f.c.c.ComboBoxRequired;

public class EUH extends EOV {
    private final EUG GKS;

    public EUH(EOW var1, EUG var2) {
        super(var1, var2.fxml_invoice_sale_new_add_invoice_element_nameController);
        this.GKS = var2;
    }

    public TaxRate HNU() {
        return (TaxRate) ((ComboBoxRequired) this.GKS.fxml_invoice_sale_new_add_invoice_element_tax_typeController.fxml_component_main_element).getValue();
    }

    public void HNV(TaxRate var1) {
        this.GKS.fxml_invoice_sale_new_add_invoice_element_tax_typeController.fxml_component_main_element.setValue(var1);
    }
}
