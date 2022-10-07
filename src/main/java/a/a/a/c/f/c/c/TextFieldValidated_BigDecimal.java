package a.a.a.c.f.c.c;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class TextFieldValidated_BigDecimal extends TextFieldValidated {
    public TextFieldValidated_BigDecimal() {
        this("");
    }

    public TextFieldValidated_BigDecimal(String var1) {
        super(var1);
        this.IFW();
    }

    private void IFW() {
        this.IEU().set(false);
        this.textProperty().addListener(new ChangeListener_validateBC(this));
    }

    public class ChangeListener_validateBC implements ChangeListener<String> {
        private final TextFieldValidated GYI;

        public ChangeListener_validateBC(TextFieldValidated var2) {
            this.GYI = var2;
        }

        public void changed(ObservableValue<? extends String> var1, String var2, String var3) {
            if (var3 != null && var3.length() > 0 && !var3.equals(var2)) {
                if (!var3.matches("^\\d+(,\\d{0,2})?$")) {
                    this.GYI.textProperty().set(var2);
                } else {
                    this.GYI.IEU().set(true);
                }
            }

        }
    }
}
