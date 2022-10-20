package a.a.a.c.f.c.c;

import a.a.a.c.f.c.b.FAU;

public class TextFieldValidated_REGON extends TextFieldRequired {
    public TextFieldValidated_REGON() {
        this("");
    }

    public TextFieldValidated_REGON(String var1) {
        super(var1);
        this.IFW();
    }

    private void IFW() {
        this.IEU().set(false);
        this.textProperty().removeListener(this.GYR);
        this.textProperty().removeListener(this.GYY);
        this.textProperty().addListener(new FAU(this));
    }
}
