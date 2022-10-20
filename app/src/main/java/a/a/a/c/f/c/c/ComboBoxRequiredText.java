package a.a.a.c.f.c.c;

import a.a.a.c.f.a.EXW;
import a.a.a.c.f.b.QST;
import a.a.a.c.f.c.b.QRV;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ComboBoxRequiredText<_T extends QST> extends ComboBoxValidatedText<_T> implements EXW<_T> {
    protected QRV<_T, ComboBoxRequiredText<_T>> QVR;
    protected BooleanProperty QVS;
    protected BooleanProperty QVT;

    public ComboBoxRequiredText() {
        this(FXCollections.observableArrayList());
    }

    public ComboBoxRequiredText(ObservableList<_T> var1) {
        super(var1);
        this.QVS = new SimpleBooleanProperty(this, "required", true);
        this.QVT = new SimpleBooleanProperty(this, "requiredAndValid", true);
        this.IGA();
    }

    public final boolean IFB() {
        return this.QVS.getValue();
    }

    public final void setRequired(boolean var1) {
        this.QVS.setValue(var1);
    }

    public final BooleanProperty IFC() {
        return this.QVS;
    }

    public final boolean IFD() {
        return this.QVT.getValue();
    }

    public final void setRequiredAndValid(boolean var1) {
        this.QVT.setValue(var1);
    }

    public final BooleanProperty IFE() {
        return this.QVT;
    }

    private void IGA() {
        this.QVT.bind(this.QVS.and(this.QVU).or(this.QVS.not()));
        this.valueProperty().removeListener(this.HAK);
        this.QVR = new QRV(this);
        this.valueProperty().addListener(this.QVR);
    }
}
