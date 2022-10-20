package a.a.a.c.f.c.c;

import a.a.a.c.f.a.EYF;
import javafx.beans.binding.BooleanBinding;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ComboBoxValidated<_T> extends ComboBoxChanged<_T> implements EYF {
    protected BooleanProperty GYT;
    protected BooleanProperty GYU;
    protected BooleanProperty GYV;

    public ComboBoxValidated() {
        this(FXCollections.observableArrayList());
    }

    public ComboBoxValidated(ObservableList<_T> var1) {
        super(var1);
        this.GYT = new SimpleBooleanProperty(this, "valid", false);
        this.GYU = new SimpleBooleanProperty(this, "validExternal", true);
        this.GYV = new SimpleBooleanProperty(this, "warning", false);
    }

    public final boolean IET() {
        return this.GYT.getValue();
    }

    public final void setValid(boolean var1) {
        this.GYT.setValue(var1);
    }

    public final BooleanProperty IEU() {
        return this.GYT;
    }

    public final boolean IEV() {
        return this.GYU.getValue();
    }

    public final void setValidExternal(boolean var1) {
        this.GYU.setValue(var1);
    }

    public final BooleanProperty IEW() {
        return this.GYU;
    }

    public final boolean IEX() {
        return this.GYV.getValue();
    }

    public final void setWarning(boolean var1) {
        this.GYV.setValue(var1);
    }

    public final BooleanProperty IEY() {
        return this.GYV;
    }

    public BooleanBinding IEZ() {
        return this.valueProperty().isNull();
    }

    public BooleanBinding IFA() {
        return this.valueProperty().isNotNull();
    }
}
