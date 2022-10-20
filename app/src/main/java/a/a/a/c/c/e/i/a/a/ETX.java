package a.a.a.c.c.e.i.a.a;

import a.a.a.c.c.e.i.a.EUA;
import a.a.a.c.g.b.FCW;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class ETX implements ChangeListener<Boolean> {
    private final EUA GJM;
    private final String GJN;

    public ETX(EUA var1) {
        this.GJM = var1;
        this.GJN = FCW.getInstance().getMessageForKey("micro.process.jpk_list.button.printUPO");
    }

    public void changed(ObservableValue<? extends Boolean> var1, Boolean var2, Boolean var3) {
        if (var3 != null && var3) {
            this.GJM.fxml_generalButtonState.setText(this.GJN);
        }

    }
}
