package a.a.a.c.f.c.c;

import a.a.a.c.f.c.c.a.UnaryOperator_Required;
import a.a.a.c.f.c.c.b.StringConverter_String;
import javafx.scene.control.TextFormatter;

public class PathFieldRequired extends TextFieldRequired {
    public PathFieldRequired() {
        this("");
    }

    public PathFieldRequired(String var1) {
        super(var1);
        this.IFW();
    }

    private void IFW() {

        this.setTextFormatter(new TextFormatter(new StringConverter_String(), "", new UnaryOperator_Required(this)));
        this.IEU().set(false);
        this.textProperty().removeListener(this.GYR);
        this.textProperty().removeListener(this.GYY);

    }
}
