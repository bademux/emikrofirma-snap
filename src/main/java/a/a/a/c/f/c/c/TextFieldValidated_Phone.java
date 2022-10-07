package a.a.a.c.f.c.c;

import a.a.a.c.f.c.b.FAH;

public class TextFieldValidated_Phone extends TextFieldRequired {
    public TextFieldValidated_Phone() {
        this("");
    }

    public TextFieldValidated_Phone(String var1) {
        super(var1);
        this.IFW();
    }

    private void IFW() {
        this.IEU().set(false);
        this.textProperty().removeListener(this.GYR);
        this.textProperty().removeListener(this.GYY);
        this.textProperty().addListener(new FAH("^(\\+){0,1}([0-9]+[\\- ]{0,1})+$", "[0-9\\- \\+]+", this));
    }
}
