package a.a.a.c.f.d;

import a.a.a.c.f.a.EYD;
import a.a.a.c.f.b.QST;
import a.a.a.c.f.c.a.RequiredGridPane;
import a.a.a.c.f.c.c.ComboBoxRequiredText;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.KeyEvent;
import javafx.util.Callback;
import javafx.util.StringConverter;

import java.util.List;

public abstract class FCL<_T extends ComboBoxRequiredText<QST>> extends EYD<QST, RequiredGridPane, _T> {
    public QST QVK;
    public String HAQ;
    public String HAR;
    public boolean HAS;
    private final Integer HAT;
    public final int HAU;

    public FCL(int var1) {
        this(null, null, var1);
    }

    public FCL(String var1, Integer var2, int var3) {
        super(var1);
        this.QVK = new QST() {
            private String RPC;

            public String getTitle(int var1) {
                return this.RPC;
            }

            public boolean getShadow() {
                return true;
            }

            public void setTitle(String var1) {
                this.RPC = var1;
            }
        };
        this.HAT = var2;
        this.HAU = var3;
    }

    public void IFQ() {
        this.HAS = true;
    }

    protected int getMaxLength() {
        return this.HAT != null ? this.HAT : this.fxml_component_root_element.getMaxLength();
    }

    public void initialize() {
        super.initialize();
        this.fxml_component_main_element.setCellFactory(new Callback<ListView<QST>, ListCell<QST>>() {
            public ListCell<QST> call(ListView<QST> var1) {
                return new ListCell<QST>() {
                    protected void updateItem(QST var1, boolean var2) {
                        if (var1 != null) {
                            super.updateItem(var1, var2);
                            this.setText(var1.getTitle(FCL.this.getTitleType()));
                        }

                    }
                };
            }
        });
        this.fxml_component_main_element.setButtonCell((ListCell) ((ComboBoxRequiredText) this.fxml_component_main_element).getCellFactory().call(null));
        this.fxml_component_main_element.editableProperty().set(true);
        this.fxml_component_main_element.setOnKeyReleased(new FCM(this));
        ((ComboBoxRequiredText) this.fxml_component_main_element).valueProperty().addListener(new FCO(this));
        ((TextField) ((ComboBoxRequiredText) this.fxml_component_main_element).editorProperty().get()).textProperty().addListener(new FCN(this));
        this.fxml_component_main_element.getEditor().focusedProperty().addListener(new ChangeListener<Boolean>() {
            public void changed(ObservableValue<? extends Boolean> var1, Boolean var2, Boolean var3) {

                if (!var3) {
                    String var4 = FCL.this.fxml_component_main_element.getEditor().getText();
                    if (var4 != null) {
                        String var5 = var4.trim();
                        if (var5.length() > 0) {
                            FCL.this.fxml_component_main_element.getEditor().setText(var5);
                        } else {
                            FCL.this.fxml_component_main_element.getEditor().setText(null);
                        }
                    }
                }

            }
        });
        this.fxml_component_main_element.setConverter(new StringConverter<QST>() {
            public String toString(QST var1) {
                return var1 != null ? var1.getTitle(FCL.this.getTitleType()) : null;
            }

            public QST fromString(String var1) {
                return (QST) ((ComboBoxRequiredText) FCL.this.fxml_component_main_element).getValue();
            }
        });
        final KeyCodeCombination var1 = new KeyCodeCombination(KeyCode.Z, KeyCombination.SHORTCUT_DOWN);
        final KeyCodeCombination var2 = new KeyCodeCombination(KeyCode.Y, KeyCombination.SHORTCUT_DOWN);
        this.fxml_component_main_element.getEditor().setOnKeyPressed(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent var1x) {
                if (var1.match(var1x) || var2.match(var1x)) {
                    var1x.consume();
                }

            }
        });
        this.fxml_component_main_element.getEditor().setContextMenu(new ContextMenu());
        this.fxml_component_main_element.changedProperty().set(false);
        this.clearChangedProperty();
    }

    public void IFR() {

        this.fxml_component_main_element.hide();
        if (this.fxml_component_main_element.isFocused()) {
            this.HAS = true;
            this.set((QST) ((ComboBoxRequiredText) this.fxml_component_main_element).getValue());
        }

    }

    public void clearChangedProperty() {
        this.fxml_component_main_element.changedProperty().set(false);
    }

    protected abstract int getTitleType();

    protected abstract void set(QST var1);

    protected abstract List<? extends QST> getByString(String var1);

    public abstract boolean isAllowed(String var1);
}
