package a.a.a.c.f.a.a;

import a.a.a.c.f.a.BaseBoxController;
import a.a.a.c.f.b.b.Period;
import a.a.a.c.f.c.a.PeriodBox;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ChangeListener;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.util.StringConverter;

import java.time.LocalDate;
import java.util.Calendar;

public class EYX extends BaseBoxController {
    @FXML
    public Label fxml_component_label_element;
    @FXML
    public Label fxml_component_label_required_flag;
    @FXML
    private ComboBox<Integer> fxml_period_year;
    @FXML
    private ComboBox<Integer> fxml_period_month;
    @FXML
    private Label fxml_period_validation_error;
    @FXML
    protected PeriodBox fxml_field_box_period;
    private static final int GVX = 2015;
    private static final String GVY = "%02d";
    private final BooleanProperty GVZ = new SimpleBooleanProperty(this, "valid", true);
    private final BooleanProperty GWA = new SimpleBooleanProperty(this, "disable", false);
    private final ObjectProperty<Period> GWB = new SimpleObjectProperty();
    private ChangeListener<? super Integer> GWC;

    public EYX(String var1) {
        super(var1);
    }

    public void initialize(boolean var1) {
        int var2 = Calendar.getInstance().get(1);
        this.fxml_period_year.getItems().clear();

        int var3;
        for (var3 = 2015; var3 <= var2; ++var3) {
            this.fxml_period_year.getItems().add(var3);
        }

        for (var3 = 1; var3 <= 12; ++var3) {
            this.fxml_period_month.getItems().add(var3);
        }

        this.fxml_period_month.setConverter(new StringConverter<Integer>() {
            public String toString(Integer var1) {
                return var1 == null ? "" : String.format("%02d", var1);
            }

            public Integer fromString(String var1) {
                try {
                    return Integer.parseInt(var1);
                } catch (NumberFormatException var3) {
                    return null;
                }
            }
        });
        this.fxml_period_validation_error.visibleProperty().bind(this.validProperty().not().and(this.disableProperty().not()));
        this.fxml_period_year.disableProperty().bind(this.GWA);
        this.fxml_period_month.disableProperty().bind(this.GWA);
        if (var1) {
            this.setPeriod(var2, LocalDate.now().getMonthValue());
        }

        if (this.fxml_component_label_required_flag != null) {
            this.fxml_component_label_required_flag.visibleProperty().bind(this.fxml_component_label_required_flag.managedProperty());
            this.fxml_component_label_required_flag.managedProperty().bind(this.fxml_field_box_period.requiredProperty());
        }

    }

    public Integer getYear() {
        return this.fxml_period_year.getValue();
    }

    public Integer getMonth() {
        return this.fxml_period_month.getValue();
    }

    public Period getPeriod() {
        return this.fxml_period_year.getValue() != null && this.fxml_period_month.getValue() != null ? new Period(this.fxml_period_year.getValue(), this.fxml_period_month.getValue()) : null;
    }

    public void setPeriod(Period var1) {
        if (var1 != null) {
            this.setPeriod(var1.getYear().getValue(), var1.getMonth().getValue());
        } else {
            this.fxml_period_year.getSelectionModel().clearSelection();
            this.fxml_period_month.getSelectionModel().clearSelection();
        }

    }

    public void setPeriod(Integer var1, Integer var2) {
        this.fxml_period_year.setValue(var1);
        this.fxml_period_month.setValue(var2);
    }

    public ObjectProperty<Period> getPeriodProperty() {
        return this.GWB;
    }

    public boolean isValid() {
        return this.GVZ.get();
    }

    public BooleanProperty validProperty() {
        return this.GVZ;
    }

    public void setValid(boolean var1) {
        this.GVZ.set(var1);
    }

    public void setValid(boolean var1, String var2) {
        this.setValid(var1);
        if (!var1) {
            this.fxml_period_validation_error.setText(var2);
        } else {
            this.fxml_period_validation_error.setText("");
        }

    }

    public boolean getDisable() {
        return this.GWA.get();
    }

    public BooleanProperty disableProperty() {
        return this.GWA;
    }

    public void setListener(ChangeListener<? super Integer> var1) {
        if (var1 != null) {
            this.fxml_period_year.getSelectionModel().selectedItemProperty().addListener(var1);
            this.fxml_period_month.getSelectionModel().selectedItemProperty().addListener(var1);
            this.GWC = var1;
        } else if (this.GWC != null) {
            this.fxml_period_year.getSelectionModel().selectedItemProperty().removeListener(this.GWC);
            this.fxml_period_month.getSelectionModel().selectedItemProperty().removeListener(this.GWC);
            this.GWC = null;
        }

    }
}
