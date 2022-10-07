package a.a.a.c.f.c.c;

import a.a.a.c.f.a.EXW;
import a.a.a.c.f.c.b.FAD;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ComboBoxRequired<_T> extends ComboBoxValidated<_T> implements EXW<_T> {
    protected FAD<_T, ComboBoxRequired<_T>> HAF;
    protected BooleanProperty HAG;
    protected BooleanProperty HAH;

    public ComboBoxRequired() {
        this(FXCollections.observableArrayList());
    }

    public ComboBoxRequired(ObservableList<_T> var1) {
        super(var1);
        this.HAG = new SimpleBooleanProperty(this, "required", true);
        this.HAH = new SimpleBooleanProperty(this, "requiredAndValid", true);
        this.IGA();
    }

    public final boolean IFB() {
        return this.HAG.getValue();
    }

    public final void setRequired(boolean var1) {
        this.HAG.setValue(var1);
    }

    public final BooleanProperty IFC() {
        return this.HAG;
    }

    public final boolean IFD() {
        return this.HAH.getValue();
    }

    public final void setRequiredAndValid(boolean var1) {
        this.HAH.setValue(var1);
    }

    public final BooleanProperty IFE() {
        return this.HAH;
    }

    private void IGA() {
        this.HAH.bind(this.HAG.and(this.GYT).or(this.HAG.not()));
        this.valueProperty().removeListener(this.HAK);
        this.HAF = new FAD(this);
        this.valueProperty().addListener(this.HAF);
    }
}
