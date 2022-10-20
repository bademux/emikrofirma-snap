package a.a.a.c.c.e.c.a.a;

import a.a.a.b.f.FFI;
import a.a.a.c.c.e.c.a.ESG;
import a.a.a.c.c.e.c.c.ESL;
import a.a.a.c.f.a.d.DeclarationJPK_VAT;
import a.a.a.c.f.a.d.HL;
import a.a.a.c.f.a.h.JG;
import a.a.a.c.g.b.FCW;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TreeItem;

public class ESE implements ChangeListener<TreeItem<ESL>> {
    private final ESG GBU;

    public ESE(ESG var1) {
        this.GBU = var1;
    }

    public void changed(ObservableValue<? extends TreeItem<ESL>> var1, TreeItem<ESL> var2, TreeItem<ESL> var3) {

        this.GBU.GCA.set(false);
        this.GBU.GCB.set(false);
        this.GBU.GCC.set(false);
        this.GBU.GCD.set(false);
        if (var3 != null) {
            this.GBU.GCE.set(var3.getValue().HTT());
            JG var4 = var3.getValue().getSettlement().getSettlementStatus();
            switch (var4) {
                case SETTLED:
                    this.GBU.GCA.set(true);
                    break;
                case NEW:
                    this.GBU.GCB.set(true);
                    break;
                case CANCELED_CHANGED:
                    this.GBU.GCC.set(true);
                    break;
                case CANCELED_UNCHANGED:
                    this.GBU.GCD.set(true);
                    break;
                default:
                    throw new FFI("wrong status");
            }

            DeclarationJPK_VAT var5 = var3.getValue().getDeclarationJPKVAT();
            HL var6 = null;
            this.GBU.QMS.set(false);
            if (var5 != null) {
                var6 = var5.getDeclarationStatus();
            }

            if (var6 != null) {
                switch (var6) {
                    case NONE:
                        this.GBU.fxml_generalButtonGenerateAndSendJPKVAT.setText(FCW.getInstance().getMessageForKey("micro.process.invoices_settlements.GenereateAndSendJPKVAT"));
                        this.GBU.QMS.set(true);
                        break;
                    case NEW:
                    case SENT:
                        this.GBU.fxml_generalButtonGenerateAndSendJPKVAT.setText(FCW.getInstance().getMessageForKey("micro.process.invoices_settlements.CheckStatusJPKVAT"));
                        break;
                    case SUCCESS:
                        this.GBU.fxml_generalButtonGenerateAndSendJPKVAT.setText(FCW.getInstance().getMessageForKey("micro.process.invoices_settlements.PrintUPOJPKVAT"));
                        break;
                    case FAILURE:
                    case RETRY:
                        this.GBU.fxml_generalButtonGenerateAndSendJPKVAT.setText(FCW.getInstance().getMessageForKey("micro.process.invoices_settlements.DeleteJPKVAT"));
                        break;
                    default:
                        throw new FFI("unknown declaration status");
                }
            } else {
                this.GBU.fxml_generalButtonGenerateAndSendJPKVAT.setText(FCW.getInstance().getMessageForKey("micro.process.invoices_settlements.GenereateAndSendJPKVAT"));
                this.GBU.QMS.set(true);
            }
        }

    }
}
