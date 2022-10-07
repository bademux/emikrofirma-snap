package a.a.a.c.c.d.m;

import javafx.event.EventHandler;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class QKN implements EventHandler<KeyEvent> {
    public QKN() {
    }

    public void handle(KeyEvent var1) {
        switch (var1.getCode()) {
            default:
                ComboBox var2 = null;
                if (var1.getSource() instanceof ComboBox) {
                    var2 = (ComboBox) var1.getSource();
                }

                TextField var3 = null;
                if (var1.getTarget() instanceof TextField) {
                    var3 = (TextField) var1.getTarget();
                }

                int var4 = QKM.getTextFieldCaret(var3);
                switch (var1.getCode()) {
                    case UP:
                    case DOWN:
                        QKM.QPL(var2, false);
                        break;
                    case ENTER:
                        QKM.QPM(var2, true);
                        break;
                    case DELETE:
                    case BACK_SPACE:
                    default:
                        if (!var1.getCode().isFunctionKey() && !var1.getCode().isNavigationKey() && !var1.getCode().isArrowKey() && !var1.getCode().isModifierKey() && !var1.getCode().isMediaKey()) {
                            QKM.setupComboBoxValues(var2, var3, true);
                            QKM.resetTextFieldCaret(var3, var4);
                        }
                }
            case ESCAPE:
            case SHIFT:
        }
    }
}
