package a.a.a.c.f.c.c;

import a.a.a.c.f.c.b.FAT;

public class TextFieldValidated_PESEL extends TextFieldRequired {
    public TextFieldValidated_PESEL() {
        this("");
    }

    public TextFieldValidated_PESEL(String var1) {
        super(var1);
        this.IFW();
    }

    private void IFW() {
        this.IEU().set(false);
        this.textProperty().removeListener(this.GYR);
        this.textProperty().removeListener(this.GYY);
        this.textProperty().addListener(new FAT(this));
    }
}
