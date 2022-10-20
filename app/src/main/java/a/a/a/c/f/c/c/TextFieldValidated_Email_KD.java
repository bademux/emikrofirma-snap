package a.a.a.c.f.c.c;

import a.a.a.c.f.c.b.FAH;

public class TextFieldValidated_Email_KD extends TextFieldRequired {
    public TextFieldValidated_Email_KD() {
        this("");
    }

    public TextFieldValidated_Email_KD(String var1) {
        super(var1);
        this.IFW();
    }

    private void IFW() {
        this.IEU().set(false);
        this.textProperty().removeListener(this.GYR);
        this.textProperty().removeListener(this.GYY);
        this.textProperty().addListener(new FAH("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$", "[a-zA-Z0-9_\\-\\.@]+", this));
    }
}
