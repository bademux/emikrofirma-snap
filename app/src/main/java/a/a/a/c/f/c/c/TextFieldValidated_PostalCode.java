package a.a.a.c.f.c.c;

import a.a.a.c.f.c.c.a.UnaryOperator_PostalCode;
import a.a.a.c.f.c.c.b.StringConverter_PostalCode;
import javafx.scene.control.TextFormatter;

public class TextFieldValidated_PostalCode extends TextFieldRequired {
    public TextFieldValidated_PostalCode() {
        this("");
    }

    public TextFieldValidated_PostalCode(String var1) {
        super(var1);
        this.IFW();
    }

    private void IFW() {

        this.setTextFormatter(new TextFormatter(new StringConverter_PostalCode(), "", new UnaryOperator_PostalCode(this)));
        this.IEU().set(false);
        this.textProperty().removeListener(this.GYR);
        this.textProperty().removeListener(this.GYY);

    }
}
