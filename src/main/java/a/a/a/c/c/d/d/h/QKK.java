package a.a.a.c.c.d.d.h;

import a.a.a.c.f.a.b.SQQ;
import javafx.event.EventHandler;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

import java.util.Set;

public class QKK<_T> implements EventHandler<KeyEvent> {
    private static final int QNJ = 1;
    private final SQQ<_T> QNK;

    public QKK(SQQ<_T> var1) {
        this.QNK = var1;
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

                int var4 = this.getTextFieldCaret(var3);
                switch (var1.getCode()) {
                    case UP:
                    case DOWN:
                        this.QPJ(var2, false);
                        break;
                    case ENTER:
                        this.QPK(var2, true);
                        break;
                    case DELETE:
                    case BACK_SPACE:
                    default:
                        if (!var1.getCode().isFunctionKey() && !var1.getCode().isNavigationKey() && !var1.getCode().isArrowKey() && !var1.getCode().isModifierKey() && !var1.getCode().isMediaKey()) {
                            this.setupComboBoxValues(var2, var3, true);
                            resetTextFieldCaret(var3, var4);
                        }
                }
            case ESCAPE:
            case SHIFT:
        }
    }

    private void QPJ(ComboBox<_T> var1, boolean var2) {
        if (var1 != null && var1.getItems().size() > 0) {
            if (var2) {
                var1.show();
            } else if (!var1.isShowing()) {
                var1.show();
            }
        }

    }

    private int getTextFieldCaret(TextField var1) {
        return var1 != null ? var1.getCaretPosition() : -1;
    }

    private void QPK(ComboBox<_T> var1, boolean var2) {
        if (var1 != null) {
            if (var2) {
                var1.hide();
            } else if (var1.isShowing()) {
                var1.hide();
            }
        }

    }

    private void setupComboBoxValues(ComboBox<_T> var1, TextField var2, boolean var3) {
        if (var1 != null) {
            this.QPK(var1, true);
            Set var4 = null;
            if (var2 != null && var2.getText().length() >= 1) {
                String var5 = var2.getText();
                var4 = this.QNK.TEB(var5);
                var1.getItems().setAll(var4);
                var2.setText(var5);
            } else {
                var1.getItems().clear();
            }

            if (var3) {
                this.QPJ(var1, true);
            }
        }

    }

    private static void resetTextFieldCaret(TextField var0, int var1) {
        if (var0 != null) {
            if (var1 < 0) {
                var0.positionCaret(var0.getText().length());
            } else {
                var0.positionCaret(var1);
            }
        }

    }
}
