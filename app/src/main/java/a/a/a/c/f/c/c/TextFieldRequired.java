package a.a.a.c.f.c.c;

import a.a.a.c.f.a.EXV;
import a.a.a.c.f.c.b.FAK;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.KeyEvent;

public class TextFieldRequired extends TextFieldValidated implements EXV {
    protected FAK<TextFieldRequired> GYY;
    protected BooleanProperty GYZ;
    protected BooleanProperty GZA;
    protected IntegerProperty GZB;
    protected BooleanProperty QWB;

    public TextFieldRequired() {
        this("");
    }

    public TextFieldRequired(String var1) {
        super(var1);
        this.GYZ = new SimpleBooleanProperty(this, "required", true);
        this.GZA = new SimpleBooleanProperty(this, "requiredAndValid", true);
        this.GZB = new SimpleIntegerProperty(this, "maxLength", 2147483647);
        this.QWB = new SimpleBooleanProperty(this, "doTrim", true);
        this.IFW();
    }

    public final boolean IFB() {
        return this.GYZ.getValue();
    }

    public final void setRequired(boolean var1) {
        this.GYZ.setValue(var1);
    }

    public final BooleanProperty IFC() {
        return this.GYZ;
    }

    public final boolean IFD() {
        return this.GZA.getValue();
    }

    public final void setRequiredAndValid(boolean var1) {
        this.GZA.setValue(var1);
    }

    public final BooleanProperty IFE() {
        return this.GZA;
    }

    public final void setMaxLength(Integer var1) {
        this.GZB.set(var1);
    }

    public final Integer getMaxLength() {
        return this.GZB.getValue();
    }

    public final IntegerProperty IFF() {
        return this.GZB;
    }

    public final boolean RHR() {
        return this.QWB.getValue();
    }

    public final void setDoTrim(boolean var1) {
        this.QWB.setValue(var1);
    }

    public final BooleanProperty RHS() {
        return this.QWB;
    }

    private void IFW() {
        this.GZA.bind(this.GYZ.and(this.GYL.and(this.GYM)).or(this.GYZ.not().and(this.textProperty().isEmpty().or(this.GYL.and(this.GYM)))));
        this.textProperty().removeListener(this.GYR);
        this.GYY = new FAK(this);
        this.textProperty().addListener(this.GYY);
        this.setOnKeyPressed(new EventHandler<KeyEvent>() {
            private final KeyCombination AAVL;
            private final KeyCombination AAVM;

            {
                this.AAVL = new KeyCodeCombination(KeyCode.Z, KeyCombination.SHORTCUT_DOWN);
                this.AAVM = new KeyCodeCombination(KeyCode.Y, KeyCombination.SHORTCUT_DOWN);
            }

            public void handle(KeyEvent var1) {
                if (this.AAVL.match(var1) || this.AAVM.match(var1)) {
                    var1.consume();
                }

            }
        });
    }
}
