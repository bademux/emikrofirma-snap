package a.a.a.c.f.a.a;

import a.a.a.c.f.a.EYD;
import a.a.a.c.f.b.EZT;
import a.a.a.c.f.b.EZU;
import a.a.a.c.f.c.a.RequiredGridPane;
import a.a.a.c.f.c.c.DatePickerRequired;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

public class EYO extends EYD<LocalDate, RequiredGridPane, DatePickerRequired> {
    private final ObservableList<EZT> GVU;

    public EYO() {
        this(null);
    }

    public EYO(String var1) {
        super(var1);
        this.GVU = FXCollections.observableArrayList();
    }

    public void initialize() {
        super.initialize();
        this.fxml_component_main_element.setDayCellFactory(new EZU(this.GVU));
    }

    public void IFM(EZT var1) {
        this.GVU.add(var1);
    }

    public void IFN(List<EZT> var1) {
        Iterator var2 = var1.iterator();

        while (var2.hasNext()) {
            EZT var3 = (EZT) var2.next();
            this.GVU.add(var3);
        }

    }

    public void IFO(EZT var1) {
        this.GVU.remove(var1);
    }

    public void IFP() {
        this.GVU.clear();
    }
}
